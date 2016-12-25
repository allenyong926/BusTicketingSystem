/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Schedule;
import java.sql.SQLException;
import java.util.ArrayList;
import jdbc.ScheduleJDBC;

/**
 *
 * @author ASUS
 */
public class ScheduleBT {
    
    ScheduleJDBC jdbc;
     
     ScheduleBT () throws Exception {
        try {
            jdbc = new ScheduleJDBC();
        }    catch (SQLException ex) {
            throw new Exception("error connecting to database");
        }
    }
     
     public ArrayList<Schedule> getUsersList() throws SQLException{
         ArrayList<Schedule> list = jdbc.getUsersList();
         return list;
     }
    
}
