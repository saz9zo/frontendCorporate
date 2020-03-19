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


@WebServlet(name="serve", urlPatterns = "/serve")
public class Serve extends HttpServlet {

   public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
       doPost(request,response);
   }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
      BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
      String json = br.readLine();
      Gson g = new Gson();
      QueryPojo qpojo = g.fromJson(json, QueryPojo.class);    

      SaveData savedata= new SaveData();
      savedata.saveit(qpojo);
      
      try {
        response.sendRedirect("contactUs.jsp");
      } catch (Exception e) {
      
      }        
    }
}