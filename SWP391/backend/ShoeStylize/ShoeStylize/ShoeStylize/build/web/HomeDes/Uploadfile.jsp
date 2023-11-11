<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shoes Page</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="../HomeDes/Uploadfile.css">
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
        <div class="header_info" style="color: white;">
            <a href="../../../Login/admin/Profile/Account information.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="#"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="MyCart.jsp"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
        </div>
    </div>


    <button style="
            margin-top: 20px;
            border-radius: 20px;
            padding: 5px 20px;
            background: #FF9900;
            border: 0.5px;
            margin-left: 1250px;
            transform: translateX(150px);
            ">
        <a href="../../../Cart/MyCart.jsp" style="color: black; text-decoration: none;"> Done</a></button>

    <div class="information_left">
        <div class="information_left_1">
            <p>Left Outside</p>
            <div class="information_left_1_1">
                <form action="" method="">
                    <input id="file" name="file" type="text" accept="image/jpg image/png" />
                </form>
            </div>



        </div>
    </div>
</body>

</html>