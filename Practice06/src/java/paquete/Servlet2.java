package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            HttpSession session = request.getSession();
            String attribute1 = (String)session.getAttribute("password");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Session</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo "+attribute1+"</h1>");                  
            out.println("</body>");
            out.println("</html>");
    }
}