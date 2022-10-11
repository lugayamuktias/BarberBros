/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberbros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akbar_t6fy92r
 */
public class Interface extends javax.swing.JFrame {
    int cost;
    public String Treatment;
    public String stylist;
    Connection con;
    Statement st;
    ResultSet rs;
   

    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        bayangan1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new com.raven.datechooser.DateChooser();
        BackgroundPanel = new javax.swing.JPanel();
        SidePanel = new javax.swing.JPanel();
        Homemenu = new javax.swing.JLabel();
        HistoryMenu = new javax.swing.JLabel();
        TreatmentMenu = new javax.swing.JLabel();
        StylistMenu = new javax.swing.JLabel();
        BookingMenu = new javax.swing.JLabel();
        headerPanel = new javax.swing.JPanel();
        UserButton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LogOutButton = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtJam = new javax.swing.JTextField();
        buttonBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbStylist = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPhoneNum = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        timePicker1 = new com.raven.swing.TimePicker();
        cmbTreatment = new javax.swing.JComboBox<>();
        btnTreatment = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        bayangan1 = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        date.setForeground(java.awt.Color.black);
        date.setTextRefernce(txtDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SidePanel.setBackground(new java.awt.Color(240, 165, 0));

        Homemenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Homemenu.setForeground(java.awt.Color.white);
        Homemenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Homemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_home_page_100px.png"))); // NOI18N
        Homemenu.setText("Home");
        Homemenu.setToolTipText("");
        Homemenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Homemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomemenuMouseClicked(evt);
            }
        });

        HistoryMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        HistoryMenu.setForeground(java.awt.Color.white);
        HistoryMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HistoryMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_order_history_80px.png"))); // NOI18N
        HistoryMenu.setText("History");
        HistoryMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HistoryMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryMenuMouseClicked(evt);
            }
        });

        TreatmentMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TreatmentMenu.setForeground(java.awt.Color.white);
        TreatmentMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TreatmentMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_cleansing_50px.png"))); // NOI18N
        TreatmentMenu.setText("Treatment");
        TreatmentMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TreatmentMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentMenuMouseClicked(evt);
            }
        });

        StylistMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        StylistMenu.setForeground(java.awt.Color.white);
        StylistMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StylistMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_beard_50px.png"))); // NOI18N
        StylistMenu.setText("Stylist");
        StylistMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StylistMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StylistMenuMouseClicked(evt);
            }
        });

        BookingMenu.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BookingMenu.setForeground(java.awt.Color.white);
        BookingMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BookingMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_ticket_50px.png"))); // NOI18N
        BookingMenu.setText("Booking");
        BookingMenu.setToolTipText("");
        BookingMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BookingMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingMenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout SidePanelLayout = new javax.swing.GroupLayout(SidePanel);
        SidePanel.setLayout(SidePanelLayout);
        SidePanelLayout.setHorizontalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGroup(SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BookingMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Homemenu, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(HistoryMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TreatmentMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StylistMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        SidePanelLayout.setVerticalGroup(
            SidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Homemenu)
                .addGap(50, 50, 50)
                .addComponent(BookingMenu)
                .addGap(58, 58, 58)
                .addComponent(StylistMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(TreatmentMenu)
                .addGap(51, 51, 51)
                .addComponent(HistoryMenu)
                .addGap(56, 56, 56))
        );

        headerPanel.setBackground(new java.awt.Color(27, 26, 23));

        UserButton.setForeground(java.awt.Color.white);
        UserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_account_30px.png"))); // NOI18N
        UserButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_barbershop_100px.png"))); // NOI18N
        jLabel2.setText("BarberBross");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        LogOutButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogOutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Logout_50px.png"))); // NOI18N
        LogOutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LogOutButton)
                .addGap(18, 18, 18)
                .addComponent(UserButton)
                .addGap(27, 27, 27))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel2))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LogOutButton)
                            .addComponent(UserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(230, 213, 184));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select Time and Date!");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Name");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Date");

        txtDate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time");

        txtJam.setEditable(false);
        txtJam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtJam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJamActionPerformed(evt);
            }
        });

        buttonBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonBook.setText("Book Now");
        buttonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Stylist");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Treatment");

        cmbStylist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose your Stylist", "Jamal bin Isnaeni", "Komar bin Tamami" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Phone Number");

        timePicker1.setForeground(new java.awt.Color(0, 0, 0));
        timePicker1.setDisplayText(txtJam);

        cmbTreatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose the Treatment", "HairStyle", "Coloring", "Massage", "Creambath", "Bleaching" }));
        cmbTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTreatmentActionPerformed(evt);
            }
        });

        btnTreatment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTreatment.setText("Add");
        btnTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatmentActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Total Cost");

        txtTotalCost.setEditable(false);
        txtTotalCost.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCostActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)
                        .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(cmbStylist, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(55, 55, 55)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(txtJam, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTreatment, 0, 225, Short.MAX_VALUE)
                            .addComponent(btnTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(txtTotalCost))
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bayangan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJam, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(btnTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(buttonBook, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(cmbStylist, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(cmbTreatment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundPanelLayout = new javax.swing.GroupLayout(BackgroundPanel);
        BackgroundPanel.setLayout(BackgroundPanelLayout);
        BackgroundPanelLayout.setHorizontalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPanelLayout.createSequentialGroup()
                .addComponent(SidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BackgroundPanelLayout.setVerticalGroup(
            BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void HomemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomemenuMouseClicked
        // TODO add your handling code here:
        Home homePage = new Home();
        homePage.show();
        
        dispose();
    }//GEN-LAST:event_HomemenuMouseClicked

    private void HistoryMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryMenuMouseClicked
        // TODO add your handling code here:
        History historyPage = new History();
        historyPage.show();
        
        dispose();
    }//GEN-LAST:event_HistoryMenuMouseClicked

    private void StylistMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StylistMenuMouseClicked
        // TODO add your handling code here:
        InterfaceStylist stylistPage = new InterfaceStylist();
        stylistPage.show();
        
        dispose();
    }//GEN-LAST:event_StylistMenuMouseClicked

    private void TreatmentMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentMenuMouseClicked
        // TODO add your handling code here:
        Treatment treatmentPage = new Treatment();
        treatmentPage.show();
        
        dispose();
    }//GEN-LAST:event_TreatmentMenuMouseClicked

    private void LogOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutButtonMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "You've been log out!");
        
        Login loginPage = new Login();
        loginPage.show();
        
        dispose();
    }//GEN-LAST:event_LogOutButtonMouseClicked

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtJamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJamActionPerformed

    private void BookingMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingMenuMouseClicked

    private void buttonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookActionPerformed
        // TODO add your handling code here:
        try{
            con = Config.configDB();
            String sql = "INSERT INTO booking VALUES('"+txtNama.getText()+"','"+txtDate.getText()+"','"+txtJam.getText()+"','"+cmbStylist.getSelectedItem().toString()+"','"+txtTotalCost.getText()+"','"+txtPhoneNum.getText()+"')";
            st = con.createStatement();
            st.execute(sql);
            
            JOptionPane.showMessageDialog(null, "Your Booking in BarberBross has been successful!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        txtNama.setText("");
        txtPhoneNum.setText("");
        txtDate.setText("");
        txtJam.setText("");
        txtTotalCost.setText("");
    }//GEN-LAST:event_buttonBookActionPerformed

    private void txtPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumActionPerformed

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void cmbTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTreatmentActionPerformed
        // TODO add your handling code here:
        Treatment = (String) cmbTreatment.getSelectedItem();
      
        switch(Treatment) {
            case "Choose the Treatment":
            bayangan1.setText(String.valueOf(""));
            break;
            case "HairStyle":
            bayangan1.setText(String.valueOf("55000"));
            break;
            case "Coloring":
            bayangan1.setText(String.valueOf("75000"));
            break;
            case "Massage":
            bayangan1.setText(String.valueOf("10000"));
            break;
            case "Creambath":
            bayangan1.setText(String.valueOf("80000"));
            break;
            case "Bleaching":
            bayangan1.setText(String.valueOf("130000"));
            break;
        }
         
    }//GEN-LAST:event_cmbTreatmentActionPerformed

    private void btnTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatmentActionPerformed
        // TODO add your handling code here:
        int hargacost;
        int hargabayangan;
        
        if(txtTotalCost.getText().trim().isEmpty()){
          String abc =  bayangan1.getText();
          txtTotalCost.setText(abc);
        }else{
            hargabayangan = Integer.parseInt(bayangan1.getText());
            hargacost = Integer.parseInt(txtTotalCost.getText());
            String total = String.valueOf(hargabayangan + hargacost);
            txtTotalCost.setText(total);
        }
    }//GEN-LAST:event_btnTreatmentActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtTotalCost.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JLabel BookingMenu;
    private javax.swing.JLabel HistoryMenu;
    private javax.swing.JLabel Homemenu;
    private javax.swing.JLabel LogOutButton;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel StylistMenu;
    private javax.swing.JLabel TreatmentMenu;
    private javax.swing.JLabel UserButton;
    private javax.swing.JTextField bayangan1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnTreatment;
    private javax.swing.JButton buttonBook;
    private javax.swing.JComboBox<String> cmbStylist;
    private javax.swing.JComboBox<String> cmbTreatment;
    private com.raven.datechooser.DateChooser date;
    private javax.swing.JPanel headerPanel;
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
    private javax.swing.JPanel mainPanel;
    private com.raven.swing.TimePicker timePicker1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtJam;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtPhoneNum;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables
}
