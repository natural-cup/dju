package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class qsh extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();

        String taste = request.getParameter("taste");

        if (taste == null){
            taste = "apple";
        }
        writer.println("<html><body>");
        writer.println("<h1> milk with" + taste +"</h1>");
        writer.println("</body></html>");
    }
    }
}
