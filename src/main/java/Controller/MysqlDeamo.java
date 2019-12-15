package Controller;
import Model.Admin;
import Utils.DataSourceUtils;
import java.sql.*;
import java.util.LinkedList;

public class MysqlDeamo {
    String sql = "select * from user  ";
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
public LinkedList<Admin> getAdmin()
    {LinkedList<Admin> linkedList = new LinkedList<Admin>();
        try {
            System.out.println("mysql success");
            connection = DataSourceUtils.getConnection();
            System.out.println("mysql success");
            statement = connection.prepareStatement(sql);
            System.out.println("mysql success");
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("t_name") + " " + resultSet.getString("t_pwd"));
                linkedList.add(new Admin(resultSet.getString("t_name"),resultSet.getString("t_pwd")));
            }
            System.out.println("mysql success");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("mysql filed");
        }
        return linkedList;
    }


}
