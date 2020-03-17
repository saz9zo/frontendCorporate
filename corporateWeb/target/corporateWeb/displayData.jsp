<%@page import="org.mountblue.DisplayContactData"%>
<%@ page import="java.util.List" %>
<%@ page import="org.mountblue.QueryPojo" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>display</title>
</head>
<body>
    <%
       DisplayContactData contactdata = new DisplayContactData();
       String list = contactdata.fetchData();
       out.println(list);
    %>
</body>
</html>