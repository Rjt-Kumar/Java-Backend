import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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


        // Generate Form data

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        writer.println("""
                <h2> Your Form Details hat you have Submitted </h2>
                <h3> Email Address %s </h3>
                <h3> Phone Number %s </h3>
                <h3> Feedback Message %s </h3>
                """.formatted(email,phoen,message));


    }
}
