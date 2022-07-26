/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;
import java.sql.Statement.*;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Alaa
 */
public class Company extends javax.swing.JFrame {

    /**
     * Creates new form Agents
     */
    public Company() {
        initComponents();
        SelectCompany();
    }
    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    private int mouseX,mouseY;
    
     public void SelectCompany(){
        try {
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
            St=Con.createStatement();
            Rs=St.executeQuery("Select * from zyad.COMPTBL");
            CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
            }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Cid = new javax.swing.JTextField();
        Cname = new javax.swing.JTextField();
        Cadd = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        DelBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        CompanyTable = new javax.swing.JTable();
        jLabel64 = new javax.swing.JLabel();
        Cphone = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        Cexp = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        Exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel56.setText(" Manage Company");

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel57.setText("ID");

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel58.setText("Name");

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel59.setText("Address");

        Cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidjTextField2ActionPerformed(evt);
            }
        });

        Cname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CnamejTextField3ActionPerformed(evt);
            }
        });

        Cadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaddjTextField4ActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel63.setText("Phone");

        UpdateBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });

        DelBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        DelBtn.setText("Delete");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        DelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelBtnActionPerformed(evt);
            }
        });

        AddBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(51, 51, 51));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnjButton5ActionPerformed(evt);
            }
        });

        CompanyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Experience", "Phone"
            }
        ));
        CompanyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompanyTableMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(CompanyTable);

        jLabel64.setFont(new java.awt.Font("Century Gothic", 1, 22)); // NOI18N
        jLabel64.setText("Companies List");

        Cphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CphonejTextField4ActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel60.setText("Experience");

        Cexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CexpjTextField4ActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Search.setForeground(new java.awt.Color(51, 51, 51));
        Search.setText("Search");
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchjButton5ActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cid, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                    .addComponent(Cname)
                                    .addComponent(Cadd))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel63))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cphone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cexp, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(232, 232, 232)
                                        .addComponent(jLabel64))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(33, 33, 33)
                                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(49, 49, 49)
                                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Exit)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel56))
                    .addComponent(Exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(Cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60)
                    .addComponent(Cexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(Cname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(Cadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Cphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 204));

        jLabel78.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("COMPANY");
        jLabel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel78jLabel68MouseClicked(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("AGENTS");
        jLabel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel79MouseClicked(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("MEDICINE");
        jLabel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel80jLabel70MouseClicked(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("PATIENTS");
        jLabel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel81jLabel71MouseClicked(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("DejaVu Sans Condensed", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("BILL");
        jLabel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel82jLabel71MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel78)
                .addGap(27, 27, 27)
                .addComponent(jLabel79)
                .addGap(37, 37, 37)
                .addComponent(jLabel80)
                .addGap(29, 29, 29)
                .addComponent(jLabel82)
                .addGap(32, 32, 32)
                .addComponent(jLabel81)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CidjTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidjTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidjTextField2ActionPerformed

    private void CnamejTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CnamejTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CnamejTextField3ActionPerformed

    private void CaddjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaddjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaddjTextField4ActionPerformed

    private void DelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelBtnActionPerformed

    private void AddBtnjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnjButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnjButton5ActionPerformed

    private void CphonejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CphonejTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CphonejTextField4ActionPerformed

    private void CexpjTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CexpjTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CexpjTextField4ActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        try{
            Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
            PreparedStatement add=Con.prepareStatement("insert into COMPTBL values(?,?,?,?,?)");
            add.setInt(1, Integer.valueOf(Cid.getText()));
            add.setString(2, Cname.getText());
            add.setString(3, Cadd.getText());
            add.setInt(4, Integer.valueOf(Cexp.getText()));
            add.setString(5, Cphone.getText());
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Company Successfully Added");
            Con.close();
            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        SelectCompany();
    }//GEN-LAST:event_AddBtnMouseClicked

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        String Id=Cid.getText();
        if(Cid.getText().isEmpty()||Cname.getText().isEmpty()||Cadd.getText().isEmpty()||Cexp.getText().isEmpty() || Cphone.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Missing Information");
       }
       
       else{
           try{ 
   
              Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
              String UpdateQuery="Update zyad.COMPTBL set COMPNAME = '"+Cname.getText()+
                      "'"+",COMPADD = '"+Cadd.getText() +"'"
                     +",COMPEXP = "+Cexp.getText()+""
                      +",COMPPHONE = '"+Cphone.getText()+"'"
            +"where COMPID ="+ Cid.getText();
              Statement Add=Con.createStatement();
                  Add.executeUpdate(UpdateQuery);
                 JOptionPane.showMessageDialog(this, "Company Updated Successfully");
           }
         catch(SQLException e){
            e.printStackTrace();
        }
            SelectCompany();
    }
    }//GEN-LAST:event_UpdateBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(Cid.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter The Company To Be Deleted");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
                String Id=Cid.getText();
                String Query="Delete from zyad.COMPTBL where COMPID="+Id;
                Statement Add=Con.createStatement();
                Add.executeUpdate(Query);
                SelectCompany();
                JOptionPane.showMessageDialog(this, "Company Deleted Successfully");
            }
            catch(SQLException e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void CompanyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompanyTableMouseClicked
        DefaultTableModel model=(DefaultTableModel)CompanyTable.getModel();
        int MyIndex=CompanyTable.getSelectedRow();
        Cid.setText(model.getValueAt(MyIndex, 0).toString());
        Cname.setText(model.getValueAt(MyIndex, 1).toString());
        Cadd.setText(model.getValueAt(MyIndex, 2).toString());
        Cexp.setText(model.getValueAt(MyIndex, 3).toString());
        Cphone.setText(model.getValueAt(MyIndex, 4).toString());
    }//GEN-LAST:event_CompanyTableMouseClicked

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
if(Cname.getText().isEmpty()){
            try{
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
                String Query = "Select * from COMPTBL";
                Statement Add=Con.createStatement();
                Rs = Add.executeQuery(Query);
                CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs));
                
            }
            catch(SQLException e){
            e.printStackTrace();
        }
            //JOptionPane.showMessageDialog(this, "Enter The Medicine To Search For");
        }
        else{
            try{
                Con=DriverManager.getConnection("jdbc:derby://localhost:1527/PharmaDB ","zyad","zyad");
                String Query = "Select * from COMPTBL WHERE COMPNAME ='" + Cname.getText()+"'";
                Statement Add=Con.createStatement();
                Rs = Add.executeQuery(Query);
                CompanyTable.setModel(DbUtils.resultSetToTableModel(Rs));
                
            }
            catch(SQLException e){
            e.printStackTrace();
        }
 }        // TODO add your handling code here:
    }//GEN-LAST:event_SearchMouseClicked

    private void SearchjButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchjButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchjButton5ActionPerformed

    private void jLabel78jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel78jLabel68MouseClicked
      //  new Company().setVisible(true);
      //  this.dispose();
    }//GEN-LAST:event_jLabel78jLabel68MouseClicked

    private void jLabel80jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel80jLabel70MouseClicked
        new Midecine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel80jLabel70MouseClicked

    private void jLabel81jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel81jLabel71MouseClicked
        new Patients().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel81jLabel71MouseClicked

    private void jLabel82jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel82jLabel71MouseClicked
        new Selling().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel82jLabel71MouseClicked

    private void jLabel79MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel79MouseClicked
        new Agents().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel79MouseClicked

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_ExitMouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getX() + evt.getX() - mouseX,this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_jPanel3MouseDragged

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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Company a = new Company();
                a.pack();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Cadd;
    private javax.swing.JTextField Cexp;
    private javax.swing.JTextField Cid;
    private javax.swing.JTextField Cname;
    private javax.swing.JTable CompanyTable;
    private javax.swing.JTextField Cphone;
    private javax.swing.JButton DelBtn;
    private javax.swing.JLabel Exit;
    private javax.swing.JButton Search;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
