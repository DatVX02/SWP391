<%-- 
    Document   : order_provider
    Created on : Nov 12, 2023, 10:19:00 PM
    Author     : Administrator
--%>

<%@page import="Order.OrderDTO"%>
<%@page import="java.util.List"%>
<%@page import="Order.OrderDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Order statictics</title>
        <link rel="icon"
              href="image/logo/shoelogo.png">
        <link href="Service Provider/Order statictics/Order.css" rel="stylesheet" type="text/css"/>
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
            <a href="#"><img src="image/logo/logo.png"
                                         alt="shoes"></a>
            <div class="header_info">
                <a href="Profile-provi-admin/Provider/information0_1.jsp"><img
                        src="image/logo/user (1).png"
                        alt="profile">Profile</a>
<!--                <a href="#"><img
                        src="image/logo/heart.png"
                        alt="Orders">Orders</a>
                <a href="../../../../Cart/MyCart.html"><img
                        src="image/logo/shopping-cart.png"
                        alt="shopping-cart">My cart</a>-->
                <a href="#"><img
                        src="image/logo/blog (2).png"
                        alt="shopping-cart">News</a>
            </div>
        </div>

        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="#">Home</a>
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
                                <td>Image</td>
                                <td>Price</td>
                                <td>Quantity</td>
                                <td>Category ID</td>
                                <td>Status</td>
                                <td>Detail</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                OrderDAO dao = new OrderDAO();
                                List<OrderDTO> result = dao.AlllistOrder();
                                for (OrderDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <%= dto.getId()%>
                                </td>

                                <td>
                                    <%= dto.getName()%>
                                </td>

                                <td>
                                    <%= dto.getImg()%>
                                </td>

                                <td>
                                    <%= dto.getPrice()%>
                                </td>

                                <td>
                                    <%= dto.getQuantity()%>
                                </td>

                                <td>
                                    <%= dto.getCategory()%>
                                </td>

                                <td>
                                    <%= dto.getStatus()%>
                                </td>
                            </tr>
                        </form>
                        <%
                            }
                        %>
                    </table>
                </div>
            </div>
        </div>



    </body>
</html>