/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;
/*testing agile lolololololl*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class UpdateSchedule extends javax.swing.JPanel {

    /**
     * Creates new form CreateStaff
     */
    public UpdateSchedule() {
        initComponents();
        
         try{
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticket","root","");
           Statement stmt = con.createStatement();
           String sql = "select * from bus";
           ResultSet rs = stmt.executeQuery(sql);
           
           while(rs.next()){
               cb_busNo.addItem(rs.getString(1));
           }
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        cb_to = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cb_busNo = new javax.swing.JComboBox();
        cb_from = new javax.swing.JComboBox();
        tf_date = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        cb_time = new javax.swing.JComboBox<>();

        jLabel15.setText("jLabel15");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(635, 481));
        setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bus Schedule Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel12.setText("Price :");

        jLabel13.setText("Time :");

        jLabel14.setText("To :");

        cb_to.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seremban", "Kedah", "Johor", "Kuala Lumpur", "Pulau Penang", "Perak", "Kelantan", " " }));

        jLabel2.setText("Bus No :");

        jLabel20.setText("Date :");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("From :");

        cb_busNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_busNoActionPerformed(evt);
            }
        });

        cb_from.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seremban", "Kedah", "Johor", "Kuala Lumpur", "Pulau Penang", "Perak", "Kelantan", " ", " " }));

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "13:00", "14:30", "17:00", "20:30", "23:00", " " }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(18, 18, 18)
                            .addComponent(tf_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(cb_from, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_busNo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(158, 158, 158)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_time, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cb_to, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cb_from, cb_to});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cb_busNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(cb_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cb_to, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cb_from, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(76, 76, 76))
        );

        add(jPanel3);
        jPanel3.setBounds(10, 10, 669, 425);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cb_busNo.setSelectedIndex(0);
        tf_price.setText("");
        cb_time.setSelectedIndex(0);
        cb_from.setSelectedIndex(0);
        cb_to.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String busNo = (String)cb_busNo.getSelectedItem();
            String date = ((JTextField)tf_date.getDateEditor().getUiComponent()).getText();
            String price = tf_price.getText();
            String time = (String)cb_time.getSelectedItem();
            String pointOfDeparture = (String)cb_from.getSelectedItem();
            String destination = (String)cb_to.getSelectedItem();
            
         if(busNo.equals("")){
            JOptionPane.showMessageDialog(null,"Bus No Cannot be empty");
            return ;
        }
                
        if(date.equals("")){
           JOptionPane.showMessageDialog(this,"Date cannot be empty");
            return ;
        }
        
        if(time.equals("")){
           JOptionPane.showMessageDialog(this,"Time cannot be empty");
            return ;
        }
        
        if(price.equals("")){
           JOptionPane.showMessageDialog(this,"Price cannot be empty");
            return ;
        }
        else if(price.matches("\\d{1,6}.\\d{1,2}")){
            JOptionPane.showMessageDialog(null,"Price type incorrect");
            return;
        }

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticket","root","");

            Statement stmt = con.createStatement();


            String sql ="update schedule set date='"+date+"',price='"+price+"',time='"+time+"',pointOfDeparture='"+pointOfDeparture+"',destination='"+destination+"' where busNo = '"+busNo+"'";

            int row = stmt.executeUpdate(sql);

                if (row > 0)
                {JOptionPane.showMessageDialog(this,"Bus No "+ busNo + " is updated" );
                }
           
        
      }catch(SQLException ex){
          ex.printStackTrace();
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_busNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_busNoActionPerformed
      
    }//GEN-LAST:event_cb_busNoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String busNo = (String)cb_busNo.getSelectedItem();
            
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busticket","root","");

             Statement stmt = con.createStatement();
        
             String sql = "select * from schedule where busNo = '" + busNo +"'";
             ResultSet rs = stmt.executeQuery(sql);
        
               while(rs.next()){
               String busNO = rs.getString("busNo");
               if(busNO != null){
               ((JTextField)tf_date.getDateEditor().getUiComponent()).setText(rs.getString("date"));
               tf_price.setText(rs.getString("price"));
               cb_time.setSelectedItem(rs.getString("time"));
               cb_from.setSelectedItem(rs.getString("pointOfDeparture"));
               cb_to.setSelectedItem(rs.getString("destination"));
        }
            }
           
        }catch(SQLException ex){
          ex.printStackTrace();
      }
       
    }//GEN-LAST:event_jButton3ActionPerformed
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_busNo;
    private javax.swing.JComboBox cb_from;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JComboBox cb_to;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser tf_date;
    private javax.swing.JTextField tf_price;
    // End of variables declaration//GEN-END:variables
}
