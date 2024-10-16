package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("Third Servlet Working Fine");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // server side
        String message = req.getParameter("message");
        String user = req.getParameter("user");
        System.out.println(user + " : " + message );

        // Sending data back to browser
        resp.setContentType("text");

        PrintWriter writer = resp.getWriter();

        writer.println("Form Submitted");
        writer.print(" Message : " + message);

    }
}
