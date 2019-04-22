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

        ExitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TempList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        ContButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ExitButton.setText("Exit");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        TempList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Homecoming", "Favorite Professor", "Favorite Advisor", "Student Government", "Blank" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(TempList);

        jLabel1.setText("Select Template");

        ContButton.setText("Continue");
        ContButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ExitButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ContButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ContButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        this.setVisible(false);
        new CreateModifyBallot().setVisible(true);
    }//GEN-LAST:event_ExitButtonActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
