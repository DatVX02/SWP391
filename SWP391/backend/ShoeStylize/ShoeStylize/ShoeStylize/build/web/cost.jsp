<%-- 
    Document   : cost
    Created on : Nov 12, 2023, 4:32:37 PM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="Shoes.ShoeDAO"%>
<%@page import="Shoes.ShoeDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Cost statictics</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS/cost.css">
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
            <a href="homepage.jsp"><img src="image\shoelogo.png"
                                        alt="shoes"></a>
            <div class="header_info">
                <a href="information0.jsp"><img
                        src="image\user (1).png"
                        alt="profile">Profile</a>
                <a href="#"><img
                        src="image\heart.png"
                        alt="Orders">Orders</a>
                <a href="../../../../Cart/MyCart.jsp"><img
                        src="image\shopping-cart.png"
                        alt="shopping-cart">My cart</a>
                <a href="#"><img
                        src="image\blog (2).png"
                        alt="shopping-cart">News</a>
            </div>
        </div>

        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="order_provider.jsp">Order statictics</a>
                <a href="cost.jsp">Cost statictics</a>
                <a href="blog_provider.jsp">Blog statictics</a>
                <a href="store.jsp">Store manage</a>
                <a href="login.jsp">Logout</a>
            </div>
            <div style="width: 79%; float:right" class="bloglist">
                <div style="clear: both;" >
                    <table>
                        <thead>
                            <tr class="tablehead">
                                <td>Shoe ID</td>
                                <td>Shoe name</td>
                                <td>Old cost</td>
                                <td>Quantity sold</td>
                                <td>New cost</td>
                                <td>Increase/decrease ratio</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ShoeDAO dao = new ShoeDAO();
                                List<ShoeDTO> result = dao.AlllistShoe();
                                for (ShoeDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <%= dto.getShoeID()%>
                                </td>

                                <td>
                                    <%= dto.getShoesName()%>
                                </td>

                                <td>
                                    <%= dto.getPrice()%>
                                </td>

                                <td>
                                    <%= dto.getQuantity()%>
                                </td>

                                <td>
                                    <%= dto.getNewPrice()%>
                                </td>

                                <td>
                                    <%= dto.getIncreaseDecreaseRatio()%>
                                </td>
                            </tr>
                        </form>
                        <%
                            }
                        %>
                        </tbody>

                    </table>
                </div>
            </div>
        </div>
    </body>

</html>
