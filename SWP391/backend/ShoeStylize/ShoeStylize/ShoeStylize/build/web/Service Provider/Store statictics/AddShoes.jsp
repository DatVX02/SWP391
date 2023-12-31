<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Store Manage</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link href="../Blog statictics/AddBlog.css" rel="stylesheet" type="text/css"/>
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
            <a href="../../Profile-provi-admin/Provider/homepage1.jsp"><img
                    src="../../image/logo/logo.png"
                    alt="shoes"></a>
            <div class="header_info">
                <a href="../../Profile-provi-admin/Provider/information0_1.jsp"><img
                        src="../../image/logo/user (1).png"
                        alt="profile">Profile</a>
                <!-- <a href="#"><img
                        src="C:\Users\ADMIN\Desktop\SWP391\SWP391\New file Shoes stylize (html)\Shoes stylize (by html)\image\logo\heart.png"
                        alt="Orders">Orders</a>
                <a href="../../../../Cart/MyCart.html"><img
                        src="C:\Users\ADMIN\Desktop\SWP391\SWP391\New file Shoes stylize (html)\Shoes stylize (by html)\image\logo\shopping-cart.png"
                        alt="shopping-cart">My cart</a> -->
                <a href="#"><img
                        src="../../image/logo/blog (2).png"
                        alt="shopping-cart">News</a>
            </div>
        </div>

        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="../../Profile-provi-admin/Provider/homepage1.jsp">Home</a>
                <a href="../../order_provider.jsp">Order statictics</a>
                <a href="../../cost.jsp">Cost statictics</a>
                <a href="../../blog_provider.jsp">Blog statictics</a>
                <a href="../../store.jsp">Store manage</a>
                <a href="../../homepage_guest.jsp">Log out</a>
            </div>
            <div style="width: 79%; float:right" class="addBLog">
                <h2>Add New Shoes</h2>
                <form action="../../MainController" method="post">
                    <p>Shoes Name <input type="text" name="txtShoeName" style="margin-left: 70px;" /></p>
                    <p>Brand Name<input type="text" name="txtBrandName" /></p>
                    
                    <p>Image: <input type="url" name="txtURL"
                                     style="width: 80%;  padding-right: 120px ;">

                    <p>Price: <input type="number" name="txtPrice" min="0" style="margin-left:122px;" /></p>
                    <p>Quantity: <input type="number" name="txtQuant" min="0" style="margin-left: 98px;"/></p>
                    <p>Description: <textarea type="text" name="txtDes" style="width: 80%; margin-left: 78px;"></textarea></p>
                    <input type="submit" name="btAction" value="Add Shoe" class="button" style="float: right; margin-right: 40px;">
                </form>
            </div>
        </div>

    </body>

</html>