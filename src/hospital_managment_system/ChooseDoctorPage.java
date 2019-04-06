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

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nafiul Alam
 */
public class ChooseDoctorPage extends javax.swing.JFrame {
    private Connection conn = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    DefaultTableModel defaultTableModel = new DefaultTableModel();

    /**
     * Creates new form ChooseDoctorPage
     */
    public ChooseDoctorPage() {
        initComponents();
        //fetch_table();
        //fillCombo();
        Object columns[] = {"ID", "Name", "Email", "Age", "Gender", "Address", "Department", "Phone", "Join Date", "Blood Group", "Status"};
        defaultTableModel.setColumnIdentifiers(columns);
        doctor_table.setModel(defaultTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choose_doctor_panel = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        department_label1 = new javax.swing.JLabel();
        next_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctor_table = new javax.swing.JTable();
        department_label = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();
        department_box = new javax.swing.JComboBox<>();
        page_title_label = new javax.swing.JLabel();
        curr_time_label = new javax.swing.JLabel();
        background_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Choose Doctor Page");
        setBounds(new java.awt.Rectangle(150, 50, 0, 0));
        setPreferredSize(new java.awt.Dimension(1050, 626));
        setResizable(false);
        setSize(new java.awt.Dimension(1050, 626));

        choose_doctor_panel.setPreferredSize(new java.awt.Dimension(1050, 626));
        choose_doctor_panel.setLayout(null);

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(102, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        choose_doctor_panel.add(back_btn);
        back_btn.setBounds(10, 530, 160, 60);

        department_label1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        department_label1.setForeground(new java.awt.Color(102, 102, 102));
        department_label1.setText("Click Next For Choosing Patient For Appointment");
        choose_doctor_panel.add(department_label1);
        department_label1.setBounds(240, 530, 640, 60);

        next_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        next_btn.setForeground(new java.awt.Color(102, 102, 102));
        next_btn.setText("Next");
        next_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_btnActionPerformed(evt);
            }
        });
        choose_doctor_panel.add(next_btn);
        next_btn.setBounds(890, 530, 150, 60);

        doctor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11"
            }
        ));
        jScrollPane1.setViewportView(doctor_table);

        choose_doctor_panel.add(jScrollPane1);
        jScrollPane1.setBounds(12, 160, 1030, 360);

        department_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        department_label.setForeground(new java.awt.Color(102, 102, 102));
        department_label.setText("Choose Doctor's Department >>");
        choose_doctor_panel.add(department_label);
        department_label.setBounds(20, 90, 420, 60);

        search_btn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_btn.setForeground(new java.awt.Color(102, 102, 102));
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });
        choose_doctor_panel.add(search_btn);
        search_btn.setBounds(890, 90, 150, 60);

        department_box.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        department_box.setForeground(new java.awt.Color(102, 102, 102));
        department_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Select Department==", "Family Physician", "Gynecologist ", "Neurologist", "Surgeon", "Cardiologist", "Psychiatrist", "Dermatologist", "Nephrologist", "Pediatrician", "Otolaryngologist", "Anesthesiologist", " " }));
        department_box.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                department_boxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                department_boxMouseReleased(evt);
            }
        });
        choose_doctor_panel.add(department_box);
        department_box.setBounds(450, 90, 430, 60);

        page_title_label.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 26)); // NOI18N
        page_title_label.setForeground(new java.awt.Color(255, 255, 255));
        page_title_label.setText("Set Appointment Panel >> Choose Doctor");
        choose_doctor_panel.add(page_title_label);
        page_title_label.setBounds(20, 20, 590, 60);

        curr_time_label.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        curr_time_label.setForeground(new java.awt.Color(102, 102, 102));
        choose_doctor_panel.add(curr_time_label);
        curr_time_label.setBounds(870, 40, 170, 40);
        choose_doctor_panel.add(background_label);
        background_label.setBounds(0, 0, 1050, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(choose_doctor_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(choose_doctor_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
                    Rep_mainpage r=new Rep_mainpage();
                    r.setVisible(true);
                    dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void next_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_btnActionPerformed
        int row = doctor_table.getSelectedRow();
        String dname = (doctor_table.getValueAt(row, 1).toString());
        ChoosePatientPage cpp = new ChoosePatientPage();
        cpp.DoctorName = dname;
        cpp.setVisible(true);
        dispose();
    }//GEN-LAST:event_next_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        conn=MySqlConnect.ConnectDB();
        defaultTableModel.getDataVector().removeAllElements();
        defaultTableModel.fireTableDataChanged();
        String searchKey = (String) department_box.getSelectedItem();
        String sql = "select `ID`, `Name`, `Email`, `Age`, `Gender`, `Address`, `Department`, `Phone`, `Join Date`, `BG`, `Status` from doctor where `Department` = '" + searchKey + "'";
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Object columnData[] = new Object[11];
            while (rs.next()) {
                columnData[0] = rs.getString("ID");
                columnData[1] = rs.getString("Name");
                columnData[2] = rs.getString("Email");
                columnData[3] = rs.getInt("Age");
                columnData[4] = rs.getString("Gender");
                columnData[5] = rs.getString("Address");
                columnData[6] = rs.getString("Department");
                columnData[7] = rs.getString("Phone");
                columnData[8] = rs.getString("Join Date");
                columnData[9] = rs.getString("BG");
                columnData[10] = rs.getString("Status");
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_search_btnActionPerformed

    private void department_boxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_department_boxMousePressed

    }//GEN-LAST:event_department_boxMousePressed

    private void department_boxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_department_boxMouseReleased

    }//GEN-LAST:event_department_boxMouseReleased

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
            java.util.logging.Logger.getLogger(ChooseDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseDoctorPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseDoctorPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel background_label;
    private javax.swing.JPanel choose_doctor_panel;
    private javax.swing.JLabel curr_time_label;
    private javax.swing.JComboBox<String> department_box;
    private javax.swing.JLabel department_label;
    private javax.swing.JLabel department_label1;
    private javax.swing.JTable doctor_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton next_btn;
    private javax.swing.JLabel page_title_label;
    private javax.swing.JButton search_btn;
    // End of variables declaration//GEN-END:variables
}
