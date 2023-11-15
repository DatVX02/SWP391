<%-- 
    Document   : manageUser
    Created on : Oct 29, 2023, 10:30:14 PM
    Author     : Administrator
--%>

<%@page import="Registration.RegistrationDAO"%>
<%@page import="java.util.List"%>
<%@page import="Registration.RegistrationDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Management</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS\manageUser.css">
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    </head>
    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="shoes">
            <button style="background: #FF0000; color: #fff;">Manage Account</button>
        </div>
        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="manageUser.jsp">Account Management</a>
                <a href="manageBlog.jsp">Blog Management</a>
                <a href="login.jsp">Logout</a>
            </div>
            <div style="width: 79%; float:right" class="searchlist">
                <div>
                    <form action="MainController" method="post">
                        <input type="text" name="txtSearchbyaccount" placeholder="Find some account">
                        <input type="submit" name="btAction" value="Search" class="button">
                    </form>
                </div>
                <div style="clear: both;">
                    <%
                        List<RegistrationDTO> result = null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbyaccount");
                        if (searchValue != null) {
                            result = (List<RegistrationDTO>) request.getAttribute("SEARCHRESULT");
                        } else {
                            dao.showUser();
                            result = dao.getListAccounts();
                        }
                        if (result != null) {
                    %>
                    <table>
                        <thead>
                            <tr class="tablehead">
                                <td>UserID</td>
                                <td>Email</td>
                                <td>Password</td>
                                <td>FullName</td>
                                <td>PhoneNumber</td>
                                <td>Birthdate</td>
                                <td>RoleID</td>
                                <td>Gender</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (RegistrationDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <input type="text" name="id" value="<%= dto.getUserID()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtEmail" value="<%= dto.getEmail()%>" />
                                </td>

                                <td>
                                    <input type="password" name="txtPassword" value="<%= dto.getPassword()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtFullname" value="<%= dto.getFullname()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtPhone" value="<%= dto.getPhone()%>" />
                                </td>

                                <td>
                                    <input type="text" name="birthDate" value="<%= dto.getBirthDate()%>" />
                                </td>

                                <td>
                                    <input type="text" name="roleID" value="<%= dto.getRoleID()%>" />
                                </td>

                                <td>
                                    <input type="radio" class="from1" id="male" name="gen" value="Male" <% if ("Male".equals(dto.getGender())) { %> checked <% } %>>Male<br>
                                    <input type="radio" class="from1" id="female" name="gen" value="Female" <% if ("Female".equals(dto.getGender())) { %> checked <% } %>>Female<br>
                                    <input type="radio" class="from1" id="other" name="gen" value="Other" <% if ("Other".equals(dto.getGender())) { %> checked <% }%>>Other<br>
                                </td>

                                <td>
                                    <input type="submit" value="Delete" name="btAction" />
                                </td>

                            </tr>
                        </form>
                        <%
                            }
                        %>

                        </tbody>
                    </table>

                    <%
                    } else {
                    %>
                    <h2>No user available.</h2>
                    <%
                        }
                    %>
                </div>
            </div>
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
