<%-- 
    Document   : adminpage
    Created on : Oct 27, 2023, 8:24:22 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\adminpage.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
    <!--font awesome cdn link-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">


<body>
    <div class="header">
        <a href="homepage.jsp"><img src="image/logo/logo.png"
            alt="shoes"></a>
    </div>

    <div class="AD">
        <h1 style="font-size: 50px; margin-bottom: 50px;">Admin Page</h1>
        <a href="manageUser.jsp" >
        <button style="width: 200px; background-color: red; padding: 25px 30px; border: 1px solid black; cursor: pointer; text-decoration: none; color: white; font-size: 20px;">Manage User</button></a>
        <br>
        <a href="manageBlog.jsp" style="color: white; text-decoration: none; font-size: 20px;">
        <button style="width: 200px; background-color: red; padding: 20px; border: 1px solid black; margin-top: 20px; cursor: pointer; color: white; text-decoration: none; font-size: 20px;">Manage Blog</button></a>
    </div>
</body>
</html>