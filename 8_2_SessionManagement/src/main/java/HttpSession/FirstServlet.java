package HttpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {
    public FirstServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

          String user = "Rjt";
          String pass = "cdrRjt@123";

        HttpSession session = req.getSession();
        session.setAttribute("user",user);
        session.setAttribute("pass",pass);
        session.setMaxInactiveInterval(2*60);

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");


        writer.println("<h1> Cookie Successfully Set </h1> ");
    }


}
