/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import domain.Staff;
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
public class StaffJDBC {
    Statement stmt;
    PreparedStatement stmt2;
    Connection con;
    
    public StaffJDBC () throws SQLException{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
            stmt= con.createStatement();
    }
    
    public String getId(String position)throws SQLException{
        String type="";
        if (position.equals("Manager"))
            type = "M";
        else
            type = "S";
        
        String sql = "select MAX(id) as highestId from staff where position=?";
        stmt2 = con.prepareStatement(sql);
        stmt2.setString(1, type);
      
        ResultSet rs = stmt2.executeQuery();
        String newId = "";
      
        boolean found=false;
        while (rs.next()){
           
           String temp = rs.getString("highestId");
                  if (temp!=null){
                 found = true;
             temp = temp.substring(1);
                 int iid = Integer.parseInt(temp) + 1;
           newId = type +iid;
      
        } }
        if (!found){
              if (position.equals("Manager")) {
           newId= "M000";
        } else if (position.equals("Staff")){
            newId = "S000";
        }
    }
             return newId;
    }
    
    public boolean createStaff (Staff s) 
                        throws SQLException{
              String sql = "insert into staff(id, name, icno, position, pwd, sex, ph, address,"+
                      "city, state, zip, email, salary, question, ans) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
              stmt2 = con.prepareStatement(sql);
              stmt2.setString(1, s.getId());
              stmt2.setString(2, s.getName());
              stmt2.setString(3, s.getIcno());
              stmt2.setString(4, s.getPosition());
              stmt2.setString(5, s.getPwd());
              stmt2.setString(6, s.getSex());
              stmt2.setString(7, s.getPh());
              stmt2.setString(8, s.getAddress());
              stmt2.setString(9, s.getCity());
              stmt2.setString(10, s.getState());
              stmt2.setString(11, s.getZip());
              stmt2.setString(12, s.getEmail());
              stmt2.setDouble(13, s.getSalary());
              stmt2.setString(14, s.getQuestion());
              stmt2.setString(15, s.getAns());
            
  
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
    public Staff RetrieveStaff(String id)
            throws SQLException {
        String sql = "select * from staff where id= '" + id +"'";
         ResultSet rs = stmt.executeQuery(sql);
        
        Staff s = null;
        while(rs.next()){
            String id2 = rs.getString("id");
            if(id2!=null){
              s = new Staff();
              s.setId(id2);
              s.setName(rs.getString("name"));
              s.setIcno(rs.getString("icno"));
              s.setPosition(rs.getString("position"));
              s.setPwd(rs.getString("pwd"));
              s.setSex(rs.getString("sex"));
              s.setPh(rs.getString("ph"));
              s.setAddress(rs.getString("address"));
              s.setCity(rs.getString("city"));
              s.setState(rs.getString("state"));
              s.setZip(rs.getString("zip"));
              s.setEmail(rs.getString("email"));
              s.setSalary(rs.getDouble("salary"));
              s.setQuestion(rs.getString("question"));
              s.setAns(rs.getString("ans"));
           
              return s;
            }
        }
        return null;
    }
    
     public boolean updateStaff (Staff s)
            throws SQLException {
          String sql = "Update staff set name=?, icno=?, position=?, pwd=?, sex=?, ph=?, address=?,"+
                      "city=?, state=?, zip=?, email=?, salary=?, question=?, ans=? where id=?";
              stmt2 = con.prepareStatement(sql);
              stmt2.setString(1, s.getName());
              stmt2.setString(2, s.getIcno());
              stmt2.setString(3, s.getPosition());
              stmt2.setString(4, s.getPwd());
              stmt2.setString(5, s.getSex());
              stmt2.setString(6, s.getPh());
              stmt2.setString(7, s.getAddress());
              stmt2.setString(8, s.getCity());
              stmt2.setString(9, s.getState());
              stmt2.setString(10, s.getZip());
              stmt2.setString(11, s.getEmail());
              stmt2.setDouble(12, s.getSalary());
              stmt2.setString(13, s.getQuestion());
              stmt2.setString(14, s.getAns());
              stmt2.setString(15, s.getId());
              
              int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
     
     public boolean DeleteStaff(String id)
            throws SQLException {
         String sql = "delete from staff where id='" + id +"'";
         
         stmt2 = con.prepareStatement(sql);
   
         int result2= stmt2.executeUpdate();
              
              if (result2 > 0)
                   return true;
              else
                  return false;
    }
    
}
