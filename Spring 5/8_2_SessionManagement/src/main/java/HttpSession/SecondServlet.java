package HttpSession;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet2")
public class SecondServlet extends HttpServlet {
    public SecondServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        HttpSession session = req.getSession(false);

        String user = (String)session.getAttribute("user");
        String pass = (String) session.getAttribute("pass");


        System.out.println("The user logged is : " + user + " Having password + " + pass);
        writer.println("""
                <h1> Successfully Logg in </h1> 
                """);
    }


}
