<%-- 
    Document   : information
    Created on : Oct 18, 2023, 3:08:52 PM
    Author     : Administrator
--%>

<%@ page import="java.sql.SQLException" %>
<%@ page import="Database.DBUtils" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="Registration.RegistrationDAO" %>
<%@ page import="Registration.RegistrationDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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

                    try {
                        con = DBUtils.makeConnection();
                        if (con != null) {
                            String sql = "SELECT FullName, Email, PhoneNumber, Birthdate, Gender FROM Users WHERE UserID = ?";
                            stm = con.prepareStatement(sql);
                            stm.setObject(1, session.getAttribute("id"));
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
            <h2>Account Information</h2>
            <form action="MainController">
                <div>
                    <h3>Full Name</h3>
                    <input type="text" name="txtFullName" value="<%= session.getAttribute("FullName")%>" style="width: 200px;" required>
                </div>

                <div>
                    <h3>Email</h3>
                    <input type="email" name="txtEmail" value="<%= session.getAttribute("Email")%>" required style="width: 200px;">
                </div>

                <div>
                    <h3>Phone</h3>
                    <input type="tel" name="txtPhone" value="<%= session.getAttribute("PhoneNumber")%>" required style="width: 200px;">
                </div>

                <div>
                    <h3>Birth Date</h3>
                    <input type="date" name="birthDate" style="width: 200px;" value="<%= session.getAttribute("Birthdate")%>">
                </div>

                <div>
                    <h3>Gender</h3>
                    <input type="radio" class="from1" id="male" name="gen" value="Male" <% if ("Male".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Male
                    <input type="radio" class="from1" id="female" name="gen" value="Female" <% if ("Female".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Female
                    <input type="radio" class="from1" id="other" name="gen" value="Other" <% if ("Other".equals(session.getAttribute("Gender"))) { %> checked <% }%>>Other
                </div>
                
                <div>
                    <input type="hidden" name="txtUserID" value="<%= session.getAttribute("id")%>"> 
                </div>

                <button name="btAction" value="Update" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Submit </button>
            </form>
        </div>
    
</body>

</html>