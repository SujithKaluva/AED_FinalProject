/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import Business.Appointment.Appointment;
import Business.Clinic.Clinic;
import Business.Ecosystem.Ecosystem;
import Business.Role.Patient;
import Business.Role.ResearchScientist;
import Business.vaccine.Vaccine;
import Business.vaccine.VaccineDetails;
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
public class PatientWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form PatientWorkArea
     */
    Ecosystem ecoSystem = Ecosystem.getInstance();
    Patient patient;
    //Patient selectedPatient;
    public PatientWorkArea(Patient p) {
        initComponents();
        this.patient=p;
        jPanel4.setBackground(new Color(255,255,255,90));
        workPanel.setBackground(new Color(255,255,255,100));
       jPanel8.setBackground(new Color(255,255,255,90));        
        WorkPanel3.setBackground(new Color(255,255,255,100));
        lableFilling();
        appointmentPopulate();
        profilePopulate();
        populateClinicVacc();
        populateCombo();
        
        
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
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Vaccinedetails = new javax.swing.JComboBox<>();
        apod = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        backbutton = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clinic = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        opacityPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        WorkPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        qua = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        backbutton1 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        opacityPanel1 = new javax.swing.JPanel();
        workPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        apptable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        workPanel.setMaximumSize(new java.awt.Dimension(1200, 700));
        workPanel.setMinimumSize(new java.awt.Dimension(1200, 700));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Appointment Date");

        jButton1.setBackground(new java.awt.Color(0, 102, 150));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Vaccine");

        Vaccinedetails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("  Appointment Booking");

        backbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N

        welcome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcome.setForeground(new java.awt.Color(46, 82, 176));

        clinic.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Clinic ID", "Clinic Name", "Address", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(clinic);

        javax.swing.GroupLayout workPanelLayout = new javax.swing.GroupLayout(workPanel);
        workPanel.setLayout(workPanelLayout);
        workPanelLayout.setHorizontalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(backbutton)
                        .addGap(118, 118, 118)
                        .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(28, 28, 28)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Vaccinedetails, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apod, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton1)))
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        workPanelLayout.setVerticalGroup(
            workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanelLayout.createSequentialGroup()
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(workPanelLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, workPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3)))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(welcome)))
                .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Vaccinedetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(workPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(apod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(jButton1))
                    .addGroup(workPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.add(workPanel);
        workPanel.setBounds(0, 0, 1200, 700);

        jPanel4.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel4.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel4.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel4.setLayout(new javax.swing.OverlayLayout(jPanel4));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/businessman-marking-calendar-appointment.jpg"))); // NOI18N
        jPanel4.add(jLabel4);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 1200, 700);

        opacityPanel.setBackground(new java.awt.Color(255, 255, 255));
        opacityPanel.setLayout(new javax.swing.OverlayLayout(opacityPanel));
        jPanel1.add(opacityPanel);
        opacityPanel.setBounds(0, 0, 1200, 700);

        jTabbedPane1.addTab("Appointment Booking", jPanel1);

        jPanel2.setBackground(new java.awt.Color(178, 198, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel2.setLayout(null);

        WorkPanel3.setBackground(new java.awt.Color(255, 255, 255));
        WorkPanel3.setPreferredSize(new java.awt.Dimension(1200, 700));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("First Name");

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel6.setText("Update Patient Profile");

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email");

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Last Name");

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Date of Birth");

        jButton2.setBackground(new java.awt.Color(0, 102, 150));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(102, 102, 102));
        jLabel30.setText("Gender");

        jLabel32.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Location");

        qua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quaActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update Location");

        backbutton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/previous (4).png"))); // NOI18N

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Phone Number ");

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Password");

        javax.swing.GroupLayout WorkPanel3Layout = new javax.swing.GroupLayout(WorkPanel3);
        WorkPanel3.setLayout(WorkPanel3Layout);
        WorkPanel3Layout.setHorizontalGroup(
            WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkPanel3Layout.createSequentialGroup()
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGap(543, 543, 543)
                        .addComponent(jButton2))
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(WorkPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(backbutton1)
                                .addGap(320, 320, 320)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkPanel3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(qua, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addComponent(jButton3))
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11)
                                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                                        .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel32))
                                        .addGap(11, 11, 11)))
                                .addGap(23, 23, 23))
                            .addGroup(WorkPanel3Layout.createSequentialGroup()
                                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                                        .addGap(409, 409, 409)
                                        .addComponent(jLabel5))
                                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                                        .addGap(406, 406, 406)
                                        .addComponent(jLabel8)))
                                .addGap(24, 24, 24)))
                        .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(phone)
                                .addComponent(lname)
                                .addComponent(fname)
                                .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email1, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        WorkPanel3Layout.setVerticalGroup(
            WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WorkPanel3Layout.createSequentialGroup()
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6))
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(36, 36, 36)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(29, 29, 29)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(28, 28, 28)
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(50, 50, 50))
                    .addGroup(WorkPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(WorkPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton2)
                .addGap(34, 34, 34))
        );

        jPanel2.add(WorkPanel3);
        WorkPanel3.setBounds(0, 0, 1200, 700);

        jPanel8.setMaximumSize(new java.awt.Dimension(1200, 700));
        jPanel8.setMinimumSize(new java.awt.Dimension(1200, 700));
        jPanel8.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel8.setLayout(new javax.swing.OverlayLayout(jPanel8));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/8619.jpg"))); // NOI18N
        jPanel8.add(jLabel22);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(0, 0, 1200, 700);

        opacityPanel1.setBackground(new java.awt.Color(255, 255, 255));
        opacityPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        opacityPanel1.setLayout(new javax.swing.OverlayLayout(opacityPanel1));
        jPanel2.add(opacityPanel1);
        opacityPanel1.setBounds(0, 0, 1200, 700);

        jTabbedPane1.addTab("Patient Profile", jPanel2);

        workPanel1.setBackground(new java.awt.Color(197, 232, 238));

        apptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clinic", "Vaccine", "AppointmentDate", "Status", "Comments"
            }
        ));
        jScrollPane3.setViewportView(apptable);

        javax.swing.GroupLayout workPanel1Layout = new javax.swing.GroupLayout(workPanel1);
        workPanel1.setLayout(workPanel1Layout);
        workPanel1Layout.setHorizontalGroup(
            workPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1194, Short.MAX_VALUE))
        );
        workPanel1Layout.setVerticalGroup(
            workPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Appointment History", workPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (Patient c : ecoSystem.patientdirectory.getPatientdirectory()) {
            
             if(c.getPatientId()==patient.getPatientId())
             {
                 c.setFirstName(fname.getText());
                 c.setLastName(fname.getText());
                 c.setGender(gender.getSelectedItem().toString());
                 c.setEmailId(email1.getText());
                 c.setPhoneNumber(Long.valueOf(phone.getText()));
                 c.setPassword(password.getText());
                 c.setDateOfBirth(dob.getDate());
             }
           

            }

        
        JOptionPane.showMessageDialog(this, "Patient Details Updated");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Clinic selectClinic=null;
        Vaccine v=null;
        int s = clinic.getSelectedRow();
        Boolean h=false;
        if(apod!=null)
        {   
        for (Clinic c : ecoSystem.getClinicdirectory().getClinicdirectory()) {
            if (c.getClinicId() == clinic.getValueAt(s, 1)) {

               selectClinic=c;
            }

        }
        for (Vaccine c : ecoSystem.getVaccineDirectory().getVaccineDirectory()) {
            if (c.getName() == null ? Vaccinedetails.getSelectedItem().toString() == null : c.getName().equals(Vaccinedetails.getSelectedItem().toString())) {

               v=c;
            }

        }
        for(Appointment p:ecoSystem.getAppointmenthistory().getAppointmenthistory())
        {
            p.setPatient(patient);
            p.setClinic(selectClinic);
            p.setDate(apod.getDate());
            p.setVaccine(v);
            h=true;
        }
        }
        else
            JOptionPane.showMessageDialog(this,"Please Select appointmentTime");
        if(selectClinic==null){
            JOptionPane.showMessageDialog(this,"Please Select a clinic");
        }
         if(v==null){
            JOptionPane.showMessageDialog(this,"Please Select a Vaccine");
        }
         if(h)
         {
             JOptionPane.showMessageDialog(this,"Appointment Booked");
         }
            
                  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

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
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PatientWorkArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Vaccinedetails;
    private javax.swing.JPanel WorkPanel3;
    private com.toedter.calendar.JDateChooser apod;
    private javax.swing.JTable apptable;
    private javax.swing.JLabel backbutton;
    private javax.swing.JLabel backbutton1;
    private javax.swing.JTable clinic;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JPanel opacityPanel;
    private javax.swing.JPanel opacityPanel1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField qua;
    private javax.swing.JLabel welcome;
    private javax.swing.JPanel workPanel;
    private javax.swing.JPanel workPanel1;
    // End of variables declaration//GEN-END:variables

    private void lableFilling() {
         welcome.setText("Welcome! "+patient.getFirstName()+" "+patient.getLastName());
    }

    private void appointmentPopulate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) apptable.getModel();
        model.setRowCount(0);
        for(Appointment vObj : ecoSystem.getAppointmenthistory().getAppointmenthistory()){
            
            if(vObj.getPatient().getPatientId()==patient.getPatientId()){
            Object[] row = new Object[10];
            row[0] =vObj.getClinic().getClinicName();
            row[1] =vObj.getVaccine().getName();
            row[2] =dateFormat.format(vObj.getDate());
            row[3] = vObj.getAppointmentstatus();
            row[4] = vObj.getComments();
           
           
            
            model.addRow(row);
            }
        
        
        }
       
    }

    private void profilePopulate() {
        
        fname.setText(patient.getFirstName());
        lname.setText(patient.getLastName());
        phone.setText(patient.getPhoneNumber()+"");
        password.setText(patient.getEmailId());
        dob.setDate(patient.getDateOfBirth());
        gender.setSelectedItem(patient.getGender());
        password.setText(patient.getPassword());
        
         
    }

    private void populateClinicVacc() {
     
       // SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
        DefaultTableModel model = (DefaultTableModel) clinic.getModel();
        model.setRowCount(0);
        for(Clinic vObj : ecoSystem.getClinicdirectory().getClinicdirectory()){
            
            
            Object[] row = new Object[10];
            row[0] =vObj.getClinicId();
            row[1] =vObj.getClinicName();
            row[2] =vObj.getClinicAddress();
            row[3] = vObj.getClinicPhoneNumber();
           
            
            model.addRow(row);
            
        
        
        }
        
        
        
    }

    private void populateCombo() {
        for(Vaccine c:ecoSystem.getVaccineDirectory().getVaccineDirectory())
        {
            Vaccinedetails.addItem(c.getName());
        }    
        
    }
}
