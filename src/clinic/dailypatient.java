/*
 * dailypatient.java
 *
 * Created on March 8, 2012, 6:24 PM
 */
package clinic;

import java.util.Vector;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author  Administrator
 */
public class dailypatient extends javax.swing.JFrame {
        JTable jTable4;
    JScrollPane jScrollPane4; 
    String t1,t2,t3,t4;
      Connection con;
    /** Creates new form dailypatient */
    public dailypatient(String name,String stdate,String endate) {
        initComponents();
        lblname.setText(name); 
        lblstdate.setText(stdate);
        lblendate.setText(endate); 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrpane = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        lblstdate = new javax.swing.JLabel();
        lblendate = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbldiesease = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblhead = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Report");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        scrpane.setName("scrpane"); // NOI18N

        table1.setModel(new javax.swing.table.DefaultTableModel(
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
        table1.setName("table1"); // NOI18N
        scrpane.setViewportView(table1);

        lblstdate.setText("jLabel1");
        lblstdate.setName("lblstdate"); // NOI18N

        lblendate.setText("jLabel2");
        lblendate.setName("lblendate"); // NOI18N

        lblname.setText("jLabel1");
        lblname.setName("lblname"); // NOI18N

        lbldiesease.setName("lbldiesease"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel3.setText("REPORT GENERATION OF");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblhead.setFont(new java.awt.Font("Times New Roman", 1, 24));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(501, 501, 501)
                .add(lbldiesease)
                .addContainerGap(501, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(scrpane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(742, Short.MAX_VALUE)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 217, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(43, 43, 43))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(221, 221, 221)
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lblhead, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(711, Short.MAX_VALUE)
                        .add(lblstdate)
                        .add(70, 70, 70)
                        .add(lblendate)))
                .add(79, 79, 79)
                .add(lblname)
                .add(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblhead, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblstdate)
                    .add(lblendate)
                    .add(lblname))
                .add(10, 10, 10)
                .add(scrpane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 548, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(lbldiesease)
                .add(18, 18, 18)
                .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .add(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
           lblname.setVisible(false);
//           jLabel1.setVisible(false);
//           lblstdate.setVisible(false);
//           jLabel2.setVisible(false);
//           lblendate.setVisible(false);
           lblname.setVisible(false);
        
          int i;
          String stda,enda;
          stda= lblstdate.getText();
           enda=lblendate.getText();
           String name=lblname.getText();
           String stdate=stda+" "+"01am";
           String endate=enda+" "+"11pm";
           Vector columnnames=new Vector();
           Vector data=new Vector();
             ResultSet rs;
             try
       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         con=DriverManager.getConnection("jdbc:odbc:rock");
         Statement st=con.createStatement();
         if(name.equals("Daily Patient"))
         {
                 lblhead.setText("DAILY PATIENTS");
          rs=st.executeQuery("select fname,code,gender,age,address from register where code in (select code from treatement where dates between '"+stdate+"' and '"+endate+"')");
         }
         else
         {
                lblhead.setText("DISEASE");
         rs=st.executeQuery("select fname,code,gender,age,address from register where code in (select code from treatement where diesease like '%"+name+"%' and dates between '"+stdate+"' and '"+endate+"')");  
//         lbldiesease.setText(name);
         }
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
              JOptionPane.showMessageDialog(this,"Database Error","Register",JOptionPane.ERROR_MESSAGE);   
              this.dispose(); 
         } 
         catch(Exception e)
         {
         }

      jTable4=new JTable(data,columnnames);
      jScrollPane4=new JScrollPane(jTable4);
      table1.setCellEditor(jTable4.getCellEditor());
      scrpane.setViewportView(jTable4);

      if(data.isEmpty()==true){
       JOptionPane.showMessageDialog(this,"there is no data available");
       this.dispose();
       }
    }//GEN-LAST:event_formWindowOpened
    
    /**
     * @param args the command line arguments
     */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbldiesease;
    private javax.swing.JLabel lblendate;
    private javax.swing.JLabel lblhead;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblstdate;
    private javax.swing.JScrollPane scrpane;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
    
}
