package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UDnewsService {
    String sql = null;
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    public boolean deleteNews(String title){
        boolean result =false;
        try{
            sql = "delete from news where t_title = ?";
            connection = DataSourceUtils.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1,title);
             statement.executeUpdate();
            result = true;

        }catch(SQLException e){
            result = false;
        }
        return result;
    }


}
