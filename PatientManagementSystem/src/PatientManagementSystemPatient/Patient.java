/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatientManagementSystemPatient;

import PatientManagementSystemDoctor.*;
import PatientManagementSystemLogin.Login;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lee
 */
public class Patient extends javax.swing.JFrame {
    private JFrame frame;

    /**
     * Creates new form PatientManagementSystem
     */
    public Patient() {
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPrescription = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextDoctorName = new javax.swing.JTextField();
        jTextPatientName = new javax.swing.JTextField();
        jComboBoxDoctorID = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextFeedbackNotes = new javax.swing.JTextArea();
        jButtonFeedView = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jButtonSaveFeed = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jTextPatientID = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1Feedback = new javax.swing.JTable();

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jTextPrescription.setBackground(new java.awt.Color(255, 255, 255));
        jTextPrescription.setColumns(20);
        jTextPrescription.setForeground(new java.awt.Color(0, 0, 0));
        jTextPrescription.setRows(5);
        jScrollPane1.setViewportView(jTextPrescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 120, 470, 460));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Patient System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(364, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(326, 326, 326))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 980, 80));

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
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, -1, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Doctor Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, -1, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Doctor Feedback");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Patient ID :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 30));

        jTextDoctorName.setBackground(new java.awt.Color(255, 255, 255));
        jTextDoctorName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextDoctorName.setForeground(new java.awt.Color(0, 0, 0));
        jTextDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDoctorNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 200, -1));

        jTextPatientName.setBackground(new java.awt.Color(255, 255, 255));
        jTextPatientName.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextPatientName.setForeground(new java.awt.Color(0, 0, 0));
        jTextPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPatientNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 260, -1));

        jComboBoxDoctorID.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxDoctorID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBoxDoctorID.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxDoctorID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID", "D9911", "D9922", "D9933" }));
        jComboBoxDoctorID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDoctorIDActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxDoctorID, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 240, 150, -1));

        jTextFeedbackNotes.setBackground(new java.awt.Color(255, 255, 255));
        jTextFeedbackNotes.setColumns(20);
        jTextFeedbackNotes.setRows(5);
        jScrollPane3.setViewportView(jTextFeedbackNotes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 320, 120));

        jButtonFeedView.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonFeedView.setText("Display Feedback");
        jButtonFeedView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFeedViewActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFeedView, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 260, 60));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Patient Name :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 30));

        jButtonSaveFeed.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonSaveFeed.setText("Save Feedback");
        jButtonSaveFeed.setToolTipText("");
        jButtonSaveFeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveFeedActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSaveFeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 240, 60));

        jButton5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 110, -1));

        jButtonDelete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 110, -1));

        jTextPatientID.setBackground(new java.awt.Color(255, 255, 255));
        jTextPatientID.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextPatientID.setForeground(new java.awt.Color(0, 0, 0));
        jTextPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPatientIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextPatientID, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 260, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Select Doctor :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, -1, 30));

        jTable1Feedback.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor ID", "Doctor Name", "Patient Name", "Patient ID", "Feedback"
            }
        ));
        jScrollPane2.setViewportView(jTable1Feedback);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1440, 180));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDoctorNameActionPerformed

    private void jTextPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPatientNameActionPerformed

    private void jButtonSaveFeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFeedActionPerformed
       DefaultTableModel DoctorModel = (DefaultTableModel) jTable1Feedback.getModel();
       DoctorModel.addRow(new Object[]{jComboBoxDoctorID.getSelectedItem().toString(),
           jTextDoctorName.getText(),jTextPatientName.getText(),jTextPatientID.getText(),jTextFeedbackNotes.getText(),});
    }//GEN-LAST:event_jButtonSaveFeedActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        frame =new JFrame();
        if (JOptionPane.showConfirmDialog(frame,"Do you want to exit?", "Patient Management System",
              JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
             System.exit(0);
            }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButtonFeedViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFeedViewActionPerformed
       
        String Quantity19 = (jTextPatientID.getText());
        String Quantity20 = (jTextPatientName.getText());
        String Quantity21 = (jTextDoctorName.getText());
        String Quantity22 = (jTextFeedbackNotes.getText());
        String Quantity23 = "";
        
        
        
        
       
        
         if (jComboBoxDoctorID.getSelectedItem().equals("D9911"))
        {
            
            Quantity23 = "D9911";
        }
        
        else if (jComboBoxDoctorID.getSelectedItem().equals("D9922"))
        {
            
            Quantity23 = "D9922";
            
        }
         
          else if (jComboBoxDoctorID.getSelectedItem().equals("D9933"))
        {
            
            Quantity23 = "D9933";
            
        }
        
        
        
        
        
       
        
        
        jTextPrescription.setText("");
        jTextPrescription.append("\t\n\tPrescription Details\n"
                +"\nPatient ID:\t\t" + Quantity19
                +"\nPatient Name:\t\t" + Quantity20
                +"\n\nDoctors ID:\t\t" + Quantity23
                +"\n\nDoctors Name:\t\t" + Quantity21
                +"\n\n\tFeedback\n\t" + Quantity22
          
        );
  
        
        
        
    }//GEN-LAST:event_jButtonFeedViewActionPerformed

    private void jComboBoxDoctorIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDoctorIDActionPerformed
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

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

       jTextDoctorName.setText("");
       jTextFeedbackNotes.setText("");
       jTextPatientName.setText("");
       jTextPatientID.setText("");
       jComboBoxDoctorID.getModel().setSelectedItem("Select ID");
      
       
       
  
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Login Login1 = new Login();
        Login1.setVisible(true);
        
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        DefaultTableModel DoctorModel = (DefaultTableModel) jTable1Feedback.getModel();
        if (jTable1Feedback.getSelectedRow()==-1){
            if (jTable1Feedback.getSelectedRowCount() ==0){

                JOptionPane.showMessageDialog(null, "Nothing selected to delete", "Patient Management System",
                    JOptionPane.OK_OPTION );

            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Patient Management System",
                    JOptionPane.OK_OPTION );

            }
        }else{

            DoctorModel.removeRow(jTable1Feedback.getSelectedRow());

        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPatientIDActionPerformed

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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonFeedView;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSaveFeed;
    private javax.swing.JComboBox<String> jComboBoxDoctorID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1Feedback;
    private javax.swing.JTextField jTextDoctorName;
    private javax.swing.JTextArea jTextFeedbackNotes;
    private javax.swing.JTextField jTextPatientID;
    private javax.swing.JTextField jTextPatientName;
    private javax.swing.JTextArea jTextPrescription;
    // End of variables declaration//GEN-END:variables
}
