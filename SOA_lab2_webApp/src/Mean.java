import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Mean", urlPatterns = {"/mean"})
public class Mean extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("windows-1250");
        PrintWriter out = response.getWriter();
        int num1 = Integer.parseInt(request.getParameter("1stnum"));
        int num2 = Integer.parseInt(request.getParameter("2ndnum"));
        int num3 = Integer.parseInt(request.getParameter("3rdnum"));
        int num4 = Integer.parseInt(request.getParameter("4thnum"));
        int num5 = Integer.parseInt(request.getParameter("5thnum"));
        out.println("<html>");
        out.println("<head><title>Pierwszy Servlet</title></head>");
        out.println("<body>");
        out.println("<p>Średnia pięciu podanych liczb: " + (num1+num2+num3+num4+num5)/5 + "</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
