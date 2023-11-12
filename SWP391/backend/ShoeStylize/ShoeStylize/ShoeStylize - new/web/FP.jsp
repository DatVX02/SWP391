<%@page import="Error.LoginInsertError"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS/FP.css">

</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize">
    </div> 

    <form action="MainController">
        <div class="input" >
            <h1>Forgot Password</h1>
            <h3>Email</h3>
            <input type="text" name="txtEmail" value="" required><br>
            <button name="btAction" value="Forgot Password">Forgot Password</button>
        </div>
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
    </form>
</body>
</html>
