<%@page import="Registration.RegistrationDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Database.DBUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Change Password</title>
        <link rel="icon" href="image/logo/shoelogo.png">
        <link href="ChangePassword.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>

    <body>
        <div class="header">
            <a href="homepage1.jsp"><img src="../../image/logo/logo.png"
                                        alt="shoes"></img></a>
            <div class="header_info">
                <a href="Update.jsp"><img
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
            </div>
        </div>
        <div class="information_left">
            <div>
                <ul class="information_left_1">
                    <img src="../../image/logo/user.png"
                         style="width: 15px; transform: translateY(02px);">
                    <a href="Update.jsp">Account information </a>
                </ul>

                <ul class="information_left_2">
                    <img src="../../image/logo/padlock.png"
                         style="width: 15px; transform: translateY(02px);">
                    <a href="ChangePassword1.jsp">Change password</a>
                </ul>

<!--                <ul class="information_left_3">
                    <img src="image/logo/checklist.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="accountManagement.jsp">
                        Order management
                    </a>
                </ul>

                <ul class="information_left_4">
                    <img src="image/logo/support.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="support.jsp">
                        Support
                    </a>
                </ul>

                <ul class="information_left_5">
                    <img src="image/logo/feedback.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="feedback.jsp">Suggestions </a>
                </ul>-->

                <ul class="information_left_6">
                    <img src="../../image/logo/logout.png"
                         style="width: 15px;" />
                    <a href="../../homepage_guest.jsp  ">Log out </a>
                </ul>
            </div>
            <%
                RegistrationDAO dao = new RegistrationDAO();
                dao.changePassword(request);
            %>
            <div class="information_right">
                <h2>Change Password</h2>
                <form action="MainController">

                    <input type="hidden" name="txtOldPasswordConfirm" value="<%= session.getAttribute("Password")%>" >
                    <input type="hidden" name="txtUserID" value="<%= session.getAttribute("id")%>" >

                    <div>
                        <h4>Old password</h4>
                        <input type="password" name="txtOldPassword" required>
                    </div>
                    <div>
                        <h4>New password</h4>
                        <input type="password" name="txtPassword" required>
                    </div>
                    <div>
                        <h4>Confirm password</h4>
                        <input type="password" name="txtConfirm" required>
                        <br>
                    </div>
                    <div>
                        <button name="btAction" value="Change Password" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px; margin-bottom: 15px">Change</button>
                    </div>

                </form>
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
