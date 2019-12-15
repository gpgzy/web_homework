package Controller;

import Model.News;
import Utils.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet("/getServlet")
public class GetNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        System.out.println(title);
        GetNewssService getNewssService = new GetNewssService();
        News news = getNewssService.GetNews_title(title);
        req.setAttribute("title",news.getTitle());
        req.setAttribute("date",news.getDate());
        req.setAttribute("content",news.getContent());
        req.getRequestDispatcher("/jsp/news.jsp").forward(req,resp);
    }
}
