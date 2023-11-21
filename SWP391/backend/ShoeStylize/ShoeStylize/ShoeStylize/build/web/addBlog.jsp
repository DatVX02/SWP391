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
        <link rel="icon"
              href="image/logo/logo.png">
        <link href="Admin/AddBlog.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    </head>

<body>
    
    <div class="header">
        <a><img src="image/logo/logo.png"
                alt="Shoes stylize"></img></a>
    </div>

    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="#">Home</a>
            <a href="manageUser.jsp">Account Management</a>
            <a href="manageBlog.jsp">Blog Management</a>
            <a href="homepage_guest.jsp">Logout</a>
        </div>
        <div style="width: 79%; float:right;" class="addBLog">
            <h2 style="margin-top: 20px;">Add Blog</h2>
            <form action="MainController" style="margin-right: 20px">
                <p>Title: <input type="text" name="txtTitle" required="" /></p>
                <p>Author: <input type="text" name="txtAccount" required="" /></p>
                <p>Content: <input type="text" name="txtContent" required="" /></p>
                <p>PostDay <input type="date" name="txtDate" /></p>
                <input type="hidden" name="userID" value="<%= session.getAttribute("id") %>">
                <input type="submit" name="btAction" value="Add Blog" class="button">
            </form>
        </div>
    </div>

</body>

</html>