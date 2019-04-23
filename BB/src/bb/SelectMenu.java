/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author josia
 */
public class SelectMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private ArrayList Ballot=null;
    public SelectMenu() {
        initComponents();
    }
    public SelectMenu(ArrayList<ArrayList<ArrayList>> B){
        initComponents();
        Ballot=new ArrayList(B);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hsoBtn = new javax.swing.JButton();
        ecBtn = new javax.swing.JButton();
        vBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hsoBtn.setBackground(new java.awt.Color(0, 51, 102));
        hsoBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        hsoBtn.setForeground(new java.awt.Color(255, 255, 255));
        hsoBtn.setText("HSO");
        hsoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hsoBtnActionPerformed(evt);
            }
        });

        ecBtn.setBackground(new java.awt.Color(0, 0, 102));
        ecBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ecBtn.setForeground(new java.awt.Color(255, 255, 255));
        ecBtn.setText("EC");
        ecBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecBtnActionPerformed(evt);
            }
        });

        vBtn.setBackground(new java.awt.Color(0, 0, 102));
        vBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        vBtn.setForeground(new java.awt.Color(255, 255, 255));
        vBtn.setText("Voter");
        vBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(hsoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(ecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ecBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hsoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hsoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hsoBtnActionPerformed
        // Created by Andrew and Josiah 
        new HSOfunc().setVisible(true);
    }//GEN-LAST:event_hsoBtnActionPerformed

    private void ecBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecBtnActionPerformed
        // TODO add your handling code here:
        if(Ballot==null)
            new CreateModifyBallot().setVisible(true);
        else
            new CreateModifyBallot().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ecBtnActionPerformed

    private void vBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vBtnActionPerformed
        //by joseph
        new voterClick().setVisible(true);
    }//GEN-LAST:event_vBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectMenu().setVisible(true); 
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ecBtn;
    private javax.swing.JButton hsoBtn;
    private javax.swing.JButton vBtn;
    // End of variables declaration//GEN-END:variables
}
