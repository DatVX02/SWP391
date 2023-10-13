package Registration;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DBUtils;

/**
 *
 * @author Admin
 */
public class RegistrationDAO implements Serializable {

          
    public boolean checkLogin(String Email, String Password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select Email, Password From Users"
                        + " Where Email = ? and Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, Email);
                stm.setString(2, Password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return true;
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
    
    public boolean checkRegister(String userID, String email, String password, String userName, String phone, String birthDate, String roleID, String image) throws SQLException {
              boolean check = false;
              Connection con = null;
              PreparedStatement stm = null;
              try {
                        con = DBUtils.makeConnection();
                        if (con != null) {
                              String sql = "Insert into Users"
                                        + " Values (?, ?, ?, ?, ?, ?, ?,?)";
                              stm = con.prepareStatement(sql);
                              stm.setString(1, userID);
                              stm.setString(2, email);
                              stm.setString(3, password);
                              stm.setString(4, userName);
                              stm.setString(5, phone);
                              stm.setString(6, birthDate);
                              stm.setString(7, roleID);
                              stm.setString(8, image);
                              check = stm.executeUpdate() > 0;
                        }
                } catch (SQLException ex) {
                              ex.printStackTrace();
                } finally {
                         if (stm != null) stm.close();
                         if(con != null) con.close();
                }
                return check;
      }
}     
