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
public class search_patient extends javax.swing.JFrame {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    /**
     * Creates new form search_patient
     */
    public search_patient() {
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

        search_label = new javax.swing.JPanel();
        scroll_table = new javax.swing.JScrollPane();
        patient_table = new javax.swing.JTable();
        bradcum_label = new javax.swing.JLabel();
        search_label1 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        reload_label = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        logOut_btn = new javax.swing.JButton();
        cover_patient = new javax.swing.JLabel();
        bg_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Patient");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        search_label.setPreferredSize(new java.awt.Dimension(1050, 626));
        search_label.setLayout(null);

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
        scroll_table.setViewportView(patient_table);

        search_label.add(scroll_table);
        scroll_table.setBounds(2, 162, 1050, 420);

        bradcum_label.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 24)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(51, 51, 51));
        bradcum_label.setText("Patient Panel >> Search Patient");
        search_label.add(bradcum_label);
        bradcum_label.setBounds(10, 0, 540, 70);
        search_label.add(search_label1);
        search_label1.setBounds(10, 100, 50, 60);

        search_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(51, 51, 51));
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        search_label.add(search_txt);
        search_txt.setBounds(60, 110, 410, 45);

        reload_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reload_labelMouseClicked(evt);
            }
        });
        search_label.add(reload_label);
        reload_label.setBounds(480, 100, 70, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        search_label.add(back_btn);
        back_btn.setBounds(560, 100, 160, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        search_label.add(home_btn);
        home_btn.setBounds(720, 100, 160, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        search_label.add(logOut_btn);
        logOut_btn.setBounds(880, 100, 160, 60);

        cover_patient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patient/cover-photo.jpg"))); // NOI18N
        search_label.add(cover_patient);
        cover_patient.setBounds(0, 0, 1050, 70);

        bg_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Patient/bg-photo.jpg"))); // NOI18N
        bg_label.setPreferredSize(new java.awt.Dimension(1050, 626));
        search_label.add(bg_label);
        bg_label.setBounds(0, 0, 1050, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(search_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(search_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        conn = (com.mysql.jdbc.Connection) MySqlConnect.ConnectDB();
        try{
            String sql = "SELECT * FROM patient WHERE Name = ? OR ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            pst.setString(2, search_txt.getText());
            rs = pst.executeQuery();
            patient_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
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
    }//GEN-LAST:event_search_txtKeyReleased

    private void reload_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reload_labelMouseClicked
        // TODO add your handling code here:
        search_txt.setText("");
    }//GEN-LAST:event_reload_labelMouseClicked

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
            java.util.logging.Logger.getLogger(search_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg_label;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JLabel cover_patient;
    private javax.swing.JButton home_btn;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JTable patient_table;
    private javax.swing.JLabel reload_label;
    private javax.swing.JScrollPane scroll_table;
    private javax.swing.JPanel search_label;
    private javax.swing.JLabel search_label1;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables
}