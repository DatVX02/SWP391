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
        <title>OrderDetail</title>
        <link rel="stylesheet" href="CSS\OrderDetail.css">
        <link rel="icon"
              href="image\shoelogo.png">
    </head>

    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="Shoes stylize">
        </div>
        <h1>Order Detail</h1>
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
                    <p>Quantity:&nbsp&nbsp<%= dto.getQuantity()%> </p>
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
        <%
        } else {
        %>
        <h2>No Order available.</h2>
        <%
            }
        %>
    </body>

</html>
