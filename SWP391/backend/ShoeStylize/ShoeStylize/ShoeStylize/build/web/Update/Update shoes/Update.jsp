<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Shoes Page</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="../Update shoes/Update.css">
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
            <a href="../Profile/Account information.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="../../../Order/OrderDetail.jsp"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="../../../Cart/MyCart.jsp"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="../Blog/Blog.jsp"><img
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
    </div>
    <div class="Update_info">
        <h1>UPDATE</h1>
        <form action="" method="">
            <p style="font-weight: bold;">Store:</p> <!-- tên cửa hàng -->
            <b class="bt">ShoesID:</b><input type="text" name=""><br>
            <b>Shoes Name:</b> <input type="text" name=""><br>
            <b>Image:</b><!-- Hình ảnh --><br>
            <b>ImageURL:</b> <input type="url" name="url" id="url" placeholder="https://example.com"
                pattern="https://.*" size="30" required /><br>
            <b>Price:</b><input type="number" min="0" name="" id=""> <br>
            <b>Quantity:</b><input type="number" name="" id=""><br>
            <b>CategoryID Old:</b><input type="number" name="" id="" min="0"><br>
            <b>New CategoryID:</b> <input type="number" name="" id="" min="0"><br>
            <b>Import Date:</b><input type="date" name="" id=""><br>
            <b style="margin-top: 20px;">Status:</b>
            <select id="option1">
                <option value="valiable">avaliable</option>
                <option value="valiable">non-avaliable</option>
            </select><br>
            <input type="button" name="" value="Update" class="Button">
        </form>
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
    </div>
</body>

</html>