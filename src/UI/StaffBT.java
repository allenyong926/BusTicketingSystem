/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import domain.Staff;
import java.sql.SQLException;
import jdbc.StaffJDBC;

/**
 *
 * @author ASUS
 */
public class StaffBT {
     StaffJDBC jdbc;
     
     StaffBT () throws Exception {
        try {
            jdbc = new StaffJDBC();
        }    catch (SQLException ex) {
            throw new Exception("error connecting to database");
        }
    }
     
    public String CreateStaff(String name, String pwd, String icno, String position, String sex, String ph, String address, 
            String city, String state, String zip, String email, double salary, String question, String ans)throws Exception {
         
       String newId = jdbc.getId(position);
       
       Staff s = new Staff();
              s.setId(newId);
              s.setName(name);
              s.setPwd(pwd);
              s.setIcno(icno);
              s.setSex(sex);
              s.setPh(ph);
              s.setAddress(address);
              s.setCity(city);
              s.setState(state);
              s.setZip(zip);
              s.setEmail(email);
              s.setSalary(salary);
              s.setQuestion(question);
              s.setAns(ans);
              
               if (position.equals("Staff"))
            s.setPosition("Staff");
        else
            s.setPosition("Manager");
                            
       boolean success = jdbc.createStaff(s);
       if (success)
        return s.getId();
       else
           return null;
    }
    
    public Staff retrieveStaff (String id) throws Exception{
        
        Staff s = jdbc.RetrieveStaff(id);
        return s;
    }
    
     public boolean updateStaff (String id,String name, String pwd, String icno, String position, String sex, String ph, String address, 
            String city, String state, String zip, String email, double salary, String question, String ans
            ) throws Exception {
     
        Staff s = new Staff();
              s.setId(id);
              s.setName(name);
              s.setPwd(pwd);
              s.setIcno(icno);
              s.setPosition(position);
              s.setSex(sex);
              s.setPh(ph);
              s.setAddress(address);
              s.setCity(city);
              s.setState(state);
              s.setZip(zip);
              s.setEmail(email);
              s.setSalary(salary);
              s.setQuestion(question);
              s.setAns(ans);
              
          boolean ss = jdbc.updateStaff(s);
          if (ss)
              return true;
          else 
              return false;
     
    }
    
    public boolean deleteStaff(String id)
             throws Exception {
        
         return jdbc.DeleteStaff(id);
    }  
    
}
