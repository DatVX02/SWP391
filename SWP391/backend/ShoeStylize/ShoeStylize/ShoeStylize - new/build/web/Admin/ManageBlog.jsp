<%@page import="java.util.List"%>
<%@page import="Registration.RegistrationDAO"%>
<%@page import="Blog.BlogDTO"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ManageBlog</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="../Admin/ManageBlog.css">
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
        <button style="background: #FF0000; color: #fff;">Manage Blog</button>
    </div>
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="ManagerUser.jsp">Account Management</a>
            <a href="ManageBlog.jsp">Blog Management</a>
        </div>
        <div style="width: 79%; float:right" class="bloglist">
            <div style="float: right;">
                <form action="*" method="post">
                    <span>
                        <input type="search" placeholder="search blog" style="text-align: center;">
                        <input type="button" value="Search Blog">
                    </span>
                    <a href="AddBlog.jsp"><input type="button" value="Add Blog" class="button"></a>
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