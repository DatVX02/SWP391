<%-- 
    Document   : information0
    Created on : Oct 29, 2023, 8:31:02 PM
    Author     : Administrator
--%>
<%@page import="Registration.RegistrationDAO"%>
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
        <title>Account information</title>
        <link rel="icon" href="image/logo.png">
        <link href="../Provider/Account information.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>


    <body>
        <div class="header">
            <a href="homepage2(admin).jsp"><img src="../../image/logo/logo.png"
                                        alt="shoes"></img></a>
            <div class="header_info">
                <a href="homepage1.jsp"><img
                        src="../../image/logo/user (1).png"
                        alt="profile">Profile</a>
<!--                <a href="orderDetail.jsp"><img
                        src="image/logo/heart.png"
                        alt="Orders">Orders</a>
                <a href="myCart.jsp"><img
                        src="image/logo/shopping-cart.png"
                        alt="shopping-cart">My cart</a>-->
                <a href="blog.jsp"><img
                        src="../../image/logo/blog (2).png "
                        alt="shopping-cart">News</a>
<!--                <a href="homepage_guest.jsp"><img
                        src="image/logo/power (1).png "
                        alt="shopping-cart">Logout</a>-->   
            </div>
        </div>
        <!-- menu -->
        <div class="information_left">
            <div>
                <ul class="information_left_1">
                    <img src="../../image/logo/user.png" style="width: 15px; transform: translateY(02px);">
                    <a href="#">Account information </a>
                </ul>

                <ul class="information_left_1">
                    <img src="../../image/logo/padlock.png" style="width: 15px; transform: translateY(02px);">
                    <a href="../Provider/ChangePassword1.jsp">Change password</a>
                </ul>

<!--                <ul class="information_left_2">
                    <img src="image/logo/checklist.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="accountManagement.jsp">
                        Order management
                    </a>
                </ul>-->

<!--                <ul class="information_left_3">
                    <img src="image/logo/support.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="support.jsp">
                        Support
                    </a>
                </ul>-->

<!--                <ul class="information_left_4">
                    <img src="image/logo/feedback.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="feedback.jsp">Suggestions </a>
                </ul>-->

                <ul class="information_left_5">
                    <img src="../../image/logo/logout.png" style="width: 15px;" />
                    <a href="homepage_guest.jsp">Log out </a>
                </ul>
            </div>
        </div>

        <%
            RegistrationDAO dao = new RegistrationDAO();
            dao.getInfo(request);
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
                    <input type="hidden" name="txtUserID" value="<%= request.getAttribute("id")%>"> 
                </div>
            </form>
                <a href="../../Profile-provi-admin/Provider/information.jsp"><button style="border-radius: 20px; background-color: #EBAA5D; margin-top: 20px; margin-bottom: 15px">Update</button></a>
                
        </div>

        <div class="footer">
            <div style="float:right; transform: translateX(-20px)" >
                <img src="../../image/logo/facebook.png"
                     alt="Facebook" />
                <img src="../../image/logo/twitter.png"
                     alt="twitter" />
                <img src="../../image/logo/linkedin.png"
                     alt="linkedin" />
                <img src="../../image/logo/instagram (1).png"
                     alt="Instagram" />
                <img src="../../image/logo/youtube (5).png"
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
