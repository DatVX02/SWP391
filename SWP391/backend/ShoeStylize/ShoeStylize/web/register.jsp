<%-- 
    Document   : register
    Created on : Oct 13, 2023, 4:13:56 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <div class="form">
        <h1>Login Page</h1>
        <form action="MainController" method="post">           
            <p style="font-weight: bold">Email:</p> <input type="email" name="txtEmail" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Password:</p> <input type="password" name="txtPassword" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Username</p> <input type="text" name="txtUsername" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Phone:</p> <input type="text" name="txtPhone" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Birthday:</p> <input type="date" name="txtBirthDate" value="" style="margin-bottom: 20px"/>
            <br/>
            
<!--            <form action="/upload" method="POST" enctype="multipart/form-data">
                      <input name="photo" type="file">
            </form>
            -->
            <input type="submit" name="btAction" value="Register"/>
        </form>
    </div>
    </body>
</html>
