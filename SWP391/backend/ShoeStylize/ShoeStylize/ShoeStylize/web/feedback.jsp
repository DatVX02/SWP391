<%-- 
    Document   : feedback
    Created on : Oct 18, 2023, 3:59:05 PM
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
    <link rel="stylesheet" href="CSS\feedback.css">
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
                <a href="information0.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png" style="width: 15px; transform: translateY(02px);">
                <a href="ChangePassword.jsp">Change password</a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png" style="width: 15px; transform: translateY(02px);" />
                <a href="accountManagement.jsp">
                    Order management
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png" style="width: 15px; transform: translateY(02px);" />
                <a href="support.jsp">
                    Support
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png" style="width: 15px; transform: translateY(02px);" />
                <a href="feedback.jsp">Suggestions </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png" style="width: 15px;" />
                <a href="login.jsp">Log out </a>
            </ul>
        </div>
    </div>

        <div class="information_right">
            <h2 style="color: #FF0000;">GÓP Ý VÀ PHẢN HỒI </h2>
            <div class="information_right_1">
                <img src="image\feedback1.png"
                    alt="feedback">
                <h3>Mời bạn đánh giá mức độ hài lòng về chương trình ưu đãi.<br>
                    Hãy cho chúng mình thêm góp ý để cải thiện tốt hơn</h3>
            </div>
            <div class="information_left_2">
                <h2 style="color: #DB00FF">THÔNG TIN FEEDBACK</h2>
                <h3 style="color: #FF0000; margin-left: 50px;">Link Feedback:
                    <a href="https://forms.gle/pczGG6aRGd8LBRnM9" style="color: black; text-decoration: underline;">https://forms.gle/pczGG6aRGd8LBRnM9</a>
                </h3>
                <h3 style="color:#FF0000; margin-left: 50px;">Liên hệ qua số hotline của cửa hàng:
                    <a style="color: black; font-weight: normal; " href="tel:1900 1772">1900 1772</a>
                </h3>
            </div>

</body>
</html>