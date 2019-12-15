package Controller;

import Model.News;
import Utils.GetNewssService;
import Utils.LoginService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Logger;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
    private static final Logger LOGGER
            = Logger.getLogger(HelloServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        //req.getRequestDispatcher("/jsp/index.html").forward(req,resp);
        GetNewssService getNewssService = new GetNewssService();
        LinkedList<News> news = getNewssService.getNews();
        req.setAttribute("news",news);
        //resp.sendRedirect("/jsp/index.jsp");
        req.getRequestDispatcher("/jsp/index.jsp").forward(req,resp);
        resp.getWriter().append("hellp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(name+" "+password);
        LoginService loginService = new LoginService();
        if(loginService.Login(name,password)==true)
        {

            GetNewssService getNewssService = new GetNewssService();
            LinkedList<News> news = getNewssService.getNews();
//            for (News n:news)
//            {
//                req.setAttribute("title",n.getTitle());
//                req.setAttribute("date",n.getDate());
//                req.setAttribute("content",n.getContent());
//            }
            //req.setAttribute("title","hehehe");
            //resp.sendRedirect("/jsp/Welcome.jsp");
            req.setAttribute("news",news);
            req.getRequestDispatcher("/jsp/getallnews.jsp").forward(req,resp);
        }
        else {
            resp.sendRedirect("/jsp/wrong.html");
        }

    }
}
