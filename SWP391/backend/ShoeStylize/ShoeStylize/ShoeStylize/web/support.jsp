<%-- 
    Document   : support
    Created on : Oct 18, 2023, 3:52:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Support</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\support.css">
</head>

<body>
    <div>
        <div class="header">
            <img src="image\shoelogo.png"
                alt="Shoes stylize"></img>
        </div>

        <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png" style="width: 15px; transform: translateY(02px);">
                <a href="information0.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png" style="width: 15px; transform: translateY(02px);">
                <a href="changePassword.jsp">Change password</a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png" style="width: 15px; transform: translateY(02px);" />
                <a href="accountManagement.jsp">
                    Order management
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png" style="width: 15px; transform: translateY(02px);" />
                <a href="support.jsp">
                    Support
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png" style="width: 15px; transform: translateY(02px);" />
                <a href="feedback.jsp">Suggestions </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png" style="width: 15px;" />
                <a href="login.jsp">Log out </a>
            </ul>
        </div>
        </div>

        

             <div class="information_right">
            <div class="information_right_1">
                <img
                    src="image\headphones.png">
                <p>Shopping Advice</p>
                <p>Operating time: 08:00 - 21:00</p>
                <p style="color: red;"><a style="text-decoration: none; color: red;" href="tel:1900 1772">Hotline: 1900 1772</a> </p>
            </div>

            <div class="information_right_2">
                <img
                    src="image\letterbox.png">
                <p>Complain</p>
                <p>Operating time: 08:00 - 21:00</p>
                <p style="color: red;"><a style="text-decoration: none; color: red;" href="tel:1900 1773 ">Hotline: 1900 1234</a> </p>
            </div>

            <div class="information_right_3">
                <img
                    src="image\insurance.png">
                <p>Policies and promotions</p>
                <p>Operating time: 08:00 - 21:00</p>
                <p style="color: red;"><a style="text-decoration: none; color: red;" href="tel:1900 1773 ">Hotline: 1900 1773</a> </p>
            </div>

            <div class="information_right_4">
                <img
                    src="image\gmail.png">
                <p>Email</p>
                <p style="color: red;"> <a style="text-decoration: none; color: red;"
                        href="mailto:@gmail.com">cskh@gmail.com</a></p>
            </div>

        </div>
    </div>
</body>

</html>
