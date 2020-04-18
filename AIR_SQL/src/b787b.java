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

    // public Component jButton1;
    Connection conn = null;
    int seat_number;
    String flightno;
    String date;
    String ebclass;

    /**
     * Creates new form b787b
     */
    public b787b(final String flightno, final String date, final String ebclass) throws SQLException {
        
        conn = DB_Connect.connect();
        this.flightno = flightno;
        this.date = date;
        this.ebclass = ebclass;
        System.out.println(flightno);
        System.out.println(date);
        System.out.println(ebclass);
        initComponents();
        final String SEATQuery = "SELECT * from b787b\n" + "WHERE flightno = ? and date = ? and class = ?";
        PreparedStatement seatps= conn.prepareStatement(SEATQuery,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        seatps.setString(1, flightno);
        seatps.setString(2, date);
        seatps.setString(3, ebclass);

        final ResultSet rs = seatps.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("seat_number"));
            if (rs.getInt("seat_number") == 1) {
                jButton1.setBackground(Color.RED);
                jButton1.setSelected(true);
            }
            if (rs.getInt("seat_number") == 2) {
                jButton2.setBackground(Color.RED);
                jButton2.setSelected(true);
            }
            if (rs.getInt("seat_number") == 3) {
                jButton3.setBackground(Color.RED);
                jButton3.setSelected(true);
            }
            if (rs.getInt("seat_number") == 4) {
                jButton4.setBackground(Color.RED);
                jButton4.setSelected(true);
            }
        }
    }

    public b787b() throws SQLException {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() throws SQLException {

        jPanel1 = new javax.swing.JPanel();
        Submit = new javax.swing.JButton();
        jButton1 = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JToggleButton();
        jButton3 = new javax.swing.JToggleButton();
        jButton4 = new javax.swing.JToggleButton();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(final java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        final javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 64,
                                                        Short.MAX_VALUE)
                                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 64,
                                                        Short.MAX_VALUE)
                                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(54, 54, 54))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                        .createSequentialGroup().addComponent(Submit).addGap(97, 97, 97)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18).addComponent(Submit).addContainerGap(26, Short.MAX_VALUE)));

        final javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 286, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 259, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addContainerGap()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addContainerGap())));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(final java.awt.event.ActionEvent evt) throws SQLException {// GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        try {

            if (jButton1.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into b787b\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jButton2.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into b787b\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else if (jButton3.getBackground() == Color.GREEN) {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into b787b\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            } else {
                final String status = "T";
                final String SQLUpdateQuery = "INSERT into b787b\n" + "values(?, ?, ?, ?, ?)";
                final PreparedStatement pstmt = conn.prepareStatement(SQLUpdateQuery);
                pstmt.setInt(1, seat_number);
                pstmt.setString(2, status);
                pstmt.setString(3, flightno);
                pstmt.setString(4, ebclass);
                pstmt.setString(5, date);
                pstmt.execute();
            }
        } catch (final Exception ex) {
            Logger.getLogger(b787b.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        dispose();
        JOptionPane.showMessageDialog(null, "Your Ticket has been booked Succesfully");
    }// GEN-LAST:event_SubmitActionPerformed

    private void jButton1ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        if (jButton1.isSelected()) {
            seat_number = 1;
        }else{
            seat_number = 0;
        }

        if (jButton1.getBackground() == Color.GREEN) {
            jButton1.setBackground(Color.WHITE);
        } else {
            jButton1.setBackground(Color.GREEN);
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        if (jButton2.isSelected()) {
            seat_number = 2;
        }else{
            seat_number = 0;
        }

        if (jButton2.getBackground() == Color.GREEN) {
            jButton2.setBackground(Color.WHITE);
        } else {
            jButton2.setBackground(Color.GREEN);
        }
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        if (jButton3.isSelected()) {
            seat_number = 3;
        }else{
            seat_number = 0;
        }

        if (jButton3.getBackground() == Color.GREEN) {
            jButton3.setBackground(Color.WHITE);
        } else {
            jButton3.setBackground(Color.GREEN);
        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(final java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        if (jButton4.isSelected()) {
            seat_number = 4;
        }else{
            seat_number = 0;
        }

        if (jButton4.getBackground() == Color.GREEN) {
            jButton4.setBackground(Color.WHITE);
        } else {
            jButton4.setBackground(Color.GREEN);
        }
    }// GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(final String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (final javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (final ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final InstantiationException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (final javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(b787b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new b787b().setVisible(true);
                } catch (final Exception ex) {
                    Logger.getLogger(b787b.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JToggleButton jButton1;
    private javax.swing.JToggleButton jButton2;
    private javax.swing.JToggleButton jButton3;
    private javax.swing.JToggleButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
