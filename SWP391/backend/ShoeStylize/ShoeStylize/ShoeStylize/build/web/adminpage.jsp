<%-- 
    Document   : adminpage
    Created on : Oct 27, 2023, 8:24:22 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\adminpage.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>

    <div class="AD">
        <h1 style="font-size: 50px;">Admin Page</h1>
        <a href="manageUser.jsp" >
        <button style="width: 200px; background-color: red; padding: 25px 30px; border: 1px solid black; cursor: pointer; text-decoration: none; color: white; font-size: 20px;">Manage User</button></a>
        <br>
        <a href="manageBlog.jsp" style="color: white; text-decoration: none; font-size: 20px;">
        <button style="width: 200px; background-color: red; padding: 20px; border: 1px solid black; margin-top: 20px; cursor: pointer; color: white; text-decoration: none; font-size: 20px;">Manage Blog</button></a>
    </div>
</body>
</html>