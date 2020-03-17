package org.mountblue;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="register", urlPatterns = "/register")
public class AdminRegister extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
         
                SaveRegister saveRegister = new SaveRegister();
                boolean res = saveRegister.saveData(name, email,password);

               if (res == true) {
                response.sendRedirect("adminLogin.jsp");
               }
               else {
                   response.sendRedirect("registerAdmin.jsp");
               }

    }
}
