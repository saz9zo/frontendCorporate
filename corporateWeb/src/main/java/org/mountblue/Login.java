package org.mountblue;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="login", urlPatterns="/login")
public class Login extends HttpServlet {
    public void doPost (HttpServletRequest request, HttpServletResponse respose) throws IOException, ServletException{
       String username = request.getParameter("username");
       String password = request.getParameter("password");

    
       HttpSession session = request.getSession();
       session.setAttribute("username",username);

       Validate validate = new Validate();
       boolean result = validate.validEntry(username, password);

       if(result == true) {
           respose.sendRedirect("displayData.jsp");
       }
       else {
           respose.sendRedirect("adminLogin.jsp");
       }

    }
}
