<%-- 
    Document   : order
    Created on : Nov 3, 2023, 5:44:51 PM
    Author     : SivaRyi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Order</title>
    <link rel="stylesheet" href="CSS\Order.css">
    <link rel="icon"
        href="image\shoelogo.png">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="shoes">
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

        <div>
        <table class="title1">
            <tr>
                <td>OrderID</td>
                <td>OrderDate</td>
                <td>Total Cost</td>
                <td>Status</td>
                <td>Detail</td>
            </tr>
            <!-- Bat Dau Vong Lap-->
            <!-- Ket Thuc Vong Lap-->
        </table>
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
</body>

</html>
