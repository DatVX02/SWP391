<%-- 
    Document   : addBlog
    Created on : Oct 29, 2023, 10:24:59 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Blog</title>
    <link rel="stylesheet" href="CSS\addBlog.css">
</head>

<body>

    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
        <button style="background: #FF0000; color: #fff;">Manage Blog</button>
    </div>

    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="manageUser.jsp">Account Management</a>
            <a href="manageBlog.jsp">Blog Management</a>
        </div>
        <div style="width: 79%; float:right" class="addBLog">
            <h2>Add Blog</h2>
            <form action="MainController" method="post">
                <p>Title: <input type="text" name="txtTieude" /></p>
                <p>Content: <input type="text" name="txtTen" /></p>
                <p>Poster: <input type="text" name="txtAccount" /></p>
                <p>Date submitted: <input type="date" name="txtDate" /></p>
                <p>Image: &nbsp<input type="file" id="img" name="img" accept="image/*"></p></br>
                <input type="hidden" name="userID" value="123">
                <input type="submit" name="btAction" value="AddBlog">
            </form>
        </div>
    </div>

</body>

</html>