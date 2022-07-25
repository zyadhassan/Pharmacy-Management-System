/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
    public int Ch;
    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    private int mouseX,mouseY;
     
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Uid = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Chk = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Clear");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("UserName");

        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setText("Pharmacy Software ");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setText("Login Page");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pharmacy/logo.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 4));
        jLabel1.setMaximumSize(new java.awt.Dimension(160, 160));
        jLabel1.setMinimumSize(new java.awt.Dimension(160, 160));
        jLabel1.setPreferredSize(new java.awt.Dimension(160, 160));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        Chk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        Chk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChkMouseClicked(evt);
            }
        });
        Chk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Uid)
                            .addComponent(Pass, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 113, Short.MAX_VALUE)
                        .addComponent(Chk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Exit)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Chk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
        
        
        
  /*  
    ​int​ ​role​=​Chk​.​getSelectedIndex​(); 
 ​         
 ​        ​final​ ​int​  ​Admin​=​0​; 
 ​        ​final​ ​int​ ​User​=​1​; 
 ​        ​final​ ​int​ ​NULL​=-​1​; 
 ​        ​String​ ​Queury​; 
 ​         
 ​                ​switch​(​role​) 
 ​            { 
 ​            ​case​ ​NULL​: 
 ​                ​JOptionPane​.​showMessageDialog​(​this​, ​"Please select your role!"​); 
 ​                ​break​; 
 ​                 
 ​            ​case​ ​ADMIN​: 
 ​                 
 ​                        String Query="select * from zyad.AGENTTBL where ANAME='"+Uid.getText()+"' and APASS= '"+Pass.getText()+"' and TYPE = 'admin""+Chk.getSelectedIndex();

 ​                  try {
                        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
                         St=Con.createStatement();
                        Rs=St.executeQuery(Query); 
                        if(Rs.next()){
                ​       
 ​                        ​new​ Midecine().​setVisible​(​true​); 
 ​                        ​this​.​dispose​(); 
 ​                    } 
 ​                    ​else 
 ​                    { 
 ​                        ​JOptionPane​.​showMessageDialog​(​this​, ​"Wrong UserName or password!"​); 
 ​                    } 
 ​             
 ​                } ​catch​ (​Exception​ ​e​) { 
 ​                } 
 ​                ​break​; 
 ​                 
 ​                 
 ​                 
 ​                 
 ​            ​case​ ​User​: 
 ​                       String Query="select * from zyad.AGENTTBL where ANAME='"+Uid.getText()+"' and APASS= '"+Pass.getText()+"' and TYPE = '"+Chk.getSelectedIndex();

 ​                  try {
                        Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
                         St=Con.createStatement();
                        Rs=St.executeQuery(Query); 
                        if(Rs.next()){
                ​       
 ​                        ​new​ Midecine().​setVisible​(​true​); 
 ​                        ​this​.​dispose​(); 
 ​                    } 
 ​                    ​else 
 ​                    { 
 ​                        ​JOptionPane​.​showMessageDialog​(​this​, ​"Wrong UserName or password!"​); 
 ​                    } 
 ​             
 ​                } ​catch​ (​Exception​ ​e​) { 
 ​                } 
 ​                ​break​;     
 ​            }
}*/
         
        if(Chk.getSelectedIndex() == 0){
        String Query="select * from zyad.AGENTTBL where ANAME='"+Uid.getText()+"' and APASS= '"+Pass.getText()+"' and TYPE = 'admin'";
        try {
         Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
          St=Con.createStatement();
         Rs=St.executeQuery(Query); 
         if(Rs.next()){
        
        new Midecine().setVisible(true);
        this.dispose();
        
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Wrong User ID Or Password");
         }
        }
      
     
     catch (SQLException e)
     {
        e.printStackTrace();
     }
       }
       else{
           String Query="select * from zyad.AGENTTBL where ANAME='"+Uid.getText()+"' and APASS= '"+Pass.getText()+"' and TYPE = 'user'";
        try {
         Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
          St=Con.createStatement();
         Rs=St.executeQuery(Query); 
         if(Rs.next()){
        
        new Midecine1().setVisible(true);
        this.dispose();
        
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Wrong User ID Or Password");
         }
        }
      
     
     catch (SQLException e)
     {
        e.printStackTrace();
     }
       }
                  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

 
    private void ChkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkActionPerformed

    private void ChkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChkMouseClicked
        // TODO add your handling code here:
        Ch = Chk.getSelectedIndex();
    }//GEN-LAST:event_ChkMouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mouseX = evt.getX();
mouseY = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX,this.getY() + evt.getY() - mouseY);// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              login a = new login();
                a.pack();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Chk;
    private javax.swing.JLabel Exit;
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Uid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
