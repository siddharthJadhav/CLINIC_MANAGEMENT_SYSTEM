/*
 * account_report.java
 *
 * Created on April 24, 2012, 12:30 PM
 */

package clinic;
import javax.swing.*;
//import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.Vector;
//import javax.swing.table.TableModel;

/**
 *
 * @author  Administrator
 */
public class account_report extends javax.swing.JFrame {
      int year=0;
    /** Creates new form account_report */
    public account_report(String a,String b,String m,String y) {
        initComponents();
        lblname.setText(a);
        lbldate.setText(b);
        txtmonth.setText(m);
        lblyear.setText(y);
        String t=lbldate.getText();
        String s=lblname.getText();
        String mo=txtmonth.getText();
        String ye=lblyear.getText();
        txtmonth.setVisible(false);
        lblyear.setVisible(false);
    }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lbltotal1 = new javax.swing.JLabel();
        lblamount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNetBalance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblCredit = new javax.swing.JLabel();
        txtmonth = new javax.swing.JTextField();
        lblyear = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Account Report");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setForeground(new java.awt.Color(252, 59, 117));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Account Report Generation Of");

        lblname.setFont(new java.awt.Font("Times New Roman", 1, 24));
        lblname.setForeground(new java.awt.Color(0, 102, 51));

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(235, 235, 235)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 188, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblname, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        btnback.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnback.setForeground(new java.awt.Color(0, 102, 0));
        btnback.setText("Close");
        btnback.setName("btnback"); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        lbldate.setName("lbldate"); // NOI18N

        lbltotal1.setFont(new java.awt.Font("Times New Roman", 0, 18));
        lbltotal1.setForeground(new java.awt.Color(0, 102, 0));
        lbltotal1.setText("Total Income");

        lblamount.setFont(new java.awt.Font("Times New Roman", 0, 18));
        lblamount.setForeground(new java.awt.Color(0, 102, 0));
        lblamount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblamount.setName("lblamount"); // NOI18N

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

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24));
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Maintainance");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE))
                    .add(jPanel3Layout.createSequentialGroup()
                        .add(356, 356, 356)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 225, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Total Spend");

        lbltotal.setFont(new java.awt.Font("Times New Roman", 0, 18));
        lbltotal.setForeground(new java.awt.Color(0, 102, 0));
        lbltotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("Net Balance");

        lblNetBalance.setFont(new java.awt.Font("Times New Roman", 0, 18));
        lblNetBalance.setForeground(new java.awt.Color(0, 102, 0));
        lblNetBalance.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblNetBalance.setName("lblNetBalance"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18));
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Credit");

        lblCredit.setFont(new java.awt.Font("Times New Roman", 0, 18));
        lblCredit.setForeground(new java.awt.Color(0, 102, 0));
        lblCredit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblCredit.setName("lblCredit"); // NOI18N

        txtmonth.setName("txtmonth"); // NOI18N

        lblyear.setName("lblyear"); // NOI18N

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(55, 55, 55)
                .add(txtmonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(73, 73, 73)
                .add(lblyear)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 537, Short.MAX_VALUE)
                .add(lbltotal1)
                .add(20, 20, 20)
                .add(lblamount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(48, 48, 48))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(lbldate, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lblNetBalance, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(lblCredit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 149, Short.MAX_VALUE)
                        .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 230, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(36, 36, 36)
                        .add(jLabel2)
                        .add(25, 25, 25)
                        .add(lbltotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 154, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(44, 44, 44))
                    .add(layout.createSequentialGroup()
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lblamount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(lbltotal1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(txtmonth, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(lblyear)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(27, 27, 27)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(16, 16, 16)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(lbltotal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2)))
                            .add(layout.createSequentialGroup()
                                .add(26, 26, 26)
                                .add(btnback, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 33, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel3)
                            .add(lblNetBalance, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblCredit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .add(24, 24, 24)))
                .add(lbldate))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
        int amou=0,tot=0,net=0,cred=0,s=0,s1=0,s4=0;
        String u,v,amo,tota;
         String mon=txtmonth.getText();
         String yea=lblyear.getText();
       u=lblname.getText();  
       v=lbldate.getText();
       ResultSet rs,rs1;
      
        amo=lblamount.getText();
        tota=lbltotal.getText();
     
          
        try
        {
            try
            {
               
                     year=Integer.parseInt(yea);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:rock");
            Statement st=con.createStatement();
          if(v.equals("Date"))
          {
            rs=st.executeQuery("select sum(amount)as Total from treatement where dates between '"+u+" 01am'and '"+u+" 11pm'");
           
          }
          else if(v.equals("Month"))
          {
             if(mon.equals("JAN")||mon.equals("MAR")||mon.equals("MAY")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("OCT")||mon.equals("DEC"))   
             {
                 rs=st.executeQuery("select sum(amount)as Total from treatement where dates between '01-"+u+"'and '31-"+u+" 11pm' ");
             }
             else if(mon.equals("APR")||mon.equals("JUN")||mon.equals("SEP")||mon.equals("NOV"))
             {
                 rs=st.executeQuery("select sum(amount)as Total from treatement where dates between '01-"+u+"'and '30-"+u+" 11pm' ");
             }
             else
             {
                 int leap=year%4;
                if(leap==0)
                {
                     rs=st.executeQuery("select sum(amount)as Total from treatement where dates between '01-"+u+"'and '29-"+u+" 11pm' ");
                }   
                else
                {
                     rs=st.executeQuery("select sum(amount)as Total from treatement where dates between '01-"+u+"'and '28-"+u+" 11pm' ");
                }   
             }    
          }    
          else
          {
              rs=st.executeQuery("select sum(amount) as Total from treatement  where dates between '01-jan-"+u+"'and '31-dec-"+u+" 11pm'");
           
          }          
            while(rs.next())
           {
            s=rs.getInt(1);
           lblamount.setText(""+s);
           }
            st.close();
            con.close();
          }
      
       catch(SQLException ex)
        {
           this.hide(); 
           JOptionPane.showMessageDialog(this,"Invalid date","Error",JOptionPane.WARNING_MESSAGE);     
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error");
        }
        
       try
        {
            try
            {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:rock");
            Statement st=con.createStatement();
           if(v.equals("Date"))
           {
             rs1=st.executeQuery("select sum(amount)as Total from personal where dates='"+u+"'"); 
           }
          else if(v.equals("Month"))
          {
             if(mon.equals("JAN")||mon.equals("MAR")||mon.equals("MAY")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("OCT")||mon.equals("DEC"))   
             {
                 rs1=st.executeQuery("select sum(amount)as Total from personal where dates between '01-"+u+"'and '31-"+u+" 11pm' ");
             }
             else if(mon.equals("APR")||mon.equals("JUN")||mon.equals("SEP")||mon.equals("NOV"))
             {
                 rs1=st.executeQuery("select sum(amount)as Total from personal where dates between '01-"+u+"'and '30-"+u+" 11pm' ");
             }
             else
             {
                 int leap=year%4;
                if(leap==0)
                {
                     rs1=st.executeQuery("select sum(amount)as Total from personal where dates between '01-"+u+"'and '29-"+u+" 11pm' ");
                }   
                else
                {
                     rs1=st.executeQuery("select sum(amount)as Total from personal where dates between '01-"+u+"'and '28-"+u+" 11pm' ");
                }   
             }    
          }   
          else
          {
              rs1=st.executeQuery("select sum(amount) as Total from personal  where dates between '01-jan-"+u+"'and '31-dec-"+u+" 11pm'");
          }          
            while(rs1.next())
           {
            s1=rs1.getInt(1);
           lbltotal.setText(""+s1);
           }
            st.close();
            con.close();
          }
       
     
       catch(SQLException ex)
        {
           this.hide(); 
           JOptionPane.showMessageDialog(this,"Invalid date","Error",JOptionPane.WARNING_MESSAGE);     
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Error");
        }
       try
        {
                   Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con=DriverManager.getConnection("jdbc:odbc:rock");
            Statement st=con.createStatement();
            ResultSet rs10=st.executeQuery("select sum(balance) from balance");       
            while(rs10.next())
           {
            s4=rs10.getInt(1);
           lblCredit.setText(""+s4);
           }
            st.close();
            con.close();
        }  
//        catch(SQLException sq)
//         {
//              JOptionPane.showMessageDialog(this,"Database Disconnected","Database Error",JOptionPane.ERROR_MESSAGE);   
//              this.dispose(); 
//         } 
         catch(Exception e)
         {
          JOptionPane.showMessageDialog(this,"There Is Any Error Occur ","Error",JOptionPane.ERROR_MESSAGE);  
          this.dispose();
         }
         
         net=s-s1;
         lblNetBalance.setText(""+net);
        
                            
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
// TODO add your handling code here:
        lbldate.setVisible(false);
       String u,v;
       u=lblname.getText();  
       v=lbldate.getText(); 
         String mon=txtmonth.getText();
         String yea=lblyear.getText();
      int i;
       year=Integer.parseInt(yea);
      ResultSet rs,rs1; 
      Vector columnnames=new Vector();
      Vector columnnames1=new Vector();
      Vector data=new Vector();
      Vector data1=new Vector();
   
      try
       {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("jdbc:odbc:rock");
          Statement st=con.createStatement();
          if(v.equals("Date"))
          {
            rs=st.executeQuery("select name as Name_Of_Patient,code as Code,amount as Amount ,paid as paid,balance as Balance from treatement where dates between '"+u+"'and '"+u+" 11pm' order by bill_id asc");
            
          }
          else if(v.equals("Month"))
          {
             if(mon.equals("JAN")||mon.equals("MAR")||mon.equals("MAY")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("OCT")||mon.equals("DEC"))   
             {
                rs=st.executeQuery("select day(dates) as Date,sum(amount)as Total,sum(paid)as Paid from treatement where dates between '01-"+u+"'and '31-"+u+" 11pm' group by day(dates)");    
             }
             else if(mon.equals("APR")||mon.equals("JUN")||mon.equals("SEP")||mon.equals("NOV"))
             {
               rs=st.executeQuery("select day(dates) as Date,sum(amount)as Total,sum(paid)as Paid from treatement where dates between '01-"+u+"'and '30-"+u+" 11pm' group by day(dates)");     
             }
             else
             {
                 int leap=year%4;
                if(leap==0)
                {
                   rs=st.executeQuery("select day(dates) as Date,sum(amount)as Total,sum(paid)as Paid from treatement where dates between '01-"+u+"'and '29-"+u+" 11pm' group by day(dates)");            
                }   
                else
                {
                   rs=st.executeQuery("select day(dates) as Date,sum(amount)as Total,sum(paid)as Paid from treatement where dates between '01-"+u+"'and '28-"+u+" 11pm' group by day(dates)");                    
                }   
             }    
          } 
          else
          {
                      rs=st.executeQuery("select month(dates)as Month,sum(amount)as Total,sum(paid) as paid from treatement where dates between '01-jan-"+u+" 01am'and '31-dec-"+u+" 11pm'group by month(dates)order by month(dates)asc");
            
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
      catch(Exception e)
         {
          //JOptionPane.showMessageDialog(this,"error"+e);
         }
      try
       {
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
          Connection con=DriverManager.getConnection("jdbc:odbc:rock");
          Statement st=con.createStatement();
          if(v.equals("Date"))
          {
             rs1=st.executeQuery("select member as Member,amount as Amount from personal where dates='"+u+"'");
          }
          else if(v.equals("Month"))
         
            {
                
             if(mon.equals("JAN")||mon.equals("MAR")||mon.equals("MAY")||mon.equals("JUL")||mon.equals("AUG")||mon.equals("OCT")||mon.equals("DEC"))   
             {
                rs1=st.executeQuery("select day(dates) as Date,sum(amount)as Total from personal where dates between '01-"+u+"'and '31-"+u+" 11pm' group by day(dates)");    
             }
             else if(mon.equals("APR")||mon.equals("JUN")||mon.equals("SEP")||mon.equals("NOV"))
             {
              
               rs1=st.executeQuery("select day(dates) as Date,sum(amount)as Total from personal where dates between '01-"+u+"'and '30-"+u+" 11pm' group by day(dates)");     
             }
             else
             {
                 int leap=year%4;
                if(leap==0)
                {
                   rs1=st.executeQuery("select day(dates) as Date,sum(amount)as Total from personal where dates between '01-"+u+"'and '29-"+u+" 11pm' group by day(dates)");            
                }   
                else
                {
                   rs1=st.executeQuery("select day(dates) as Date,sum(amount)as Total from personal where dates between '01-"+u+"'and '28-"+u+" 11pm' group by day(dates)");                    
                }   
             }    
          }
          else
          {
            rs1=st.executeQuery("select month(dates)as Month,sum(amount)as Total from personal where dates between '01-jan-"+u+" 01am'and '31-dec-"+u+" 11pm'group by month(dates)order by month(dates)asc");          
          }
               
         ResultSetMetaData md1=rs1.getMetaData();
         int columns1=md1.getColumnCount();
         for(i=1;i<=columns1;i++)
          {
             columnnames1.addElement(md1.getColumnName(i));
          }
         while(rs1.next())
          {
             Vector row1=new Vector(columns1);
             for(i=1;i<=columns1;i++)
               {
                 row1.addElement(rs1.getObject(i));
              
               }
             data1.addElement(row1);
          }
               

      JTable jTable4=new JTable(data,columnnames);
      JScrollPane jScrollPane4=new JScrollPane(jTable4);
      jTable1.setCellEditor(jTable4.getCellEditor());
      jScrollPane1.setViewportView(jTable4);   
     
      JTable jTable5=new JTable(data1,columnnames1);
      JScrollPane jScrollPane5=new JScrollPane(jTable5);
      jTable2.setCellEditor(jTable5.getCellEditor());
      jScrollPane2.setViewportView(jTable5); 
                 
         st.close();
         con.close();
       }
       catch(SQLException sq)
         {
              JOptionPane.showMessageDialog(this,"Invalid date"," Error",JOptionPane.ERROR_MESSAGE);   
              this.dispose(); 
         } 
         catch(Exception e)
         {
          JOptionPane.showMessageDialog(this,"There Is Any Error Occur ","Error",JOptionPane.ERROR_MESSAGE);  
          this.dispose();
         } 

        
    }//GEN-LAST:event_formWindowActivated

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
// TODO add your handling code here:
        
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed
    
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCredit;
    private javax.swing.JLabel lblNetBalance;
    private javax.swing.JLabel lblamount;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotal1;
    private javax.swing.JLabel lblyear;
    private javax.swing.JTextField txtmonth;
    // End of variables declaration//GEN-END:variables
    
}
