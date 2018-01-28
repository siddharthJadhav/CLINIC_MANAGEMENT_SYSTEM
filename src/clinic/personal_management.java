/*
 * personal_management.java
 *
 * Created on July 19, 2012, 11:08 AM
 */

package clinic;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author  amir
 */
public class personal_management extends javax.swing.JFrame {
      Connection con;
    Statement st;
    ResultSet rs;
    String med="medicine",notequal="!=";
     int coumem=0;
    /** Creates new form personal_management */
    public personal_management() {
        initComponents();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        optentry = new javax.swing.JRadioButton();
        optnew = new javax.swing.JRadioButton();
        pnlentry = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbomember = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtmoney = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        pnlnew = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnew = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnbback = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Personal Management");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        optentry.setFont(new java.awt.Font("Times New Roman", 0, 14));
        optentry.setText("Entry");
        optentry.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        optentry.setMargin(new java.awt.Insets(0, 0, 0, 0));
        optentry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optentryActionPerformed(evt);
            }
        });

        optnew.setFont(new java.awt.Font("Times New Roman", 0, 14));
        optnew.setText("New");
        optnew.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        optnew.setMargin(new java.awt.Insets(0, 0, 0, 0));
        optnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optnewActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(80, 80, 80)
                .add(optentry)
                .add(65, 65, 65)
                .add(optnew)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(optnew)
                    .add(optentry))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlentry.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel1.setText("Give To");

        cbomember.setFont(new java.awt.Font("Times New Roman", 0, 14));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel2.setText("Money");

        txtmoney.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtmoney.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmoneyKeyReleased(evt);
            }
        });

        btnsave.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlentryLayout = new org.jdesktop.layout.GroupLayout(pnlentry);
        pnlentry.setLayout(pnlentryLayout);
        pnlentryLayout.setHorizontalGroup(
            pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlentryLayout.createSequentialGroup()
                .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlentryLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(jLabel1))
                        .add(17, 17, 17)
                        .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txtmoney, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 87, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cbomember, 0, 273, Short.MAX_VALUE)))
                    .add(pnlentryLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(btnsave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(73, 73, 73)
                        .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlentryLayout.setVerticalGroup(
            pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlentryLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbomember, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .add(42, 42, 42)
                .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtmoney, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(pnlentryLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnsave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(23, 23, 23))
        );

        pnlnew.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel3.setText("New Entry");

        txtnew.setFont(new java.awt.Font("Times New Roman", 0, 14));

        btnok.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnok.setText("Ok");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnbback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnbback.setText("Back");
        btnbback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbbackActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlnewLayout = new org.jdesktop.layout.GroupLayout(pnlnew);
        pnlnew.setLayout(pnlnewLayout);
        pnlnewLayout.setHorizontalGroup(
            pnlnewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlnewLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(pnlnewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(pnlnewLayout.createSequentialGroup()
                        .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(77, 77, 77)
                        .add(btnbback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlnewLayout.createSequentialGroup()
                        .add(jLabel3)
                        .add(13, 13, 13)
                        .add(txtnew, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlnewLayout.setVerticalGroup(
            pnlnewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlnewLayout.createSequentialGroup()
                .add(26, 26, 26)
                .add(pnlnewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(txtnew, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(43, 43, 43)
                .add(pnlnewLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnbback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 24));
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("PERSONAL MANAGEMENT");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(jLabel4))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(pnlentry, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(pnlnew, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(24, 24, 24)
                .add(jLabel4)
                .add(18, 18, 18)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlentry, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlnew, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtmoneyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmoneyKeyReleased
// TODO add your handling code here:
             String s=txtmoney.getText();
        if(!(s.equals("")))
        {
         int a=s.length()-1;
         int i=(int)s.charAt(a);
         if(!(i>47&&i<58))
        {
            JOptionPane.showMessageDialog(this,"Enter only number","Warning",JOptionPane.WARNING_MESSAGE);
            txtmoney.setText("");

         }

       
       }
    }//GEN-LAST:event_txtmoneyKeyReleased

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
// TODO add your handling code here:
        String s=txtnew.getText();
        int coumem1=0;
         if(s.equals(""))
         {
            JOptionPane.showMessageDialog(this,"Please enter member name");
         } 
         else
         {       
     try
      {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:rock");
       st=con.createStatement();
       ResultSet rs1=st.executeQuery("select count(member) from personal where member = '"+s+"'");
       while(rs1.next())
       {
         coumem1=rs1.getInt(1); 
       }
       if(coumem1>0)
       {
         JOptionPane.showMessageDialog(this,""+s+" is already available ","Error",JOptionPane.ERROR_MESSAGE); 
         
       }
       else
       {    
        int k=st.executeUpdate("insert into personal values(convert(varchar(12),getdate(),106),'"+s+"',0)");  
        
        JOptionPane.showMessageDialog(this,""+s+" member is added");
       } 
        st.close();
        con.close();
     }
         catch(SQLException sq)
         {
            JOptionPane.showMessageDialog(this,"Database Disconnected","Personal",JOptionPane.ERROR_MESSAGE);
         }       
            catch(Exception e) 
            {
             JOptionPane.showMessageDialog(this,"error occur"+e);
            } 
       txtnew.setText("");
         } 
    }//GEN-LAST:event_btnokActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
// TODO add your handling code here:
    String s,p;
    s=(String)cbomember.getSelectedItem();
    p=txtmoney.getText();
    
    if(!(p.equals("")))
    {  
     
     int a=Integer.parseInt(p); 
     try
      {
       Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
       con=DriverManager.getConnection("jdbc:odbc:rock");
       st=con.createStatement();
      
        int k=st.executeUpdate("update personal set dates=convert(varchar(12),getdate(),106),amount="+a+" where member='"+s+"'");       
        JOptionPane.showMessageDialog(this,"You Pay "+a+" Rupees For "+s);
      
       st.close();
       con.close();
      }
     catch(SQLException sq)
         {
            JOptionPane.showMessageDialog(this,"Database Disconnected","Personal",JOptionPane.ERROR_MESSAGE);
         
         }       
            catch(Exception e) 
            {
             JOptionPane.showMessageDialog(this,"error occur"+e);
            }
     } 
    
    else
    {
        JOptionPane.showMessageDialog(this,"Please Enter Amount");
    }    
     txtmoney.setText("");
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnbbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbbackActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnbbackActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void optnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optnewActionPerformed
// TODO add your handling code here:
 
        pnlnew.setVisible(true);
        optnew.setSelected(true);
        optentry.setSelected(false);
        pnlentry.setVisible(false);
    }//GEN-LAST:event_optnewActionPerformed

    private void optentryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optentryActionPerformed
// TODO add your handling code here:
       
        pnlnew.setVisible(false);
        optnew.setSelected(false);
        optentry.setSelected(true);
        pnlentry.setVisible(true);
        cbomember.removeAllItems();
        try
         {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          con=DriverManager.getConnection("jdbc:odbc:rock");
          st=con.createStatement();                                     
          ResultSet rs2=st.executeQuery("select count(member) from personal where member "+notequal+" '"+med+"'");
          while(rs2.next())
          {
              coumem=rs2.getInt(1);
          }
          if(coumem>0)
          {    
           ResultSet rs1=st.executeQuery("select member from personal where member "+notequal+" '"+med+"'");
           while(rs1.next())
           {
             String tname=rs1.getString(1);
             cbomember.addItem(tname);
            
           }
          } 
          else
          {
             JOptionPane.showMessageDialog(this,"Member not available");
             pnlnew.setVisible(true);
        optnew.setSelected(true);
        optentry.setSelected(false);
        pnlentry.setVisible(false);
          }
              
          st.close();
          con.close();
         }
         catch(SQLException sq)
         {
            JOptionPane.showMessageDialog(this,"Database Disconnected","Personal",JOptionPane.ERROR_MESSAGE);
          
         }       
            catch(Exception e) 
            {
             JOptionPane.showMessageDialog(this,"error occur"+e);
            }
    }//GEN-LAST:event_optentryActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
      
        pnlnew.setVisible(false);
        optnew.setSelected(false);
        optentry.setSelected(true);
        pnlentry.setVisible(true);
        cbomember.removeAllItems();
        try{
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   con=DriverManager.getConnection("jdbc:odbc:rock");
                   st=con.createStatement();                     
            ResultSet rs2=st.executeQuery("select count(member) from personal where member "+notequal+" '"+med+"'");
          while(rs2.next())
          {
              coumem=rs2.getInt(1);
          }
          if(coumem>0)
          {    
           ResultSet rs1=st.executeQuery("select member from personal where member "+notequal+" '"+med+"'");
           while(rs1.next())
           {
             String tname=rs1.getString(1);
             cbomember.addItem(tname);
            
           }
          } 
          else
          {
             JOptionPane.showMessageDialog(this,"Member not available");
             pnlnew.setVisible(true);
        optnew.setSelected(true);
        optentry.setSelected(false);
        pnlentry.setVisible(false);
          }
         st.close();
        con.close();
        }
        catch(SQLException sq)
         {
            JOptionPane.showMessageDialog(this,"Database Disconnected","Personal",JOptionPane.ERROR_MESSAGE);
            this.dispose(); 
        }       
            catch(Exception e) 
            {
             JOptionPane.showMessageDialog(this,"error occur"+e);
             
            }
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personal_management().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbback;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cbomember;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton optentry;
    private javax.swing.JRadioButton optnew;
    private javax.swing.JPanel pnlentry;
    private javax.swing.JPanel pnlnew;
    private javax.swing.JTextField txtmoney;
    private javax.swing.JTextField txtnew;
    // End of variables declaration//GEN-END:variables
    
}
