<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\AccountManagement.css">
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
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
    </div>

    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png"
                    style="width: 15px; transform: translateY(02px);">
                <a href="Account information.jsp">Account information </a>
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
            <h2>Order Management</h2>
            <ul style="list-style-type: none; ">
                <li>All</li>
                <li>Awaiting approval</li>
                <li>Complete</li>
                <li>Cancel</li>
            </ul>
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