package Student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Alumno extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Administrador</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://unpkg.com/material-components-web@latest/dist/material-components-web.min.css\">");
            out.println("</head>");
            out.println("<style>");
            //Body
            out.println("body{align-items:center;text-align:center;background:url('Fondo-Login.jpg') no-repeat;");
            out.println("background-attachment:scroll;-webkit-background-size:cover;-moz-background-size:cover;");
            out.println("-o-background-size:cover;background-size:cover;width:100%;display:table;text-align:center;}");
            //Divisor
            out.println(".divisor{width:50%;position:relative;margin:0%auto;border-style:solid;border-radius:10px;");
            out.println("padding:10px 40px 10px 40px;background-color:#eaeded;display:inline-block;}");
            //Fuente
            out.println(".fuente{font-family:Gill Sans,Gill Sans MT,Myriad Pro,DejaVu Sans Condensed,Helvetica,Arial,sans-serif;}");
            out.println("</style>");
            HttpSession sesion = request.getSession();
            String user = (String)sesion.getAttribute("userName");
            out.println("<body>");
            out.println("<h1>Servlet Administrador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}