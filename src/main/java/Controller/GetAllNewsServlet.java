package Controller;

import Model.News;
import Utils.GetNewssService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;

@WebServlet("/getallServlet")
public class GetAllNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        GetNewssService getNewssService = new GetNewssService();
        LinkedList<News> news = getNewssService.getNews();
        req.setAttribute("news",news);
        req.getRequestDispatcher("/jsp/getallnews.jsp").forward(req,resp);
    }
}
