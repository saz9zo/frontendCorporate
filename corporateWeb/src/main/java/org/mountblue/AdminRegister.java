package org.mountblue;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.Gson; 
import java.io.*;


@WebServlet(name="register", urlPatterns = "/register")
public class AdminRegister extends HttpServlet{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = br.readLine();
        Gson g = new Gson();
        AdminPojo aPojo= g.fromJson(json, AdminPojo.class);   

        // String name = request.getParameter("name");
        // String email = request.getParameter("email");
        // String password = request.getParameter("password");
         
        SaveRegister saveRegister = new SaveRegister();
        boolean res = saveRegister.saveData(aPojo);
                    
        if (res == false) {
           response.sendError(403);
        }
    }
}
