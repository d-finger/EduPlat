/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dkkcorp;

import com.mysql.jdbc.*;
import java.sql.*;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kapanga_david_wa_kap
 */
public class LogInFrame extends javax.swing.JFrame {

    /**
     * Creates new form LogInFrame
     */
    public static AdminUser adminuser=null;
    public static StudentUser studentlogin=null;
    public static TeacherUser teacherlogin=null;
    public LogInFrame() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/Untitled-1.png"))); // NOI18N
        jRadioButton2.setNextFocusableComponent(jRadioButton3);
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jRadioButton2StateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginCheckBxImg.png"))); // NOI18N
        jRadioButton3.setNextFocusableComponent(jRadioButton1);
        jRadioButton3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton3ItemStateChanged(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginCheckBxImg.png"))); // NOI18N
        jRadioButton1.setNextFocusableComponent(jTextField1);
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setToolTipText("Enter your user name");
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);
        jTextField1.setNextFocusableComponent(jPasswordField1);
        jTextField1.setOpaque(false);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 80, 220, 40));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setAutoscrolls(false);
        jPasswordField1.setBorder(null);
        jPasswordField1.setNextFocusableComponent(jButton1);
        jPasswordField1.setOpaque(false);
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 220, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginBtn.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(0));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setNextFocusableComponent(jRadioButton2);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, -1));

        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 230, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("Forgot password");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/logIn2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jRadioButton2StateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton2StateChanged

    private void jRadioButton3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton3ItemStateChanged
        // TODO add your handling code here:
         checkboxstatus_3();
    }//GEN-LAST:event_jRadioButton3ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        // TODO add your handling code here:
         checkboxstatus_1();
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        // TODO add your handling code here:
        checkboxstatus_2();
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jTextField1.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String dbname="",dblastname="" ,dbusernam="",dbemail="",dbpassword="",dbstudentid="",dbprogrammeosstudy="",dbclassenrolled="",dbcours="",dbteacherid="";
        int dbpermision=0, dbid=0,dbadmisiondate=0;
        String usernam=jTextField1.getText();
        Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
        String categories,tb="";
        
        if(jRadioButton2.isSelected()){categories="student";tb="student_tab_eduplat_t2";}
        else if(jRadioButton3.isSelected()){categories="teacher";tb="teacher_tab_eduplat_t3";}
        else{categories="admin";tb="admin_tab_eduplat_t1";}
        
        try {
            // 1. Get a connection to database
            myConn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eduplat_dkkcorpdb", "root" , "");
            // 2. Create a prepared statement
             PreparedStatement statement = myConn.prepareStatement("select * from " + tb + " where UserName = ?");
            // 3. the where clause definition
            statement.setString(1, usernam);
            // 4. Execute SQL query
            myRs = statement.executeQuery();
            // 5. Process the result set
            while (myRs.next()) {
                if(categories=="student")
                {
                    //assinging db value find to each variABLE
                    dbid=Integer.parseInt(myRs.getString("Id"));
                    dbusernam=myRs.getString("UserName");
                    dbpassword=myRs.getString("Password");
                    dbname=myRs.getString("Name");
                    dblastname=myRs.getString("LastName");
                    dbemail=myRs.getString("Email");
                    dbstudentid=myRs.getString("StudentId");
                    dbprogrammeosstudy=myRs.getString("ProgrammeOsStudy");
                    dbadmisiondate=Integer.parseInt(myRs.getString("AdmisionDate"));
                    dbclassenrolled=myRs.getString("ClassEnrolled");
                    dbpermision=Integer.parseInt(myRs.getString("Permision"));
                    
                }
                else if(categories=="teacher")
                {
                    dbid=Integer.parseInt(myRs.getString("Id"));
                    dbname=myRs.getString("Name");
                    dblastname=myRs.getString("LastName");
                    dbemail=myRs.getString("Email");
                    dbusernam=myRs.getString("UserName");
                    dbpassword=myRs.getString("Password");
                    dbteacherid=myRs.getString("TeacherId");
                    dbcours=myRs.getString("Cours");
                    dbpermision=Integer.parseInt(myRs.getString("Permision"));
                }
                else{
                    dbid=Integer.parseInt(myRs.getString("Id"));
                    dbname=myRs.getString("Name");
                    dblastname=myRs.getString("LastName");
                    dbemail=myRs.getString("Email");
                    dbusernam=myRs.getString("UserName");
                    dbpassword=myRs.getString("Password");
                    dbpermision=Integer.parseInt(myRs.getString("Permision"));
                }
            }
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
                            try {
                                myRs.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(LogInFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			
			if (myStmt != null) {
                            try {
                                myStmt.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(LogInFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
			
			if (myConn != null) {
                            try {
                                myConn.close();
                            } catch (SQLException ex) {
                                Logger.getLogger(LogInFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
			}
		}
	//getting password value from password field of the frame
        String password="";
        char []passarray=jPasswordField1.getPassword();
        int i=0;
        for(i=0;i<jPasswordField1.getPassword().length;i++){
            password = password+String.valueOf(passarray[i]);
        }
        if(!usernam.isEmpty() && (usernam.equalsIgnoreCase(dbusernam) && password.equals(dbpassword)))
        {if(categories=="student")
                {     
                    //creat a new static object student when the login is correct
                    studentlogin= new StudentUser(dbid,dbname,dblastname,dbusernam,dbemail,dbpassword,dbpermision,dbstudentid,dbprogrammeosstudy,dbclassenrolled,dbadmisiondate);
                   //go to the interface for student user
                   
                    java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                    new StudentFrame_Home().setVisible(true);
                    }
                    });
                    //set login form invisible
                    this.setVisible(false);
                    
                }
                else if(categories=="teacher")
                {
                     //creat a new static object student when the login is correct
                    teacherlogin = new TeacherUser(dbid,dbname,dblastname,dbusernam,dbemail,dbpassword,dbpermision,dbteacherid,dbcours);
                   //go to the interface for teacher user
                   
                    java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                    new TeacherFrame_Home().setVisible(true);
                    }
                    });
                    //set login form invisible
                    this.setVisible(false);
                   
                }
                else{
                    //creat a new static object admin when the login is correct
                    adminuser= new AdminUser(dbid,dbname,dblastname,dbusernam,dbemail,dbpassword,dbpermision);
                   //go to the interface for admin user
                    java.awt.EventQueue.invokeLater(new Runnable() {
                     public void run() {
                    new AdminFrame1().setVisible(true);
                    }
                    });
                    this.setVisible(false);
                }
            
        }
        else
        {
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel2.setText("Your username or password was ");
            jLabel3.setText("incorrect. Please Try again");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
         // when the username textfield gain focus, remove login error message
        jLabel2.setVisible(false);
            jLabel3.setVisible(false);
    }//GEN-LAST:event_jTextField1FocusGained

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // when the password textfield gain focus, remove login error message
        jLabel2.setVisible(false);
            jLabel3.setVisible(false);
    }//GEN-LAST:event_jPasswordField1FocusGained

    /**
     * @param args the command line arguments
     */
    public void checkboxstatus_2()
    {
        if(jRadioButton2.isSelected()==true){
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/Untitled-1.png")));
        //System.out.println("selected");
        }
        else
        {
            jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginCheckBxImg.png")));
        }
      
    }
    public void checkboxstatus_1()
    {
        if(jRadioButton1.isSelected()==true){
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/Untitled-1.png")));
        //System.out.println("selected 1");
        }
        else
        {
            jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginCheckBxImg.png")));
        }
    }
    public void checkboxstatus_3()
    {
      if(jRadioButton3.isSelected()==true){
            //System.out.println("selected 3");
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/Untitled-1.png")));
        }
        else
        {
            jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/dkkcorp/loginCheckBxImg.png")));
        }
    }
    

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
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogInFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               LogInFrame f = new LogInFrame();
                       f.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
