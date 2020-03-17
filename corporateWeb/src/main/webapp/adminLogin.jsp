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

        <form action="displayData" method="post">
            <h1>Login</h1>
            <label for="username">username</label>
            <input type="text" name="username" id="username">
            <label for="password">password</label>
            <input type="password" name="password" id="password">
            <input type="submit" value="login">
        </form>

    <%@include file="footer.jsp"%>
</body>
</html>