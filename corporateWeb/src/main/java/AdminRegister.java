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
        String repassword = request.getParameter("repassword");
           PrintWriter out = response.getWriter();
        
        if(!(password.equals(repassword))){
            out.print("password missmatch");
            response.sendRedirect("registerAdmin.jsp");
        }
        else {
                SaveRegister saveRegister = new SaveRegister();
                saveRegister.saveData(name, email,password);
        }

       
    }
}
