/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Driver;
import domain.Staff;
import java.sql.SQLException;
import jdbc.DriverJDBC;

/**
 *
 * @author ASUS
 */
public class DriverBT {
     DriverJDBC jdbc;
     
     DriverBT () throws Exception {
        try {
            jdbc = new DriverJDBC();
        }    catch (SQLException ex) {
            throw new Exception("error connecting to database");
        }
    }
     
    public boolean CreateDriver(String name, String sex, String ph, String address, 
            String city, String state, String zip, String email, String busplateno, String icno, double salary)throws Exception {
        
       Driver dr = new Driver();

              dr.setName(name);
              dr.setSex(sex);
              dr.setPh(ph);
              dr.setAddress(address);
              dr.setCity(city);
              dr.setState(state);
              dr.setZip(zip);
              dr.setEmail(email);
              dr.setBusplateno(busplateno);
              dr.setIcno(icno);
              dr.setSalary(salary);
              
              return jdbc.createDriver(dr);
                
    }
    
    public Driver retrieveDriver (String name) throws Exception{
        
        Driver dr = jdbc.RetrieveDriver(name);
        return dr;
    }
    
     public boolean updateDriver (String name, String sex, String ph, String address, 
            String city, String state, String zip, String email, String busplateno, String icno, double salary)throws Exception {
     
       Driver dr = new Driver();

              dr.setName(name);
              dr.setSex(sex);
              dr.setPh(ph);
              dr.setAddress(address);
              dr.setCity(city);
              dr.setState(state);
              dr.setZip(zip);
              dr.setEmail(email);
              dr.setBusplateno(busplateno);
              dr.setIcno(icno);
              dr.setSalary(salary);
              
              return jdbc.updateDriver(dr);
         
    }
    
    public boolean deleteDriver(String name)
             throws Exception {
        
         return jdbc.DeleteDriver(name);
    }
}
