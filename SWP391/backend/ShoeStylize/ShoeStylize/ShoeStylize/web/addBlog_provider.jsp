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
        <title>Blog statictics</title>
        <link rel="icon"
              href="image/logo/shoelogo.png">
        <link href="Service Provider/Blog statictics/AddBlog.css" rel="stylesheet" type="text/css"/>
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>
    
    <body>
        <div class="header">
            <a href="Profile-provi-admin/Provider/homepage1.jsp"><img src="image/logo/logo.png"
                    alt="shoes"></a>
            <div class="header_info">
                <a href="Profile-provi-admin/Provider/information0_1.jsp"><img
                        src="image/logo/user (1).png"
                        alt="profile">Profile</a>
                <!--            <a href="#"><img
                                    src="image\heart.png"
                                    alt="Orders">Orders</a>
                            <a href="#"><img
                                    src="image\shopping-cart.png"
                                    alt="shopping-cart">My cart</a>-->
                <a href="#"><img
                        src="image/logo/blog (2).png"
                        alt="shopping-cart">News</a>
            </div>
        </div>
        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="Profile-provi-admin/Provider/homepage1.jsp">Home</a>
                <a href="order_provider.jsp">Order statictics</a>
                <a href="cost.jsp">Cost statictics</a>
                <a href="blog_provider.jsp">Blog statictics</a>
                <a href="store.jsp">Store manage</a>
                <a href="homepage_guest.jsp">Logout</a>
            </div>
            <div style="width: 79%; float:right" class="addBLog">
                <h2>Add Blog</h2>
                <form action="MainController" method="post">
                    <p>Title: <input type="text" name="txtTitle" /></p>
                    <p>Content: <textarea type="text" name="txtContent" style="width: 80%; margin-left: 100px; padding-right: 120px ;"></textarea>
                    <p>Poster: <input type="text" name="txtAccount" value="<%= session.getAttribute("id")%>"  readonly /></p>
                    <p>Date submitted: <input type="date" name="txtDate" /></p>
                    <input type="hidden" name="userID" value="<%= session.getAttribute("id")%>">
                    <input type="submit" name="btAction" value="Post" class="button">
                </form>
            </div>
        </div>

    </body>

</html>