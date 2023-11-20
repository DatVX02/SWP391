<%-- 
    Document   : myCart
    Created on : Nov 14, 2023, 11:21:08 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS/myCart.css">
    <!--Bootstrap CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

    <!--font awesome cdn link-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

</head>

<body>
    <!-- header -->
    <div class="header">
        <img src="image\shoelogo.png"
            alt="shoes">
        <div class="header_info">
            <a href="infomation0.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="orderDetail.jsp"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="myCart.html"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="#"><img
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
    </div>
    <!-- Cart -->
    <div>
        <h1 style="margin-left: 150px; margin-top: 20px; margin-bottom: 20px;">Your Cart</h1>
        <form action="*" method="post">
            <div class="product">
                <div class="column left">
                    <img src="<%= session.getAttribute("Image") %>" alt="Product">
                </div>
                <div class="column middle">
                    <h2>Name product</h2>
                    <p>Price:&nbsp&nbsp&nbsp<!-- Price --></p>
                    <p>Quantity:&nbsp&nbsp <input type="number" value="*" min="0" max="9999999999"></p>
                </div>
                <div class="column right">
                    <!-- <a href="../Order/OrderDetail.html"><input type="button" value="Update"/></a></br> -->
                    <input type="button" value="Detail" />
                </div>
            </div>

            
            <!-- KẾT THÚC VÒNG LẶP -->
            <h3>Total amount:<!-- Tong Tien --></h3></br>
            <div class="order">
                <a href="orderDetail.jsp"><input type="button" value="Order"></a>
            </div>
        </form>
    </div>

    <!-- footer -->
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