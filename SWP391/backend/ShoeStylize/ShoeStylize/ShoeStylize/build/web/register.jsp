<%-- 
    Document   : register
    Created on : Oct 13, 2023, 4:13:56 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Register</title>
        <link rel="icon" href="image\shoelogo.png">
        <link href="Login/Register.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>
    <style>
        form h3{
            font-size: 20px;
            margin-top: 20px;
        }

        .form .from1{
            width: 20px;
        }

        button {
            background-color: #FF9900;
            color: #fff;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            max-width: 20%;
            margin-left: 700px;
            margin-top: 15px;
        }

        input {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
        }
    </style>
    <body>
        <div class="header">
            <img src="image/logo/logo.png"
                 alt="Shoes stylize"></img>
        </div>

        <form action="MainController">
            <div class="title">
                <h1 style="font-size: 40px; margin-top: 20px">Sign up</h1>
                <div class="form">
                    <h3>Email</h3>
                    <input type="email" name="txtEmail" value="" required="@gmail.com">
                </div>

                <div class="form">
                    <h3>Full Name</h3>
                    <input type="text" name="txtFullName" value="" required>
                </div>

                <div class="form">
                    <h3>Password</h3>
                    <input type="password" name="txtPassword" value="" required>
                </div>

                <div class="form">
                    <h3>Confirm password</h3>
                    <input type="password" name="txtConfirmPassword" value="" required style="width: 50%;">
                    <div style="margin-left: 350px; margin-top: -90px;">
                        <h3>Gender</h3>
                        <input type="radio" class="from1" id="male" name="gen" value="Male">Male
                        <input type="radio" class="from1" id="female" name="gen" value="Female">Female
                        <input type="radio" class="from1" id="other" name="gen" value="Other">Other
                    </div>

                </div>

                <div class="form" style="margin-top: 30px;">
                    <h3>Phone</h3>
                    <input type="tel" name="txtPhone" value="" required style="width: 50%;">
                </div>

                <div style="margin-left: 350px; margin-top: -100px; ">
                    <h3>Birthday</h3>
                    <input type="date" name="birthDate" required>
                </div>
                <button name="btAction" value="Register" style="text-decoration: none; color: black;">Register</button>

            </div>
        </form>
    </body>

</html>