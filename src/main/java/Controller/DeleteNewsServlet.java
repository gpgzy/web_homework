package Controller;

import Utils.UDnewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteServlet")
public class DeleteNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        UDnewsService uDnewsService = new UDnewsService();
        boolean result = uDnewsService.deleteNews(title);
        if (result == true)
        {
            resp.sendRedirect("/jsp/deletesuccess.html");
        }
        else
        {
            resp.sendRedirect("/jsp/wrong.html");
        }
    }
}
