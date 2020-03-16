<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register</title>
</head>
<body>
    <%@include file="header.jsp"%>

      <form action="AdminRegister" method="post">
          <label for="name">name</label>
          <input type="text" name="name" id="name">
          <label for="email">email</label>
          <input type="email" name="email" id="email">
          <label for="password">password</label>
          <input type="password" name="password" id="password">
          <label for="repassword">re-enter password</label>
          <input type="password" name="repassword" id="repassword">
          <input type="submit" value="register">
      </form>

    <%@include file="footer.jsp"%>
</body>
</html>