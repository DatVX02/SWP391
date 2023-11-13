<%-- 
    Document   : store
    Created on : Nov 13, 2023, 9:22:19 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Store manage</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\store.css">
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
            <a href="information0.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="#"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="../../../../Cart/MyCart.html"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="#"><img
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
    </div>

    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="order_provider.jsp">Order statictics</a>
            <a href="cost.jsp">Cost statictics</a>
            <a href="blog_provider.jsp">Blog statictics</a>
            <a href="store.jsp">Store manage</a>
        </div>
        <div style="width: 79%; float:right" class="bloglist">
            <div style="clear: both;" class="">
                <table>
                    <tr class="tablehead">
                        <td>Shoe ID </td>
                        <td>Shoe Name</td>
                        <td>Brand Name</td>
                        <td>Size</td>
                        <td>Price</td>
                        <td>Quantity</td>
                        <td>Description</td>
                        <td>Status</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</body>

</html>