
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Panth
 */
public final class prev_bookings extends javax.swing.JFrame {

    Connection conn = null;
    String username;

    /**
     * Creates new form prev_bookings
     *
     * @throws java.sql.SQLException
     */
    public prev_bookings() throws SQLException {
        initComponents();
        conn = DB_Connect.connect();
        String SQLQuery1 = "SELECT username FROM userdetails where logon = ?";
        PreparedStatement pst1 = conn.prepareStatement(SQLQuery1);
        pst1.setInt(1, 1);
        ResultSet rs1 = pst1.executeQuery();
        while (rs1.next()) {
            this.username = rs1.getString("username");
        }
        System.out.println(username);
        showUser();
    }

    public ArrayList<reservation> rlist() throws SQLException {
        System.out.println(username);
        ArrayList<reservation> rlist = new ArrayList<>();
        reservation Reservation;
        String SQLQuery = "SELECT bcode, name, age, gender, origin, dest, flightno, date, dep, arr, seatno FROM reservation\n"
                + "WHERE username = ?;";
        PreparedStatement pst = conn.prepareStatement(SQLQuery);
        pst.setString(1, username);
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {

            Reservation = new reservation(rs.getString("bcode"), rs.getString("name"), rs.getInt("age"), rs.getString("gender"), rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("date"), rs.getString("dep"), rs.getString("arr"), rs.getString("seatno"));
            rlist.add(Reservation);
        }

        return rlist;
    }

    public void showUser() throws SQLException {
        ArrayList<reservation> list = rlist();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        Object row[] = new Object[11];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getRefno();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAge();
            row[3] = list.get(i).getGender();
            row[4] = list.get(i).getTo();
            row[5] = list.get(i).getFrom();
            row[6] = list.get(i).getFlightno();
            row[7] = list.get(i).getDate();
            row[8] = list.get(i).getDep();
            row[9] = list.get(i).getArr();
            row[10] = list.get(i).getSeatno();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking Code", "Name", "Age", "Gender", "To", "From", "Flight No.", "Date", "Departure", "Arrival", "Seat No."
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        int i = jTable.getSelectedRow();
        TableModel model = jTable.getModel();
        int selectedRowIndex = jTable.getSelectedRow();
        String refno = model.getValueAt(selectedRowIndex, 0).toString();
        String name = model.getValueAt(selectedRowIndex, 1).toString();
        show_booking sb1;
        try {
            sb1 = new show_booking(refno, name);
            sb1.setVisible(true);
            sb1.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(prev_bookings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(prev_bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prev_bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prev_bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prev_bookings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new prev_bookings().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(prev_bookings.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
