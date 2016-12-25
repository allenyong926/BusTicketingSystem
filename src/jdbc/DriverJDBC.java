/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import domain.Driver;
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
public class DriverJDBC {
    
    Statement stmt;
    PreparedStatement stmt2;
    Connection con;
    
    public DriverJDBC () throws SQLException{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
            stmt= con.createStatement();
    }
    
    public boolean createDriver (Driver dr) 
                        throws SQLException{
              String sql = "insert into driver(name, sex, ph, address,"+
                      "city, state, zip, email, busPlateNo, icno, salary) values(?,?,?,?,?,?,?,?,?,?,?)";
              stmt2 = con.prepareStatement(sql);
              stmt2.setString(1, dr.getName());
              stmt2.setString(2, dr.getSex());
              stmt2.setString(3, dr.getPh());
              stmt2.setString(4, dr.getAddress());
              stmt2.setString(5, dr.getCity());
              stmt2.setString(6, dr.getState());
              stmt2.setString(7, dr.getZip());
              stmt2.setString(8, dr.getEmail());
              stmt2.setString(9, dr.getBusplateno());
              stmt2.setString(10, dr.getIcno());
              stmt2.setDouble(11, dr.getSalary());
             
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
    public Driver RetrieveDriver(String name)
            throws SQLException {
        String sql = "select * from driver where name= '" + name +"'";
         ResultSet rs = stmt.executeQuery(sql);
        
        Driver dr = null;
        while(rs.next()){
            String name2 = rs.getString("name");
            if(name2!=null){
              dr = new Driver();
              dr.setName(name2);
              dr.setSex(rs.getString("sex"));
              dr.setPh(rs.getString("ph"));
              dr.setAddress(rs.getString("address"));
              dr.setCity(rs.getString("city"));
              dr.setState(rs.getString("state"));
              dr.setZip(rs.getString("zip"));
              dr.setEmail(rs.getString("email"));
              dr.setBusplateno(rs.getString("busPlateNo"));
              dr.setIcno(rs.getString("icno"));
              dr.setSalary(rs.getDouble("salary"));
      
              return dr;
            }
        }
        return null;
    }
    
     public boolean updateDriver (Driver dr)
            throws SQLException {
          String sql = "Update driver set sex=?, ph=?, address=?,"+
                      "city=?, state=?, zip=?, email=?, busPlateNo=?, icno=?, salary=? where name=?";
              stmt2 = con.prepareStatement(sql);
             
              stmt2.setString(1, dr.getSex());
              stmt2.setString(2, dr.getPh());
              stmt2.setString(3, dr.getAddress());
              stmt2.setString(4, dr.getCity());
              stmt2.setString(5, dr.getState());
              stmt2.setString(6, dr.getZip());
              stmt2.setString(7, dr.getEmail());
              stmt2.setString(8, dr.getBusplateno());
              stmt2.setString(9, dr.getIcno());
              stmt2.setDouble(10, dr.getSalary());
              stmt2.setString(11, dr.getName());
              
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
     
     public boolean DeleteDriver(String name)
            throws SQLException {
         String sql = "delete from driver where name='" + name +"'";
         
         stmt2 = con.prepareStatement(sql);
   
         int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
}
