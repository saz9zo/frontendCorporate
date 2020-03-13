
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name="serve", urlPatterns = "/serve")
public class serve extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("number");
            String query = request.getParameter("query");

            PrintWriter printWriter = response.getWriter();
            printWriter.println(name);
            printWriter.println(email);
            printWriter.println(phone);
            printWriter.println(query);
    }
}