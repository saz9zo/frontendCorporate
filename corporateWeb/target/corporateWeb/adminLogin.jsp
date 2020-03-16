<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
</head>
<body>
    <%@include file="header.jsp"%>

        <form action="" method="post">
            <label for="username">username</label>
            <input type="text" name="username" id="username">
            <label for="password">password</label>
            <input type="password" name="password" id="password">
            <input type="submit" value="login">
        </form>

    <%@include file="header.jsp"%>
</body>
</html>