/*
 * preview.java
 *
 * Created on January 29, 2012, 12:42 PM
 */

package clinic;

//import java.awt.event.ActionEvent;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author  Administrator
 */
public class preview extends javax.swing.JFrame {

       /** Creates new form preview */
    public preview(String a,String b,String c,String d,int e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String yea) {
        initComponents();
       lblyear.setVisible(false);
       txtfname.setText(a);
       txtmname.setText(b);
       txtlname.setText(c);
       txtdob.setText(d);  
       txtage.setText(""+e);
       txtgender.setText(f);
       txtoccupation.setText(g);
       txtaddress.setText(h);
       txtcontact.setText(i);
       txtmail.setText(j);
       txtcode.setText(k);
       txtallergy.setText(l);
       txtreference.setText(m);
       txtrelation.setText(n);
       lblyear.setText(yea);
       }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtmname = new javax.swing.JTextField();
        lbldob = new javax.swing.JLabel();
        txtdob = new javax.swing.JTextField();
        lblage = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        txtoccupation = new javax.swing.JTextField();
        lbloccupation = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        lblgender = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtcontact = new javax.swing.JTextField();
        lblcontact = new javax.swing.JLabel();
        lblcode = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtallergy = new javax.swing.JTextField();
        lblallergy = new javax.swing.JLabel();
        btnconfirm = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        txtreference = new javax.swing.JTextField();
        txtmail = new javax.swing.JTextField();
        lblmail = new javax.swing.JLabel();
        lblreference = new javax.swing.JLabel();
        lblrelation = new javax.swing.JLabel();
        txtrelation = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Preview");
        setResizable(false);

        lblname.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblname.setForeground(new java.awt.Color(51, 51, 51));
        lblname.setText("Name Of Patient");
        lblname.setName("lblname"); // NOI18N

        txtlname.setEditable(false);
        txtlname.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtlname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtlname.setName("txtlname"); // NOI18N

        txtfname.setEditable(false);
        txtfname.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtfname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtfname.setName("txtfname"); // NOI18N

        txtmname.setEditable(false);
        txtmname.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtmname.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtmname.setName("txtmname"); // NOI18N

        lbldob.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lbldob.setForeground(new java.awt.Color(51, 51, 51));
        lbldob.setText("Date Of Birth");
        lbldob.setName("lbldobl"); // NOI18N

        txtdob.setEditable(false);
        txtdob.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtdob.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtdob.setName("txtdob"); // NOI18N

        lblage.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblage.setForeground(new java.awt.Color(51, 51, 51));
        lblage.setText("Age");
        lblage.setName("lblage"); // NOI18N

        txtage.setEditable(false);
        txtage.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtage.setName("txtage"); // NOI18N

        txtoccupation.setEditable(false);
        txtoccupation.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtoccupation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtoccupation.setName("txtoccupaion"); // NOI18N

        lbloccupation.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lbloccupation.setForeground(new java.awt.Color(51, 51, 51));
        lbloccupation.setText("Occupation");
        lbloccupation.setName("lbloccupation"); // NOI18N

        txtgender.setEditable(false);
        txtgender.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtgender.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtgender.setName("txtgender"); // NOI18N

        lblgender.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblgender.setForeground(new java.awt.Color(51, 51, 51));
        lblgender.setText("Gender");
        lblgender.setName("lblgender"); // NOI18N

        lbladdress.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lbladdress.setForeground(new java.awt.Color(51, 51, 51));
        lbladdress.setText("Address");
        lbladdress.setName("lbladdress"); // NOI18N

        txtaddress.setColumns(1);
        txtaddress.setEditable(false);
        txtaddress.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtaddress.setLineWrap(true);
        txtaddress.setRows(5);
        txtaddress.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtaddress.setName("txtaddress"); // NOI18N
        jScrollPane1.setViewportView(txtaddress);

        txtcontact.setEditable(false);
        txtcontact.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtcontact.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtcontact.setName("txtcontact"); // NOI18N

        lblcontact.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblcontact.setForeground(new java.awt.Color(51, 51, 51));
        lblcontact.setText("Contact No");
        lblcontact.setName("lblcontact"); // NOI18N

        lblcode.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblcode.setForeground(new java.awt.Color(51, 51, 51));
        lblcode.setText("Code");
        lblcode.setName("lblcode"); // NOI18N

        txtcode.setEditable(false);
        txtcode.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtcode.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtcode.setName("txtcode"); // NOI18N

        txtallergy.setEditable(false);
        txtallergy.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtallergy.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtallergy.setName("txtallergy"); // NOI18N

        lblallergy.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblallergy.setForeground(new java.awt.Color(51, 51, 51));
        lblallergy.setText("Allergy");
        lblallergy.setName("lblallergy"); // NOI18N

        btnconfirm.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnconfirm.setText("Confirm");
        btnconfirm.setName("btnconfirm"); // NOI18N
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnback.setText("Back");
        btnback.setName("btnback"); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        txtreference.setEditable(false);
        txtreference.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtreference.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtreference.setName("txtreference"); // NOI18N

        txtmail.setEditable(false);
        txtmail.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtmail.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtmail.setName("txtmail"); // NOI18N

        lblmail.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblmail.setForeground(new java.awt.Color(51, 51, 51));
        lblmail.setText("E-Mail");
        lblmail.setName("lblmail"); // NOI18N

        lblreference.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblreference.setForeground(new java.awt.Color(51, 51, 51));
        lblreference.setText("Reference");
        lblreference.setName("lblreference"); // NOI18N

        lblrelation.setFont(new java.awt.Font("Times New Roman", 0, 14));
        lblrelation.setForeground(new java.awt.Color(51, 51, 51));
        lblrelation.setText("Relation");
        lblrelation.setName("lblrelation"); // NOI18N

        txtrelation.setEditable(false);
        txtrelation.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtrelation.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtrelation.setName("txtrelation"); // NOI18N

        lblyear.setName("lblyear"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(124, 124, 124)
                .add(btnconfirm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 102, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(89, 89, 89)
                .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lbladdress)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lblname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lbldob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblgender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 62, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(27, 27, 27)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(txtlname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(29, 29, 29)
                                        .add(txtfname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(txtgender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtdob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 108, Short.MAX_VALUE)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(lbloccupation)
                                            .add(lblage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(lblcontact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(lblmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(lblrelation))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(txtrelation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 167, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtoccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtcontact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 197, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 244, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(txtmname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))))
                        .add(562, 562, 562)
                        .add(lblyear)
                        .addContainerGap())
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(lblallergy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(14, 14, 14)
                                .add(txtcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lblreference)
                                .add(31, 31, 31)
                                .add(txtreference, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txtallergy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 409, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(815, 815, 815))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtlname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtfname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtmname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(55, 55, 55)
                        .add(lblyear)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtdob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lbldob, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(30, 30, 30)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtgender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblgender, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(55, 55, 55)
                                        .add(lbladdress, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jPanel1Layout.createSequentialGroup()
                                        .add(45, 45, 45)
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 40, Short.MAX_VALUE)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lblage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(30, 30, 30)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(lbloccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtoccupation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(31, 31, 31)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lblcontact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtcontact, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(42, 42, 42)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lblmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtmail, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(22, 22, 22)))
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(txtreference, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblreference, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lblcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(txtcode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(37, 37, 37)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lblrelation)
                                    .add(txtrelation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(2, 2, 2)))
                        .add(43, 43, 43)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lblallergy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(txtallergy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(21, 21, 21)))
                .add(5, 5, 5)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnconfirm, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("PREVIEW");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(288, 288, 288)
                        .add(jLabel1))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 783, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 17, Short.MAX_VALUE)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
// TODO add your handling code here:
       
 
      this.dispose();
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
       // TODO add your handling code here:
           int a=0;
        
        String s1,s2,s3,s4,s6,s7,s8,s9,s10,s11,s12,s13,s14,i2,s15,s16;
       int  i1,ag=0,trage=0,years=0;      
       s1=txtfname.getText();
       s2=txtmname.getText();
       s3=txtlname.getText();
       s15=s1+" "+s2+" "+s3;
       s4=txtdob.getText();
       s6=txtgender.getText();
      
       i1=Integer.parseInt(txtage.getText());
      
       s7=txtoccupation.getText();
       s8=txtaddress.getText();
       i2=txtcontact.getText();
       s9=txtmail.getText();
       s10=txtcode.getText();
       s12=txtallergy.getText();
       s11=txtreference.getText();
       s16=txtrelation.getText();
       ag=12*i1;
       years=Integer.parseInt(lblyear.getText());
      try
      {

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con=DriverManager.getConnection("jdbc:odbc:rock");
        Statement st=con.createStatement();
     
        ResultSet rs=st.executeQuery("Select year(dateadd(m,-"+ag+",getdate()))");
     
        while(rs.next())
        {
         trage=rs.getInt(1);
         
        }
         if(trage==years)
         {  
           a=st.executeUpdate("insert into register values(getDate(),'"+s1+"','"+s2+"','"+s3+"','"+s4+"',"+i1+",'"+s6+"','"+s7+"','"+s8+"','"+i2+"','"+s9+"','"+s10+"','"+s11+"','"+s16+"','"+s12+"')");
         }
         else
         {
           String years1=""+trage; 
           a=st.executeUpdate("insert into register values(getDate(),'"+s1+"','"+s2+"','"+s3+"','"+years1+"',"+i1+",'"+s6+"','"+s7+"','"+s8+"','"+i2+"','"+s9+"','"+s10+"','"+s11+"','"+s16+"','"+s12+"')");             
         }
            
          if(a>0)
           {
              
              
             card c= new card(s10,s15,s6,s12,i1);
             c.setVisible(true);
         
            this.dispose();
    
          
         
             
           }

         st.close();
         con.close();

     
      }
       catch(SQLException sq)
       {
          JOptionPane.showMessageDialog(this,"Database Error","Register",JOptionPane.ERROR_MESSAGE);   
       } 
              
       catch(Exception e)
       {
          JOptionPane.showMessageDialog(this,"Error Occur");   
       }


    }//GEN-LAST:event_btnconfirmActionPerformed
      /**
     * @param args the command line arguments
     */  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    public javax.swing.JButton btnconfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblage;
    private javax.swing.JLabel lblallergy;
    private javax.swing.JLabel lblcode;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lbldob;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblmail;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbloccupation;
    private javax.swing.JLabel lblreference;
    private javax.swing.JLabel lblrelation;
    private javax.swing.JLabel lblyear;
    public javax.swing.JTextArea txtaddress;
    public javax.swing.JTextField txtage;
    public javax.swing.JTextField txtallergy;
    public javax.swing.JTextField txtcode;
    public javax.swing.JTextField txtcontact;
    public javax.swing.JTextField txtdob;
    public javax.swing.JTextField txtfname;
    public javax.swing.JTextField txtgender;
    public javax.swing.JTextField txtlname;
    public javax.swing.JTextField txtmail;
    public javax.swing.JTextField txtmname;
    public javax.swing.JTextField txtoccupation;
    public javax.swing.JTextField txtreference;
    private javax.swing.JTextField txtrelation;
    // End of variables declaration//GEN-END:variables
    
}