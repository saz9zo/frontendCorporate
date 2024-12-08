<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/adminlogin.css">
    <title>login</title>
</head>
<body>
    <%@include file="header.jsp"%>

        <form action="login" method="post" id="loginForm">
            <h1>Login</h1>
            <label for="username" class="label">username</label>
            <input type="text" name="username" class= "textField" id="username">
            <p id="usernamePtag"></p>
            <label for="password" class="label">password</label>
            <input type="password" name="password" class="textField" id="password">
            <p id="passwordPtag"></p>
            <input type="submit" onclick="return validateLogin()" value="login" class="login">
            <a href="registerAdmin.jsp" class="registerlink">register</a>
        </form>

        

    <%@include file="footer.jsp"%>

    <script src="js/loginvalidate.js"></script>
</body>
</html>