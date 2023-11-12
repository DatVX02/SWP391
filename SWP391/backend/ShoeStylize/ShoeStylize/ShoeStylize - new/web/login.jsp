<%-- 
    Document   : login
    Created on : Oct 11, 2023, 1:35:00 PM
    Author     : Administrator
--%>
<%@page import="Error.LoginInsertError"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="icon" href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS/login.css">
    </head>

    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="Shoes stylize">
        </div>
        <div class="form">
            <h1>Login Page</h1>
            <form action="MainController">
                <% 
                  LoginInsertError error = (LoginInsertError) request.getAttribute("INSERTERROR");
                  if (error != null) {
                %>
                <font color="red">
                    <%= error.getInvalid()%>
                </font>
                <%
                  }
                %>
                <p style="font-weight: bold">Email:</p> <input type="text" name="txtEmail" value="" style="margin-bottom: 20px"/>
                <br/>

                <p style="font-weight: bold">Password:</p> <input type="password" name="txtPassword" value="" style="margin-bottom: 20px"/>
                <br/>

                <div style="font-style: italic;" class="form_2">
                    <a href="FP.jsp">
                        <h4> Forget password</h4>
                    </a>
                    <a href="register.jsp">
                        <h4 class="form_2_1"> Create new account</h4>
                    </a>
                </div>
                <br>
                <input type="submit" class="button"  name="btAction" value="Login"/>
            </form>
        </div>
    </body>

</html>