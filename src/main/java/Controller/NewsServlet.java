package Controller;

import Utils.AddNewsService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Logger;

@WebServlet("/newServlet")
public class NewsServlet extends HttpServlet {
    private static final Logger LOGGER
            = Logger.getLogger(HelloServlet.class.getName());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String title = req.getParameter("title");
        String year = req.getParameter("year");
        String month = req.getParameter("month");
        String day = req.getParameter("day");
        String content = req.getParameter("content");
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        int y = Integer.parseInt(year);
        String date = year+"年"+month+"月"+day+"日";
        if(m>12||m<1||d>31||d<0)
        {
            resp.sendRedirect("/jsp/wrong.html");
        System.out.println(title+""+date);
        }else{
            AddNewsService addNewsService = new AddNewsService();
            addNewsService.addnews(title,date,content);
            resp.sendRedirect("/jsp/success.html");

        }
    }
}
