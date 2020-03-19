<%@page import="org.mountblue.DisplayContactData"%>
<%@ page import="java.util.List" %>
<%@ page import="org.mountblue.QueryPojo" %>
<%@ page import= "javax.servlet.http.HttpSession"%>
<%@ page import="com.google.gson.Gson"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/displaydata.css">
    <title>display</title>
</head>
<body>

     <%@include file="header.jsp" %>

     <form action="logout" id="logout" method="get">
         <input type="submit" value="logout">
     </form>

    <%
        response.setHeader ("cache-control","no-cache,no-store,must-revalidate");  //http 1.1
        response.setHeader("Pragma","no-cache");  //http 1.0
        response.setHeader("Expires","0");        //proxies
        if(session.getAttribute("username")== null) {
            response.sendRedirect("adminLogin.jsp");
        }
    %>
    <table class="detailsTable" border="1 solid black">
        <tr class="row">
            <th>name</th>
            <th>email</th>
            <th>phone</th>
            <th>query</th>
        </tr>
    
    <%
       
       DisplayContactData contactdata = new DisplayContactData();
       String jsondata = contactdata.fetchData();
       Gson g = new Gson();
       QueryPojo[] data = g.fromJson(jsondata, QueryPojo[].class);    
       for(QueryPojo querydata: data){
                
        %>
           <tr class="row">
               <td>   <%= querydata.getName()%>   </td>
               <td>   <%= querydata.getEmail()%>   </td>
               <td>   <%= querydata.getPhone()%>   </td>
               <td>   <%= querydata.getQuery()%>   </td>
           </tr>
           
           <%
       }
    %>
</table>

<%@include file="footer.jsp" %>

</body>
</html>