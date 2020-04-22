package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultiplyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("value");
        if (value == null) {
            response.getWriter().println(0);
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } else {
            response.getWriter().println(Integer.valueOf(value) * 2);
            response.setStatus(HttpServletResponse.SC_OK);
        }
        response.setContentType("text/html;charset=utf-8");
    }
}
