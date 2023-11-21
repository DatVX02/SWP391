<%-- 
    Document   : feedback
    Created on : Oct 18, 2023, 3:59:05 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Feedback</title>
        <link rel="icon" href="image/logo/shoelogo.png">
        <link href="Profile/Feedback.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>
    <style>
        .footer {
            background-color: #979797;
            width: 100%;
            margin-top: 100px;
        }

        .center {
            margin-left: auto;
            margin-right: auto;
            margin-top: 20px;
            transform: translateX(-380px);
            margin-bottom: 20px;
        }

        .center tr td {
            width: 42%;
            padding: 4px;
            color: white;
        }

        .footer img {
            max-width: 30px;
            margin: 20px 20px 10px 10px;
        }

        .commerce  {
            text-align: center;
            color: #606060;
            background: white;
            padding: 10px;
        }


        .center .tableHeader td {
            font-weight: bolder;
            color: black;

        }
    </style>
    <body>
        <div class="header">
            <a href="homepage.jsp"><img src="image/logo/logo.png"
                                        alt="shoes"></img></a>
            <div class="header_info">
                <a href="information0.jsp"><img
                        src="image/logo/user (1).png"
                        alt="profile">Profile</a>
                <a href="orderDetail.jsp"><img
                        src="image/logo/heart.png"
                        alt="Orders">Orders</a>
                <a href="myCart.jsp"><img
                        src="image/logo/shopping-cart.png"
                        alt="shopping-cart">My cart</a>
                <a href="blog.jsp"><img
                        src="image/logo/blog (2).png "
                        alt="shopping-cart">News</a>
            </div>
        </div>
        <!-- menu -->
        <div class="information_left">
            <div>
                <ul class="information_left_1">
                    <img src="image/logo/user.png" style="width: 15px; transform: translateY(02px);">
                    <a href="information0.jsp">Account information </a>
                </ul>

                <ul class="information_left_1">
                    <img src="image/logo/padlock.png" style="width: 15px; transform: translateY(02px);">
                    <a href="changePassword.jsp">Change password</a>
                </ul>

                <ul class="information_left_2">
                    <img src="image/logo/checklist.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="accountManagement.jsp">
                        Order management
                    </a>
                </ul>

                <ul class="information_left_3">
                    <img src="image/logo/support.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="support.jsp">
                        Support
                    </a>
                </ul>

                <ul class="information_left_4">
                    <img src="image/logo/feedback.png" style="width: 15px; transform: translateY(02px);" />
                    <a href="feedback.jsp">Suggestions </a>
                </ul>

                <ul class="information_left_5">
                    <img src="image/logo/logout.png" style="width: 15px;" />
                    <a href="homepage_guest.jsp">Log out </a>
                </ul>
            </div>
        </div>

        <div class="information_right">
            <h2 style="color: #FF0000; transform: translateX(40px)">Suggestions</h2>
            <div class="information_right_1">
                <img src="image/logo/feedback (1).png"
                     alt="feedback">
                <h3>Please rate your satisfaction with the promotion program.<br>
                    Please give us more feedback to improve better</h3>
            </div>
            <div class="information_left_2">
                <h2 style="color: #DB00FF; font-size: 30px; transform: translateX(-80px)">FeedBack information</h2>
                <h3 style="color: #FF0000; margin-left: 50px;">Link Feedback:
                    <a href="https://forms.gle/pczGG6aRGd8LBRnM9" style="color: black; text-decoration: underline;">https://forms.gle/pczGG6aRGd8LBRnM9</a>
                </h3>
                <h3 style="color:#FF0000; margin-left: 50px;">Contact via the store's hotline number:
                    <a style="color: black; font-weight: normal; text-decoration: none; " href="tel:1900 1772">1900 1772</a>
                </h3>
            </div>
        </div>
        <div class="footer">
            <div style="float:right; transform: translateX(-20px)">
                <img src="image/logo/facebook.png"
                     alt="Facebook" />
                <img src="image/logo/twitter.png"
                     alt="twitter" />
                <img src="image/logo/linkedin.png"
                     alt="linkedin" />
                <img src="image/logo/instagram (1).png"
                     alt="Instagram" />
                <img src="image/logo/youtube (5).png"
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