<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/adminregister.css">
    <title>register</title>
</head>
<body>
    <%@include file="header.jsp"%>

      <form action="register" method="post" id="registerForm">
          <h1 id="registerheading">register</h1>
          <label for="name" class="label">name</label>
          <input type="text" name="name" id="name" class="inputtext">
           <p class="namePtag"></p>
          <label for="email" class="label">email</label>
          <input type="email" name="email" id="email" class="inputtext">
          <p class="emailPtag"></p>
          <label for="password" class="label">password</label>
          <input type="password" name="password" id="password" class="inputtext">
          <p class="passwordPtag"></p>
          <label for="repassword" class="label">re-enter password</label>
          <input type="password" name="repassword" id="repassword" class="inputtext">
          <p class="repasswordPtag"></p>
          <input type="submit" value="register" class="registerbutton" >
          <a href="adminLogin.jsp" class="loginlink">login</a>
      </form>

    <%@include file="footer.jsp"%>

    <script src="js/validateRegister.js"></script>
</body>
</html>
