/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import hospital_managment_system.Home;
import hospital_managment_system.Log_In;
import hospital_managment_system.MySqlConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nafiul Alam
 */
public class Update_patient extends javax.swing.JFrame {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    /**
     * Creates new form Update_patient
     */
    public Update_patient() {
        initComponents();
        fetch_table();
    }
    private void fetch_table(){
        try{
           conn = (com.mysql.jdbc.Connection) MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM patient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
            patient_table.setAutoResizeMode(patient_table.AUTO_RESIZE_OFF);
            patient_table.getColumnModel().getColumn(0).setPreferredWidth(58);
            patient_table.getColumnModel().getColumn(1).setPreferredWidth(58);
            patient_table.getColumnModel().getColumn(2).setPreferredWidth(80);
            patient_table.getColumnModel().getColumn(3).setPreferredWidth(170);
            patient_table.getColumnModel().getColumn(4).setPreferredWidth(33);
            patient_table.getColumnModel().getColumn(5).setPreferredWidth(110);
            patient_table.getColumnModel().getColumn(6).setPreferredWidth(80);
            patient_table.getColumnModel().getColumn(7).setPreferredWidth(110);
            patient_table.getColumnModel().getColumn(8).setPreferredWidth(160);
            patient_table.getColumnModel().getColumn(9).setPreferredWidth(53);
            patient_table.getColumnModel().getColumn(10).setPreferredWidth(50);
            patient_table.getColumnModel().getColumn(11).setPreferredWidth(30);
            patient_table.getColumnModel().getColumn(12).setPreferredWidth(60);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void update_table(){
        try{
            String sql = "SELECT * FROM patient";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
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

        update_panel = new javax.swing.JPanel();
        serialNo_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        disease_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        roomNo_txt = new javax.swing.JTextField();
        blood_txt = new javax.swing.JTextField();
        status_txt = new javax.swing.JTextField();
        scroll_table = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        bradcum_label = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        cover_patient = new javax.swing.JLabel();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        update_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        update_panel.setLayout(null);
        update_panel.add(serialNo_txt);
        serialNo_txt.setBounds(0, 100, 60, 30);
        update_panel.add(id_txt);
        id_txt.setBounds(60, 100, 60, 30);
        update_panel.add(date_txt);
        date_txt.setBounds(120, 100, 80, 30);
        update_panel.add(name_txt);
        name_txt.setBounds(200, 100, 170, 30);
        update_panel.add(age_txt);
        age_txt.setBounds(370, 100, 33, 30);
        update_panel.add(disease_txt);
        disease_txt.setBounds(400, 100, 110, 30);
        update_panel.add(phone_txt);
        phone_txt.setBounds(510, 100, 80, 30);

        email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        update_panel.add(email_txt);
        email_txt.setBounds(590, 100, 100, 30);
        update_panel.add(address_txt);
        address_txt.setBounds(690, 100, 160, 30);
        update_panel.add(gender_txt);
        gender_txt.setBounds(850, 100, 53, 30);
        update_panel.add(roomNo_txt);
        roomNo_txt.setBounds(900, 100, 50, 30);
        update_panel.add(blood_txt);
        blood_txt.setBounds(950, 100, 30, 30);
        update_panel.add(status_txt);
        status_txt.setBounds(980, 100, 60, 30);

        patient_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        patient_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patient_tableMouseClicked(evt);
            }
        });
        scroll_table.setViewportView(patient_table);

        update_panel.add(scroll_table);
        scroll_table.setBounds(2, 132, 1040, 400);

        bradcum_label.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(51, 51, 51));
        bradcum_label.setText("Patient Panel >> Update Patient");
        update_panel.add(bradcum_label);
        bradcum_label.setBounds(20, 10, 540, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        update_panel.add(back_btn);
        back_btn.setBounds(560, 10, 160, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        update_panel.add(home_btn);
        home_btn.setBounds(720, 10, 160, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        update_panel.add(logOut_btn);
        logOut_btn.setBounds(880, 10, 160, 60);

        add_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(102, 102, 102));
        add_btn.setText("Add");
        add_btn.setToolTipText("");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        update_panel.add(add_btn);
        add_btn.setBounds(740, 530, 140, 60);

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setForeground(new java.awt.Color(51, 51, 51));
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });
        update_panel.add(update_btn);
        update_btn.setBounds(880, 530, 160, 60);

        cover_patient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patient/cover-photo.jpg"))); // NOI18N
        update_panel.add(cover_patient);
        cover_patient.setBounds(0, 0, 1050, 70);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patient/bg-photo.jpg"))); // NOI18N
        update_panel.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(update_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void patient_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patient_tableMouseClicked
        try{
            int row = patient_table.getSelectedRow();
            String tableClick = (patient_table.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM patient WHERE ID = '" + tableClick + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String serialNo = rs.getString("Serial");
                serialNo_txt.setText(serialNo);
                String id = rs.getString("ID");
                id_txt.setText(id);
                String date = rs.getString("Date");
                date_txt.setText(date);
                String name = rs.getString("Name");
                name_txt.setText(name);
                String age = rs.getString("Age");
                age_txt.setText(age);
                String disease = rs.getString("Disease");
                disease_txt.setText(disease);
                String phone = rs.getString("Phone");
                phone_txt.setText(phone);
                String email = rs.getString("Email");
                email_txt.setText(email);
                String adderss = rs.getString("Address");
                address_txt.setText(adderss);
                String gender = rs.getString("Gender");
                gender_txt.setText(gender);
                String roomNo = rs.getString("Room");
                roomNo_txt.setText(roomNo);
                String blood = rs.getString("BG");
                blood_txt.setText(blood);
                String status = rs.getString("Status");
                status_txt.setText(status);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_patient_tableMouseClicked

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        patient p=new patient();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        Log_In l=new Log_In();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOut_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        add_patient ap=new add_patient();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_add_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        try{
            conn = (com.mysql.jdbc.Connection) MySqlConnect.ConnectDB();
            String serialNo = serialNo_txt.getText();
            String id = id_txt.getText();
            String name = name_txt.getText();
            String email = email_txt.getText();
            String age = age_txt.getText();
            String gender = gender_txt.getText();
            String address = address_txt.getText();
            String phone = phone_txt.getText();
            String date = date_txt.getText();
            String blood = blood_txt.getText();
            String status = status_txt.getText();
            String disease = disease_txt.getText();
            String roomNo = roomNo_txt.getText();

            String sql = "UPDATE `patient` SET `Serial` = '"+serialNo+"', `ID` = '"+id+"', `Name` = '"+name+"', `Email` = '"+email+"', `Age` = '"+age+"', `Gender` = '"+gender+"', `Address` = '"+address+"', `Phone` = '"+phone+"', `Date` = '"+date+"', `BG` = '"+blood+"', `Status` = '"+status+"', `Disease` = '"+disease+"', `Room` = '"+roomNo+"' WHERE `patient`.`ID` = '"+id+"'";

            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated Successfully");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
        patient_table.setAutoResizeMode(patient_table.AUTO_RESIZE_OFF);
        patient_table.getColumnModel().getColumn(0).setPreferredWidth(58);
        patient_table.getColumnModel().getColumn(1).setPreferredWidth(58);
        patient_table.getColumnModel().getColumn(2).setPreferredWidth(80);
        patient_table.getColumnModel().getColumn(3).setPreferredWidth(170);
        patient_table.getColumnModel().getColumn(4).setPreferredWidth(33);
        patient_table.getColumnModel().getColumn(5).setPreferredWidth(110);
        patient_table.getColumnModel().getColumn(6).setPreferredWidth(80);
        patient_table.getColumnModel().getColumn(7).setPreferredWidth(105);
        patient_table.getColumnModel().getColumn(8).setPreferredWidth(155);
        patient_table.getColumnModel().getColumn(9).setPreferredWidth(53);
        patient_table.getColumnModel().getColumn(10).setPreferredWidth(50);
        patient_table.getColumnModel().getColumn(11).setPreferredWidth(30);
        patient_table.getColumnModel().getColumn(12).setPreferredWidth(60);

    }//GEN-LAST:event_update_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JTextField blood_txt;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JLabel cover_patient;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField disease_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTable patient_table;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTextField roomNo_txt;
    private javax.swing.JScrollPane scroll_table;
    private javax.swing.JTextField serialNo_txt;
    private javax.swing.JTextField status_txt;
    private javax.swing.JButton update_btn;
    private javax.swing.JPanel update_panel;
    // End of variables declaration//GEN-END:variables
}