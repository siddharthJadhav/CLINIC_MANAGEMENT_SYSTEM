/*
 * tabletreport.java
 *
 * Created on July 11, 2012, 9:26 AM
 */

package clinic;

import java.util.Vector;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author  Amir Sanas
 */
public class tabletreport extends javax.swing.JFrame {
           JTable jTable4;
      JScrollPane jScrollPane4; 
      String t1;
      Connection con;
    /** Creates new form tabletreport */
    public tabletreport(String rece) {
        initComponents();
        txtxer.setText(rece);
        txtxer.setVisible(false);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtxer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tablet Report");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnclose.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnclose.setText("Close");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24));
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("INFORMATION OF TABLET");

        txtxer.setName("txtxer"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(59, 59, 59)
                .add(txtxer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(178, 178, 178)
                .add(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(704, Short.MAX_VALUE)
                .add(btnclose, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(25, 25, 25)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(txtxer, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 22, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 564, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnclose, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
          int i; 
          ResultSet rs;
           String a=txtxer.getText();           
        Vector columnnames=new Vector();
          Vector data=new Vector();
       JPanel panel=new JPanel();
             try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:rock");
      }catch(Exception q)
      {
       JOptionPane.showMessageDialog(this,"database disconnected");

      }
       try{
    
         Statement st=con.createStatement();
         rs=st.executeQuery("select name as Name,price as Price,quantity as Quantity,convert(varchar(12),dates,106)as Expiry_Date from tablet where name like '%"+a+"%'");
        
//         else
//         {
//             rs=st.executeQuery("select name as Name,price as Price,quantity as Quantity,convert(varchar(12),dates,106)as Expiry_Date from tablet where dates < dateadd(m,+13,getdate())");
//         }    
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
        }catch(Exception e)
         {
         }

      jTable4=new JTable(data,columnnames);
      jScrollPane4=new JScrollPane(jTable4);
      jTable1.setCellEditor(jTable4.getCellEditor());
      jScrollPane1.setViewportView(jTable4);

      if(data.isEmpty()==true){
       JOptionPane.showMessageDialog(this,"there is no data available");
   
       }
        
        
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtxer;
    // End of variables declaration//GEN-END:variables
    
}
