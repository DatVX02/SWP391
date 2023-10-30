<%-- 
    Document   : information0
    Created on : Oct 29, 2023, 8:31:02 PM
    Author     : Administrator
--%>
<%@page import="java.sql.SQLException"%>
<%@page import="Database.DBUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Information</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\information.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>
    
    <% 
        String userID="";
        Cookie[] cookie = request.getCookies();
        if(cookie !=null){
            userID = cookie[cookie.length-1].getName();
        }
    %>
    
    <!-- menu -->
    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png" style="width: 15px; transform: translateY(02px);">
                <a href="information0.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png" style="width: 15px; transform: translateY(02px);">
                <a href="ChangePassword.jsp">Change password</a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png" style="width: 15px; transform: translateY(02px);" />
                <a href="accountManagement.jsp">
                    Order management
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png" style="width: 15px; transform: translateY(02px);" />
                <a href="support.jsp">
                    Support
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png" style="width: 15px; transform: translateY(02px);" />
                <a href="feedback.jsp">Suggestions </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png" style="width: 15px;" />
                <a href="login.jsp">Log out </a>
            </ul>
        </div>
    </div>
    
    <%
                    Connection con = null;
                    PreparedStatement stm = null;
                    ResultSet rs = null;
                    int id = Integer.valueOf(userID);

                    try {
                        con = DBUtils.makeConnection();
                        if (con != null) {
                            String sql = "SELECT FullName, Email, PhoneNumber, Birthdate, Gender FROM Users WHERE UserID = ?";
                            stm = con.prepareStatement(sql);
                            stm.setInt(1, id);
                            rs = stm.executeQuery();

                            if (rs.next()) { // Check if there are results
                                String name = rs.getString("FullName");
                                String email = rs.getString("Email");
                                String phone = rs.getString("PhoneNumber");
                                String date = rs.getString("Birthdate");
                                String gender = rs.getString("Gender");
                                session.setAttribute("FullName", name);
                                session.setAttribute("Email", email);
                                session.setAttribute("PhoneNumber", phone);
                                session.setAttribute("Birthdate", date);
                                session.setAttribute("Gender", gender);
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
                %>
        
    <div class="information_right">
            <h2>Account information</h2>
            <form action="" method="">
            <div>
                    <h3>Full Name</h3>
                    <input type="text" name="txtFullName" value="<%= session.getAttribute("FullName")%>" style="width: 200px;" readonly>
                </div>

                <div>
                    <h3>Email</h3>
                    <input type="email" name="txtEmail" value="<%= session.getAttribute("Email")%>" readonly style="width: 200px;">
                </div>

                <div>
                    <h3>Phone</h3>
                    <input type="tel" name="txtPhone" value="<%= session.getAttribute("PhoneNumber")%>" readonly style="width: 200px;">
                </div>

                <div>
                    <h3>Birth Date</h3>
                    <input type="date" name="birthDate" style="width: 200px;" value="<%= session.getAttribute("Birthdate")%>" readonly>
                </div>

                <div>
                    <h3>Gender</h3>
                    <input type="text" name="gen" value="<%= session.getAttribute("Gender")%>" style="width: 200px;" readonly>
                </div>
                
                <div>
                    <input type="hidden" name="txtUserID" value="<%= userID%>"> 
                </div>
        </form>
            <a href="information.jsp"><button style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Update</button></a>
        </div>
</html>
