
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
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
public class flight_details extends javax.swing.JFrame {

    Connection conn = null;
    String origin;
    String dest;
    int date;
    String passng;
    String ebclass;
//    String date;
    /**
     * Creates new form reg_info
     */
    public flight_details() throws SQLException {
        initComponents();
    }
    
    public flight_details(String from, String To, int fdate, String passng, String ebclass) throws SQLException{
        this.origin = from;
        this.dest = To;
        this.passng = passng;
        this.ebclass = ebclass;
        this.date = fdate;
        initComponents();
        conn = DB_Connect.connect();
        showUser(); 
    }
    
    
    
    public ArrayList<flight> flightLists() throws SQLException{
        System.out.println(origin);
        System.out.println(dest);
        ArrayList<flight> flightsList = new ArrayList<>();
        flight Flight;
        if (date==1)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%1%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }

        }
        else if (date==2)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%2%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
        else if (date==3)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%3%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
        else if (date==4)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%4%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
       else if (date==5)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%5%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
        else if (date==6)
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%6%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
        else
        {
            String SQLQuery = "SELECT origin, dest, flightno ,freq, dep, arr, aircraft, stops\n" +
                    "FROM public.flightdetails where origin = ? and dest = ? and freq LIKE '%7%' ;";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, origin);
            pst.setString(2, dest);
            // pst.setInt(3, date);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Flight = new flight(rs.getString("origin"), rs.getString("dest"), rs.getString("flightno"), rs.getString("freq"), rs.getString("dep"), rs.getString("arr"), rs.getString("aircraft"), rs.getInt("stops"));
                flightsList.add(Flight);
            }
        }
        return flightsList;
    }
    
    public void showUser() throws SQLException{
        ArrayList<flight> list = flightLists();
        System.out.println(list.size());
        DefaultTableModel model = (DefaultTableModel) flight_jTable.getModel();
        Object row[] = new Object[8];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getOrigin();
            row[1] = list.get(i).getDest();
            row[2] = list.get(i).getFlightno();
            row[3] = list.get(i).getFreq();
            row[4] = list.get(i).getDep();
            row[5] = list.get(i).getArr();
            row[6] = list.get(i).getAircraft();
            row[7] = list.get(i).getStops();
            model.addRow(row);
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        flight_jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        flight_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origin", "Destination", "Flight No.", "Frequency", "Departure", "Arrival", "Aircraft", "Stops", "Book"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        flight_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flight_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(flight_jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void flight_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flight_jTableMouseClicked
        int i = flight_jTable.getSelectedRow();
        TableModel model = flight_jTable.getModel();
        int selectedRowIndex = flight_jTable.getSelectedRow();
        String origin = model.getValueAt(selectedRowIndex, 0).toString();
        String dest = model.getValueAt(selectedRowIndex, 1).toString();
        String flightno = model.getValueAt(selectedRowIndex, 2).toString();
        String s_freq = model.getValueAt(selectedRowIndex, 3).toString();
        String dep = model.getValueAt(selectedRowIndex, 4).toString();
        String arr = model.getValueAt(selectedRowIndex, 5).toString();
        String aircraft = model.getValueAt(selectedRowIndex, 6).toString();
        String stops = model.getValueAt(selectedRowIndex, 7).toString();
        
        new show_flight(origin, dest, flightno, passng, dep, arr, aircraft, stops).setVisible(true);
    }//GEN-LAST:event_flight_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(flight_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(flight_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(flight_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(flight_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new flight_details().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(flight_details.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable flight_jTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
