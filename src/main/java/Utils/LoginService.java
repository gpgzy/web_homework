package Utils;

import Controller.MysqlDeamo;
import Model.Admin;

import java.util.LinkedList;

public class LoginService {
    public  boolean Login(String name,String password){
        MysqlDeamo mysqlDeamo = new MysqlDeamo();
        LinkedList<Admin> list = mysqlDeamo.getAdmin();
        boolean result = false;
        for (Admin list1:list)
        {
            if(name.equals(list1.getUsername())&&password.equals(list1.getPassword()))
            {
                result = true;
                break;
            }
            else
            {
                result = false;
            }

        }
        return result;
    }
}
