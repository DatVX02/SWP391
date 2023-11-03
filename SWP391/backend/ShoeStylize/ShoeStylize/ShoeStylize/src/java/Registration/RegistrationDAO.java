package Registration;

import Blog.BlogDTO;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Database.DBUtils;
import Order.OrderDTO;
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

    public boolean checkEmail(String Email) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select Email From Users"
                        + " Where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, Email);
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

    public int checkUserID(String Email) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select UserID From Users"
                        + " Where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, Email);
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

    public boolean updatePassword(int userID, String password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            // tra ra null or k.
            if (con != null) {
                String sql = "UPDATE Users SET [Password] = ?"
                        + " WHERE UserID = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, password);
                stm.setInt(2, userID);
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

    public boolean addBlog(String title, String content, String author, String postDate) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "INSERT INTO [BlogPosts]([Title],[Content],[UserID],[PostDay])"
                        + " VALUES (?, ?, ?, ?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, title);
                stm.setString(2, content);
                stm.setString(3, author);
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
                String sql = "SELECT UserID,Email, FullName, PhoneNumber, Birthdate, Gender FROM Users";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("UserID");
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(id, email, name, phone, date, gender);
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
                String sql = "SELECT UserID, Email, FullName, PhoneNumber, Birthdate, Gender FROM Users"
                        + " Where FullName LIKE ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("UserID");
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(id, email, name, phone, date, gender);
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
                String sql = "SELECT [PostID],[FullName],[Title],[Content],[PostDay] FROM BlogPosts \n"
                        + "INNER JOIN Users ON BlogPosts.UserId = Users.UserId;";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("PostID");
                    String title = rs.getString("Title");
                    String author = rs.getString("FullName");
                    String date = rs.getString("Content");
                    String content = rs.getString("PostDay");
                    BlogDTO dto = new BlogDTO(id, title, author, date, content);
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
                String sql = "SELECT [PostID],[FullName],[Title],[Content],[PostDay] FROM BlogPosts \n"
                        + "Where Title LIKE ?;";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("PostID");
                    String title = rs.getString("Title");
                    String author = rs.getString("FullName");
                    String date = rs.getString("Content");
                    String content = rs.getString("PostDay");
                    BlogDTO dto = new BlogDTO(id, title, author, date, content);
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

    List<OrderDTO> ListOrders;

    public List<OrderDTO> getListOrders() {
        return ListOrders;
    }

    public void showOrderDetail() throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT [ShoesName],[Price],[OrderDetails].[Quantity] FROM OrderDetails\n"
                        + "INNER JOIN Shoes ON Shoes.ShoeID = OrderDetails.ShoeID;";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    String name = rs.getString("ShoesName");
                    double price = rs.getDouble("Price");
                    int quantity = rs.getInt("Quantity");
                    OrderDTO dto = new OrderDTO(name, price, quantity);
                    if (ListOrders == null) {
                        ListOrders = new ArrayList<>();
                    }
                    ListOrders.add(dto);
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

    public boolean deleteRecord(String id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "EXEC sp_msforeachtable 'ALTER TABLE Users NOCHECK CONSTRAINT ALL';\n"
                        + "DELETE FROM Users WHERE UserID = ?;\n"
                        + "EXEC sp_msforeachtable 'ALTER TABLE Users WITH CHECK CONSTRAINT ALL';";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
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

    public boolean deleteBlogRecord(String id) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "EXEC sp_msforeachtable 'ALTER TABLE BlogPosts NOCHECK CONSTRAINT ALL';\n"
                        + "DELETE FROM BlogPosts WHERE PostID = ?;\n"
                        + "EXEC sp_msforeachtable 'ALTER TABLE BlogPosts WITH CHECK CONSTRAINT ALL';";
                stm = con.prepareStatement(sql);
                stm.setString(1, id);
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
