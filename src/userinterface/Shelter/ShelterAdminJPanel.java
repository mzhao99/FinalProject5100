/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Shelter;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Reporting.CommonReporting.Children;
import Reporting.CommonReporting.ChildrenDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.Police.PoliceViewDetailsJPanel;

/**
 *
 * @author mzhao
 */
public class ShelterAdminJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem ecoSystem; 
    private UserAccount userAccount;
    private ChildrenDirectory childrenDirectory;
    
    /**
     * Creates new form ShelterAdminJPanel
     */
    public ShelterAdminJPanel(JPanel userProcessContainer, EcoSystem ecoSystem, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecoSystem = ecoSystem;
        this.userAccount = userAccount;
        this.childrenDirectory = ecoSystem.getChildrenDirectory();
        
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableChildren = new javax.swing.JTable();
        btnFinished = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnrfrsh = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setText("Shelter Admin Management Panel");

        tableChildren.setBackground(new java.awt.Color(153, 153, 153));
        tableChildren.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Approx. Age", "Sex", "Race", "Found Date", "Found Location"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableChildren);

        btnFinished.setBackground(new java.awt.Color(0, 0, 0));
        btnFinished.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnFinished.setForeground(new java.awt.Color(255, 204, 51));
        btnFinished.setText("View Details");
        btnFinished.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishedActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("Search");

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 204, 51));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 204, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name", "Status", " " }));

        btnrfrsh.setBackground(new java.awt.Color(0, 0, 0));
        btnrfrsh.setForeground(new java.awt.Color(255, 204, 51));
        btnrfrsh.setText("Refresh Filter");
        btnrfrsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrfrshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(btnFinished)))
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel2)
                        .addGap(39, 39, 39)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnrfrsh)
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearch)
                        .addComponent(btnrfrsh, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnFinished)
                .addContainerGap(99, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinishedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishedActionPerformed
        int selectedRow = tableChildren.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this,"Please select a children first.");
            return;
        }
        
        Children child = (Children) tableChildren.getValueAt(selectedRow, 1);
        ShelterViewDetailsJPanel pvdp = new ShelterViewDetailsJPanel(userProcessContainer, ecoSystem, child);
        userProcessContainer.add("ViewDetailsJPanel", pvdp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinishedActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        String item = (String)jComboBox1.getSelectedItem();
        ArrayList<Children> selectedc = new ArrayList<Children>();
        long millis=System.currentTimeMillis();  
        java.sql.Date currentDate=new java.sql.Date(millis); 
        
        if(item.equals("ID")){
            int id =Integer.parseInt(txtSearch.getText());
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                long diffInMillies = Math.abs(currentDate.getTime() - c.getFoundDate().getTime());
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                if(c.getId().equals(txtSearch.getText()) && c.getStatus().equals("Treated")  && diff <=365){
                    selectedc.add(c);
                }
            }
        }
        if(item.equals("Name")){
            String Name =txtSearch.getText();
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                long diffInMillies = Math.abs(currentDate.getTime() - c.getFoundDate().getTime());
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                if(c.getName().equals(Name) && c.getStatus().equals("Treated") && diff <=365){
                    selectedc.add(c);
                }
            }
        }
        if(item.equals("Status")){
            String Status =txtSearch.getText();
            for(Children c : ecoSystem.getChildrenDirectory().getChildrenDirectory()){
                long diffInMillies = Math.abs(currentDate.getTime() - c.getFoundDate().getTime());
                long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                if(c.getStatus().equals(Status) && c.getStatus().equals("Treated")  && diff <=365){
                    selectedc.add(c);
                }
            }
        }
        

        DefaultTableModel model = (DefaultTableModel) tableChildren.getModel();
        model.setRowCount(0);

        for(Children children:selectedc){

            Object[] row = new Object[5];
            row[0] = children.getId();
            row[1] = children.getName();
            row[2] = children.getApproxAge();
            row[3] = children.getStatus();
            row[4] = children.getMedicalAdvice();

            model.addRow(row);

        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnrfrshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrfrshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnrfrshActionPerformed
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tableChildren.getModel();
        model.setRowCount(0);
        long millis=System.currentTimeMillis();  
        java.sql.Date currentDate=new java.sql.Date(millis); 
      
 
        
        for(Children c : childrenDirectory.getChildrenDirectory()){
             long diffInMillies = Math.abs(currentDate.getTime() - c.getFoundDate().getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            if(c.getStatus().equals("Treated") && diff <=365)
            {
                Object [] row = new Object[7];
                row[0] = c.getId();
                row[1] = c;
                row[2] = c.getApproxAge();
                row[3] = c.getSex();
                row[4] = c.getRace();
                row[5] = c.getFoundDate();
                row[6] = c.getRegion();
               
                model.addRow(row);
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinished;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnrfrsh;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableChildren;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
