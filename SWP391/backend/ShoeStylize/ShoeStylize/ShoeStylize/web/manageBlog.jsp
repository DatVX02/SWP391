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
        <title>Manage Blog</title>
        <link rel="stylesheet" href="CSS\manageBlog.css">
    </head>
    <body>
        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="manageUser.jsp">Account Management</a>
                <a href="manageBlog.jsp">Blog Management</a>
            </div>
            <div style="width: 79%; float:right" class="bloglist">
                <div style="float: right;">
                    <form action="MainController" method="post">
                        <input type="text" name="txtSearchbytitle" placeholder="Find some blog">
                        <input type="submit" name="btAction" value="Search Blog" class="button">
                        <a href="addBlog.jsp"><input type="button" value="Add Blog" class="button"></a>
                    </form>
                </div>
                <div style="clear: both;">
                    <%
                        List<BlogDTO> result = null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbytitle");
                        if(searchValue != null){
                            result = (List<BlogDTO>) request.getAttribute("BLOGSEARCHRESULT");
                        } else{
                            dao.showBlog();
                            result = dao.getListBlogs();
                        }    
                        if (result != null) {
                    %>
                    <table>
                        <thead>
                            <tr class="tablehead">
                                <td>No.</td>
                                <td>Title</td>
                                <td>Author</td>
                                <td>Post Date</td>
                                <td>Content</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int count = 0;
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
                                    <input type="text" name="postDate" value="<%= dto.getDate()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtContent" value="<%= dto.getContent()%>" />
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
    </body>
</html>
