package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            response.setContentType("text/html;charset=UTF-8");
            String param1=request.getParameter("param1");
            String param2=request.getParameter("param2");
            PrintWriter out = response.getWriter();
            out.println("<DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title> Servlet Servlet 1</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>param1: "+param1+"  param2: "+param2+" </h1>");
            out.println("</body>");
            out.println("</html>");
            
        }
}
