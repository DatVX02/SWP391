<%@page import="Registration.RegistrationDAO"%>
<%@page import="java.sql.SQLException"%>
<%@page import="Database.DBUtils"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel="icon"
              href="image\shoelogo.png">
        <link rel="stylesheet" href="CSS\ChangePassword.css">
    </head>

    <body>
        <div class="header">
            <img src="image\shoelogo.png"
                 alt="Shoes stylize">
        </div>
        <div class="information_left">
            <div>
                <ul class="information_left_1">
                    <img src="image\user.png"
                         style="width: 15px; transform: translateY(02px);">
                    <a href="information0.jsp">Account information </a>
                </ul>

                <ul class="information_left_2">
                    <img src="image\padlock.png"
                         style="width: 15px; transform: translateY(02px);">
                    <a href="changePassword.jsp">Change password</a>
                </ul>

                <ul class="information_left_3">
                    <img src="image\checklist.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="accountManagement.jsp">
                        Order management
                    </a>
                </ul>

                <ul class="information_left_4">
                    <img src="image\support.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="support.jsp">
                        Support
                    </a>
                </ul>

                <ul class="information_left_5">
                    <img src="image\feedback.png"
                         style="width: 15px; transform: translateY(02px);" />
                    <a href="feedback.jsp">Suggestions </a>
                </ul>

                <ul class="information_left_6">
                    <img src="image\logout.png"
                         style="width: 15px;" />
                    <a href="homepage_guest.jsp">Log out </a>
                </ul>
            </div>
            <%
                RegistrationDAO dao = new RegistrationDAO();
                dao.changePassword(request);
            %>
            <div class="information_right">
                <h2>Change Password</h2>
                <form action="MainController">

                    <input type="hidden" name="txtOldPasswordConfirm" value="<%= session.getAttribute("Password")%>" >
                    <input type="hidden" name="txtUserID" value="<%= session.getAttribute("id")%>" >

                    <div>
                        <h4>Old password</h4>
                        <input type="password" name="txtOldPassword" required>
                    </div>
                    <div>
                        <h4>New password</h4>
                        <input type="password" name="txtPassword" required>
                    </div>
                    <div>
                        <h4>Confirm password</h4>
                        <input type="password" name="txtConfirm" required>
                        <br>
                    </div>
                    <div>
                        <button name="btAction" value="Change Password" style="border-radius: 20px; background-color: #EBAA5D; margin-top: 10px;">Change</button>
                    </div>

                </form>
            </div>
    </body>
</html>
