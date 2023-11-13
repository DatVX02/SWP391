<%-- 
    Document   : manageBlog
    Created on : Oct 29, 2023, 10:19:02 PM
    Author     : Administrator
--%>

<%@page import="Blog.BlogDTO"%>
<%@page import="java.util.List"%>
<%@page import="Registration.RegistrationDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>ManageBlog</title>
        <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\manageBlog.css">
    <!--Bootstrap CSS-->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
    <!--font awesome cdn link-->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    </head>
    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="shoes"></img>
        </div>
        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="manageUser.jsp">Account Management</a>
                <a href="manageBlog.jsp">Blog Management</a>
            </div>
            <div style="width: 79%; float:right" class="bloglist">
                <div style="float: right;">
                    <form action="MainController" method="post">
                        <input type="text" name="txtSearchbytitle" placeholder="Find some blog">
                        <input type="submit" name="btAction" value="Find Blog" class="button">
                        <a href="addBlog.jsp"><input type="button" value="Add Blog" class="button"></a>
                    </form>
                </div>
                <div style="clear: both;">
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
                                <td>PostID</td>
                                <td>Title</td>
                                <td>Author</td>
                                <td>Content</td>
                                <td>PostDay</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (BlogDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <input type="text" name="id" value="<%= dto.getPostID()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtTitle" value="<%= dto.getTitle()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtFullname" value="<%= dto.getAuthor()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtContent" value="<%= dto.getContent()%>" />
                                </td>
                                
                                <td>
                                    <input type="text" name="postDate" value="<%= dto.getDate()%>" />
                                </td>

                                <td>
                                    <input type="submit" value="Delete Blog" name="btAction" />
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
