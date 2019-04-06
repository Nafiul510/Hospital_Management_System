/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctor;

import com.mysql.jdbc.Connection;
import hospital_managment_system.Home;
import hospital_managment_system.Log_In;
import hospital_managment_system.MySqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Nafiul Alam
 */
public class view_doctor extends javax.swing.JFrame {
    
    private Connection conn;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    /**
     * Creates new form view_doctor
     */
    public view_doctor() {
        initComponents();
        fetch_table();
    }
    
    
    
    
    private void fetch_table(){
        conn = (Connection) MySqlConnect.ConnectDB();
        try{
            String sql = "SELECT * FROM doctor";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            doctor_table.setModel(DbUtils.resultSetToTableModel(rs));
            doctor_table.setAutoResizeMode(doctor_table.AUTO_RESIZE_OFF);
            doctor_table.getColumnModel().getColumn(0).setPreferredWidth(68);
            doctor_table.getColumnModel().getColumn(1).setPreferredWidth(187);
            doctor_table.getColumnModel().getColumn(2).setPreferredWidth(120);
            doctor_table.getColumnModel().getColumn(3).setPreferredWidth(33);
            doctor_table.getColumnModel().getColumn(4).setPreferredWidth(53);
            doctor_table.getColumnModel().getColumn(5).setPreferredWidth(185);
            doctor_table.getColumnModel().getColumn(6).setPreferredWidth(110);
            doctor_table.getColumnModel().getColumn(7).setPreferredWidth(90);
            doctor_table.getColumnModel().getColumn(8).setPreferredWidth(80);
            doctor_table.getColumnModel().getColumn(9).setPreferredWidth(40);
            doctor_table.getColumnModel().getColumn(10).setPreferredWidth(58);
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

        doctor_v_panel = new javax.swing.JPanel();
        status_txt = new javax.swing.JTextField();
        blood_txt = new javax.swing.JTextField();
        date_txt = new javax.swing.JTextField();
        phone_txt = new javax.swing.JTextField();
        department_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        gender_txt = new javax.swing.JTextField();
        age_txt = new javax.swing.JTextField();
        email_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        id_txt = new javax.swing.JTextField();
        view_table = new javax.swing.JScrollPane();
        doctor_table = new javax.swing.JTable();
        home_i = new javax.swing.JLabel();
        log_i = new javax.swing.JLabel();
        back_i = new javax.swing.JLabel();
        add_i = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        home_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        H_view = new javax.swing.JLabel();
        cover_view = new javax.swing.JLabel();
        bg_view = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("view panal");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        doctor_v_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        doctor_v_panel.setLayout(null);
        doctor_v_panel.add(status_txt);
        status_txt.setBounds(980, 100, 60, 30);
        doctor_v_panel.add(blood_txt);
        blood_txt.setBounds(940, 100, 40, 30);
        doctor_v_panel.add(date_txt);
        date_txt.setBounds(860, 100, 80, 30);
        doctor_v_panel.add(phone_txt);
        phone_txt.setBounds(770, 100, 90, 30);
        doctor_v_panel.add(department_txt);
        department_txt.setBounds(660, 100, 110, 30);
        doctor_v_panel.add(address_txt);
        address_txt.setBounds(470, 100, 190, 30);
        doctor_v_panel.add(gender_txt);
        gender_txt.setBounds(420, 100, 53, 30);
        doctor_v_panel.add(age_txt);
        age_txt.setBounds(390, 100, 33, 30);

        email_txt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        doctor_v_panel.add(email_txt);
        email_txt.setBounds(270, 100, 120, 30);
        doctor_v_panel.add(name_txt);
        name_txt.setBounds(80, 100, 190, 30);
        doctor_v_panel.add(id_txt);
        id_txt.setBounds(10, 100, 70, 30);

        view_table.setForeground(new java.awt.Color(51, 51, 51));

        doctor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department", "Email", "Phone", "Address", "Age", "Gender", "Date", "Blood Gr", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        doctor_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctor_tableMouseClicked(evt);
            }
        });
        view_table.setViewportView(doctor_table);

        doctor_v_panel.add(view_table);
        view_table.setBounds(10, 132, 1030, 470);

        home_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/home-icon.png"))); // NOI18N
        doctor_v_panel.add(home_i);
        home_i.setBounds(710, 20, 40, 50);

        log_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/system-log-out-icon.png"))); // NOI18N
        doctor_v_panel.add(log_i);
        log_i.setBounds(870, 24, 32, 40);

        back_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/back-icon.png"))); // NOI18N
        doctor_v_panel.add(back_i);
        back_i.setBounds(550, 20, 32, 50);

        add_i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/add-icon.png"))); // NOI18N
        doctor_v_panel.add(add_i);
        add_i.setBounds(390, 20, 48, 50);

        logout_btn.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 14)); // NOI18N
        logout_btn.setForeground(new java.awt.Color(51, 51, 51));
        logout_btn.setText("log out");
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        doctor_v_panel.add(logout_btn);
        logout_btn.setBounds(860, 20, 160, 50);

        home_btn.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 14)); // NOI18N
        home_btn.setForeground(new java.awt.Color(51, 51, 51));
        home_btn.setText("home");
        home_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_btnActionPerformed(evt);
            }
        });
        doctor_v_panel.add(home_btn);
        home_btn.setBounds(700, 20, 160, 50);

        back_btn.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(51, 51, 51));
        back_btn.setText("back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        doctor_v_panel.add(back_btn);
        back_btn.setBounds(540, 20, 160, 50);

        add_btn.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 14)); // NOI18N
        add_btn.setForeground(new java.awt.Color(51, 51, 51));
        add_btn.setText("add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });
        doctor_v_panel.add(add_btn);
        add_btn.setBounds(380, 20, 160, 50);

        H_view.setFont(new java.awt.Font("BatmanForeverAlternate", 0, 18)); // NOI18N
        H_view.setForeground(new java.awt.Color(51, 51, 51));
        H_view.setText("doctor panel >> view doctor");
        doctor_v_panel.add(H_view);
        H_view.setBounds(10, 20, 360, 19);

        cover_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/cover-photo.jpg"))); // NOI18N
        doctor_v_panel.add(cover_view);
        cover_view.setBounds(0, 0, 1050, 70);

        bg_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doctor/bg_home.jpg"))); // NOI18N
        bg_view.setText("jLabel1");
        doctor_v_panel.add(bg_view);
        bg_view.setBounds(0, 0, 1050, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(doctor_v_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(doctor_v_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void home_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_btnActionPerformed
        // TODO add your handling code here:
        Home h=new Home();
        h.setVisible(true);
        dispose();
    }//GEN-LAST:event_home_btnActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        Log_In l=new Log_In();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logout_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        add_doctor ad=new add_doctor();
        ad.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_add_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        doctor d=new doctor();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void doctor_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctor_tableMouseClicked
        try{
            int row = doctor_table.getSelectedRow();
            String tableClick = (doctor_table.getModel().getValueAt(row, 0).toString());
            String sql = "SELECT * FROM doctor WHERE ID = '" + tableClick + "' ";
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
                String department = rs.getString("Department");
                department_txt.setText(department);
                String phone = rs.getString("Phone");
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
    }//GEN-LAST:event_doctor_tableMouseClicked

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

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
            java.util.logging.Logger.getLogger(view_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_doctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel H_view;
    private javax.swing.JButton add_btn;
    private javax.swing.JLabel add_i;
    private javax.swing.JTextField address_txt;
    private javax.swing.JTextField age_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel back_i;
    private javax.swing.JLabel bg_view;
    private javax.swing.JTextField blood_txt;
    private javax.swing.JLabel cover_view;
    private javax.swing.JTextField date_txt;
    private javax.swing.JTextField department_txt;
    private javax.swing.JTable doctor_table;
    private javax.swing.JPanel doctor_v_panel;
    private javax.swing.JTextField email_txt;
    private javax.swing.JTextField gender_txt;
    private javax.swing.JButton home_btn;
    private javax.swing.JLabel home_i;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel log_i;
    private javax.swing.JButton logout_btn;
    private javax.swing.JTextField name_txt;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JTextField status_txt;
    private javax.swing.JScrollPane view_table;
    // End of variables declaration//GEN-END:variables
}
