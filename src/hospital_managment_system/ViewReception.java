/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital_managment_system;

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
public class ViewReception extends javax.swing.JFrame {
     private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    /**
     * Creates new form ViewReception
     */
    public ViewReception() {
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

        View_Reception = new javax.swing.JPanel();
        status_txt = new javax.swing.JTextField();
        blood_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        table = new javax.swing.JScrollPane();
        reception_table = new javax.swing.JTable();
        log_i = new javax.swing.JLabel();
        logOut_btn = new javax.swing.JButton();
        home_i = new javax.swing.JLabel();
        home_btn = new javax.swing.JButton();
        back_i = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        bradcum_label = new javax.swing.JLabel();
        cover_view = new javax.swing.JLabel();
        bg_view = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View Reception");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        View_Reception.setPreferredSize(new java.awt.Dimension(1050, 626));
        View_Reception.setLayout(null);
        View_Reception.add(status_txt);
        status_txt.setBounds(980, 100, 60, 30);
        View_Reception.add(blood_txt);
        blood_txt.setBounds(940, 100, 40, 30);
        View_Reception.add(date_txt);
        date_txt.setBounds(860, 100, 80, 30);
        View_Reception.add(phone_txt);
        phone_txt.setBounds(770, 100, 90, 30);
        View_Reception.add(address_txt);
        address_txt.setBounds(530, 100, 240, 30);
        View_Reception.add(gender_txt);
        gender_txt.setBounds(480, 100, 53, 30);
        View_Reception.add(age_txt);
        age_txt.setBounds(440, 100, 40, 30);

        email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        View_Reception.add(email_txt);
        email_txt.setBounds(280, 100, 160, 30);
        View_Reception.add(name_txt);
        name_txt.setBounds(80, 100, 200, 30);
        View_Reception.add(id_txt);
        id_txt.setBounds(10, 100, 70, 30);

        reception_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10"
            }
        ));
        reception_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reception_tableMouseClicked(evt);
            }
        });
        table.setViewportView(reception_table);

        View_Reception.add(table);
        table.setBounds(10, 130, 1030, 390);

        log_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/system-log-out-icon.png"))); // NOI18N
        View_Reception.add(log_i);
        log_i.setBounds(880, 10, 32, 60);

        logOut_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logOut_btn.setForeground(new java.awt.Color(102, 102, 102));
        logOut_btn.setText("Log Out");
        logOut_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_btnActionPerformed(evt);
            }
        });
        View_Reception.add(logOut_btn);
        logOut_btn.setBounds(870, 10, 160, 60);

        home_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/home-icon.png"))); // NOI18N
        View_Reception.add(home_i);
        home_i.setBounds(720, 10, 32, 60);

        home_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home_btn.setForeground(new java.awt.Color(102, 102, 102));
        home_btn.setText("Home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        View_Reception.add(home_btn);
        home_btn.setBounds(710, 10, 160, 60);

        back_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/back-icon.png"))); // NOI18N
        View_Reception.add(back_i);
        back_i.setBounds(560, 10, 40, 60);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        View_Reception.add(back_btn);
        back_btn.setBounds(550, 10, 160, 60);

        bradcum_label.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 18)); // NOI18N
        bradcum_label.setForeground(new java.awt.Color(51, 51, 51));
        bradcum_label.setText("Reception Panel >> View Recepiton");
        View_Reception.add(bradcum_label);
        bradcum_label.setBounds(10, 0, 430, 70);

        cover_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/cover-photo.jpg"))); // NOI18N
        View_Reception.add(cover_view);
        cover_view.setBounds(0, 0, 1050, 70);

        bg_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Receptionist/hospital-reception-background.jpg"))); // NOI18N
        View_Reception.add(bg_view);
        bg_view.setBounds(0, 0, 1050, 626);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(View_Reception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(View_Reception, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void reception_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reception_tableMouseClicked
        try{
            int row = reception_table.getSelectedRow();
            String tableClick = (reception_table.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM reception WHERE ID = '" + tableClick + "' ";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                String id = rs.getString("ID");
                id_txt.setText(id);
                String name = rs.getString("Name");
                name_txt.setText(name);
                String email = rs.getString("Email");
                email_txt.setText(email);
                String age = rs.getString("Age");
                age_txt.setText(age);
                String gender = rs.getString("Gender");
                gender_txt.setText(gender);
                String adderss = rs.getString("Address");
                address_txt.setText(adderss);
                String phone = rs.getString("phone");
                phone_txt.setText(phone);
                String date = rs.getString("Join Date");
                date_txt.setText(date);
                String blood = rs.getString("BG");
                blood_txt.setText(blood);
                String status = rs.getString("Status");
                status_txt.setText(status);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_reception_tableMouseClicked

    private void logOut_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_btnActionPerformed
        // TODO add your handling code here:
        Log_In l=new Log_In();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logOut_btnActionPerformed

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Rep_mainpage r=new Rep_mainpage();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Rep_mainpage r=new Rep_mainpage();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReception().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel View_Reception;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel back_i;
    private javax.swing.JLabel bg_view;
    private javax.swing.JTextField blood_txt;
    private javax.swing.JLabel bradcum_label;
    private javax.swing.JLabel cover_view;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel home_i;
    private javax.swing.JTextField id_txt;
    private javax.swing.JButton logOut_btn;
    private javax.swing.JLabel log_i;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTable reception_table;
    private javax.swing.JTextField status_txt;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
