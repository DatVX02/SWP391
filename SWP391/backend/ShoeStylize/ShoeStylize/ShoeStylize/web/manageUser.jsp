<%-- 
    Document   : manageUser
    Created on : Oct 29, 2023, 10:30:14 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Management</title>
    <link rel="stylesheet" href="CSS\manageUser.css">
</head>
<body>
    
    
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="managerUser.jsp">Account Management</a>
            <a href="manageBlog.jsp">Blog Management</a>
        </div>
        <div style="width: 79%; float:right" class="searchlist">
            <div>
                <form action="*" method="post">
                    <input type="text" name="txtSearchbyaccount" placeholder="Tài khoản tìm kiếm">
                    <input type="text" name="txtSearchbystatus" placeholder="Trạng thái hoạt động">
                    <input type="button" value="Tìm kiếm" class="button">
                </form>
            </div>
            <div style="clear: both;">
                <table>
                    <tr class="tablehead">
                        <td>No.</td>
                        <td>Email</td>
                        <td>Full Name</td>
                        <td>Phone</td>
                        <td>Birth Date</td>
                        <td>Gender</td>
                    </tr>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
