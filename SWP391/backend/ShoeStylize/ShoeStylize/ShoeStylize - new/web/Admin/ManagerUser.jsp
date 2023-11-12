<%@page import="Registration.RegistrationDTO"%>
<%@page import="Registration.RegistrationDAO"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Management</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="../Admin/ManageUser.css">
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
        <button style="background: #FF0000; color: #fff;">Manage Account</button>
    </div>
    <div class="manage">
        <div style="width: 20%; float:left" class="managefunction">
            <a href="ManagerUser.jsp">Account Management</a>
            <a href="ManageBlog.jsp">Blog Management</a>
        </div>
        <div style="width: 79%; float:right" class="searchlist">
            <div>
                <form action="*" method="post">
                    <input type="text" name="txtSearchbyaccount" placeholder="Search account">
                    <input type="text" name="txtSearchbystatus" placeholder="Operating status">
                    <input type="button" value="Search" class="button">
                </form>
            </div>
            <div style="clear: both;">
                <%
                        List<RegistrationDTO> result =null;
                        RegistrationDAO dao = new RegistrationDAO();
                        String searchValue = request.getParameter("txtSearchbyaccount");
                        if(searchValue != null){
                            result = (List<RegistrationDTO>) request.getAttribute("SEARCHRESULT");
                        } else{
                            dao.showUser();
                            result = dao.getListAccounts();
                        }                       
                        if (result != null) {
                    %>
                    <table>
                        <thead>
                            <tr class="tablehead">
                                <td>No.</td>
                                <td>Email</td>
                                <td>Full Name</td>
                                <td>Phone</td>
                                <td>Birth Date</td>
                                <td>Role</td>
                                <td>Gender</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int count = 0;
                                for (RegistrationDTO dto : result) {
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <%= dto.getUserID()%>
                                </td>

                                <td>
                                    <input type="text" name="txtEmail" value="<%= dto.getEmail()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtFullname" value="<%= dto.getFullname()%>" />
                                </td>

                                <td>
                                    <input type="text" name="txtPhone" value="<%= dto.getPhone()%>" />
                                </td>

                                <td>
                                    <input type="text" name="birthDate" value="<%= dto.getBirthDate()%>" />
                                </td>
                                
                                <td>
                                    <input type="text" name="roleID" value="<%= dto.getRoleID()%>" />
                                </td>

                                <td>
                                    <input type="radio" class="from1" id="male" name="gen" value="Male" <% if ("Male".equals(dto.getGender())) { %> checked <% } %>>Male
                                    <input type="radio" class="from1" id="female" name="gen" value="Female" <% if ("Female".equals(dto.getGender())) { %> checked <% } %>>Female
                                    <input type="radio" class="from1" id="other" name="gen" value="Other" <% if ("Other".equals(dto.getGender())) { %> checked <% }%>>Other
                                </td>

                                <td>
                                    <input type="submit" value="Delete" name="btAction" />
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
                    <h2>No user available.</h2>
                    <%
                        }
                    %>
            </div>
        </div>
    </div>
</body>

</html>
