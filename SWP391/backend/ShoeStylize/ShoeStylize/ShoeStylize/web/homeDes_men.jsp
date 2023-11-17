<%@page import="Shoes.ShoeDAO"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Upload File</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS\homeDes_men.css">
        <!--Bootstrap CSS-->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
              integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />

        <!--font awesome cdn link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    </head>

    <body>
        <!-- header -->
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="shoes">
            <div class="header_info">
                <a href="infomation0.jsp"><img
                        src="image\user (1).png"
                        alt="profile">Profile</a>
                <a href="orderDetail.jsp"><img
                        src="image\heart.png"
                        alt="Orders">Orders</a>
                <a href="myCart.html"><img
                        src="image\shopping-cart.png"
                        alt="shopping-cart">My cart</a>
                <a href="#"><img
                        src="image\blog (2).png"
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
                    transform: translate(150px, -50px);
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
                                <!-- Tên giày --><input type="text" name="ShoeName" value="">
                            </h3>
                            <!-- <a href='../SizeChart/SizeChart.html' target="_blank"><img
                                    style="max-width: 20px; margin-top: -70px; margin-left: 380px;"
                                    src="C:\Users\ADMIN\Desktop\SWP391\SWP391\New file Shoes stylize (html)\Shoes stylize (by html)\image\logo\information.png"
                                    alt="information"></a> -->
                            <p style="margin-bottom: 50px; font-size: 13px; font-weight: normal;">Custom Shoes</p>
                        </div>
                        <div class="information_right_2">
                            <p>Select Gender</p>
                            <input type="button" name="gen" value="Men" style="background-color: black; color: white;">
                            <a href="homeDes_women.jsp"><input type="button" value="Women's"
                                                               style="transform: translateX(35px);"></a>
                        </div>
                        <div class="information_right_3">
                            <p>Select Size</p>
                            <a href="sizeChart.jsp" target="_blank" style="color: black;"><span>Size Guide</span></a>
                            <input type="radio" value="39" name="size" id="">39<br>
                            <input type="radio" value="40" name="size" id="">40<br>
                            <input type="radio" value="41" name="size" id="">41<br>
                            <input type="radio" value="42" name="size" id="">42<br>
                            <input type="radio" value="43" name="size" id="">43<br>
                            <input type="radio" value="44" name="size" id="">44<br>
                            <input type="radio" value="45" name="size" id="">45<br>
                            <input type="radio" value="46" name="size" id="">46<br>
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
                                <div class="information_right_4_4" style="margin-left: -278px;"><input type="checkbox" name="Service5" value="Back" id="" >Back</div>
                                <div class="information_right_4_3" style="margin-left: 96px; margin-top: -23px"><input type="checkbox" name="Service6" value="Overlook" id="" >Overlook</div>
                            </div>
                            <h3 style="font-size: 20px; margin-left: 180px; margin-top: 20px; color: red;">
                                Total amount: <%= total %>
                            </h3>
                            <input type="hidden" name="total" value="<%= total%>" >
                        </div>
                    </div>
                </div>
            </div>
        </form>
        <!-- Footer -->
        <div class="footer">
            <div style="float:right">
                <img src="image\facebook.png"
                     alt="Facebook" />
                <img src="image\twitter.png"
                     alt="twitter" />
                <img src="image\linkedin.png"
                     alt="linkedin" />
                <img src="image\instagram (1).png"
                     alt="Instagram" />
                <img src="image\youtube (5).png"
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
