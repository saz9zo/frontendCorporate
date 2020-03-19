<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <link rel="stylesheet" href="css/contactUs.css">
    <title>contactus</title>
</head>
<body>
  <%@include file="header.jsp" %>


  <form id="contactUs">
    <h1 class="contact-us-heading">Contact Us</h1>
    <label>Name</label>
    <input type="text" class="name" name="name"><br>
    <p class= "nametag"></p>
    <label>Email</label>
    <input type="text" class="email" name="email" ><br>
    <p class= "emailtag"></p>
    <label>Phone No</label>
    <input type="text" class="number" name="number" ><br>
    <p class= "numbertag"></p>
    <label>Query</label>
    <textarea class="query" name="query"></textarea><br>
    <p class= "querytag"></p>
    <input type="submit" onclick="dataToJson()" class="submit" value="submit">
   </form>

  <%@include file="footer.jsp" %>
  <script src="js/contactUs.js"></script>
</body>
</html>
