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
    
    public boolean checkRegister(String userID, String email, String password, String phone, String birthDate, String roleID, String image) throws SQLException {
              Connection con = null;
              PreparedStatement stm = null;
              ResultSet rs = null;
              try {
                        con = DBUtils.makeConnection();
                        if (con != null) {
                              String sql = "Insert into Users"
                                        + " Values UserID = ?, Email = ?, Password = ?, Phone = ?, BirthDate = ?, RoleID = ?, Image = ?";
                              stm = con.prepareStatement(sql);
                              stm.setString(1, userID);
                              stm.setString(2, email);
                              stm.setString(3, password);
                              stm.setString(4, phone);
                              stm.setString(5, birthDate);
                              stm.setString(6, roleID);
                              stm.setString(7, image);
                              rs = stm.executeQuery();
                              if (rs.next()) {
                                        return true;
                              }
                              }
              } catch (SQLException ex) {
                        ex.printStackTrace();
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
    
}