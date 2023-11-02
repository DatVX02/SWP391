<%-- 
    Document   : manageUser
    Created on : Oct 29, 2023, 10:30:14 PM
    Author     : Administrator
--%>

<%@page import="Registration.RegistrationDAO"%>
<%@page import="java.util.List"%>
<%@page import="Registration.RegistrationDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>User Management</title>
        <link rel="stylesheet" href="CSS\manageUser.css">
    </head>
    <body>


        <div class="manage">
            <div style="width: 20%; float:left" class="managefunction">
                <a href="managerUser.jsp">Account Management</a>
                <a href="manageBlog.jsp">Blog Management</a>
            </div>
            <div style="width: 79%; float:right" class="searchlist">
                <div>
                    <form action="MainController" method="post">
                        <input type="text" name="txtSearchbyaccount" placeholder="Find some account">
                        <input type="submit" name="btAction" value="Search" class="button">
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
                                <td>Gender</td>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                int count = 0;
                                for (RegistrationDTO dto : result) {
                                    String urlRewriting = "MainController?btAction=Delete&pk=" + dto.getEmail() + "&lastSearchValue=" + request.getParameter("txtSearchbyaccount");
                            %>
                        <form action="MainController">
                            <tr>
                                <td>
                                    <input type="text" name="id" value="<%= dto.getUserID()%>" />
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
