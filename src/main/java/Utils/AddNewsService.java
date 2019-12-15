package Utils;

import Model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddNewsService {
    String sql = "insert into news values (?,?,?)";
    Connection connection = null;
    PreparedStatement statement = null;
    //ResultSet resultSet = null;
    public void addnews(String title,String date,String content)
    {
        try {
            connection = DataSourceUtils.getConnection();
            statement = connection.prepareStatement(sql);
            //resultSet = statement.executeQuery();
            statement.setString(1,title);
            statement.setString(2,date);
            statement.setString(3,content);
            statement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("mysql filed");
        }
    }

}
