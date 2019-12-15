package Utils;

import Model.News;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class GetNewssService {
    String sql = "select * from news  ";
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
LinkedList<News> linkedList = new LinkedList<News>();
public LinkedList getNews(){
    try {
        System.out.println("mysql success");
        connection = DataSourceUtils.getConnection();
        System.out.println("mysql success");
        statement = connection.prepareStatement(sql);
        System.out.println("mysql success");
        resultSet = statement.executeQuery();
        while (resultSet.next())
        {
            System.out.println(resultSet.getString("t_title")+""+resultSet.getString("t_date")+""+resultSet.getString("t_content"));
        linkedList.add(new News(resultSet.getString("t_date"),resultSet.getString("t_content"),resultSet.getString("t_title")));
        }
    }catch (SQLException e) {
        e.printStackTrace();
        System.out.println("mysql filed");
    }
    return linkedList;
}
public News GetNews_title(String title){
    String sql1 = "select * from news where t_title = ?";
    News news = null;
            try{
                connection = DataSourceUtils.getConnection();
                statement = connection.prepareStatement(sql1);
                statement.setString(1,title);
                resultSet = statement.executeQuery();
                while (resultSet.next())
                {
                    System.out.println(resultSet.getString("t_title")+""+resultSet.getString("t_date")+""+resultSet.getString("t_content"));
                      news = new News(resultSet.getString("t_date"),resultSet.getString("t_content"),resultSet.getString("t_title"));
                }
            }
            catch (Exception e){

            }
            return  news;
}

}
