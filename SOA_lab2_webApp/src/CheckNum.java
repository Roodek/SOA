import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

@WebServlet(name = "CheckNum", urlPatterns = {"/checknum"})
public class CheckNum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("windows-1250");

        PrintWriter out = response.getWriter();

        String[] values = request.getParameterValues("text");
        ArrayList<Double> numArray = new ArrayList<>();
        boolean isNumericFlag = true;
        out.println("<html>");
        out.println("<head><title>Pierwszy Servlet</title></head>");
        out.println("<body>");
        for(String i : values) {
            if (isNumeric(i)){
                numArray.add(Double.parseDouble(i));
                continue;
            }else{
                out.println("<p> przynajmniej jedno z podanych pól nie jest liczbą </p>");
                isNumericFlag = false;
                break;
            }
        }
        if (isNumericFlag){
            Collections.sort(numArray);
            out.println("<p> posortowane liczby </p>");
            for (Double i :numArray){
                out.println("<p>" + i +"</p>");
            }

        }
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public static boolean isNumeric(String str){
        try{
            Double.parseDouble(str);
            return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
}
