package org.hotel.management.system;


import java.sql.*;

public class Conn{
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","swehasanov");

            s =c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }
}

