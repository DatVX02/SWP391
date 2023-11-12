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
            <a href="homepage.jsp"><img src="image\shoelogo.png"
                                        alt="shoes"></img></a>
            <div class="header_info">
                <a href="information.jsp"><img
                        src="image\user (1).png"
                        alt="profile">Profile</a>
                <a href="OrderDetail.jsp"><img
                        src="image\heart.png"
                        alt="Orders">Orders</a>
                <a href="MyCart.jsp"><img
                        src="image\shopping-cart.png"
                        alt="shopping-cart">My cart</a>
                <a href="Blog.jsp"><img
                        src="image\blog (2).png "
                        alt="shopping-cart">News</a>
            </div>
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
            RegistrationDAO dao = new RegistrationDAO();
            dao.getInfo(request);
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
                    <input type="radio" class="from1" id="male" name="gen" value="Male" <% if ("Male".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Male<br>
                    <input type="radio" class="from1" id="female" name="gen" value="Female" <% if ("Female".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Female<br>
                    <input type="radio" class="from1" id="other" name="gen" value="Other" <% if ("Other".equals(session.getAttribute("Gender"))) { %> checked <% }%>>Other<br>
                </div>

                <div>
                    <input type="hidden" name="txtUserID" value="<%= session.getAttribute("id")%>"> 
                </div>

                <button name="btAction" value="Update" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Submit </button>
            </form>
        </div>
        <div class="footer">
            <div style="float:right">
                <img src="image\facebook.png"
                     alt="Facebook" />
                <img src="image\twitter.png"
                     alt="twitter" />
                <img src="image\linkedin.png"
                     alt="linkedin" />
                <img src="image\instagram (1).png"
                     alt="Instagram" />
                <img src="image\youtube (5).png"
                     alt="youtube" />
            </div>
            <div style=" float:right">
                <table class="center">
                    <tr class="tableHeader">
                        <td>About Us</td>
                        <td>For Users</td>
                        <td>Information</td>
                    </tr>
                    <tr>
                        <td>About Us</td>
                        <td>Login</td>
                        <td>Help Center</td>
                    </tr>
                    <tr>
                        <td>Find Store</td>
                        <td>Register</td>
                        <td>Money Refund</td>
                    </tr>
                    <tr>
                        <td>Categories</td>
                        <td>Settings</td>
                        <td>Shipping</td>
                    </tr>
                    <tr>
                        <td>Blogs</td>
                        <td>My Orders</td>
                        <td>Contact us</td>
                    </tr>
                </table>
            </div>
            <div style="clear: both" class="commerce">
                @2023 Ecommerce
            </div>
        </div>

    </body>

</html>
