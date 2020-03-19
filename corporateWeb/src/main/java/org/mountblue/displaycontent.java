package org.mountblue;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="displaycontent", urlPatterns="/displaycontent")
public class displaycontent extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        DisplayContactData displayDataContact = new DisplayContactData();
        String json = displayDataContact.fetchData();
        res.getWriter().print(json);
    }
}