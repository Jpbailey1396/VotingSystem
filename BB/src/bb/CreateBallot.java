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
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chris
 */
public class CreateBallot extends javax.swing.JFrame {

    /**
     * Creates new form CreateBallot
     */
    
    DefaultTableModel model;
    DefaultListModel liztModel;
    private ArrayList<ArrayList<ArrayList>> Ballot;
    private ArrayList<ArrayList<ArrayList>> exitBallot;
    private int currentRace;
    public CreateBallot() {
        initComponents();
        setSize(780,780);
        model=(DefaultTableModel)CanTable.getModel();
        liztModel=new DefaultListModel();
        liztModel.addElement("Race 1");
        RaceList.setModel(liztModel);
        RaceList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        currentRace=0;
        ArrayList temp=new ArrayList();
        ArrayList temp2=new ArrayList();
        temp2.add("Race1");
        temp2.add("v1");
        temp.add(temp2);
        Ballot=new ArrayList();
        Ballot.add(temp);
        exitBallot=new ArrayList();

    }
    //REDO WITH NEW CONSTRUCTOR W/ PARAM ARRAYLIST<ARRAYLIST<ARRAYLIST>> B
    public CreateBallot(ArrayList<ArrayList<ArrayList>> B) {
        initComponents();
        
        model=(DefaultTableModel)CanTable.getModel();
        liztModel=new DefaultListModel();
        int cnt=B.size();
        
        for(int i=0;i<cnt;i++)
        {
            liztModel.addElement(B.get(i).get(0).get(0));//populate RaceList //fix
        }
        currentRace=0;
        updateEverything(B);
        RaceList.setModel(liztModel);
        RaceList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Ballot=new ArrayList(B);
        exitBallot=new ArrayList(B);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CanTable = new javax.swing.JTable();
        RaceNameText = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        yText = new javax.swing.JTextField();
        rText = new javax.swing.JTextField();
        sText = new javax.swing.JTextField();
        aText = new javax.swing.JTextField();
        lNameText = new javax.swing.JTextField();
        fNameText = new javax.swing.JTextField();
        studIdText = new javax.swing.JTextField();
        voteSetButton = new javax.swing.JButton();
        raceSetButton = new javax.swing.JButton();
        VoteComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        VoteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RaceNameLabel = new javax.swing.JLabel();
        ClearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        addRaceButton = new javax.swing.JButton();
        removeRaceButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        RaceList = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        DuplButton = new javax.swing.JButton();

        jButton4.setText("jButton4");

        jButton3.setText("Save Ballot");

        jButton5.setText("Update Selected Race");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel2.setPreferredSize(new java.awt.Dimension(700, 600));

        CanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Age", "Sex", "Race", "Academic Year"
            }
        ));
        CanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(CanTable);

        RaceNameText.setText("Name of Race");
        RaceNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RaceNameTextActionPerformed(evt);
            }
        });

        addButton.setText("Add Candidate");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Update Candidate");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        delButton.setText("Delete Candidate");
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Student ID");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Age");

        jLabel5.setText("Sex");

        jLabel6.setText("Race");

        jLabel7.setText("Academic Year");

        yText.setText("UG");

        rText.setText("A");

        sText.setText("F");

        aText.setText("50");

        lNameText.setText("Doe");

        fNameText.setText("Jane");
        fNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTextActionPerformed(evt);
            }
        });

        studIdText.setText("800000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studIdText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aText)
                            .addComponent(lNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(rText)
                            .addComponent(sText)
                            .addComponent(yText))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(studIdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(aText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(sText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(rText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(yText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        voteSetButton.setText("Set");
        voteSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteSetButtonActionPerformed(evt);
            }
        });

        raceSetButton.setText("Set");
        raceSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raceSetButtonActionPerformed(evt);
            }
        });

        VoteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vote for One", "Vote for Many" }));
        VoteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Vote:");

        VoteLabel.setText("1");

        RaceNameLabel.setText("Race 1");
        jScrollPane1.setViewportView(RaceNameLabel);

        ClearButton.setText("Clear All Candidates");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delButton)
                        .addGap(18, 18, 18)
                        .addComponent(ClearButton))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(VoteComboBox, 0, 130, Short.MAX_VALUE)
                                .addComponent(RaceNameText))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(VoteLabel)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(raceSetButton))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(voteSetButton))))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RaceNameText)
                    .addComponent(raceSetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(VoteLabel)
                    .addComponent(voteSetButton))
                .addGap(8, 8, 8)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(delButton)
                    .addComponent(ClearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel2);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Submit Ballot");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        addRaceButton.setText("Add Race");
        addRaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRaceButtonActionPerformed(evt);
            }
        });

        removeRaceButton.setText("Remove Selected Race");
        removeRaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeRaceButtonActionPerformed(evt);
            }
        });

        RaceList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Race 1", "Race 2", "Race 3", "Race 4", "Race 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        RaceList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RaceListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(RaceList);

        jLabel9.setText("Election Races");

        jLabel10.setText("Ballot Creation");

        DuplButton.setText("Duplicate Race");
        DuplButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuplButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(exitButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(DuplButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addRaceButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(removeRaceButton, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveButton))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addRaceButton)
                        .addGap(30, 30, 30)
                        .addComponent(DuplButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeRaceButton)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        boolean  g=true;
        if(Ballot.get(currentRace).size()>1)
            for(int i=1;i<Ballot.get(currentRace).size();i++)
            {
                if(Ballot.get(currentRace).get(i).get(0).equals(studIdText.getText()))
                {
                    //display error message "Multiple people can't share the same id"
                    g=false;
                }
            }
        if(g)
        {
        model.insertRow(model.getRowCount(),new Object[]{studIdText.getText(),fNameText.getText(),
            lNameText.getText(),aText.getText(),sText.getText(),rText.getText(),yText.getText()});
        ArrayList cand=new ArrayList();
        cand.add(studIdText.getText());
        cand.add(fNameText.getText());
        cand.add(lNameText.getText());
        cand.add(aText.getText());
        cand.add(sText.getText());
        cand.add(rText.getText());
        cand.add(yText.getText());
        Ballot.get(currentRace).add(cand);
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void CanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanTableMouseClicked
        studIdText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),0)));
        fNameText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),1)));
        lNameText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),2)));
        aText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),3)));
        sText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),4)));
        rText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),5)));
        yText.setText(String.valueOf(model.getValueAt(CanTable.getSelectedRow(),6)));
    }//GEN-LAST:event_CanTableMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int b=CanTable.getSelectedRow();
        model.setValueAt(studIdText.getText(), b,0);
        model.setValueAt(fNameText.getText(), b,1);
        model.setValueAt(lNameText.getText(), b,2);
        model.setValueAt(aText.getText(), b,3);
        model.setValueAt(sText.getText(), b,4);
        model.setValueAt(rText.getText(), b,5);
        model.setValueAt(yText.getText(), b,6);
        Ballot.get(currentRace).get(1+b).set(0,studIdText.getText());
        Ballot.get(currentRace).get(1+b).set(1,fNameText.getText());
        Ballot.get(currentRace).get(1+b).set(2,lNameText.getText());
        Ballot.get(currentRace).get(1+b).set(3,aText.getText());
        Ballot.get(currentRace).get(1+b).set(4,sText.getText());
        Ballot.get(currentRace).get(1+b).set(5,rText.getText());
        Ballot.get(currentRace).get(1+b).set(6,yText.getText());
    }//GEN-LAST:event_editButtonActionPerformed

    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtonActionPerformed
        int i=1;
        boolean g=true;
        int size=Ballot.get(currentRace).size();
        while(g=true & i<size)
        {
          if(Ballot.get(currentRace).get(i).get(0) == model.getValueAt(CanTable.getSelectedRow(),0))
          {
              Ballot.get(currentRace).remove(i);
              g=false;
          }
          i++;  
        }
        model.removeRow(CanTable.getSelectedRow());

    }//GEN-LAST:event_delButtonActionPerformed

    private void voteSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteSetButtonActionPerformed
        String lab=(String)VoteComboBox.getSelectedItem();
        String votes="";
        int VoteNum=0;
        switch(lab){
            case "Vote for One":
                VoteLabel.setText("1");
                votes="v1";
                break;
            case "Vote for Many":
                //Create Dialog Box that asks for vote count input
                //saves input number
                //VoteLabel.setText(VoteNum);
                votes="v"+VoteNum;
                break;
        }
        Ballot.get(currentRace).get(0).set(1,votes);//fix
    }//GEN-LAST:event_voteSetButtonActionPerformed

    private void raceSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raceSetButtonActionPerformed
        RaceNameLabel.setText(RaceNameText.getText());
        Ballot.get(currentRace).get(0).set(0,RaceNameText.getText());
        liztModel.set(currentRace, RaceNameText.getText());
    }//GEN-LAST:event_raceSetButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //Exit, No Data Saved
        //Pop-up "No data will be saved, are you sure?"
        //if "yes" continue
        this.setVisible(false);
        boolean g=true;
        int i=0;
        while (g & i<exitBallot.size() )
        {
            if(exitBallot.get(i).size()>1)
                g=false;
            i++;
        }
        if(g==false)
            new CreateModifyBallot(exitBallot).setVisible(true);
        else
            new CreateModifyBallot().setVisible(true);
        //else
        //do nothing

    }//GEN-LAST:event_exitButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        //Save Data here in Array List
        //Ballot(Race1(Name,Vote,Candidates()...),Race2(Name,Vote,Candidates()...),...)
        this.setVisible(false);
        new CreateModifyBallot(Ballot).setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void RaceNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RaceNameTextActionPerformed
        //can be deleted
    }//GEN-LAST:event_RaceNameTextActionPerformed

    private void DuplButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuplButtonActionPerformed
        ArrayList temp=new ArrayList(Ballot.get(currentRace));
        Ballot.add(temp);
        currentRace=Ballot.size()-1;
        updateEverything(Ballot);
        liztModel.addElement(Ballot.get(currentRace).get(0).get(0));

    }//GEN-LAST:event_DuplButtonActionPerformed
 
    private void updateEverything(ArrayList<ArrayList<ArrayList>> B){
        int cnt2= B.get(currentRace).size();
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }
        if(cnt2>1)
        {
                String[][] data = new String[B.get(currentRace).size()-1][];
                for (int j = 1; j < B.get(currentRace).size(); j++) {
                    ArrayList<String> row = B.get(currentRace).get(j);
                    data[j-1] = row.toArray(new String[row.size()]);
                }
                String [] col={"Student ID", "First Name", "Last Name", "Age", "Sex", "Race", "Academic Year"};
                model.setDataVector(data,col);
                //model.insertRow(model.getRowCount(),new Object[]{Ballot.get(currentRace).get(i).get(0),
                  //B.get(currentRace).get(i).get(1),B.get(currentRace).get(i).get(2),B.get(currentRace).get(i).get(3),
                  //B.get(currentRace).get(i).get(4),B.get(currentRace).get(i).get(5),B.get(currentRace).get(i).get(6)});
            
        }

        RaceNameLabel.setText((String)B.get(currentRace).get(0).get(0));
        char a=((String)B.get(currentRace).get(0).get(1)).charAt(0);
        if(a=='v')
        {
            //vote for one or vote for many
            String g=((String)B.get(currentRace).get(0).get(1)).substring(1);
            VoteLabel.setText(g);    
        }
        else if(a=='m')
        {
            //some other voting schematic
        }
    }

    private void RaceListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RaceListMouseClicked
        if(currentRace!=RaceList.getSelectedIndex()){
            currentRace=RaceList.getSelectedIndex();
            updateEverything(Ballot);
        }
    }//GEN-LAST:event_RaceListMouseClicked

    private void VoteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VoteComboBoxActionPerformed

    private void fNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fNameTextActionPerformed

    private void addRaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRaceButtonActionPerformed
        ArrayList temp=new ArrayList();
        ArrayList temp2=new ArrayList();
        String name="";
        //dialog box asking for new name
        //can't be same as previous race name
        temp2.add(name);
        temp2.add("v1");
        temp.add(temp2);
        Ballot.add(temp);
        liztModel.addElement("Race 1");
    }//GEN-LAST:event_addRaceButtonActionPerformed

    private void removeRaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeRaceButtonActionPerformed
        Ballot.remove(RaceList.getSelectedIndex());
        liztModel.remove(RaceList.getSelectedIndex()); 
        currentRace=0;
        updateEverything(Ballot);

    }//GEN-LAST:event_removeRaceButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        while(model.getRowCount()>0)
        {
            model.removeRow(0);
        }
        ArrayList temp= new ArrayList();
        temp.add(Ballot.get(currentRace).get(0).get(0));
        temp.add(Ballot.get(currentRace).get(0).get(1));
        Ballot.get(currentRace).clear();
        Ballot.get(currentRace).add(temp);
    }//GEN-LAST:event_ClearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBallot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBallot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CanTable;
    private javax.swing.JButton ClearButton;
    private javax.swing.JButton DuplButton;
    private javax.swing.JList<String> RaceList;
    private javax.swing.JLabel RaceNameLabel;
    private javax.swing.JTextField RaceNameText;
    private javax.swing.JComboBox<String> VoteComboBox;
    private javax.swing.JLabel VoteLabel;
    private javax.swing.JTextField aText;
    private javax.swing.JButton addButton;
    private javax.swing.JButton addRaceButton;
    private javax.swing.JButton delButton;
    private javax.swing.JButton editButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField fNameText;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField lNameText;
    private javax.swing.JTextField rText;
    private javax.swing.JButton raceSetButton;
    private javax.swing.JButton removeRaceButton;
    private javax.swing.JTextField sText;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField studIdText;
    private javax.swing.JButton voteSetButton;
    private javax.swing.JTextField yText;
    // End of variables declaration//GEN-END:variables
}
