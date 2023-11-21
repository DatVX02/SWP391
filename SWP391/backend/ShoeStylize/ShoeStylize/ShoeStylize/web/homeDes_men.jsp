<%@page import="Shoes.ShoeDAO"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Upload File</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <!--<link href="HomeDes/Men's/Uploadfile.css" rel="stylesheet" type="text/css"/>-->
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            overflow-x: hidden;
        }

        .header {
            background-color: #979797;
            width: 100%;
        }

        .header img {
            max-width: 100px;
            height: auto;
            display: block;
            /* margin: 0 auto; */
            padding: 5px 5px;
        }


        .header_info a {
            float: left;
            background: #979797;
            text-decoration: none;
            color: white;
            padding-right: 50px;
            transform: translate(-60px, -85px);
        }

        .header_info img {
            max-width: 30px;
            transform: translateX(7px);
        }

        .header_info {
            float: right;
        }

        .header_info a {
            color: #fff;
            text-decoration: none;
            padding: 10px;
        }

        /* Left Outside  */
        .information_left_1 {
            background-color: #D9D9D9;
            width: 20%;
            height: 350px;
            text-align: center;
            margin-left: 200px;
            margin-top: -20px;
        }

        .information_left_1 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_1_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }

        /* Right Outside */
        .information_left_2 {
            background-color: #D9D9D9;
            width: 100%;
            height: 350px;
            text-align: center;
            margin-left: 400px;
            margin-top: -70px;
        }

        .information_left_2 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_2_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }

        /* Left inside*/
        .information_left_3 {
            background-color: #D9D9D9;
            width: 100%;
            height: 350px;
            text-align: center;
            /* margin-left: 150px; */
            margin-top: 26px;
        }

        .information_left_3 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_3_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }

        /* Right inside */
        .information_left_4 {
            background-color: #D9D9D9;
            width: 100%;
            height: 350px;
            text-align: center;
            margin-left: 400px;
            margin-top: -350px;
        }

        .information_left_4 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_4_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }

        /* Back */
        .information_left_5 {
            background-color: #D9D9D9;
            width: 100%;
            height: 350px;
            text-align: center;
            /* margin-left: 400px; */
            margin-top: 24px;
        }

        .information_left_5 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_5_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }

        /* Overlook */
        .information_left_6 {
            background-color: #D9D9D9;
            width: 100%;
            height: 350px;
            text-align: center;
            margin-left: 400px;
            margin-top: -350px;
        }

        .information_left_6 p {
            text-align: left;
            font-weight: bold;
            margin-left: 10px;
        }

        .information_left_6_1 {
            transform: translateY(100px);
        }

        input[type="file"] {
            outline: none;
            padding: 4px;
            margin: -4px;
        }

        input[type="file"]:focus-within::file-selector-button,
        input[type="file"]:focus::file-selector-button {
            outline: 2px solid #0964b0;
            outline-offset: 2px;
        }

        input[type="file"]::before {
            top: 12px;
        }

        input[type="file"]::after {
            top: 14px;
        }

        input[type="file"] {
            position: relative;
        }

        input[type="file"]::file-selector-button {
            width: 136px;
            color: transparent;
        }

        input[type="file"]::before {
            position: absolute;
            pointer-events: none;
            /*   top: 11px; */
            left: 40px;
            color: #0964b0;
            content: "Upload File";
        }

        input[type="file"]::after {
            position: absolute;
            pointer-events: none;
            /*   top: 10px; */
            left: 16px;
            height: 20px;
            width: 20px;
            content: "";
            background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 24 24' fill='%230964B0'%3E%3Cpath d='M18 15v3H6v-3H4v3c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2v-3h-2zM7 9l1.41 1.41L11 7.83V16h2V7.83l2.59 2.58L17 9l-5-5-5 5z'/%3E%3C/svg%3E");
        }

        input[type="file"]::file-selector-button {
            border-radius: 4px;
            padding: 0 16px;
            height: 40px;
            cursor: pointer;
            background-color: white;
            border: 1px solid rgba(0, 0, 0, 0.16);
            box-shadow: 0px 1px 0px rgba(0, 0, 0, 0.05);
            margin-right: 16px;
            transition: background-color 200ms;
        }

        input[type="file"]::file-selector-button:hover {
            background-color: #f3f4f6;
        }

        input[type="file"]::file-selector-button:active {
            background-color: #e5e7eb;
        }


        .information_right {
            background: #D9D9D9;
        }

        /* Information_right */
        .information_right {
            background-color: #D9D9D9;
            width: 140%;
            height: 1100px;
            text-align: center;
            margin-left: 800px;
            margin-top: -1102px;
        }

        form h3 {
            text-align: left;
            margin-left: 20px;
        }

        .information_right_2 input[type="button"] {
            margin-right: 55px;
        }

        .information_right_2 {
            margin-bottom: 15px;
        }

        /* Footer */
        .footer {
            background-color: #979797;
            width: 100%;
            margin-top: 960px;
        }

        .center {
            margin-left: auto;
            margin-right: auto;
            margin-top: 20px;
            transform: translateX(-380px);
            margin-bottom: 20px;
        }

        .center tr td {
            width: 42%;
            padding: 4px;
            color: white;
        }

        .footer img {
            max-width: 30px;
            margin: 20px 20px 10px 10px;
        }

        .commerce  {
            text-align: center;
            color: #606060;
            background: white;
            padding: 10px;
        }


        .center .tableHeader td {
            font-weight: bolder;
            color: black;

        }

        .information_right_3 span {
            float: right;
            margin-top: -40px;
            margin-right: 20px;
            font-weight: bold;
        }

        .information_right_3 input {
            
            margin-right: 50px;
            margin-bottom: 15px;
            transform: translateX(20px);
        }

        .information_right_4_1{
            float: left;  
            margin-left: 50px;
        }

        .information_right_4_3{
            transform: translateX(10px);
        }



    </style>
    <body>
        <!-- header -->
        <div class="header">
            <a href="homepage.jsp"><img src="image/logo/logo.png"
                 alt="shoes"></a>
            <div class="header_info">
                <a href="information0.jsp"><img
                        src="image/logo/user (1).png"
                        alt="profile">Profile</a>
                <a href="orderDetail.jsp"><img
                        src="image/logo/heart.png"
                        alt="Orders">Orders</a>
                <a href="myCart.jsp"><img
                        src="image/logo/shopping-cart.png"
                        alt="shopping-cart">My cart</a>
                <a href="#"><img
                        src="image/logo/blog (2).png"
                        alt="shopping-cart">News</a>
            </div>
        </div>


        <form action="MainController" method="">
            <button style="
                    border-radius: 20px;
                    padding: 5px 20px;
                    background: #FF9900;
                    border: 0.5px;
                    margin-left: 1250px;
                    transform: translate(80px, -50px);
                    " name="btAction" value="Custom">
                Done</button>

            <div class="information_left">
                <div class="information_left_1">
                    <p>Left Outside</p>
                    <div class="information_left_1_1">
                        <input id="file" name="file1" type="text" accept="image/jpg image/png" />
                    </div>

                    <div class="information_left_2">
                        <p>Right Outside</p>
                        <div class="information_left_2_1">
                            <input id="file" name="file2" type="text" accept="image/jpg image/png" />
                        </div>
                    </div>

                    <div class="information_left_3">
                        <p>Left Inside</p>
                        <div class="information_left_3_1">
                            <input id="file" name="file3" type="text" accept="image/jpg image/png" />
                        </div>
                    </div>

                    <div class="information_left_4">
                        <p>Left Outside</p>
                        <div class="information_left_4_1">
                            <input id="file" name="file4" type="text" accept="image/jpg image/png" />
                        </div>
                    </div>

                    <div class="information_left_5">
                        <p>Back</p>
                        <div class="information_left_5_1">
                            <input id="file" name="file5" type="text" accept="image/jpg image/png" />
                        </div>
                    </div>

                    <div class="information_left_6">
                        <p>Overlook</p>
                        <div class="information_left_6_1">
                            <input id="file" name="file6" type="text" accept="image/jpg image/png" />
                        </div>
                    </div>

                    <div class="information_right">
                        <div>
                            <%
                                Object total = session.getAttribute("");
                            %>
                            <h3>
                                <!-- Tên giày --><input type="text" name="ShoeName" value="<%= request.getParameter("name") %>">
                            </h3>
                            <!-- <a href='../SizeChart/SizeChart.html' target="_blank"><img
                                    style="max-width: 20px; margin-top: -70px; margin-left: 380px;"
                                    src="C:\Users\ADMIN\Desktop\SWP391\SWP391\New file Shoes stylize (html)\Shoes stylize (by html)\image\logo\information.png"
                                    alt="information"></a> -->
                            <p style="margin-bottom: 50px; font-size: 13px; font-weight: normal;">Custom Shoes</p>
                        </div>
                        <div class="information_right_2">
                            <p>Select Gender</p>
                            <input type="button" name="gen" value="Men's" style="background-color: black; color: white;">
                            <a href="homeDes_women.jsp"><input type="button" value="Women's"
                                                               style="transform: translateX(35px);"></a>
                        </div>
                        <div class="information_right_3">
                            <p>Select Size</p>
                            <a href="sizeChart.jsp" target="_blank" style="color: black;"><span>Size Guide</span></a>
                            <input type="radio" value="39" name="size" id="">39
                            <input type="radio" value="40" name="size" id="">40
                            <input type="radio" value="41" name="size" id="">41
                            <input type="radio" value="42" name="size" id="">42<br>
                            <input type="radio" value="43" name="size" id="">43
                            <input type="radio" value="44" name="size" id="">44
                            <input type="radio" value="45" name="size" id="">45
                            <input type="radio" value="46" name="size" id="">46
                        </div>

                        <div class="information_right_4">
                            <p>Service</p>

                            <div>
                                <div class="information_right_4_1"><input type="checkbox" name="Service1" value="LO" id="" >Left Outside</div>
                                <div class="information_right_4_2"><input type="checkbox" name="Service2" value="RO" id="" >Right Outside</div>
                                <br>
                                <div class="information_right_4_1"><input type="checkbox" name="Service3" value="LI" id="" >Left Inside </div>
                                <div class="information_right_4_2"><input type="checkbox" name="Service4" value="RI" id="" >Right Inside</div>
                                <br>
                                <div class="information_right_4_4" style="margin-left: -265px;"><input type="checkbox" name="Service5" value="Back" id="" >Back</div>
                                <div class="information_right_4_3" style="margin-left: 96px; margin-top: -23px"><input type="checkbox" name="Service6" value="Overlook" id="" >Overlook</div>
                            </div>
                            <h3 style="font-size: 20px; margin-left: 180px; margin-top: 20px; color: red;">
                                Total amount: <%= total%>
                            </h3>
                            <input type="hidden" name="img" value="<%= request.getParameter("image")%>" >
                            <input type="hidden" name="total" value="<%= total%>" >
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <!-- Footer -->
        <div class="footer">
            <div style="float:right; transform: translateX(-20px)">
                <img src="image/logo/facebook.png"
                     alt="Facebook" />
                <img src="image/logo/twitter.png"
                     alt="twitter" />
                <img src="image/logo/linkedin.png"
                     alt="linkedin" />
                <img src="image/logo/instagram (1).png"
                     alt="Instagram" />
                <img src="image/logo/youtube (5).png"
                     alt="youtube" />
            </div>
            <div style=" float:right">
                <table class="center">
                    <tr class="tableHeader">
                        <td>About Us</td>
                        <td>For Users</td>
                        <td>Information</td>
                    </tr>
                    <tr>
                        <td>About Us</td>
                        <td>Login</td>
                        <td>Help Center</td>
                    </tr>
                    <tr>
                        <td>Find Store</td>
                        <td>Register</td>
                        <td>Money Refund</td>
                    </tr>
                    <tr>
                        <td>Categories</td>
                        <td>Settings</td>
                        <td>Shipping</td>
                    </tr>
                    <tr>
                        <td>Blogs</td>
                        <td>My Orders</td>
                        <td>Contact us</td>
                    </tr>
                </table>

            </div>
            <div style="clear: both" class="commerce">
                @2023 Ecommerce
            </div>
        </div>
    </body>

</html>
