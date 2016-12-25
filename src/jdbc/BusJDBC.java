/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import domain.Bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class BusJDBC {
     Statement stmt;
    PreparedStatement stmt2;
    Connection con;
    
    public BusJDBC () throws SQLException{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
            stmt= con.createStatement();
    }
    
    public boolean createBus (Bus bs) 
                        throws SQLException{
              String sql = "insert into bus(busNo, busPlateNo, busType, numOfSeat) values(?,?,?,?)";
              stmt2 = con.prepareStatement(sql);
              stmt2.setString(1, bs.getBusNo());
              stmt2.setString(2, bs.getBusPlateNo());
              stmt2.setString(3, bs.getBusType());
              stmt2.setInt(4, bs.getNumOfSeat());
              
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
    public Bus RetrieveBus(String busPlateNo)
            throws SQLException {
        String sql = "select * from bus where busPlateNo= '" + busPlateNo +"'";
        ResultSet rs = stmt.executeQuery(sql);
        
        Bus bs = null;
        while(rs.next()){
              bs = new Bus();
              bs.setBusNo(rs.getString("busNo"));
              bs.setBusPlateNo(rs.getString("busPlateNo"));
              bs.setBusType(rs.getString("busType"));
              bs.setNumOfSeat(rs.getInt("numOfSeat"));
              
              return bs;
        }
        return null;
    }
      
    
    public boolean updateBus (Bus bs)
            throws SQLException {
          String sql = "Update bus set busNo=?, busType=?, numOfSeat=? where busPlateNo=?";
              stmt2 = con.prepareStatement(sql);
              
              stmt2.setString(1, bs.getBusNo());
              stmt2.setString(2, bs.getBusType());
              stmt2.setInt(3, bs.getNumOfSeat());
              stmt2.setString(4, bs.getBusPlateNo());
            
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
    public boolean DeleteBus(String busPlateNo)
            throws SQLException {
         String sql = "delete from bus where busPlateNo='" + busPlateNo +"'";
         
         stmt2 = con.prepareStatement(sql);
   
         int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
}
