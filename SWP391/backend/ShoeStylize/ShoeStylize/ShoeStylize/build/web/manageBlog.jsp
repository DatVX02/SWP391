<%-- 
    Document   : manageBlog
    Created on : Oct 29, 2023, 10:19:02 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Manage Blog</title>
    <link rel="stylesheet" href="CSS\manageBlog.css">
</head>
<body>
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="manageUser.jsp">Account Management</a>
            <a href="manageBlog.jsp">Blog Management</a>
        </div>
        <div style="width: 79%; float:right" class="bloglist">
            <div style="float: right;">
                <form action="*" method="post">
                    <a href="addBlog.jsp"><input type="button" value="Add Blog" class="button"></a>
                </form>
            </div>
            <div style="clear: both;">
                <table>
                    <tr class="tablehead">
                        <td>No.</td>
                        <td>Title</td>
                        <td>Author</td>
                        <td>Post Date</td>
                        <td>Category</td>
                        <td>Status</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</body>
</html>