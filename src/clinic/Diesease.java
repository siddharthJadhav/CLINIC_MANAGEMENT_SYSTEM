/*
 * diesease1.java
 *
 * Created on July 9, 2012, 8:48 AM
 */

package clinic;

import java.util.Vector;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author  Amir Sanas
 */
public class Diesease extends javax.swing.JFrame {
       JTable jTable4;
      JScrollPane jScrollPane4; 
      String t1;
      Connection con;
    /** Creates new form diesease1 */
    public Diesease() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnok = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbldisease = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Diesease");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jLabel1.setText("Enter Name of Disease");

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14));
        txtname.setName("txtname"); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnok.setText("Ok");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Diesease"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("DISEASE");

        lbldisease.setFont(new java.awt.Font("Times New Roman", 0, 14));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(layout.createSequentialGroup()
                                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(14, 14, 14)
                                .add(txtname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 149, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(34, 34, 34)
                        .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 11, Short.MAX_VALUE)
                        .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, lbldisease, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel2)
                .add(38, 38, 38)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(txtname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(lbldisease, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 357, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
       int i;
        Vector columnnames=new Vector();
          Vector data=new Vector();
       JPanel panel=new JPanel();
             try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:rock");
         Statement st=con.createStatement();
           
         ResultSet rs=st.executeQuery("select name as Name_Of_Diesease from diesease");
         
         ResultSetMetaData md=rs.getMetaData();
         int columns=md.getColumnCount();
         for(i=1;i<=columns;i++)
          {
             columnnames.addElement(md.getColumnName(i));
          }
         while(rs.next())
          {
           Vector row=new Vector(columns);
           for(i=1;i<=columns;i++)
             {
              row.addElement(rs.getObject(i));
             }
           data.addElement(row);
          }
         
         
      

      jTable4=new JTable(data,columnnames);
      jScrollPane4=new JScrollPane(jTable4);
      jTable1.setCellEditor(jTable4.getCellEditor());
      jScrollPane1.setViewportView(jTable4);

      if(data.isEmpty()==true){
       JOptionPane.showMessageDialog(this,"diesease name not available ","Diesease",JOptionPane.ERROR_MESSAGE);
       txtname.setText("");
       this.dispose();
       }  
         st.close();
        con.close();
        }
         catch(SQLException sq)
         {
            JOptionPane.showMessageDialog(this,"Database Error ","Diesease",JOptionPane.ERROR_MESSAGE);
            this.dispose();
         }        
         catch(Exception e)
         {
         }
    }//GEN-LAST:event_formWindowActivated

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
// TODO add your handling code here:
           
  
      
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
// TODO add your handling code here:
     String s="";
    int i=jTable4.getSelectedRow();
    int j=jTable4.getSelectedColumn(); 
    if(i < 0 && j < 0)
     {
      JOptionPane.showMessageDialog(this,"No Record Selected");
     }
    else
     {
      Object o=jTable4.getValueAt(i,0);
      s=o.toString();
      try
       {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          con=DriverManager.getConnection("jdbc:odbc:rock");
          Statement st=con.createStatement();
          int v=st.executeUpdate("insert into refer values('"+s+"')");
          lbldisease.setText(""+s+" Selected");
          txtname.setText("");
          st.close();
         con.close();
       }
        catch(SQLException sq)
        {
         JOptionPane.showMessageDialog(this,"Database Error","Refer",JOptionPane.ERROR_MESSAGE);   
        }        
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(this,"Database Error","Refer",JOptionPane.ERROR_MESSAGE);   
        } 
    } 
   
    //txtname.setText("");
        
    }//GEN-LAST:event_btnokActionPerformed

    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
// TODO add your handling code here:
        
                int i;       
               t1=txtname.getText();
                        
        Vector columnnames=new Vector();
          Vector data=new Vector();
       JPanel panel=new JPanel();
             try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:rock");
   
    
         Statement st=con.createStatement();
           
         ResultSet rs=st.executeQuery("select name as Name_of_Disease from diesease where name like '"+t1+"%'");
         
         ResultSetMetaData md=rs.getMetaData();
         int columns=md.getColumnCount();
         for(i=1;i<=columns;i++)
          {
             columnnames.addElement(md.getColumnName(i));
          }
         while(rs.next())
          {
           Vector row=new Vector(columns);
           for(i=1;i<=columns;i++)
             {
              row.addElement(rs.getObject(i));
             }
           data.addElement(row);
          }
         
         
         st.close();
        con.close();
        }
           catch(SQLException sq)
         {
              JOptionPane.showMessageDialog(this,"Database Error","Diesease",JOptionPane.ERROR_MESSAGE);   
            
         }
         catch(Exception e)
         {
         }

      jTable4=new JTable(data,columnnames);
      jScrollPane4=new JScrollPane(jTable4);
      jTable1.setCellEditor(jTable4.getCellEditor());
      jScrollPane1.setViewportView(jTable4);

      if(data.isEmpty()==true){
       JOptionPane.showMessageDialog(this,"there is no data available");
       txtname.setText("");
       
       }
        
    }//GEN-LAST:event_txtnameKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        

        
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diesease().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbldisease;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
    
}
