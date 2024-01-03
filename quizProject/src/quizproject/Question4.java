/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizproject;

import static java.awt.Color.*;
import javax.swing.JOptionPane;

/**
 *
 * @author ADIA ICT CENTER
 */
public class Question4 extends javax.swing.JFrame {
    
    int marks;
    int questionAnswered;

    /**
     * Creates new form Question1
     */
    public Question4( int marks, int questionAnswered) {
        initComponents();
        
        this.marks = marks;
        this.questionAnswered = questionAnswered;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ansBtn1 = new javax.swing.JRadioButton();
        ansBtn3 = new javax.swing.JRadioButton();
        ansBtn2 = new javax.swing.JRadioButton();
        ansBtn4 = new javax.swing.JRadioButton();
        checkAnsBtn = new javax.swing.JButton();
        submitFinishBtn = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        ansStatusLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Java Mock Exam - 2023");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Question 4");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Which keywoerd is used while using interface in Java8");

        btnGroup1.add(ansBtn1);
        ansBtn1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ansBtn1.setText("extend");

        btnGroup1.add(ansBtn3);
        ansBtn3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ansBtn3.setText("throw");

        btnGroup1.add(ansBtn2);
        ansBtn2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ansBtn2.setText("throws");
        ansBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansBtn2ActionPerformed(evt);
            }
        });

        btnGroup1.add(ansBtn4);
        ansBtn4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ansBtn4.setText("implements");
        ansBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansBtn4ActionPerformed(evt);
            }
        });

        checkAnsBtn.setBackground(new java.awt.Color(0, 0, 51));
        checkAnsBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkAnsBtn.setForeground(new java.awt.Color(255, 255, 255));
        checkAnsBtn.setText("check answer");
        checkAnsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnsBtnActionPerformed(evt);
            }
        });

        submitFinishBtn.setBackground(new java.awt.Color(0, 0, 51));
        submitFinishBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submitFinishBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitFinishBtn.setText("submit/finish");
        submitFinishBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitFinishBtnActionPerformed(evt);
            }
        });

        statusPanel.setBackground(new java.awt.Color(153, 153, 153));

        ansStatusLbl.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        ansStatusLbl.setForeground(new java.awt.Color(255, 255, 255));
        ansStatusLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ansStatusLbl.setText("ANSWER STATUS");

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ansStatusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ansStatusLbl)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ansBtn1)
                            .addComponent(ansBtn3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ansBtn2)
                            .addComponent(ansBtn4))
                        .addContainerGap(173, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(checkAnsBtn)
                        .addGap(27, 27, 27)
                        .addComponent(submitFinishBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansBtn2)
                    .addComponent(ansBtn1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansBtn4)
                    .addComponent(ansBtn3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAnsBtn)
                    .addComponent(submitFinishBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ansBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansBtn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansBtn4ActionPerformed

    private void ansBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansBtn2ActionPerformed

    private void checkAnsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnsBtnActionPerformed
        // TODO add your handling code here:
        if(!ansBtn1.isSelected() && !ansBtn2.isSelected() && !ansBtn3.isSelected() && !ansBtn4.isSelected() ){
            JOptionPane.showMessageDialog(null, "Please select an Answer");
        } else{
            if(ansBtn4.isSelected()){
                ansStatusLbl.setText("correct answer");
                ansStatusLbl.setForeground(white);
                statusPanel.setBackground(green);
            } else{
                ansStatusLbl.setText("incorrect - answer is IMPLEMENTS");
                ansStatusLbl.setForeground(white);
                statusPanel.setBackground(red);
            }
            
            ansBtn1.setEnabled(false);
            ansBtn2.setEnabled(false);
            ansBtn3.setEnabled(false);
            ansBtn4.setEnabled(false);
        }
    }//GEN-LAST:event_checkAnsBtnActionPerformed

    private void submitFinishBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitFinishBtnActionPerformed
        // TODO add your handling code here:
        
        if(!ansBtn1.isSelected() && !ansBtn2.isSelected() && !ansBtn3.isSelected() && !ansBtn4.isSelected() ){
            JOptionPane.showMessageDialog(null, "Please select an Answer");
        } else{ 
             if(ansBtn4.isSelected()){
                marks = marks + 25;
            }
             questionAnswered = questionAnswered + 1;
             new result(marks,questionAnswered).setVisible(true);
             this.dispose();
             
         }
    }//GEN-LAST:event_submitFinishBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question4(0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ansBtn1;
    private javax.swing.JRadioButton ansBtn2;
    private javax.swing.JRadioButton ansBtn3;
    private javax.swing.JRadioButton ansBtn4;
    private javax.swing.JLabel ansStatusLbl;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.JButton checkAnsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JButton submitFinishBtn;
    // End of variables declaration//GEN-END:variables
}
