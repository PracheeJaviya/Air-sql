
import com.toedter.calendar.JDateChooser;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Registration extends javax.swing.JFrame {

    Connection conn = null;
    int ct=1;
    public Registration() throws SQLException {
        initComponents();
        conn = DB_Connect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        submit_reg_jTextField = new javax.swing.JButton();
        name_reg_jTextField = new javax.swing.JTextField();
        user_reg_jTextField = new javax.swing.JTextField();
        mobile_reg_jTextField = new javax.swing.JTextField();
        email_reg_jTextField = new javax.swing.JTextField();
        state_reg_jTextField = new javax.swing.JTextField();
        country_reg_jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addr_reg_jTextArea = new javax.swing.JTextArea();
        city_reg_jTextField = new javax.swing.JTextField();
        pass_reg_jPasswordField = new javax.swing.JPasswordField();
        cpass_reg_jPasswordField = new javax.swing.JPasswordField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name :");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        jLabel4.setText("Confirm Password :");

        jLabel5.setText("Mobile No. :");

        jLabel6.setText("Email :");

        jLabel7.setText("DOB :");

        jLabel8.setText("Address :");

        jLabel10.setText("City :");

        jLabel11.setText("State :");

        jLabel12.setText("Country :");

        submit_reg_jTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        submit_reg_jTextField.setText("Submit");
        submit_reg_jTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_reg_jTextFieldActionPerformed(evt);
            }
        });

        addr_reg_jTextArea.setColumns(20);
        addr_reg_jTextArea.setRows(5);
        jScrollPane1.setViewportView(addr_reg_jTextArea);

        city_reg_jTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                try {
                    city_reg_jTextFieldMouseExited(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_reg_jTextField)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(name_reg_jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                        .addComponent(user_reg_jTextField)
                        .addComponent(mobile_reg_jTextField)
                        .addComponent(email_reg_jTextField)
                        .addComponent(state_reg_jTextField)
                        .addComponent(country_reg_jTextField)
                        .addComponent(city_reg_jTextField)
                        .addComponent(jScrollPane1)
                        .addComponent(pass_reg_jPasswordField)
                        .addComponent(cpass_reg_jPasswordField)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(user_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(pass_reg_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cpass_reg_jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mobile_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(email_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(city_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(state_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(country_reg_jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(submit_reg_jTextField)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_reg_jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_reg_jTextFieldActionPerformed
        try {
            int logon = 0;
            String SQLQuery = "INSERT INTO userdetails(\n" +  "name, addr, city,state,country, username, passwd, mobno, email, dob, logon)\n" + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?,?);";
            PreparedStatement pst = conn.prepareStatement(SQLQuery);
            pst.setString(1, name_reg_jTextField.getText());
            pst.setString(2, addr_reg_jTextArea.getText());
            pst.setString(3, city_reg_jTextField.getText());
            pst.setString(4, state_reg_jTextField.getText());
            pst.setString(5, country_reg_jTextField.getText());
            pst.setString(6, user_reg_jTextField.getText());
            pst.setString(7, pass_reg_jPasswordField.getText());
            pst.setString(8, mobile_reg_jTextField.getText());
            pst.setString(9, email_reg_jTextField.getText());
            pst.setString(10, jDateChooser1.getDate().toString().substring(4, 10) + " " + jDateChooser1.getDate().toString().substring(23));
            pst.setInt(11, logon);

            //CHECK AGE (invalid age)
            String dateage = jDateChooser1.getDate().toString();
            CallableStatement AGECHK =conn.prepareCall("{?=call agechk(?)}");
            AGECHK.setString(2,dateage);
            AGECHK.registerOutParameter(1, Types.INTEGER);
            AGECHK.execute();
            Integer ageret = AGECHK.getInt(1);

            //CHECK CITY
            CallableStatement CITYCHK =conn.prepareCall("{?=call citychk(?)}");
            CITYCHK.setString(2,city_reg_jTextField.getText());
            CITYCHK.registerOutParameter(1, Types.INTEGER);
            CITYCHK.execute();
            Integer cityret = CITYCHK.getInt(1);
            //System.out.println("cityret "+cityret);

            //CHECK AGE
            String date = jDateChooser1.getDate().toString();
            System.out.println(date);
            CallableStatement DOBCHK=conn.prepareCall("{?=call dobchk(?)}");
            DOBCHK.setString(2,date);
            DOBCHK.registerOutParameter(1,Types.INTEGER);
            DOBCHK.execute();
            Integer dobret=DOBCHK.getInt(1);

            //CHECK IF PASSWORDS MATCH
            CallableStatement PASSCHK =conn.prepareCall("{?=call passchk(?,?)}");
            PASSCHK.setString(2,pass_reg_jPasswordField.getText());
            PASSCHK.setString(3,cpass_reg_jPasswordField.getText());
            PASSCHK.registerOutParameter(1, Types.INTEGER);
            PASSCHK.execute();
            Integer passret = PASSCHK.getInt(1);



            //CHECK USERNAME
            CallableStatement USNMCHK =conn.prepareCall("{?=call usnmchk(?)}");
            USNMCHK.setString(2,user_reg_jTextField.getText());
            USNMCHK.registerOutParameter(1, Types.INTEGER);
            USNMCHK.execute();
            Integer usnmret = USNMCHK.getInt(1);



            // CHECK EMAIL ID
            CallableStatement MAILCHK =conn.prepareCall("{?=call mailchk(?)}");
            MAILCHK.setString(2,email_reg_jTextField.getText());
            MAILCHK.registerOutParameter(1, Types.INTEGER);
            MAILCHK.execute();
            Integer mailret = MAILCHK.getInt(1);


            // CHECK MOBILE NUMBER
            CallableStatement MOBCHK =conn.prepareCall("{?=call mobchk(?)}");
            MOBCHK.setString(2,mobile_reg_jTextField.getText());
            MOBCHK.registerOutParameter(1, Types.INTEGER);
            MOBCHK.execute();
            Integer mobret = MOBCHK.getInt(1);

//            String SQLFatal = "INSERT INTO userdetails(\n" +  "name, addr, city, state, country, username, passwd, mobno, email, dob, logon)\n" + "VALUES ('fatal','fatal','fatal','fatal','fatal','fatal','fatal','fatal','fatal','fatal','fatal');";
//            PreparedStatement fatal = conn.prepareStatement(SQLFatal);


              if(mobret==0)
                  JOptionPane.showMessageDialog(null, "Check your Mobile Number");
              else if(usnmret==1)
                  JOptionPane.showMessageDialog(null, "Username taken");
              else if(mailret==0)
                  JOptionPane.showMessageDialog(null, "PLease check your email");
              else if (passret==0)
                  JOptionPane.showMessageDialog(null, "Passwords do not match");
              else if (ageret==0)
                  JOptionPane.showMessageDialog(null, "Invalid age");
              else if (dobret==0)
                  JOptionPane.showMessageDialog(null, "Underage");
              else if (cityret==0 && ct == 0)
                  JOptionPane.showMessageDialog(null, "City does not exist");
              else if(mobret==1 && usnmret==0 && mailret==1 && passret==1 && ageret==1 && cityret==1) {
                  pst.executeQuery();
                  dispose();

              }
            } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Login lg1 = new Login();
            lg1.setVisible(true);
            lg1.setLocationRelativeTo(null);

        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
//
    }//GEN-LAST:event_submit_reg_jTextFieldActionPerformed

    private void city_reg_jTextFieldMouseExited(java.awt.event.MouseEvent evt) throws SQLException {//GEN-FIRST:event_city_reg_jTextFieldMouseExited
        // TODO add your handling code here:
        String StateQuery="SELECT state from place \n"+"WHERE city = ?";
        PreparedStatement st = conn.prepareStatement(StateQuery,ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        st.setString(1,city_reg_jTextField.getText());
        ResultSet state = st.executeQuery();
        String statee =null;
        System.out.println(state.first());
        state.beforeFirst();
        while(state.next()) {
            statee = state.getString("state");
            state_reg_jTextField.setText(statee);
            country_reg_jTextField.setText("India");

        }
        if(statee == null)
            ct=0;
    }//GEN-LAST:event_city_reg_jTextFieldMouseExited


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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registration rg1 = new Registration();
                    rg1.setVisible(true);
                    rg1.setLocationRelativeTo(null);
                } catch (SQLException ex) {
                    Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addr_reg_jTextArea;
    private javax.swing.JTextField city_reg_jTextField;
    private javax.swing.JTextField country_reg_jTextField;
    private javax.swing.JPasswordField cpass_reg_jPasswordField;
    private javax.swing.JTextField email_reg_jTextField;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile_reg_jTextField;
    private javax.swing.JTextField name_reg_jTextField;
    private javax.swing.JPasswordField pass_reg_jPasswordField;
    private javax.swing.JTextField state_reg_jTextField;
    private javax.swing.JButton submit_reg_jTextField;
    private javax.swing.JTextField user_reg_jTextField;
    // End of variables declaration//GEN-END:variables
}
