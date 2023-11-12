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
    <link rel="stylesheet" href="CSS\register.css">
    <title>Register</title>
    <link rel="icon"
        href="image\shoelogo.png">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>
    
    <form action="MainController">
        <div class="title">
        <h1>Sign up</h1>
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