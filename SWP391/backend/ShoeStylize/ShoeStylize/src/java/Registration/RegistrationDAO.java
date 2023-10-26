package Registration;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.Date;

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
    
 
    public boolean insertRecord(String userID, String email, String password, String phone, String fullname, String birthDate, String roleID, String gender) throws SQLException {
    Connection con = null;
    PreparedStatement stm = null;
    try {
        con = DBUtils.makeConnection();
        // Check if the connection is not null
        if (con != null) {
            String sql = "insert into Users (UserID, Email, Password, PhoneNumber, FullName, Birthdate, RoleID, Gender) values (?, ?, ?, ?, ?, ?, ?, ?)";
            stm = con.prepareStatement(sql);
            stm.setString(1, userID);
            stm.setString(2, email);
            stm.setString(3, password);
            stm.setString(4, phone);
            stm.setString(5, fullname);
            stm.setString(6, birthDate);
            stm.setString(7, roleID);
            stm.setString(8, gender);
            int row = stm.executeUpdate();
            if (row > 0) {
                return true;
            }
        }
    } finally {
        if (stm != null) {
            stm.close();
        }
        if (con != null) {
            con.close();
        }
    }
    return false;
}

    
    public boolean updateRecord(String userID, String fullname, String email, String phone, String birthDate, String gender) throws SQLException {
    Connection con = null;
    PreparedStatement stm = null;
    try {
        con = DBUtils.makeConnection();
        // Check if the connection is not null
        if (con != null) {
            String sql = "UPDATE Users SET FullName = ?, Email = ?, PhoneNumber = ?, Birthdate = ?, Gender = ? WHERE UserID = ?";
            stm = con.prepareStatement(sql);
            stm.setString(1, fullname);
            stm.setString(2, email);
            stm.setString(3, phone);
            stm.setString(4, birthDate);
            stm.setString(5, gender);
            stm.setString(6, userID);
            int row = stm.executeUpdate();
            if (row > 0) {
                return true;
            }
        }
    } finally {
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
