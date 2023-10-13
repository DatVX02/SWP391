<%-- 
    Document   : login
    Created on : Oct 11, 2023, 1:35:00 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="icon" href="image\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png">
        <link rel="stylesheet" href="CSS/login.css">
    </head>

    <body>
        <div class="header">
            <img src="image\shoe-logo-design-concept-shoes-logo-template-man-fashion-logo-design-template_9850-9282.png"
                 alt="Shoes stylize">
        </div>
        <div class="form">
            <h1>Login Page</h1>
            <form action="MainController">
                <p style="font-weight: bold">Email:</p> <input type="text" name="txtEmail" value="" style="margin-bottom: 20px"/>
                <br/>

                <p style="font-weight: bold">Password:</p> <input type="password" name="txtPassword" value="" style="margin-bottom: 20px"/>
                <br/>

                <div style="font-style: italic;" class="form_2">
                    <a href="#">
                        <h4> Forget password</h4>
                    </a>
                    <a href="Register.jsp">
                        <h4 class="form_2_1"> Create new account</h4>
                    </a>
                </div>
                <br>
                <input type="submit"  name="btAction" value="Login"/>
            </form>
        </div>
    </body>

</html>