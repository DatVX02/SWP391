<%-- 
    Document   : addBlog_provider
    Created on : Nov 13, 2023, 9:38:47 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Blog</title>
    <link rel="stylesheet" href="CSS\addBlog_provider.css">
    <link rel="icon" href="image\shoelogo.png">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="shoes">
        <div class="header_info">
            <a href="information0.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
<!--            <a href="#"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="#"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>-->
            <a href="#"><img
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
    </div>
    <div class="manage">
       <div style="width: 20%; float:left" class="managefunction">
            <a href="order_provider.jsp">Order statictics</a>
            <a href="cost.jsp">Cost statictics</a>
            <a href="blog_provider.jsp">Blog statictics</a>
            <a href="store.jsp">Store manage</a>
        </div>
        <div style="width: 79%; float:right" class="addBLog">
            <h2>Add Blog</h2>
            <form action="MainController" method="post">
                <p>Title: <input type="text" name="txtTitle" /></p>
                <p>Content: <textarea type="text" name="txtContent" style="width: 70%; margin-left: 100px; padding-right: 120px ;"></textarea>
                <p>Poster: <input type="text" name="txtAccount" value="<%= session.getAttribute("id") %>"  readonly /></p>
                <p>Date submitted: <input type="date" name="txtDate" /></p>
                <input type="hidden" name="userID" value="<%= session.getAttribute("id") %>">
                <input type="submit" name="btAction" value="Post" class="button">
            </form>
        </div>
    </div>

</body>

</html>