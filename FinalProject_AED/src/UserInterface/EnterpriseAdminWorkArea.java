/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem.Ecosystem;
import Business.Manufacturer.Manufacturer;
import Business.Role.EnterpriseAdmin;
import Business.enterprise.Enterprise;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tendusmac
 */
public class EnterpriseAdminWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form EnterpriseAdminWorkArea
     */
    Ecosystem ecoSystem = Ecosystem.getInstance();
    DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    EnterpriseAdmin loggedInUser;
    
    public EnterpriseAdminWorkArea(EnterpriseAdmin enterpriseAdmin) {
        initComponents();
        TableFilling2();
        TableFilling3();
        fillenter();
        this.loggedInUser = enterpriseAdmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        workPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        entname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        entaddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        enterpriseadmin = new javax.swing.JTable();
        create = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        estdate = new com.toedter.calendar.JDateChooser();
        backbutton = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        create1 = new javax.swing.JButton();
        create2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        opacityPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        manufacturername = new javax.swing.JTextField();
        emailid = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        Create1 = new javax.swing.JButton();
        Enterprise = new javax.swing.JLabel();
        enterpriselist = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        manufacturertable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        workPanel.setBackground(new java.awt.Color(255, 255, 255));
        workPanel.setForeground(new java.awt.Color(102, 102, 102));
        workPanel.setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("EnterpriseName");

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Established Date");

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("EnterpriseAddress");

        enterpriseadmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "EnterpriseName", "EnterpriseAddress", "Estdate"
            }
        ));
        jScrollPane2.setViewportView(enterpriseadmin);

        create.setBackground(new java.awt.Color(0, 102, 150));
        create.setForeground(new java.awt.Color(255, 255, 255));
        create.setText("Create Enterprise Admin");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel2.setText("Enterprise Admin");

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N
        backbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbuttonMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 150));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Select");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        create1.setBackground(new java.awt.Color(0, 102, 150));
        create1.setForeground(new java.awt.Color(255, 255, 255));
        create1.setText("Set Location");
        create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create1ActionPerformed(evt);
            }
        });

        create2.setBackground(new java.awt.Color(0, 102, 150));
        create2.setForeground(new java.awt.Color(255, 255, 255));
        create2.setText("Update");
        create2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(workPanelLayout.createSequentialGroup()
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)
                                            .addComponent(estdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(workPanelLayout.createSequentialGroup()
                                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(entname, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(entaddress))))
                                    .addGroup(workPanelLayout.createSequentialGroup()
                                        .addComponent(create1)
                                        .addGap(18, 18, 18)
                                        .addComponent(create2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(workPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(create, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(100, 100, 100)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jButton1)
                        .addGap(88, 88, 88)
                        .addComponent(jButton2)
                        .addGap(80, 80, 80)
                        .addComponent(jButton3)))
                .addGap(489, 489, Short.MAX_VALUE))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(entname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(estdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(entaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(create2)
                            .addComponent(create1))
                        .addGap(27, 27, 27)
                        .addComponent(create))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(472, Short.MAX_VALUE))
        );

        jPanel1.add(workPanel);
        workPanel.setBounds(0, 0, 1490, 950);

        jPanel4.setAlignmentY(0.0F);
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/10976.jpg"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1200, 700);

        opacityPanel.setBackground(new java.awt.Color(255, 255, 255));
        opacityPanel.setPreferredSize(new java.awt.Dimension(1200, 700));
        opacityPanel.setLayout(new javax.swing.OverlayLayout(opacityPanel));
        jPanel1.add(opacityPanel);
        opacityPanel.setBounds(0, 0, 1490, 950);

        jTabbedPane1.addTab("EnterpriseAdmin", jPanel1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setText("ManufacturerName");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel3.setText("Email id");

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setText("Password");

        manufacturername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturernameActionPerformed(evt);
            }
        });

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        Create1.setBackground(new java.awt.Color(0, 102, 150));
        Create1.setForeground(new java.awt.Color(255, 255, 255));
        Create1.setText("Create");
        Create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create1ActionPerformed(evt);
            }
        });

        Enterprise.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        Enterprise.setText("Enterprise");

        enterpriselist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        manufacturertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ManufacturerId", "ManufacturerName", "Email", "Enterprise"
            }
        ));
        jScrollPane3.setViewportView(manufacturertable);

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText(" New Manufacturer ");

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 102, 150));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jButton4)
                        .addGap(97, 97, 97)
                        .addComponent(jButton5)
                        .addGap(111, 111, 111)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(manufacturername, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Enterprise)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(enterpriselist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Create1)
                                .addGap(33, 33, 33)))))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manufacturername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(enterpriselist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enterprise))
                        .addGap(49, 49, 49)
                        .addComponent(Create1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Manufacturer", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1144, Short.MAX_VALUE)
                .addGap(479, 479, 479))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
      
        if(entname.getText().isBlank())
        {
             JOptionPane.showMessageDialog(this," Enter enterprise name");
        }
        else if(entaddress.getText().isBlank())
        {
            JOptionPane.showMessageDialog(this," Enter enterprise address");
        }
       else
        {
            Enterprise e=new Enterprise(entname.getText(),estdate.getDate(),entaddress.getText());
            TableFilling2();
            
            
        }
        
                    
       
    }//GEN-LAST:event_createActionPerformed

    private void Create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Create1ActionPerformed

    private void manufacturernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int s = enterpriseadmin.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this," select Enterprise " );
        }
        for (Enterprise ent : ecoSystem.getEnterpriseDirectory().getEnterprisedirectory()) {
            if (ent.getCompanyName() == enterpriseadmin.getValueAt(s, 0)) {

                ecoSystem.getEnterpriseDirectory().getEnterprisedirectory().remove(ent);
                TableFilling2();
                break;
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int s =manufacturertable.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this," select Manufacturer" );
        }   
        else{
        for(Manufacturer ma :ecoSystem.getManufacturerCatalog().getManufacturerList()){
            
            if(ma.getManufacturerId().equals(manufacturertable.getValueAt(s, 0))){
                ecoSystem.getManufacturerCatalog().getManufacturerList().remove(ma);
            
            }
        }
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Enterprise d=null;
        int s = manufacturertable.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this," select Manufacturer" );
        }   
        for(Enterprise e:ecoSystem.getEnterpriseDirectory().getEnterprisedirectory())
        {
            if(e.getCompanyName().equals(enterpriselist.getSelectedItem().toString()))
            {
                d=e;
            }    
                
        } 
        for (Manufacturer mu : ecoSystem.getManufacturerCatalog().getManufacturerList()) {
            if (mu.getManufacturerId().equals(manufacturertable.getValueAt(s, 0).toString())) {

                mu.setManufacturerName(manufacturername.getText());
                mu.setEmailId(emailid.getText());
                mu.setPassword(password.getText());
                mu.setEnterprise(d);
            }
        }
             
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int s = manufacturertable.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this," select Manufacturer" );
        }    
        for (Manufacturer mu : ecoSystem.getManufacturerCatalog().getManufacturerList()) {
            if (mu.getManufacturerId().equals(manufacturertable.getValueAt(s, 0).toString())) {

                manufacturername.setText(mu.getManufacturerName());
                emailid.setText(mu.getEmailId());
                //estdate.setDate(mu.getCompanyEstDate());
               

            

        
        
       
                
               

            }

        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int s = enterpriseadmin.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this,"Select Enterprise");
        }   
        else{
        for (Enterprise ent : ecoSystem.getEnterpriseDirectory().getEnterprisedirectory()) {
            if (ent.getCompanyName().equals(enterpriseadmin.getValueAt(s, 0).toString())) {

                ent.setCompanyName(entname.getText());
                ent.setCompanyAddress(entaddress.getText());
                ent.setCompanyEstDate(estdate.getDate());
                TableFilling2();
                JOptionPane.showMessageDialog(this,"EnterPrise Updated");
                break;
                

            }
        }

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int s = enterpriseadmin.getSelectedRow();
        if(s==-1)
        {
            JOptionPane.showMessageDialog(this,"select enterprise");
        }
        else
        {
        for (Enterprise ent : ecoSystem.getEnterpriseDirectory().getEnterprisedirectory()) {
            if (ent.getCompanyName().equals(enterpriseadmin.getValueAt(s,0).toString())) {

                entname.setText(ent.getCompanyName());
                entaddress.setText(ent.getCompanyAddress());
                estdate.setDate(ent.getCompanyEstDate());
                break;
               

            }
        }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbuttonMouseClicked
        // TODO add your handling code here:
        dB4OUtil.storeSystem(Ecosystem.getInstance());
        Login mf = new Login();
        mf.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonMouseClicked

    private void create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create1ActionPerformed
        // TODO add your handling code here:
        Location lobj = new Location();
        lobj.setVisible(true);
    }//GEN-LAST:event_create1ActionPerformed

    private void create2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create2ActionPerformed
        // TODO add your handling code here:
        entaddress.setText(ecoSystem.getgMapsLocation().getLatitude() + "," + ecoSystem.getgMapsLocation().getLongitude());
    }//GEN-LAST:event_create2ActionPerformed

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EnterpriseAdminWorkAreaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EnterpriseAdminWorkAreaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EnterpriseAdminWorkAreaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EnterpriseAdminWorkAreaOld.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EnterpriseAdminWorkAreaOld().setVisible(true);
            }
        });
    }
     private void TableFilling2() {
        //HashMap<String, String> pManager;
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) enterpriseadmin.getModel();
        model.setRowCount(0);

        for (Enterprise ent : ecoSystem.getEnterpriseDirectory().getEnterprisedirectory()) {

            Object[] row = new Object[4];
            row[0] = ent.getCompanyName();
            row[1] =ent.getCompanyAddress();
            row[2] = ent.getCompanyEstDate();
            
            

            model.addRow(row);

        }

    }












    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Create1;
    private javax.swing.JLabel Enterprise;
    private javax.swing.JLabel backbutton;
    private javax.swing.JButton create;
    private javax.swing.JButton create1;
    private javax.swing.JButton create2;
    private javax.swing.JTextField emailid;
    private javax.swing.JTextField entaddress;
    private javax.swing.JTable enterpriseadmin;
    private javax.swing.JComboBox<String> enterpriselist;
    private javax.swing.JTextField entname;
    private com.toedter.calendar.JDateChooser estdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField manufacturername;
    private javax.swing.JTable manufacturertable;
    private javax.swing.JPanel opacityPanel;
    private javax.swing.JTextField password;
    private javax.swing.JPanel workPanel;
    // End of variables declaration//GEN-END:variables

    private void TableFilling3() {
           SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) manufacturertable.getModel();
        model.setRowCount(0);

        for (Manufacturer ent : ecoSystem.getManufacturerCatalog().getManufacturerList()) {

            Object[] row = new Object[4];
            row[0] = ent.getManufacturerId();
            row[1] =ent.getManufacturerName();
            row[2] = ent.getEmailId();
            row[3]=ent.getEnterprise().getCompanyName();
            
            

            model.addRow(row);

        }

    }

    private void fillenter() {
       
        ArrayList<String> vaccineList = new ArrayList<String>();
        for (Enterprise c : ecoSystem.getEnterpriseDirectory().getEnterprisedirectory()) {
            vaccineList.add(c.getCompanyName());
           // System.out.print(c.getName());
        }
        DefaultComboBoxModel vaccineModelList = new DefaultComboBoxModel(vaccineList.toArray());
        enterpriselist.setModel(vaccineModelList);
        
        
        
    }
}

