
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jovan
 */
@WebServlet(urlPatterns = {"/SecondServlet"})
public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("Uspesno si savladao osnove servleta!");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
