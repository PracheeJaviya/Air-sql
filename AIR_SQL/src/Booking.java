
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import org.jdatepicker.*;



public class Booking extends javax.swing.JFrame {

    public Booking() {
        initComponents();
    }

    BCode b=new BCode();
    String bcode;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        from_jComboBox = new javax.swing.JComboBox<>();
        to_jComboBox = new javax.swing.JComboBox<>();
        day_jComboBox = new javax.swing.JComboBox<>();
        month_jComboBox = new javax.swing.JComboBox<>();
        year_jComboBox = new javax.swing.JComboBox<>();
        booking_submit_jButton = new javax.swing.JButton();
        ebclass_jComboBox = new javax.swing.JComboBox<>();
        passng_jTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("From :");

        jLabel2.setText("To :");

        jLabel3.setText("Date :");

        jLabel4.setText("Paseengers :");

        jLabel5.setText("Class :");

        from_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi", "AgartalaAgatti", "Agra", "Ahmedabad", "Aizawl", "Allahabad", "Amritsar", "Aurangabad", "Bagdogra", "Bahrain", "Bangkok", "Belgaum", "Bengaluru", "Bhatinda", "Bhavnagar", "Bhopal", "Bhubaneswar", "Bhuj", "Bikaner", "Birmingham", "Chandigarh", "Chennai", "Chicago", "Coimbatore", "Colombo", "Copenhagen", "Dammam", "Dehra Dun", "Delhi", "Dhaka", "Dharamshala", "Dimapur", "DIU", "Doha", "Dubai", "Durgapur", "Frankfurt", "Gaya", "Goa", "Gorakhpur", "Guwahati", "Gwalior", "Hong Kong", "Hubli", "Hyderabad", "Imphal", "Indore", "Jabalpur", "Jaffna", "Jaipur", "Jammu", "Jamnagar", "Jeddah", "Jharsuguda", "Jodhpur", "Kabul", "Gulbarga", "Kandla ", "Kathmandu", "Khajuraho", "Kochi", "Kolhapur", "Kolkata", "Kozhikode", "Kullu", "Kuwait", "Leh", "Lilabari", "London", "Lucknow", "Ludhiana", "Madrid", "Madurai", "Male", "Mangalore", "Melbourne", "Milan", "Mumbai", "Muscat", "Mysore", "Nagpur", "Nairobi", "Nanded", "Nasik", "New York", "Newark", "Pantnagar", "Paris", "Pasighat", "Pathankot", "Patna", "Port Blair", "Pune", "Raipur", "Rajkot", "Ranchi", "Riyadh", "Rome", "San Francisco", "Seoul", "Shanghai", "Sharjah", "Shirdi", "Silchar", "Shimla", "Singapore", "Srinagar", "Srckholm", "Surat", "Sydney", "Tel Aviv", "Tezpur", "Thiruvananthapuram", "Tiruchirapalli", "Tirupati", "Tokyo", "Toronto", "Udaipur", "Vadodara", "Varanasi", "Vienna", "Vijayawada", "Visakhapatnam", "Washington", "Yangon", " ", " ", " ", " " }));
        from_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                from_jComboBoxActionPerformed(evt);
            }
        });

        to_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abu Dhabi", "Agartala", "Agatti", "Agra", "Ahmedabad", "Aizawl", "Allahabad", "Amritsar", "Aurangabad", "Bagdogra", "Bahrain", "Bangkok", "Belgaum", "Bengaluru", "Bhatinda", "Bhavnagar", "Bhopal", "Bhubaneswar", "Bhuj", "Bikaner", "Birmingham", "Chandigarh", "Chennai", "Chicago", "Coimbatore", "Colombo", "Copenhagen", "Dammam", "Dehra Dun", "Delhi", "Dhaka", "Dharamshala", "Dimapur", "DIU", "Doha", "Dubai", "Durgapur", "Frankfurt", "Gaya", "Goa", "Gorakhpur", "Guwahati", "Gwalior", "Hong Kong", "Hubli", "Hyderabad", "Imphal", "Indore", "Jabalpur", "Jaffna", "Jaipur", "Jammu", "Jamnagar", "Jeddah", "Jharsuguda", "Jodhpur", "Kabul", "Gulbarga", "Kandla ", "Kathmandu", "Khajuraho", "Kochi", "Kolhapur", "Kolkata", "Kozhikode", "Kullu", "Kuwait", "Leh", "Lilabari", "London", "Lucknow", "Ludhiana", "Madrid", "Madurai", "Male", "Mangalore", "Melbourne", "Milan", "Mumbai", "Muscat", "Mysore", "Nagpur", "Nairobi", "Nanded", "Nasik", "New York", "Newark", "Pantnagar", "Paris", "Pasighat", "Pathankot", "Patna", "Port Blair", "Pune", "Raipur", "Rajkot", "Ranchi", "Riyadh", "Rome", "San Francisco", "Seoul", "Shanghai", "Sharjah", "Shirdi", "Silchar", "Shimla", "Singapore", "Srinagar", "Srckholm", "Surat", "Sydney", "Tel Aviv", "Tezpur", "Thiruvananthapuram", "Tiruchirapalli", "Tirupati", "Tokyo", "Toronto", "Udaipur", "Vadodara", "Varanasi", "Vienna", "Vijayawada", "Visakhapatnam", "Washington", "Yangon", " ", " ", " ", " " }));

        day_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        month_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " ", " " }));

        year_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", " " }));
        year_jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                year_jComboBoxActionPerformed(evt);
            }
        });

        booking_submit_jButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        booking_submit_jButton.setText("Submit");
        booking_submit_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booking_submit_jButtonActionPerformed(evt);
            }
        });

        ebclass_jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(from_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(to_jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ebclass_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passng_jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(day_jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(month_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(booking_submit_jButton)
                        .addGap(157, 157, 157))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(from_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(to_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(day_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(passng_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(ebclass_jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(booking_submit_jButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void from_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_from_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_from_jComboBoxActionPerformed

    private void year_jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_jComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_jComboBoxActionPerformed

    private void booking_submit_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booking_submit_jButtonActionPerformed
        String origin;
        origin = from_jComboBox.getSelectedItem().toString();
        String dest;
        dest = to_jComboBox.getSelectedItem().toString();
        flight_details fd1;
        String date;

        UtilDateModel mode1 = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(mode1,null);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,null);
        // frame.add(datePicker);  //add JFRAME here

        date  = day_jComboBox.getSelectedItem().toString() + "/" + month_jComboBox.getSelectedItem().toString() + "/" + year_jComboBox.getSelectedItem().toString();
        String passng1 = passng_jTextField.getText();
        String ebclass;
        ebclass = ebclass_jComboBox.getSelectedItem().toString();
        try {
            fd1 = new flight_details(origin, dest, date, passng1, ebclass);
            fd1.setLocationRelativeTo(null);
            fd1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_booking_submit_jButtonActionPerformed


    /**
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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton booking_submit_jButton;
    private javax.swing.JComboBox<String> day_jComboBox;
    private javax.swing.JComboBox<String> ebclass_jComboBox;
    private javax.swing.JComboBox<String> from_jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JComboBox<String> month_jComboBox;
    private javax.swing.JTextField passng_jTextField;
    private javax.swing.JComboBox<String> to_jComboBox;
    private javax.swing.JComboBox<String> year_jComboBox;
    // End of variables declaration//GEN-END:variables
}
