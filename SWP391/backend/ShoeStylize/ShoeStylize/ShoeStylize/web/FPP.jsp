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
        <title>Login</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS/FPP.css">

    </head>

    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="Shoes stylize">
        </div>


        <form action="MainController">
            <div class="input">
                <h1>Reset Password</h1>
                <input type="hidden" name="txtUserID" value="<%= request.getAttribute("id") %>" >
                <div>
                    <h3>New password</h3>
                    <input type="password" name="txtPassword" required>
                </div>
                <div>
                    <h3>Confirm password</h3>
                    <input type="passwd" name="txtConfirm" required>
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
