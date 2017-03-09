import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jovan
 */
@WebServlet(urlPatterns = {"/FirstServlet"})
public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            String n = request.getParameter("userName");
            out.print("Dobro dosli " + n);
            out.print("</br> Ne smes da vidis sifru.. Sem u linku tu se vidi sve ");
            out.print("<a href='SecondServlet?uname=" + n + "'> Drugi servlet</a>");
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
