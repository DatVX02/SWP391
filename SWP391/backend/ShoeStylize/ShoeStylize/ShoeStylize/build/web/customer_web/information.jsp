<%-- 
    Document   : information
    Created on : Oct 18, 2023, 3:08:52 PM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Information</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\information.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>
    <!-- menu -->
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
            <h2>Thông tin tài khoản</h2>
            <div>
                <h3>Họ tên</h3>
                <input type="text" style="width: 200px;" required>
            </div>

            <div>
                <h3>Email</h3>
                <input type="email" required style="width: 200px;">
            </div>

            <div>
                <h3>Số điện thoại</h3>
                <input type="text" required style="width: 200px;">
            </div>

            <div>
                <h3> Ngày sinh</h3>
                <input type="date" style="width: 200px;">
            </div>

            <div>
                <h3>
                    Giới tính
                </h3>

                <input type="radio">Nam
                <input type="radio">Nữ
                <input type="radio">Khác

            </div>
            <button style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Cập nhật</button>
        </div>


</body>

</html>
