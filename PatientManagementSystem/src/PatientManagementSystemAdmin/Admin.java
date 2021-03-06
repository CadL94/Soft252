/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemAdmin;

import PatientManagementSystemPatient.*;
import PatientManagementSystemLogin.Login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lee
 */
public class Admin extends javax.swing.JFrame {
    private JFrame frame;

    /**
     * Creates new form PatientManagementSystem
     */
    public Admin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextDoctorName = new javax.swing.JTextField();
        jComboBoxDoctorID = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextFeedbackNotes = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jButtonvIewDocFeed = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDocFeed = new javax.swing.JTable();
        jButtonDocFeed = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1500, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Patient Management System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(411, 411, 411))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 1450, 90));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Admin System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(584, 584, 584)
                .addComponent(jLabel1)
                .addContainerGap(586, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 1450, 80));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jButtonLogin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLogin.setText("Back to Login");
        jButtonLogin.setToolTipText("");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 380));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Enter Feedback :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Doctor Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 380, -1, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Doctor Feedback");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 30));

        jTextDoctorName.setEditable(false);
        jTextDoctorName.setBackground(new java.awt.Color(255, 255, 255));
        jTextDoctorName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextDoctorName.setForeground(new java.awt.Color(0, 0, 0));
        jTextDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDoctorNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 200, -1));

        jComboBoxDoctorID.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDoctorID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBoxDoctorID.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDoctorID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID", "D9911", "D9922", "D9933" }));
        jComboBoxDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDoctorIDActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 150, -1));

        jTextFeedbackNotes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFeedbackNotes.setColumns(20);
        jTextFeedbackNotes.setRows(5);
        jScrollPane3.setViewportView(jTextFeedbackNotes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 450, 370, 200));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Select Doctor :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, -1, 30));

        jButtonvIewDocFeed.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonvIewDocFeed.setText("View Doctor Feedback");
        jButtonvIewDocFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonvIewDocFeedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonvIewDocFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        jScrollPane4.setBackground(new java.awt.Color(60, 63, 60));

        jTableDocFeed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableDocFeed);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 510, 270));

        jButtonDocFeed.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonDocFeed.setText("Submit Feedback");
        jButtonDocFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDocFeedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDocFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 660, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDoctorNameActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        /*** Exit button. Quits Application ***/
        
        frame =new JFrame();
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit?", "Patient Management System",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
             System.exit(0);
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBoxDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDoctorIDActionPerformed
     
        /*** Sets text box fields when selecting certain items from drop down box. ***/
        
        if (jComboBoxDoctorID.getSelectedItem().equals("D9911")) 
       {
           jTextDoctorName.setText("Dr Mark Ruffalo");
           
           
           
           
       }
       
       else if (jComboBoxDoctorID.getSelectedItem().equals("D9922"))
           
       {
           jTextDoctorName.setText("Dr Stephen Strange");
           
           
           
       }
      
        else if (jComboBoxDoctorID.getSelectedItem().equals("D9933"))
           
       {
           jTextDoctorName.setText("Dr Walter White");
           
           
           
       }
      
      else if (jComboBoxDoctorID.getSelectedItem().equals("Select ID"))
           
       {
           jTextDoctorName.setText("");
         
           
           
       }
    }//GEN-LAST:event_jComboBoxDoctorIDActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Login Login1 = new Login();
        Login1.setVisible(true);
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonvIewDocFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonvIewDocFeedActionPerformed
       
        /*** Loads text file and displays text ***/
        
        String filePath = "jTextPatientDocFeedback.txt";
    File file = new File(filePath);
    
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String firstLine = br.readLine().trim();
            String[] columnsName = firstLine.split(",");
            DefaultTableModel model = (DefaultTableModel) jTableDocFeed.getModel();
            model.setColumnIdentifiers(columnsName);
            
            Object[] tableLines = br.lines().toArray();
            
            for(int i = 0; i < tableLines.length; i++)
            {
                
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                model.addRow(dataRow); 
            }
            
        } catch (Exception ex) {
            Logger.getLogger(Patient.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButtonvIewDocFeedActionPerformed

    private void jButtonDocFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDocFeedActionPerformed
         
        /*** Saves to text file ***/
        
        try 
            {
                FileWriter writer = new FileWriter("jTextDocGiveFeedback.txt");
            try (BufferedWriter bw = new BufferedWriter( writer )) {
                
                jTextDoctorName.write(bw);
                jTextFeedbackNotes.write(bw);
                
             
            }
                jTextFeedbackNotes.requestFocus();
        }
        catch(IOException e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }//GEN-LAST:event_jButtonDocFeedActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonDocFeed;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonvIewDocFeed;
    private javax.swing.JComboBox<String> jComboBoxDoctorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableDocFeed;
    private javax.swing.JTextField jTextDoctorName;
    private javax.swing.JTextArea jTextFeedbackNotes;
    // End of variables declaration//GEN-END:variables
}
