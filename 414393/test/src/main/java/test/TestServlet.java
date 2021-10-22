package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.eclipse.jetty.util.ReadLineInputStream;

public class TestServlet extends  HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException { 
        PrintWriter out = response.getWriter();
        out.println("The Parameter are ："+request.getPart("name1"));

        ReadLineInputStream ris = new ReadLineInputStream(request.getPart("name1").getInputStream());
        String line = ris.readLine();
        out.println("The length is " + line.length());
    }
}
