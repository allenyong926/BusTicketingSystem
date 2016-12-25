/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import domain.Schedule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ScheduleJDBC {
     Statement stmt;
    PreparedStatement stmt2;
    Connection con;
    
    public ScheduleJDBC () throws SQLException{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
            stmt= con.createStatement();
    }
    
     public ArrayList<Schedule> getUsersList() throws SQLException{
         ArrayList<Schedule> usersList = new ArrayList<Schedule>();
         String sql = "select * from schedule ";
         ResultSet rs = stmt.executeQuery(sql);
         Schedule sc;
         
          while(rs.next()){
              sc = new Schedule();
              rs.getString("busNo");
              rs.getString("busPlateNo");
              rs.getString("date");
              rs.getDouble("price");
              rs.getString("time");
              rs.getString("pointOfDeparture");
              rs.getString("destination");
              usersList.add(sc);
              
              return usersList;
        }
        return null;
    }
      
}
