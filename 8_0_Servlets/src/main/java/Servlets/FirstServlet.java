package Servlets;


//import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_it;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;


@WebServlet("/first")
public class FirstServlet implements Servlet{

    private ServletConfig config;
    private int count;
    public FirstServlet() {
        super();
    }



    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
         this.config = servletConfig;
         this.count = 0;
         System.out.println("Init Method is Called");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Called");
        count++;
    }

    @Override
    public String getServletInfo() {
        return "The is My Servlet with Count = " + count;
    }

    @Override
    public void destroy() {

    }
}
