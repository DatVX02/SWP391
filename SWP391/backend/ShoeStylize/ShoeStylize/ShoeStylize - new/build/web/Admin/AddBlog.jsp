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
        <a href="../HomePage/Homepage (login)/HomePage.jsp"> <img src="image\shoelogo.png"
            alt="Shoes stylize"></img></a>
        <button>Manage Account</button>
    </div>
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="ManagerUser.jsp">Account Management</a>
            <a href="ManageBlog.jsp">Blog managemnet</a>
        </div>
        <div style="width: 79%; float:right" class="addBLog">
            <h2>Add Blog</h2>
            <form action="*" method="post">
                <p>Title: <input type="text" name="txtTieude" /></p>
                <p>Content: <textarea type="text" name="txtContent" style="width: 70%; margin-left: 100px; padding-right: 120px ;"></textarea>
                <p>Poster: <input type="text" name="txtAccount" value="<%= session.getAttribute("id")%>" /></p>
                <p>Date submitted: <input type="date" name="txtDate" /></p>
                <p>Image: &nbsp<input type="file" id="img" name="img" accept="image/*"></p></br>
                <input type="hidden" name="userID" value="<%= session.getAttribute("id") %>">
                <input type="button" name="btAction" value="Post" class="button">
            </form>
        </div>
    </div>

</body>

</html>