<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Store Manage</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS/AddShoes.css">
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
        <a href="homepage.jsp"><img
                src="image\shoelogo.png"
                alt="shoes"></a>
        <div class="header_info">
            <a href="../../Profile/Account information.html"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <!-- <a href="#"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="../../../../Cart/MyCart.html"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a> -->
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
            <a href="Login.jsp">Logout</a>
        </div>
        <div style="width: 79%; float:right" class="addBLog">
            <h2>Add New Shoes</h2>
            <form action="MainController" method="post">
                <p>Shoes Name: <input type="text" name="txtName" style="margin-left: 70px;" /></p>
                <p>Brand Id:<input type="text" name="txtBrand" /></p>
                <p>Price: <input type="number" name="txtPrice" min="0" style="margin-left:122px;" /></p>
                <p>Quantity: <input type="number" name="txtQuantity" min="0" style="margin-left: 98px;"/></p>
                <p>Description: <textarea name="txtDesc" style="width: 70%; margin-left: 78px;"></textarea></p>
                <input type="submit" name="btAction" value="Post Shoe" class="button" style="float: right; margin-right: 40px;">
            </form>
        </div>
    </div>

</body>

</html>