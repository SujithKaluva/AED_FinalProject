/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Orders.Orders;
import Business.Role.SalesPerson;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tendusmac
 */
public class SalesPersonWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form SalesPersonWorkArea
     */
    Ecosystem ecoSystem = Ecosystem.getInstance();
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    Orders sec;
    SalesPerson sp;

    public SalesPersonWorkArea(SalesPerson h) {
        initComponents();
        this.setVisible(true);
        this.sp = h;
        TableFilling();
        welcome.setText("Hello "+h.getFirstName()+" "+h.getLastName());
        jPanel4.setBackground(new Color(255, 255, 255, 90));
        workPanel.setBackground(new Color(255, 255, 255, 100));

    }

    private void TableFilling() {
        //HashMap<String, String> pManager;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) salespersontable.getModel();
        model.setRowCount(0);

        for (Orders odd : ecoSystem.getOrderDirectory().getOrderdirectory()) {

            if (odd.getSalesperson().getSalesId().equals(sp.getSalesId())) {
                Object[] row = new Object[5];
                row[0] = odd.getSalesperson().getSalesId();
                row[1] = odd.getPrice();
                row[2] = odd.getStatus();
                row[3] = odd.getDate();
                row[4] = odd.getDelivereddate();

                model.addRow(row);
            }

        }

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
        workPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        salespersontable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        deldate = new com.toedter.calendar.JDateChooser();
        ordstatus = new javax.swing.JComboBox<>();
        orddate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        ordprice = new javax.swing.JTextField();
        backbutton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        opacityPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Order Status");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Delivery Date");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Order Date");

        salespersontable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Price", "OrderStatus", "OrderDate", "DeliveryDate"
            }
        ));
        jScrollPane2.setViewportView(salespersontable);

        jButton3.setBackground(new java.awt.Color(255, 51, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 102, 150));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Select");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        welcome.setText("Sales Person Work Area");

        ordstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Booked", "Volunteer Assigned", "On hold", "Vaccine Not available", "Vaccinated", "Payment pending", "Rejected" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Price ");

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(819, Short.MAX_VALUE))
            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(workPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(workPanelLayout.createSequentialGroup()
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(255, 255, 255)
                            .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(423, 423, 423))
                        .addGroup(workPanelLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(workPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(orddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(29, 29, 29))
                                .addGroup(workPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(32, 32, 32))
                                .addGroup(workPanelLayout.createSequentialGroup()
                                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ordstatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ordprice))
                                    .addGap(32, 32, 32)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)))))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(219, 219, 219))
            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(workPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(welcome))
                    .addGap(49, 49, 49)
                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(workPanelLayout.createSequentialGroup()
                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(ordprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(ordstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12)
                                .addComponent(orddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel11)
                                .addComponent(deldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(237, 237, 237)))
                    .addContainerGap(96, Short.MAX_VALUE)))
        );

        jPanel1.add(workPanel);
        workPanel.setBounds(0, 0, 1200, 670);

        jPanel4.setAlignmentX(1.0F);
        jPanel4.setAlignmentY(0.0F);
        jPanel4.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel4.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5222.jpg"))); // NOI18N
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1200, 700);

        opacityPanel.setBackground(new java.awt.Color(255, 255, 255));
        opacityPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        opacityPanel.setLayout(new javax.swing.OverlayLayout(opacityPanel));
        jPanel1.add(opacityPanel);
        opacityPanel.setBounds(0, 0, 1200, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (sec != null) {
            int s = salespersontable.getSelectedRow();
            for (Orders od : ecoSystem.getOrderDirectory().getOrderdirectory()) {
                if (od.getSalesperson().getSalesId().equals(salespersontable.getValueAt(s, 0).toString())) {
                    ecoSystem.getOrderDirectory().getOrderdirectory().remove(od);
                    JOptionPane.showMessageDialog(this, "Deleted Order");
                    TableFilling();
                    break;
                }

            }
        } else
            JOptionPane.showMessageDialog(this, "Select Order to be deleted");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        boolean validated = false;
        boolean validatedOtherFields = false;
        
        String status = ordstatus.getSelectedItem() == null ? "" : ordstatus.getSelectedItem().toString();
        JDateChooser strtDt = orddate;
        JDateChooser strtDt1 = deldate;
        int p=Integer.valueOf(ordprice.getText());
        
        
        
        
        if(!status.isEmpty() && strtDt!=null && strtDt1!=null){
             validatedOtherFields = true;
        }
        else {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory!");
        }
        
        
        
        int s = salespersontable.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Select a row");
        } else {
            for (Orders odd : ecoSystem.getOrderDirectory().getOrderdirectory()) {
                if (odd.getOrderid().equals(salespersontable.getValueAt(s, 0).toString())) {

                    odd.setPrice(Integer.valueOf(ordprice.getText()));
                    odd.setStatus(ordstatus.getSelectedItem().toString());
                    odd.setDate(orddate.getDate());
                    odd.setDelivereddate(deldate.getDate());
                    JOptionPane.showMessageDialog(this, "Updated Order");
                            TableFilling();
                    break;
                }

            }

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int s = salespersontable.getSelectedRow();
        if (s == -1) {
            JOptionPane.showMessageDialog(this, "Select an order");
        } else {

            for (Orders odd : ecoSystem.getOrderDirectory().getOrderdirectory()) {
                if (odd.getOrderid().equalsIgnoreCase(salespersontable.getValueAt(s, 0).toString())) {

                    sec = odd;
                    ordprice.setText(odd.getPrice() + "");
                    ordstatus.setSelectedItem(odd.getStatus());
                    orddate.setDate(odd.getDate());
                    deldate.setDate(odd.getDelivereddate());

                }

            }
        }
        if (sec == null) {
            JOptionPane.showMessageDialog(this, "Select an order");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        // TODO add your handling code here:
        dB4OUtil.storeSystem(Ecosystem.getInstance());
        Login mf = new Login();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

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
            java.util.logging.Logger.getLogger(SalesPersonWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesPersonWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesPersonWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesPersonWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //new SalesPersonWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbutton;
    private com.toedter.calendar.JDateChooser deldate;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel opacityPanel;
    private com.toedter.calendar.JDateChooser orddate;
    private javax.swing.JTextField ordprice;
    private javax.swing.JComboBox<String> ordstatus;
    private javax.swing.JTable salespersontable;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables
}
