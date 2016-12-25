/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Bus;
import java.sql.SQLException;
import jdbc.BusJDBC;

/**
 *
 * @author ASUS
 */
public class BusBT {
    BusJDBC jdbc;
     
     BusBT () throws Exception {
        try {
            jdbc = new BusJDBC();
        }    catch (SQLException ex) {
            throw new Exception("error connecting to database");
        }
    }
     
    public boolean CreateBus(String busNo, String busPlateNo, String busType, String numOfSeat)throws Exception {
        
        int noOfSeat;
        try{
            noOfSeat = Integer.parseInt(numOfSeat);
        } catch (NumberFormatException ex){
            throw new Exception("invalid format");
                    
        }
       
       Bus bs = new Bus();
              bs.setBusNo(busNo);
              bs.setBusPlateNo(busPlateNo);
              bs.setBusType(busType);
              bs.setNumOfSeat(noOfSeat);
              
       return jdbc.createBus(bs);
    
    }
    
    public Bus retrieveBus (String busPlateNo) throws Exception{
        
        Bus bs = jdbc.RetrieveBus(busPlateNo);
        return bs;
        
    }
    
    public boolean updateBus (String busNo, String busPlateNo, String busType, String numOfSeat) throws Exception {
        
        int noOfSeat;
        try{
            noOfSeat = Integer.parseInt(numOfSeat);
        } catch (NumberFormatException ex){
            throw new Exception("invalid format");
                    
        }
     
          Bus bs = new Bus();
              bs.setBusPlateNo(busPlateNo);
              bs.setBusNo(busNo);
              bs.setBusType(busType);
              bs.setNumOfSeat(noOfSeat);
              
           return jdbc.updateBus(bs);
     
    }
    
    public boolean deleteBus(String busPlateNo)
             throws Exception {
        
         return jdbc.DeleteBus(busPlateNo);
    }  
    
}
