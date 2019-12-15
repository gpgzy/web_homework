package Controller;

import Model.News;
import Utils.AddNewsService;
import Utils.GetNewssService;
import Utils.UDnewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        //System.out.println(title);
        GetNewssService getNewssService = new GetNewssService();
        News news = getNewssService.GetNews_title(title);
        req.setAttribute("title",news.getTitle());
        req.setAttribute("date",news.getDate());
        req.setAttribute("content",news.getContent());
        req.getRequestDispatcher("/jsp/update_news.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        String date = req.getParameter("date");
        String content = req.getParameter("content");
        UDnewsService uDnewsService = new UDnewsService();
        boolean result = uDnewsService.deleteNews(title);
        AddNewsService addNewsService = new AddNewsService();
        addNewsService.addnews(title,date,content);
        resp.sendRedirect("/jsp/updatesuccess.html");
        //req.getRequestDispatcher("/jsp/updatesuccess.html").forward(req,resp);
    }
}
