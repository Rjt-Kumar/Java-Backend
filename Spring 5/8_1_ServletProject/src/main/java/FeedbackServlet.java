import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import entities.Message;
import jdbc.Process;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        resp.setContentType("text");
        resp.getWriter().print("doGet Fine");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Get Form data
        String email = req.getParameter("email");
        String phoen = req.getParameter("phone");
        String message = req.getParameter("message");

        // Process Form data
        Process pro = new Process();
        try {
            pro.insert(new Message(email, phoen, message));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Generate Form data

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        try{
            pro.show(writer);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
