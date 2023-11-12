<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Blog</title>
    <link rel="stylesheet" href="AddBlog.css">
    <link rel="icon" href="image\shoelogo.png">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="shoes">
        <div class="header_info">
            <a href="../Profile/Account information.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="../../../Order/OrderDetail.jsp"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="../../../Cart/MyCart.jsp"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="../Blog/Blog.jsp"><img
                    src="image\blog (2).png "
                    alt="shopping-cart">News</a>
        </div>
    </div>
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="../Order statictics/Order.jsp">Order statictics</a>
            <a href="../Cost statictics/Cost.jsp">Cost statictics</a>
            <a href="../Blog statictics/Blog.jsp">Blog statictics</a>
            <a href="../Store statictics/Store.jsp">Store manage</a>
        </div>
        <div style="width: 79%; float:right" class="addBLog">
            <h2>Add Blog</h2>
            <form action="*" method="post">
                <p>Title: <input type="text" name="txtTieude" /></p>
                <p>Content: <textarea type="text" name="txtTen" style="width: 70%; margin-left: 100px; padding-right: 120px ;"></textarea>
                <p>Poster: <input type="text" name="txtAccount" readonly /></p>
                <p>Date submitted: <input type="date" name="txtDate" /></p>
                <p>Image: &nbsp<input type="file" id="img" name="img" accept="image/*"></p></br>
                <input type="button" value="Post" class="button">
            </form>
        </div>
    </div>

</body>

</html>