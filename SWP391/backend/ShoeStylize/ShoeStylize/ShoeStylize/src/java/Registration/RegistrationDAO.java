package Registration;

import Blog.BlogDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DBUtils;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

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

    public String checkRoleID(String Email, String Password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select RoleID From Users"
                        + " Where Email = ? and Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, Email);
                stm.setString(2, Password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getString("RoleID");
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
        return null;
    }

    public int checkUserID(String Email, String Password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select UserID From Users"
                        + " Where Email = ? and Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, Email);
                stm.setString(2, Password);
                rs = stm.executeQuery();
                if (rs.next()) {
                    return rs.getInt("UserID");
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
        return -1;
    }

    public boolean insertRecord(String email, String password, String phone, String fullname, String birthDate, String roleID, String gender) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO Users([Email],[Password],[FullName],[PhoneNumber],[Birthdate],[RoleID],[Gender])"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, password);
                stm.setString(3, phone);
                stm.setString(4, fullname);
                stm.setString(5, birthDate);
                stm.setString(6, roleID);
                stm.setString(7, gender);
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

    public boolean updateRecord(int userID, String email, String fullName, String phone, String birthDate, String gender) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            // tra ra null or k.
            if (con != null) {
                String sql = "UPDATE Users SET [Email] = ? ,[FullName] = ? ,[PhoneNumber] = ? ,[Birthdate] = ?  ,[Gender] = ?"
                        + " WHERE UserID = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                stm.setString(2, fullName);
                stm.setString(3, phone);
                stm.setString(4, birthDate);
                stm.setString(5, gender);
                stm.setInt(6, userID);
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

    public boolean addBlog(int userID, String title, String content, String postDate) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO [BlogPosts]([UserID],[Title],[Content],[PostDay])"
                        + " VALUES (?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setInt(1, userID);
                stm.setString(2, title);
                stm.setString(3, content);
                stm.setString(4, postDate);
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

    List<RegistrationDTO> ListAccounts;

    public List<RegistrationDTO> getListAccounts() {
        return ListAccounts;
    }

    public void showUser() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT Email, FullName, PhoneNumber, Birthdate, Gender FROM Users";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(email, name, phone, date, gender);
                    if (ListAccounts == null) {
                        ListAccounts = new ArrayList<>();
                    }
                    ListAccounts.add(dto);
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
    }

    public void searchByName(String searchValue) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT Email, FullName, PhoneNumber, Birthdate, Gender FROM Users"
                        + " Where FullName LIKE ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(email, name, phone, date, gender);
                    if (ListAccounts == null) {
                        ListAccounts = new ArrayList<>();
                    }
                    ListAccounts.add(dto);
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
    }

    List<BlogDTO> ListBlogs;

    public List<BlogDTO> getListBlogs() {
        return ListBlogs;
    }

    public void showBlog() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT UserID, Title, Content, PostDay FROM BlogPosts \n"
                        + "INNER JOIN Users ON BlogPosts.UserId = Users.UserId;";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String title = rs.getString("Title");
                    String author = rs.getString("FullName");
                    String date = rs.getString("PostDay");
                    String content = rs.getString("Content");
                    BlogDTO dto = new BlogDTO(title, author, date, content);
                    if (ListBlogs == null) {
                        ListBlogs = new ArrayList<>();
                    }
                    ListBlogs.add(dto);
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
    }

    public void searchByTitle(String searchValue) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT UserID, Title, Content, PostDay FROM BlogPosts \n"
                        + "Where Title LIKE ?;";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    String title = rs.getString("UserID");
                    String author = rs.getString("Title");
                    String date = rs.getString("Content");
                    String content = rs.getString("PostDay");
                    BlogDTO dto = new BlogDTO(title, author, date, content);
                    if (ListBlogs == null) {
                        ListBlogs = new ArrayList<>();
                    }
                    ListBlogs.add(dto);
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
    }

}
