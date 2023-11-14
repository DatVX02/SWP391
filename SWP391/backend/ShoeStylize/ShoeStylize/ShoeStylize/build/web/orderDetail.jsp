<%-- 
    Document   : orderDetail
    Created on : Nov 3, 2023, 5:45:01 PM
    Author     : SivaRyi
--%>

<%@page import="java.math.BigDecimal"%>
<%@page import="Order.OrderDTO"%>
<%@page import="java.util.List"%>
<%@page import="Registration.RegistrationDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Order Detail</title>
        <link rel="stylesheet" href="CSS\OrderDetail.css">
        <link rel="icon"
              href="image\shoelogo.png">
    </head>

    <body>
        <div class="header">
            <a href="homepage.jsp"><img src="image\shoelogo.png"
            alt="shoes"></img></a>
        <div class="header_info">
            <a href="information.jsp"><img
                    src="image\user (1).png"
                    alt="profile">Profile</a>
            <a href="orderDetail.jsp"><img
                    src="image\heart.png"
                    alt="Orders">Orders</a>
            <a href="myCart.jsp"><img
                    src="image\shopping-cart.png"
                    alt="shopping-cart">My cart</a>
            <a href="blog.jsp"><img
                    src="image\blog (2).png"
                    alt="shopping-cart">News</a>
        </div>
        </div>
        <div>
        <h1 style="margin-left: 100px; margin-top: 30px; margin-bottom: 15px; font-size: 30px;">Order Detail</h1>
        <%
            RegistrationDAO dao = new RegistrationDAO();
            dao.showOrderDetail();
            List<OrderDTO> result = dao.getListOrders();
            if (result != null) {
        %>
        <%
            double totalAmount = 0;
            for (OrderDTO dto : result) {
                totalAmount += dto.getPrice();
        %>
        <form action="*" method="post">
            <div class="product">
                <div class="column left">
                    <img src="*" alt="Product">
                </div>
                <div class="column middle">
                    <h2><%= dto.getName()%></h2>
                    <p>Price:&nbsp&nbsp&nbsp<%= dto.getPrice()%></p>
                    <span>Quantity:&nbsp&nbsp <input type="number" value="<%= dto.getQuantity()%>" name="" id="" min="0"
                            max="999999"></span>
                </div>
                <div class="column right">
                    <input type="button" value="Detail"/>
                    <a href="feedback.jsp"> 
                        <input type="button" value="Feedback"/>
                    </a>
                </div>
            </div>
            <%
                }
            %>
            <h3>Total amount:<%= totalAmount%></h3></br>
        </form>
        </div>
        
        <%
        } else {
        %>
        <h2>No Order available.</h2>
        <%
            }
        %>
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
