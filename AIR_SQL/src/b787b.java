/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIsarg Thoriya
 */
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class b787b extends javax.swing.JFrame {

    //public Component jButton1;
    Connection conn = null;

    /**
     * Creates new form b787b
     */
    public b787b() throws SQLException {
        conn = DB_Connect.connect();
        initComponents();
        conn = DB_Connect.connect();
        String SEATQuery= "SELECT * from b787b\n"+"WHERE status = 'T'";
        PreparedStatement seatps= conn.prepareStatement(SEATQuery);
        ResultSet rs=seatps.executeQuery();
        while(rs.next())
        {
            System.out.println(rs.getInt("seat_number"));
            if(rs.getInt("seat_number")==1)
                jButton1.setBackground(Color.RED);
            if(rs.getInt("seat_number")==2)
                jButton2.setBackground(Color.RED);
            if(rs.getInt("seat_number")==3)
                jButton3.setBackground(Color.RED);
            if(rs.getInt("seat_number")==4)
                jButton4.setBackground(Color.RED);
        }
    }
    // public void fetch()throws SQLException
//    {
//
//        conn = DB_Connect.connect();
//        String SEATQuery= "SELECT * from b787b\n"+"WHERE status = 'T'";
//        PreparedStatement seatps= conn.prepareStatement(SEATQuery);
//        ResultSet rs=seatps.executeQuery();
//        while(!rs.next())
//        {
//            System.out.println(rs.getInt("seat_number"));
//            if(rs.getInt("seat_number")==1)
//                jButton1.setBackground(Color.RED);
//            if(rs.getInt("seat_number")==2)
//                jButton2.setBackground(Color.RED);
//            if(rs.getInt("seat_number")==3)
//                jButton3.setBackground(Color.RED);
//            if(rs.getInt("seat_number")==4)
//                jButton4.setBackground(Color.RED);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
<<<<<<< HEAD
        conn = DB_Connect.connect();
        String SEATQuery= "SELECT * from b787b\n"+"WHERE status = 'T'";
        PreparedStatement seatps= conn.prepareStatement(SEATQuery,ResultSet.TYPE_SCROLL_SENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
        ResultSet rs=seatps.executeQuery();
        //rs.first();
//        System.out.println(rs);
        while(rs.next())
        {
            System.out.println(rs.getInt("seat_number"));
            if(rs.getInt("seat_number")==1) {
                jButton1.setBackground(Color.RED);
                
            }
            if(rs.getInt("seat_number")==2)
                jButton2.setBackground(Color.RED);
            if(rs.getInt("seat_number")==3)
                jButton3.setBackground(Color.RED);
            if(rs.getInt("seat_number")==4)
                jButton4.setBackground(Color.RED);
        }

=======
>>>>>>> f9ad8aac1f2c2db0e2513ba852c70fc368683df2

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        //jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        //jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("2");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

       // jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("3");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

       // jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("4");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Submit)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Submit)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {

        if (jButton1.getBackground() == Color.GREEN) {
            jButton1.setBackground(Color.WHITE);
        } else {
            jButton1.setBackground(Color.GREEN);
        }
    }

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if (jButton2.getBackground() == Color.GREEN) {
            jButton2.setBackground(Color.WHITE);
        } else {
            jButton2.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:

        if (jButton3.getBackground() == Color.GREEN) {
            jButton3.setBackground(Color.WHITE);
        } else {
            jButton3.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

        if (jButton4.getBackground() == Color.GREEN) {
            jButton4.setBackground(Color.WHITE);
        } else {
            jButton4.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        try {

            if (jButton1.getBackground() == Color.GREEN) {
                String SQLUpdateQuery = "Update b787b\n" + "set status = 'T'\n" + "where seat_number = 1";
                PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.executeUpdate();
            } else if (jButton2.getBackground() == Color.GREEN) {
                String SQLUpdateQuery = "Update b787b\n" + "set status = 'T'\n" + "where seat_number = 2";
                PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.executeUpdate();
            } else if (jButton3.getBackground() == Color.GREEN) {
                String SQLUpdateQuery = "Update b787b\n" + "set status = 'T'\n" + "where seat_number = 3";
                PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.executeUpdate();
            } else {
                String SQLUpdateQuery = "Update b787b\n" + "set status = 'T'\n" + "where seat_number = 4";
                PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.executeUpdate();
            }
        } catch (Exception ex) {
            Logger.getLogger(b787b.class.getName()).log(Level.SEVERE, null, ex);

        }
        dispose();
    }//GEN-LAST:event_SubmitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new b787b().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(b787b.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
