/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ClinicRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gyt
 */
public class DnaTestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DnaTestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    
    public DnaTestJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnDNA = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Approx age", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Matched Children List");

        btnDNA.setBackground(new java.awt.Color(0, 0, 0));
        btnDNA.setForeground(new java.awt.Color(255, 204, 51));
        btnDNA.setText("contact parents");
        btnDNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDNAActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 204, 51));
        jButton1.setText("comfirm DNA testing result");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(99, 99, 99)
                .addComponent(btnDNA)
                .addGap(160, 160, 160))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDNA)
                    .addComponent(jButton1))
                .addContainerGap(94, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTable1.getSelectedRow();
        if(selectRowIndex<0){
           JOptionPane.showMessageDialog(this, "Please select a row to update.");
           return;
       }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Children children = (Children)model.getValueAt(selectRowIndex, 1);
        children.setStatus("DNA Matched");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDNAActionPerformed
        // TODO add your handling code here:
        int selectRowIndex = jTable1.getSelectedRow();
        if(selectRowIndex<0){
           JOptionPane.showMessageDialog(this, "Please select a row to update.");
           return;
       }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Children children = (Children)model.getValueAt(selectRowIndex, 1);
        DnaDetailsJPanel ddjp = new DnaDetailsJPanel(userProcessContainer, userAccount, ecoSystem, children);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        userProcessContainer.add(ddjp);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDNAActionPerformed


    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        for(Children children:ecoSystem.getChildrenDirectory().getChildrenDirectory()){
            if(children.getStatus().equals("Waiting for testing center to respond")){
                Object[] row = new Object[4];
                row[0] = children.getId();
                row[1] = children;
                row[2] = children.getApproxAge();
                row[3] = children.getStatus();
                
            
                model.addRow(row);
            }
        }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDNA;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
