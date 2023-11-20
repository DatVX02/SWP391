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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
                String sql = "SELECT UserID, Email, FullName,Password, PhoneNumber, Birthdate, RoleID, Gender FROM Users";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("UserID");
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String password = rs.getString("Password");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String role = rs.getString("RoleID");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(id, email,password, phone, name, date, role, gender);
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
                String sql = "SELECT UserID, Email, FullName,Password, PhoneNumber, Birthdate, RoleID, Gender FROM Users"
                        + " Where FullName LIKE ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("UserID");
                    String email = rs.getString("Email");
                    String name = rs.getString("FullName");
                    String password = rs.getString("Password");
                    String phone = rs.getString("PhoneNumber");
                    String date = rs.getString("Birthdate");
                    String role = rs.getString("RoleID");
                    String gender = rs.getString("Gender");
                    RegistrationDTO dto = new RegistrationDTO(id, email,password, phone, name, date, role, gender);
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
                    String date = rs.getString("PostDay");
                    String content = rs.getString("Content");
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
                String sql = "SELECT [PostID],[FullName],[Title],[Content],[PostDay] FROM BlogPosts\n"
                        + "INNER JOIN Users ON BlogPosts.UserId = Users.UserId\n"
                        + "Where Title LIKE ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, "%" + searchValue + "%");
                rs = stm.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("PostID");
                    String title = rs.getString("Title");
                    String author = rs.getString("FullName");
                    String date = rs.getString("PostDay");
                    String content = rs.getString("Content");
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
                String sql = "SELECT ShoesName, Price, OrderDetails.Quantity\n"
                        + "FROM OrderDetails\n"
                        + "INNER JOIN CustomizeShoes ON CustomizeShoes.CusShoeID = OrderDetails.CusShoeID;";
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

    public void changePassword(HttpServletRequest request) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        HttpSession session = request.getSession();

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT [Password] FROM Users WHERE UserID = ?";
                stm = con.prepareStatement(sql);
                stm.setObject(1, session.getAttribute("id"));
                rs = stm.executeQuery();

                if (rs.next()) { // Check if there are results
                    String password = rs.getString("Password");
                    session.setAttribute("Password", password);
                }
            }
        } catch (SQLException e) {
            // Handle the SQLException, or at least log it
            e.printStackTrace();
            throw e; // Re-throw the exception if needed
        } finally {
            // Close resources in reverse order of acquisition, and check for null
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

    public void getInfo(HttpServletRequest request) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        HttpSession session = request.getSession();

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "SELECT FullName, Email, PhoneNumber, Birthdate, Gender FROM Users WHERE UserID = ?";
                stm = con.prepareStatement(sql);
                stm.setObject(1, session.getAttribute("id"));
                rs = stm.executeQuery();

                if (rs.next()) { // Check if there are results
                    session.setAttribute("FullName", rs.getString("FullName"));
                    session.setAttribute("Email", rs.getString("Email"));
                    session.setAttribute("PhoneNumber", rs.getString("PhoneNumber"));
                    session.setAttribute("Birthdate", rs.getString("Birthdate"));
                    session.setAttribute("Gender", rs.getString("Gender"));
                }
            }
        } catch (SQLException e) {
            // Handle the SQLException, or at least log it
            e.printStackTrace();
            throw e; // Re-throw the exception if needed
        } finally {
            // Close resources in reverse order of acquisition, and check for null
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
