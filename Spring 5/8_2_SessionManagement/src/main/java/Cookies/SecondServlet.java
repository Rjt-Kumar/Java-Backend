package Cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
    public SecondServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        var flag = false;
        Cookie[] cookies = req.getCookies();

        if( cookies != null ){
            for(Cookie c : cookies ){
                String name = c.getName();
                if( name.equals("Rajat") ){
                    flag = true;
                    System.out.println("Username : " + c.getValue());
                    writer.println("""
                            
                            <h1> Welcome %s </h1>
                            
                            """.formatted(c.getValue()));

                }
            }
        }

        if(!flag){
            System.out.println("No user Found ");

            writer.println("""
                    
                    <h1> No user Found in the Cookie </h1> 
                        """);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
