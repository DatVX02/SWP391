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
        <link href="Login/Login.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

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
                    <h4>
                        <a href="FP.jsp">
                            Forget password
                        </a>
                    </h4>
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