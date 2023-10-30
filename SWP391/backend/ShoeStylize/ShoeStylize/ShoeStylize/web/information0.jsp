<%-- 
    Document   : information0
    Created on : Oct 29, 2023, 8:31:02 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Information</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\information.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>
    
    <% 
        String userID="";
        Cookie[] cookie = request.getCookies();
        if(cookie !=null){
            userID = cookie[cookie.length-1].getName();
        }
    %>
    
    <!-- menu -->
    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png" style="width: 15px; transform: translateY(02px);">
                <a href="information.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png" style="width: 15px; transform: translateY(02px);">
                <a href="ChangePassword.jsp">Change password</a>
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
            <h2>Account information</h2>
            <form action="" method="">
            <div>
                <h3>FullName</h3>
                <input type="text" style="width: 200px;" required>
            </div>

            <div>
                <h3>Email</h3>
                <input type="email" required style="width: 200px;">
            </div>

            <div>
                <h3>Phone Number</h3>
                <input type="number" required style="width: 200px;">
            </div>

            <div>
                <h3>Birth Date</h3>
                <input type="date" style="width: 200px;">
            </div>

            <div>
                <h3>
                    Gender
                </h3>

                <input type="radio" class="from1" id="male" name="gen" value="Male"> Male
                <input type="radio" class="from1" id="female" name="gen" value="Female">Female
                <input type="radio" class="from1" id="other" name="gen" value="Other">Other

            </div>
                
            <div>
                <input type="hidden" name="userID" value="123"> 
            </div>
        </form>
            <a href="information.jsp"><button style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Update</button></a>
        
        </div>
</html>
