<%-- 
    Document   : accountManagement
    Created on : Oct 18, 2023, 3:44:34 PM
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
    <link rel="stylesheet" href="CSS\accountManagement.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>

    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png" style="width: 15px; transform: translateY(02px);">
                <a href="information.jsp">Thông tin tài khoản </a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png" style="width: 15px; transform: translateY(02px);" />
                <a href="accountManagement.jsp">
                    Quản lí tài khoản
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png" style="width: 15px; transform: translateY(02px);" />
                <a href="support.jsp">
                    Hỗ trợ
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png" style="width: 15px; transform: translateY(02px);" />
                <a href="feedback.jsp">Góp ý - phản hồi </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png" style="width: 15px;" />
                <a href="login.jsp">Đăng xuất </a>
            </ul>
        </div>

        <div class="information_right">
            <h2>Quản lí đơn hàng</h2>
            <ul style="list-style-type: none; ">
                <li>Tất cả</li>
                <li>Đơn đang chờ duyệt</li>
                <li>Hoàn thành</li>
                <li>Hủy</li>
            </ul>
        </div>
</body>

</html>