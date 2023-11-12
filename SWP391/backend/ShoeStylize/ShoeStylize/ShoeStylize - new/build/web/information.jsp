<%@page import="Registration.RegistrationDAO"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="icon"
        href="image\shoelogo.png">
    <link rel="stylesheet" href="CSS\information.css">
</head>

<body>
    <div class="header">
        <img src="image\shoelogo.png"
            alt="Shoes stylize"></img>
    </div>
    <!-- menu -->
    <div class="information_left">
        <div>
            <ul class="information_left_1">
                <img src="image\user.png"
                    style="width: 15px; transform: translateY(02px);">
                <a href="information.jsp">Account information </a>
            </ul>

            <ul class="information_left_1">
                <img src="image\padlock.png"
                    style="width: 15px; transform: translateY(02px);">
                <a href="ChangePassword.jsp">Change password</a>
            </ul>

            <ul class="information_left_2">
                <img src="image\checklist.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="AccountManagement.jsp">
                    Order management
                </a>
            </ul>

            <ul class="information_left_3">
                <img src="image\support.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="./Support.jsp">
                    Support
                </a>
            </ul>

            <ul class="information_left_4">
                <img src="image\feedback.png"
                    style="width: 15px; transform: translateY(02px);" />
                <a href="../Profile/Feedback.jsp">Suggestions </a>
            </ul>

            <ul class="information_left_5">
                <img src="image\logout.png"
                    style="width: 15px;" />
                <a href="../HomePage/HomePage(no login)/HomePage.jsp">Log out </a>
            </ul>
        </div>
        
        <%
            RegistrationDAO dao = new RegistrationDAO();
            dao.getInfo(request);
        %>


        <div class="information_right">
            <h2>Account information</h2>
            <form action="MainController">
                <div>
                    <h3>FullName</h3>
                    <input type="text" name="txtFullName" value="<%= session.getAttribute("FullName")%>" style="width: 200px;" required>
                </div>

                <div>
                    <h3>Email</h3>
                    <input type="email" name="txtEmail" value="<%= session.getAttribute("Email")%>" required style="width: 200px;">
                </div>

                <div>
                    <h3>Phone Number</h3>
                    <input type="tel" name="txtPhone" value="<%= session.getAttribute("PhoneNumber")%>" required style="width: 200px;">
                </div>

                <div>
                    <h3>Date of Birth</h3>
                    <input type="date" name="birthDate" value="<%= session.getAttribute("Birthdate")%>" style="width: 200px;">
                </div>

                <div>
                    <h3>Gender</h3>
                    <input type="radio" class="from1" id="male" name="gen" value="Male" <% if ("Male".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Male
                    <input type="radio" class="from1" id="female" name="gen" value="Female" <% if ("Female".equals(session.getAttribute("Gender"))) { %> checked <% } %>>Female
                    <input type="radio" class="from1" id="other" name="gen" value="Other" <% if ("Other".equals(session.getAttribute("Gender"))) { %> checked <% }%>>Other
                </div>
                <div>
                    <input type="hidden" name="txtUserID" value="<%= session.getAttribute("id")%>"> 
                </div>
                <a href="information0.jsp"><button name="btAction" value="Update" style="border-radius: 20px; background-color: #EBAA5D;    margin-bottom: 20px;
 margin-top: 10px; padding: 5px 20px; margin-left: 320px;    margin-bottom: 20px;

                        ">Submit </button></a>
            </form>
        </div>


</body>

</html>