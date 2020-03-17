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

        <form action="login" method="post">
            <h1>Login</h1>
            <label for="username" class="label">username</label>
            <input type="text" name="username" class= "textField" id="username">
            <label for="password" class="label">password</label>
            <input type="password" name="password" class="textField" id="password">
            <input type="submit" value="login" class="login">
            <a href="registerAdmin.jsp" class="registerlink">register</a>
        </form>

        

    <%@include file="footer.jsp"%>
</body>
</html>