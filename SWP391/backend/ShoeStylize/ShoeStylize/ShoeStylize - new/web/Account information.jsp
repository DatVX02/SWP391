<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\Account information.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="shoes">
        <div class="header_info">
            <a href="Account information.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="../../../Order/OrderDetail.jsp"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="../../../Cart/MyCart.jsp"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="../Blog/Blog.jsp"><img
                    src="image\blog (2).png "
                    alt="shopping-cart">News</a>
        </div>
    </div>
    <!-- menu -->
    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png"
                    style="width: 15px; transform: translateY(02px);">
                <a href="information.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png"
                    style="width: 15px; transform: translateY(02px);">
                <a href="ChangePassword.jsp">Change password</a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="AccountManagement.jsp">
                    Order management
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="./Support.jsp">
                    Support
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="Suggestions .jsp">Suggestions </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png"
                    style="width: 15px;" />
                <a href="../HomePage/HomePage(no login)/HomePage.jsp">Log out </a>
            </ul>
        </div>


        <div class="information_right">
            <h2>Account information</h2>
            <form action="" method="">
                <div>
                    <h3>FullName</h3>
                    <input type="text" style="width: 200px;" required readonly>
                </div>

                <div>
                    <h3>Email</h3>
                    <input type="email" required style="width: 200px;" readonly>
                </div>

                <div>
                    <h3>Phone Number</h3>
                    <input type="tel" required style="width: 200px;" readonly>
                </div>

                <div>
                    <h3>Date of Birth</h3>
                    <input type="date" style="width: 200px;" readonly>
                </div>

                <div>
                    <h3>
                        Gender
                    </h3>

                    <input type="radio" class="from1" id="male" name="gen" value="Male" readonly> Male
                    <input type="radio" class="from1" id="female" name="gen" value="Female" readonly>Female
                    <input type="radio" class="from1" id="other" name="gen" value="Other" readonly>Other

                </div>
            </form>
            <a href="../Profile/Update information.jsp"><button
                    style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Update</button></a>

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