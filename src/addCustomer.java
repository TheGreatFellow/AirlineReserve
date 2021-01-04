import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class addCustomer extends javax.swing.JInternalFrame {

    private PreparedStatement pst;

    /**
     * Creates new form addCustomer
     */
    public addCustomer() {
        initComponents();
        this.setBorder(null);
        BasicInternalFrameUI bi = (BasicInternalFrameUI) this.getUI();
        bi.setNorthPane(null);
        bi.setSouthPane(null);
        bi.setEastPane(null);
        bi.setWestPane(null);
        AutoID();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void AutoID() {
        try {
            conn cl = new conn();
            ResultSet rs = cl.s.executeQuery("select MAX(id) from customer");
            rs.next();
            rs.getString("MAX(id)");
            if (rs.getString("MAX(id)") == null)
                txtid.setText("CS001");
            else {
                long id = Long.parseLong(rs.getString("MAX(id)").substring(2, rs.getString("MAX(id)").length()));
                id++;
                txtid.setText("CS" + String.format("%03d", id));
            }
        } catch (SQLException e) {
            System.out.print("SQL Erro1");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassport = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdob = new com.toedter.calendar.JDateChooser();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        txtcontact = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(36, 29, 62));
        setPreferredSize(new java.awt.Dimension(1025, 650));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 85, 116));
        jLabel6.setText("Customer ID:");

        txtid.setBackground(new java.awt.Color(255, 255, 51));
        txtid.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        txtid.setForeground(new java.awt.Color(255, 255, 51));
        txtid.setText("CSXXX");

        jToggleButton1.setBackground(new java.awt.Color(36, 29, 62));
        jToggleButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(241, 85, 116));
        jToggleButton1.setText("Cancel");
        jToggleButton1.setToolTipText("");
        jToggleButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(241, 85, 116), 2, true));
        jToggleButton1.setFocusable(false);
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(241, 85, 116));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 85, 116));
        jLabel1.setText("FirstName");

        txtfirstname.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtfirstname.setForeground(new java.awt.Color(232, 168, 240));
        txtfirstname.setBorder(null);
        txtfirstname.setCaretColor(new java.awt.Color(182, 83, 125));
        txtfirstname.setMargin(new java.awt.Insets(2, 4, 2, 2));
        txtfirstname.setOpaque(false);
        txtfirstname.setPreferredSize(new java.awt.Dimension(67, 27));

        jSeparator1.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator1.setForeground(new java.awt.Color(238, 116, 162));

        jLabel2.setBackground(new java.awt.Color(241, 85, 116));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 85, 116));
        jLabel2.setText("Last Name");

        txtlastname.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtlastname.setForeground(new java.awt.Color(232, 168, 240));
        txtlastname.setBorder(null);
        txtlastname.setCaretColor(new java.awt.Color(182, 83, 125));
        txtlastname.setMargin(new java.awt.Insets(2, 4, 2, 2));
        txtlastname.setOpaque(false);
        txtlastname.setPreferredSize(new java.awt.Dimension(67, 27));

        jSeparator2.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator2.setForeground(new java.awt.Color(238, 116, 162));

        jLabel3.setBackground(new java.awt.Color(241, 85, 116));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 85, 116));
        jLabel3.setText("Aadhar No.");

        txtnic.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtnic.setForeground(new java.awt.Color(232, 168, 240));
        txtnic.setBorder(null);
        txtnic.setCaretColor(new java.awt.Color(182, 83, 125));
        txtnic.setMargin(new java.awt.Insets(2, 4, 2, 2));
        txtnic.setOpaque(false);
        txtnic.setPreferredSize(new java.awt.Dimension(67, 27));

        jLabel5.setBackground(new java.awt.Color(241, 85, 116));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 85, 116));
        jLabel5.setText("Address");

        jLabel4.setBackground(new java.awt.Color(241, 85, 116));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 85, 116));
        jLabel4.setText("Passport ID");

        txtpassport.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtpassport.setForeground(new java.awt.Color(232, 168, 240));
        txtpassport.setBorder(null);
        txtpassport.setCaretColor(new java.awt.Color(182, 83, 125));
        txtpassport.setMargin(new java.awt.Insets(2, 4, 2, 2));
        txtpassport.setOpaque(false);
        txtpassport.setPreferredSize(new java.awt.Dimension(67, 27));

        jLabel8.setBackground(new java.awt.Color(241, 85, 116));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(241, 85, 116));
        jLabel8.setText("Date Of Birth");

        txtdob.setBackground(new java.awt.Color(36, 29, 62));
        txtdob.setForeground(new java.awt.Color(36, 29, 62));
        txtdob.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtdob.setOpaque(false);

        r1.setBackground(new java.awt.Color(36, 29, 62));
        r1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        r1.setForeground(new java.awt.Color(204, 159, 153));
        r1.setText("Male");
        r1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        r2.setBackground(new java.awt.Color(36, 29, 62));
        r2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        r2.setForeground(new java.awt.Color(204, 159, 153));
        r2.setText("Female");

        txtcontact.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtcontact.setForeground(new java.awt.Color(232, 168, 240));
        txtcontact.setBorder(null);
        txtcontact.setCaretColor(new java.awt.Color(182, 83, 125));
        txtcontact.setMargin(new java.awt.Insets(2, 4, 2, 2));
        txtcontact.setOpaque(false);
        txtcontact.setPreferredSize(new java.awt.Dimension(60, 26));

        jLabel10.setBackground(new java.awt.Color(241, 85, 116));
        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 85, 116));
        jLabel10.setText("Contact");

        jLabel9.setBackground(new java.awt.Color(241, 85, 116));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(241, 85, 116));
        jLabel9.setText("Gender");

        jSeparator3.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator3.setForeground(new java.awt.Color(238, 116, 162));

        jSeparator4.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator4.setForeground(new java.awt.Color(238, 116, 162));

        jSeparator5.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator5.setForeground(new java.awt.Color(238, 116, 162));

        jToggleButton2.setBackground(new java.awt.Color(36, 29, 62));
        jToggleButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton2.setForeground(new java.awt.Color(241, 85, 116));
        jToggleButton2.setText("Submit");
        jToggleButton2.setToolTipText("");
        jToggleButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(241, 85, 116), 2, true));
        jToggleButton2.setFocusable(false);
        jToggleButton2.setOpaque(true);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtaddress.setBackground(new java.awt.Color(36, 29, 62));
        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtaddress.setForeground(new java.awt.Color(232, 168, 240));
        txtaddress.setLineWrap(true);
        txtaddress.setRows(5);
        txtaddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(238, 116, 162), 2, true));
        txtaddress.setCaretColor(new java.awt.Color(182, 83, 125));
        txtaddress.setMargin(new java.awt.Insets(2, 4, 2, 2));
        jScrollPane1.setViewportView(txtaddress);

        jSeparator6.setBackground(new java.awt.Color(238, 116, 162));
        jSeparator6.setForeground(new java.awt.Color(238, 116, 162));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtfirstname, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtnic, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator4).addComponent(jSeparator3)
                                                .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE, 172,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup().addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtid)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 321, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86).addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(r2))
                        .addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10).addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdob, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtcontact, javax.swing.GroupLayout.Alignment.LEADING,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addGap(154, 154, 154)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup().addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6).addComponent(txtid))
                                .addGap(29, 29, 29).addComponent(jLabel1).addGap(8, 8, 8)
                                .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup().addGap(2, 2, 2)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46).addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup().addGap(87, 87, 87)
                                                .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46).addComponent(jLabel3).addGap(8, 8, 8)
                                                .addComponent(txtnic, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46).addComponent(jLabel4).addGap(8, 8, 8)
                                                .addComponent(txtpassport, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2).addComponent(jSeparator4,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82))
                        .addGroup(layout.createSequentialGroup().addGap(71, 71, 71).addComponent(jLabel8)
                                .addGap(11, 11, 11)
                                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60).addComponent(jLabel9).addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                                        .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(64, 64, 64).addComponent(jLabel10).addGap(8, 8, 8)
                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46).addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)));

        setBounds(160, 12, 1025, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_r1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed

        this.hide();
        // TODO add your handling code here:
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        String id = txtid.getText();
        String firstname = txtfirstname.getText();
        String lastname = txtlastname.getText();
        String nic = txtnic.getText();
        String passport = txtpassport.getText();
        String address = txtaddress.getText();

        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(txtdob.getDate());
        String gender;
        if (r1.isSelected())
            gender = "male";
        else
            gender = "female";
        String contact = txtcontact.getText();

        try {
            conn cl = new conn();
            pst = cl.con.prepareStatement(
                    "insert into customer(id, firstname, lastname, nic, passport, address, dob, gender, contact)values(?,?,?,?,?,?,?,?,?)");

            pst.setString(1, id);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, nic);
            pst.setString(5, passport);
            pst.setString(6, address);
            pst.setString(7, date);
            pst.setString(8, gender);
            pst.setString(9, contact);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Registration Successful!");
            this.hide();

        } catch (SQLException e) {
            System.out.println("SQL Error2");
        }
    }// GEN-LAST:event_jToggleButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtcontact;
    private com.toedter.calendar.JDateChooser txtdob;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JLabel txtid;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtpassport;
    // End of variables declaration//GEN-END:variables
}
