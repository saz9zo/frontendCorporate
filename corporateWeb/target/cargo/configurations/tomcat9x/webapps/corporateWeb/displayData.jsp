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

    <div>
        <table id="displaydata">
            <tr>
                <th>name</th>
                <th>email</th>
                <th>phone</th>
                <th>query</th>
            </tr>
        </table>
    </div>
<%@include file="footer.jsp" %>

<script>
    document.body.onload = function (){
       let displaytable = document.getElementById('displaydata');
        let xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) { 
           let jsonarray =  JSON.parse(xhttp.responseText);
           for(json of jsonarray) {
             let row = document.createElement('tr');
             let entity1 = document.createElement('td');
             let entity2 = document.createElement('td');
             let entity3 = document.createElement('td');
             let entity4 = document.createElement('td');
             entity1.textContent= json.name;
             entity2.textContent = json.email;
             entity3.textContent = json.phone;
             entity4.textContent = json.query;

             row.appendChild(entity1);
             row.appendChild(entity2);
             row.appendChild(entity3);
             row.appendChild(entity4);
             displaytable.appendChild(row);
          }       
        }
    }
    xhttp.open("GET","displaycontent",true);
    xhttp.send();
    }
    
</script>
</body>
</html>