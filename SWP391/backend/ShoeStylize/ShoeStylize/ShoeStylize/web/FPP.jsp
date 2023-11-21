<%-- 
    Document   : FPP
    Created on : Nov 1, 2023, 9:31:58 PM
    Author     : SivaRyi
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="Database.DBUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Reset Password</title>
        <link rel="icon" href="image\shoelogo.png">
        <link href="Login/FPP.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>


    <body>
        <div class="header">
            <img src="image/logo/logo.png"
                 alt="Shoes stylize">
        </div>


        <form action="MainController">
            <div class="input">
                <h1 style="font-size: 40px">Reset Password</h1>
                <input type="hidden" name="txtUserID" value="<%= request.getAttribute("id") %>" >
                <div>
                    <h3 style="font-size:  20px">New password</h3>
                    <input type="password" name="txtPassword" required>
                </div>
                <div>
                    <h3 style="font-size: 20px; margin-top: 10px">Confirm password</h3>
                    <input type="password" name="txtConfirm" required>
                    <br>
                </div>
                <!-- popup -->
                <button name="btAction" value="Reset Password" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">
                    <a class="dialog-btn" href="#my-dialog" style="text-decoration: none;">Reset button</a>

                    <div class="dialog overlay" id="my-dialog">
                        <!--<a href="#" class="overlay-close"></a>-->

                        <div class="dialog-body">
                            <img
                                src="image\yes.png">
                            <div class="dialog-close-btn">&times;</div>
                            <h3>Reset Password Successful</h3>
                            <p style="color: #EBAA5D; font-style: italic;"><a href="login.jsp">Return to Login</a></p>
                        </div>
                    </div>
                </button>
        </form>

        <a href="login.jsp" style="text-decoration: none;">
            <p style="font-style: italic; color: hsla(0, 21%, 65%, 0.774) ;">Back to login</p>
        </a>
    </div>






</body>

</html>
