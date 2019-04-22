/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bb;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Chris
 */
public class ModifyBallot extends javax.swing.JFrame {
    private ArrayList Ballot=null;
    /**
     * Creates new form ModifyBallot
     */
    public ModifyBallot() {
        initComponents();
        Ballot=new ArrayList();
        //TempList.setList;
        TempList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setSize(1100, 900);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    //Homecoming Template
    private void initHome()  {
        //fix
        ArrayList King=new ArrayList();
        ArrayList Queen=new ArrayList();
        King.add("King");
        King.add("v1");
                //vote for 1:v1
                //vote for 2:v2
                //...
        Queen.add("Queen");
        Queen.add("v1");
        Ballot.add(King);
        Ballot.add(Queen);
    }
    private void initFavProf(){
        //fix
        ArrayList FavProf=new ArrayList();
        FavProf.add("Favorite Professor");
        FavProf.add("v1");
                //vote for 1:v1
                //vote for 2:v2
                //...
        Ballot.add(FavProf);
    }
    private void initFavAdv(){
        //fix
        ArrayList FavAdv=new ArrayList();
        FavAdv.add("Favorite Advisor");
        FavAdv.add("v1");
                //vote for 1:v1
                //vote for 2:v2
                //...
        Ballot.add(FavAdv);
    }
    private void initStdGov(){
        //fix
        ArrayList BoardofGov=new ArrayList();
        ArrayList Secretary=new ArrayList();
        ArrayList VPresident=new ArrayList();
        ArrayList President=new ArrayList();
        BoardofGov.add("Board of Governors");
        BoardofGov.add("v3");
                //vote for 1:v1
                //vote for 2:v2
                //...
        Secretary.add("Secretary");
        Secretary.add("v1");
        VPresident.add("Vice President");
        VPresident.add("v1");
        President.add("President");
        President.add("v1");
        Ballot.add(BoardofGov);
        Ballot.add(Secretary);
        Ballot.add(VPresident);
        Ballot.add(President);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ContButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TempList = new javax.swing.JList<>();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Select Template");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        ContButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ContButton.setText("Continue");
        ContButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContButtonActionPerformed(evt);
            }
        });

        TempList.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        TempList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Homecoming", "Favorite Professor", "Favorite Advisor", "Student Government", "Blank" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(TempList);

        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ContButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ExitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ContButton))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(378, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ContButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContButtonActionPerformed
        String a=TempList.getSelectedValue();
        if(a.equals("Homecoming"))
        initHome();
        else if(a.equals("Favorite Professor"))
        initFavProf();
        else if(a.equals("Favorite Advisor"))
        initFavAdv();
        else if(a.equals("Student Government"))
        initStdGov();
        else if(a.equals("Blank"))
        {
            this.setVisible(false);
            new CreateBallot().setVisible(true);
            return;
        }
        this.setVisible(false);
        new CreateBallot(Ballot).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ContButtonActionPerformed

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
        new CreateModifyBallot().setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyBallot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JList<String> TempList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
