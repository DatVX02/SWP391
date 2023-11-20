<%@page import="Error.LoginInsertError"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Forget Password</title>
        <link rel="icon" href="image\shoelogo.png">
        <link href="Login/FP.css" rel="stylesheet" type="text/css"/>
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

        <form action="MainController">
            <div class="input" >
                <h1 style="font-size: 40px">Forgot Password</h1>
                <h3 style="font-size: 20px">Email</h3>
                <input type="text" name="txtEmail" value="" required style="padding: 5px"><br>
                <button name="btAction" value="Forgot Password" style="
                        background-color: #FF9900;
                        color: #fff;
                        padding: 10px 15px;
                        border: none;
                        border-radius: 5px;
                        cursor: pointer;
                        transform: translateY(10px);
                        
                        
                        ">
                    Forgot Password</button>
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
