package Servlets;

import jakarta.servlet.*;
//import sun.jvm.hotspot.debugger.win32.coff.DebugVC50ReservedTypes;

import java.io.IOException;

public class SecondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service Method for Second Servlet");
    }
}