<%-- 
    Document   : information
    Created on : Oct 18, 2023, 3:08:52 PM
    Author     : Administrator
--%>

<%@ page import="java.sql.SQLException" %>
<%@ page import="Database.DBUtils" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="Registration.RegistrationDAO" %>
<%@ page import="Registration.RegistrationDTO" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

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
                <a href="information0.jsp">Account information </a>
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
            <h2>Account Information</h2>
            <form action="MainController">
                <div>
                    <h3>Full Name</h3>
                    <input type="text" name="txtFullName" value="" style="width: 200px;" required>
                </div>
                
                <div>
                    <h3>Email</h3>
                    <input type="email" name="txtEmail" value="" required style="width: 200px;">
                </div>
                
                <div>
                    <h3>Phone</h3>
                    <input type="tel" name="txtPhone" value="" required style="width: 200px;">
                </div>

                <div>
                    <h3>Birth Date</h3>
                    <input type="date" name="birthDate" style="width: 200px;">
                </div>
                
                <div>
                    <h3>
                        Gender
                    </h3>
                    <input type="radio" class="from1" id="male" name="gen" value="Male">Male
                    <input type="radio" class="from1" id="female" name="gen" value="Female">Female
                    <input type="radio" class="from1" id="other" name="gen" value="Other">Other
                </div>
                
                <div>
                    <input type="hidden" name="txtUserID" value="<%= userID %>"> 
                </div>

                <button name="btAction" value="Update" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Submit </button>
            </form>
        </div>
    
</body>

</html>