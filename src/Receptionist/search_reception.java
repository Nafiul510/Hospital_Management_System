/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Receptionist;

import hospital_managment_system.Log_In;
import hospital_managment_system.Home;
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
public class search_reception extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement pst;
    private ResultSet rs;

    /**
     * Creates new form search_reception
     */
    public search_reception() {
        initComponents();
        fetch_table();
    }
    private void fetch_table(){
        try{
            conn = (com.mysql.jdbc.Connection) MySqlConnect.ConnectDB();
            String sql = "SELECT * FROM reception";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            reception_table.setModel(DbUtils.resultSetToTableModel(rs));
            reception_table.setAutoResizeMode(reception_table.AUTO_RESIZE_OFF);
            reception_table.getColumnModel().getColumn(0).setPreferredWidth(70);
            reception_table.getColumnModel().getColumn(1).setPreferredWidth(200);
            reception_table.getColumnModel().getColumn(2).setPreferredWidth(160);
            reception_table.getColumnModel().getColumn(3).setPreferredWidth(40);
            reception_table.getColumnModel().getColumn(4).setPreferredWidth(53);
            reception_table.getColumnModel().getColumn(5).setPreferredWidth(231);
            reception_table.getColumnModel().getColumn(6).setPreferredWidth(90);
            reception_table.getColumnModel().getColumn(7).setPreferredWidth(80);
            reception_table.getColumnModel().getColumn(8).setPreferredWidth(40);
            reception_table.getColumnModel().getColumn(9).setPreferredWidth(60);
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

        search_reception = new javax.swing.JPanel();
        table = new javax.swing.JScrollPane();
        reception_table = new javax.swing.JTable();
        log_i = new javax.swing.JLabel();
        logOut_btn = new javax.swing.JButton();
        home_i = new javax.swing.JLabel();
        home_btn = new javax.swing.JButton();
        back_i = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        search_txt = new javax.swing.JTextField();
        heading_cover = new javax.swing.JLabel();
        cover_search = new javax.swing.JLabel();
        bg_search = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Reception");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        search_reception.setPreferredSize(new java.awt.Dimension(1050, 626));
        search_reception.setLayout(null);

        reception_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        table.setViewportView(reception_table);

        search_reception.add(table);
        table.setBounds(10, 162, 1030, 420);

        log_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/system-log-out-icon.png"))); // NOI18N
        search_reception.add(log_i);
        log_i.setBounds(870, 100, 32, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        search_reception.add(logOut_btn);
        logOut_btn.setBounds(860, 100, 160, 60);

        home_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/home-icon.png"))); // NOI18N
        search_reception.add(home_i);
        home_i.setBounds(710, 100, 32, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        search_reception.add(home_btn);
        home_btn.setBounds(700, 100, 160, 60);

        back_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/back-icon.png"))); // NOI18N
        search_reception.add(back_i);
        back_i.setBounds(550, 100, 40, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        search_reception.add(back_btn);
        back_btn.setBounds(540, 100, 160, 60);

        search_txt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(51, 51, 51));
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        search_reception.add(search_txt);
        search_txt.setBounds(60, 110, 410, 45);

        heading_cover.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 18)); // NOI18N
        heading_cover.setForeground(new java.awt.Color(51, 51, 51));
        heading_cover.setText("Recepiton Panel >> Search Receptionist");
        search_reception.add(heading_cover);
        heading_cover.setBounds(10, 0, 500, 70);

        cover_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/cover-photo.jpg"))); // NOI18N
        search_reception.add(cover_search);
        cover_search.setBounds(0, 0, 1050, 70);

        bg_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/hospital-reception-background.jpg"))); // NOI18N
        search_reception.add(bg_search);
        bg_search.setBounds(0, 0, 1050, 626);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(search_reception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(search_reception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        conn = (com.mysql.jdbc.Connection) MySqlConnect.ConnectDB();
        try{
            String sql = "SELECT * FROM reception WHERE Name = ? or ID = ?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, search_txt.getText());
            pst.setString(2, search_txt.getText());
            rs = pst.executeQuery();
            reception_table.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        reception_table.setAutoResizeMode(reception_table.AUTO_RESIZE_OFF);
        reception_table.getColumnModel().getColumn(0).setPreferredWidth(70);
        reception_table.getColumnModel().getColumn(1).setPreferredWidth(200);
        reception_table.getColumnModel().getColumn(2).setPreferredWidth(160);
        reception_table.getColumnModel().getColumn(3).setPreferredWidth(40);
        reception_table.getColumnModel().getColumn(4).setPreferredWidth(53);
        reception_table.getColumnModel().getColumn(5).setPreferredWidth(231);
        reception_table.getColumnModel().getColumn(6).setPreferredWidth(90);
        reception_table.getColumnModel().getColumn(7).setPreferredWidth(80);
        reception_table.getColumnModel().getColumn(8).setPreferredWidth(40);
        reception_table.getColumnModel().getColumn(9).setPreferredWidth(60);
    }//GEN-LAST:event_search_txtKeyReleased

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Receptionist_panel rp = new Receptionist_panel();
        rp.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(search_reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search_reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search_reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search_reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search_reception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel back_i;
    private javax.swing.JLabel bg_search;
    private javax.swing.JLabel cover_search;
    private javax.swing.JLabel heading_cover;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel home_i;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JLabel log_i;
    private javax.swing.JTable reception_table;
    private javax.swing.JPanel search_reception;
    private javax.swing.JTextField search_txt;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
