
package bank_management_system;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
     Connection c;
     Statement s;
    public Conn(){
        try {
//             Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "1234s");
            s = c.createStatement();
            // System.out.println("Connected to the database");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

