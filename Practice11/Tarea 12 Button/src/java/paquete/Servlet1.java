package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8"); 
        String boton = request.getParameter("boton");
        String alerta = request.getParameter("alerta");
        PrintWriter out = response.getWriter(); 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Button</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<button type=\"button\" onclick=\"alert('"+alerta+"')\">"+boton+"</button>");
            out.println("</body>");
            out.println("</html>");
    }
}