import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WybórPiwa", urlPatterns = {"/getBeer"})
public class WyborPiwa extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("windows-1250");
        RequestDispatcher view;
        EkspertPiwny ekspertPiwny = new EkspertPiwny();
        request.setAttribute("marki", ekspertPiwny.list((String)request.getParameter("kolor")));
        view = request.getRequestDispatcher("wynik.jsp");
        view.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
