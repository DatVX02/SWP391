/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
}
public boolean updateRecord(String id, String password, String username, String phonenumber, Date birthday, String role, String image) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            // tra ra null or k.
            if (con != null) {
                String sql = "Update Registration set Password= ?, UserName= ?, PhoneNumber= ?, Birthdate= ?, RoleID= ?, Image= ? "
                        + " Where UserID= ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setString(2, username);
                stm.setString(3, phonenumber);
                stm.setDate(4, birthday);
                stm.setString(5, role);
                stm.setString(6, image);
                stm.setString(7, id);
                int row = stm.executeUpdate();
                if (row > 0) {
                    return true;
                }
                // hoan chinh roi thi excutequery

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
