/*
 * setting.java
 *
 * Created on February 11, 2012, 4:47 PM
 */

package clinic;

/**
 *
 * @author  Administrator
 */
public class setting extends javax.swing.JFrame {
    record_home r=new record_home();
    boolean rvi=r.isVisible();
      personal p=new personal();
      boolean pvi=p.isVisible();
    /**
     * Creates new form setting
     */
    public setting() {
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
        btnaccount = new javax.swing.JButton();
        btnpatient = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Setting");
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.pink);

        btnaccount.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnaccount.setIcon(new javax.swing.ImageIcon("src/images/security.JPG")); // NOI18N
        btnaccount.setName("btnaccount"); // NOI18N
        btnaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccountActionPerformed(evt);
            }
        });

        btnpatient.setFont(new java.awt.Font("Times New Roman", 0, 14));
        btnpatient.setIcon(new javax.swing.ImageIcon("src/images/record.JPG")); // NOI18N
        btnpatient.setName("btnpatient"); // NOI18N
        btnpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpatientActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36));
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Setting of Clinic Management");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jSeparator1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
            .add(jPanel1Layout.createSequentialGroup()
                .add(39, 39, 39)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnaccount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 403, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(btnpatient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(92, Short.MAX_VALUE))
            .add(jPanel1Layout.createSequentialGroup()
                .add(38, 38, 38)
                .add(jLabel1)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .add(7, 7, 7)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnaccount, 0, 160, Short.MAX_VALUE)
                    .add(btnpatient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(47, 47, 47)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 47, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(41, 41, 41))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        r.dispose();
        p.dispose();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpatientActionPerformed
// TODO add your handling code here:
     
     
     if(rvi==false)
       { 
         r=new record_home();    
       r.setVisible(true);
       rvi=true;
       }
       else
       {
        rvi=r.isVisible();
        if(rvi==false)
        { 
            r=new record_home();   
         r.setVisible(true);
         rvi=true;
        }
        else
        {
          r.requestFocus();  
        }    
       } 
   
    }//GEN-LAST:event_btnpatientActionPerformed

    private void btnaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccountActionPerformed
// TODO add your handling code here:
       
          if(pvi==false)
       { 
         p=new personal();      
       p.setVisible(true);
       pvi=true;
       }
       else
       {
        pvi=p.isVisible();
        if(pvi==false)
        {  
           p=new personal();  
         p.setVisible(true);
         pvi=true;
        }
        else
        {
          p.requestFocus();  
        }    
       } 
        
        
        
    }//GEN-LAST:event_btnaccountActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setting().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaccount;
    private javax.swing.JButton btnpatient;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
