/*
 * m2.java
 *
 * Created on July 9, 2012, 10:49 AM
 */

package clinic;
import javax.sql.*;
//import java.awt.event.ActionEvent;
//import java.util.Vector;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author  Amir Sanas
 */
public class tablet extends javax.swing.JFrame {
    int coutab=0;
    /** Creates new form m2 */
    public tablet() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbotablet = new javax.swing.JComboBox();
        txtquantity = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablet");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnok.setText("Ok");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Select Tablet & Its Quantity");

        cbotablet.setName("cbotablet"); // NOI18N

        txtquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquantityKeyReleased(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("TABLET");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(cbotablet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 176, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(txtquantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(73, 73, 73)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap(48, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel1)
                .addContainerGap(54, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(34, 34, 34)
                .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(jLabel2)
                .add(15, 15, 15)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cbotablet, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtquantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnback, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
//      try
//         {
//          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
//          Connection con=DriverManager.getConnection("jdbc:odbc:rock");
//          Statement st=con.createStatement();
//          ResultSet rs1=st.executeQuery("select count(name) from tablet");
//        while(rs1.next())
//        {
//           coutab=rs1.getInt(1); 
//           if(coutab>0)
//            {    
//             ResultSet rs=st.executeQuery("select name from tablet");
//             while(rs.next())
//              {
//               String tname=rs.getString("name");
//               cbotablet.addItem(tname);
//              }
//             st.close();
//             con.close();
//            }
//           else
//           {
//             JOptionPane.showMessageDialog(this,"Tablet detail not exist","Tablet",JOptionPane.ERROR_MESSAGE);  
//           }
//         } 
//        }
//          catch(Exception e)
//         {
//          JOptionPane.showMessageDialog(this,"error"+e);
//          }
//        
    }//GEN-LAST:event_formWindowOpened

    private void txtquantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquantityKeyReleased
// TODO add your handling code here:
             String s=txtquantity.getText();
        if(!(s.equals("")))
        {
         int a=s.length()-1;
         int i=(int)s.charAt(a);
         if(!(i>47&&i<58))
        {
            JOptionPane.showMessageDialog(this,"Enter only number","Warning",JOptionPane.WARNING_MESSAGE);
            txtquantity.setText("");

         }

       
       }
    }//GEN-LAST:event_txtquantityKeyReleased

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
// TODO add your handling code here:
         String s=(String)cbotablet.getSelectedItem();
         int quantity=0;
        String abc=txtquantity.getText();
        
          
         if(!(abc.equals("")))
         {  
              try
                {  
                  int p=Integer.parseInt(txtquantity.getText());
                   String q=s+"__"+p+" "; 
                 
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                   Connection con=DriverManager.getConnection("jdbc:odbc:rock");
                   Statement st=con.createStatement();
                   ResultSet rs=st.executeQuery("select quantity from tablet where name='"+s+"'");
                   while(rs.next())
                    {
                         quantity=rs.getInt("quantity");
          
                     }
              
                   int j=quantity-p;
                 if(j>0)
                 {
                    
                       int m=st.executeUpdate("insert into refer values('"+q+"')");
                       int k=st.executeUpdate(" update tablet set quantity="+j+" where name='"+s+"'");
                //  JOptionPane.showMessageDialog(this,"tablet "+s+" selected");
                  txtquantity.setText("");
                 }
                 else
                 {
                  JOptionPane.showMessageDialog(this,"tablet are not available in the stock");
                 }
                  st.close();
                  con.close();
                }
          catch(Exception e)
               {
                   JOptionPane.showMessageDialog(this,"error"+e);
               }  
         }
         else
          {
             JOptionPane.showMessageDialog(this,"Please enter quantity");
         }    
    }//GEN-LAST:event_btnokActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
       int co=0;
        try
        {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("jdbc:odbc:rock");
          Statement st=con.createStatement();
          ResultSet rs1=st.executeQuery("select count(name) from tablet");
          while(rs1.next())
          {
            coutab=rs1.getInt(1); 
          } 
          if(coutab>0)
          {
           ResultSet rs=st.executeQuery("select name from tablet");
           while(rs.next())
              {
                
                String tname=rs.getString(1);
                int len=tname.length();
                for(co=0;co<len;co++)
                {
                  int ab=tname.charAt(co);  
                  if(ab>47&&ab<58)
                  {
                     
                  }    
                }    
                cbotablet.addItem(tname);
               
              }
            }
           else
           {
             JOptionPane.showMessageDialog(this,"Tablet detail not exist","Tablet",JOptionPane.ERROR_MESSAGE);  
             this.dispose();
           }
          
             st.close();
             con.close();
        }
         catch(SQLException sq)
         {
             JOptionPane.showMessageDialog(this,"error1");
         }       
     
          catch(Exception e)
         {
          JOptionPane.showMessageDialog(this,"error");
          }
        
    }//GEN-LAST:event_formWindowActivated
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablet().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnok;
    public javax.swing.JComboBox cbotablet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
    
}
