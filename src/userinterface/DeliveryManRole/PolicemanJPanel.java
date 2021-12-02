/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Item;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class PolicemanJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private OrderDirectory orderDirectory;
    
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PolicemanJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.orderDirectory = business.getOrderDirectory();
        
        populateTable();
    }
    
    public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
//        model.setRowCount(0);
//        
//        for(Order order : orderDirectory.getOrderDirectory()){
//            if(order.getDeliveryMan() != null && order.getDeliveryMan().getUsername().equals(userAccount.getUsername())) {
//                Object [] row = new Object[6];
//                row[0] = order;
//                row[1] = order.getCustomer().getName();
//                row[2] = order.getCustomer().getAddress();
//                row[3] = order.getRestaurant().getName();
//                row[4] = order.getRestaurant().getAddress();
//                row[5] = order.getStatus();
//                
//                model.addRow(row);
//            }
//        }
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
        workRequestJTable = new javax.swing.JTable();
        btnUpdateStatus = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxStatus = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Customer Address", "Restaurant", "Restaurant Address", "Order Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1020, 170));

        btnUpdateStatus.setText("Update");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });
        add(btnUpdateStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, 30));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 120, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Delivery Man Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("My Assigned Orders:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Status Update:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        comboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Picked up from the Restaurant", "On the Way", "Delivered" }));
        add(comboBoxStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        int selectedRowIndex = workRequestJTable.getSelectedRow();
        if (selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select an order.");
            return;
        }

        String selectedStatus = comboBoxStatus.getSelectedItem().toString();
        DefaultTableModel modelOrders = (DefaultTableModel) workRequestJTable.getModel();
        Order selectedOrder = (Order) modelOrders.getValueAt(selectedRowIndex, 0);
        if (selectedStatus.equals("Picked up from the Restaurant")){
            selectedOrder.setStatus("Picked up from the Restaurant");
            JOptionPane.showMessageDialog(this, "Update Successful!");
        }else if (selectedStatus.equals("On the Way")){
            selectedOrder.setStatus("On the Way");
            JOptionPane.showMessageDialog(this, "Update Successful!");
        }else if (selectedStatus.equals("Delivered")){
            selectedOrder.setStatus("Delivered");
            JOptionPane.showMessageDialog(this, "Update Successful!");
        }
        populateTable();
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JComboBox<String> comboBoxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
