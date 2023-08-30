package bankManagementSystem;

import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {
              //step 1: register the driver
            c = DriverManager.getConnection("jdbc:mysql:///BankManagementSystem", "root", "Gaurav@2002"); //step 2: create conncetivity
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
