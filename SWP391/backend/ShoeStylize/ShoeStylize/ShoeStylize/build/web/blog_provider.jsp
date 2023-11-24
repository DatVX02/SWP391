<%-- 
    Document   : blog_provider
    Created on : Nov 13, 2023, 9:05:50 AM
    Author     : Administrator
--%>

<%@page import="Registration.RegistrationDAO"%>
<%@page import="Blog.BlogDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Blog statictics</title>
        <link rel="icon"
              href="image/logo/shoelogo.png">
        <link href="Service Provider/Blog statictics/Blog.css" rel="stylesheet" type="text/css"/>
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
            <a href="Profile-provi-admin/Provider/homepage1.jsp"><img src="image/logo/logo.png"
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
                <a href="homepage.jsp">Home</a>
                <a href="order_provider.jsp">Order statictics</a>
                <a href="cost.jsp">Cost statictics</a>
                <a href="blog_provider.jsp">Blog statictics</a>
                <a href="store.jsp">Store manage</a>
                <a href="homepage_guest.jsp">Log out</a>
            </div>
            <div style="width: 79%; float:right" class="bloglist">
                <div style="float: right;">
                    <form action="MainController" method="post">
                        <span>
                            <input type="text" name="txtSearchbytitle" placeholder="search blog" style="text-align: center;">
                            <input type="submit" name="btAction" value="Title Search" style="background: aqua">
                        </span>
                        <a href="addBlog_provider.jsp"><input type="button" value="Add Blog" class="button"></a>
                    </form>
                </div>

                <div style="clear: both;" class="">
                    <%
                        List<BlogDTO> result = null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbytitle");
                        if (searchValue != null) {
                            result = (List<BlogDTO>) request.getAttribute("BLOGSEARCHRESULT");
                        } else {
                            dao.showBlog();
                            result = dao.getListBlogs();
                        }
                        if (result != null) {

                    %>
                    <table>
                        <thead>
                            <tr class="tablehead">
                                <td>Blog ID</td>
                                <td>Title</td>
                                <td>Content</td>
                                <td>Poster</td>
                                <td>Date Submitted</td>
<!--                                <td>Category</td>--> 
                                <td>Status</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (BlogDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <%= dto.getPostID()%>
                                </td>

                                <td>
                                    <%= dto.getTitle()%>
                                </td>

                                <td>
                                    <%= dto.getContent()%>
                                </td>

                                <td>
                                    <%= dto.getAuthor()%>
                                </td>

                                <td>
                                    <%= dto.getDate()%>
                                </td>
                            </tr>
                        </form>
                        <%
                            }
                        %>

                        </tbody>
                    </table>
                    <%
                    } else {
                    %>
                    <h2>No blog available.</h2>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
    </body>

</html>
