<%-- 
    Document   : homepage
    Created on : Oct 21, 2023, 1:18:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\HomePage.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>

<body>
    <!-- header -->
    <div class="header">
        <img src="image\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png"
            alt="Shoes stylize">
        <div style="color: white;">
            <img src="image\user (1).png"
                alt="profile">Profile
            <img src="image\heart.png"
                alt="Orders">Orders
            <img src="image\shopping-cart.png"
                alt="shopping-cart">My cart
        </div>
    </div>
    <!-- information left -->
    <div class="information_left" style="width: 40%;">
        <div>
            <h3>
                Category</h3>
            <ul style="list-style-type: none;">
                <li>Sport</li>
                <li>Party</li>
            </ul>
            <h3>
                Brands
            </h3>
            <ul>
                <input type="checkbox">Nike <br>
                <input type="checkbox">Jordan <br>
                <input type="checkbox">Adidas <br>
                <input type="checkbox"> Puma <br>
                <input type="checkbox">Converse <br>
            </ul>

            <h3>Price Range
                <img src="" alt="">
            </h3>

            Min <br>
            <input type="number" style="border-radius: 5px; border: 0.5px solid #fff; padding: 10px;" placeholder="0">
            <br>
            Max <br>
            <input type="number" style="border-radius: 5px; border: 0.5px solid #fff; padding: 10px;"
                placeholder="9999999">
            <br>
            <button>Apply</button>
        </div>

        <div>
            <h3>Ratings</h3>
            <!-- 5 start -->
            <input type="checkbox">
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <br>
            <!-- 4 star -->
            <input type="checkbox">
            <span class="fa fa-star checked "></span>
            <span class="fa fa-star checked "></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>

            <br>
            <!-- 3 star -->
            <input type="checkbox">
            <span class="fa fa-star  checked "></span>
            <span class="fa fa-star checked "></span>
            <span class="fa fa-star checked "></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>



            <br>
            <!-- 2 star -->
            <input type="checkbox">
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>

            <br>
            <!-- 1 star -->
            <input type="checkbox">
            <span class="fa fa-star checked "></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
        </div>




    </div>

</body>

</html>
