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
        <script type="text/javascript">
                  function validateEmail() {
                        var email = document.getElementsByName('txtEmail');
                        if(email.length === 0) {
                              alert("Email can not empty");
                        } 
                        return false;
                  }
        </script>
    </head>
    <body>
        <div class="form">
        <h1>Login Page</h1>
        <form action="MainController">
            <p style="font-weight: bold">User ID:</p> <input type="text" name="txtUserID" value="" style="margin-bottom: 20px"/>

            <br/>
            
            <p style="font-weight: bold">Email:</p> <input type="email" name="txtEmail" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Password:</p> <input type="password" name="txtPassword" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Phone:</p> <input type="text" name="txtPhone" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Birthday:</p> <input type="text" name="txtBirthDate" value="" style="margin-bottom: 20px"/>
            <br/>
            
            <p style="font-weight: bold">Image:</p> <input type="text" name="txtImage" value="" style="margin-bottom: 20px"/>
            <br/>
            <input type="submit"  onclick="return validateEmail()" name="btAction" value="Register"/>
        </form>
    </div>
    </body>
</html>
