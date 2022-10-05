
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author danie
 */
public class UserFrame extends javax.swing.JFrame {

    /**
     * Creates new form UserFrame
     */
    public UserFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFPassword = new javax.swing.JPasswordField();
        JBPhoto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JTFPhotoPath = new javax.swing.JTextField();
        JTFEmail = new javax.swing.JTextField();
        JBDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JBChangeInfo1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        JTFPhoneNumber = new javax.swing.JTextField();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        btnRefresh = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Welcome!");

        jLabel2.setText("Here you can change your personal information.");

        JBPhoto.setText("Import photo");

        jLabel5.setText("New password");

        jLabel6.setText("Birth date");

        jLabel7.setText("Email");

        jLabel8.setText("Profile photo");

        jLabel9.setText("Phone number");

        JTFPhotoPath.setEditable(false);

        JBDelete.setText("DELETE ACCOUNT");
        JBDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBDeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("WARNING ZONE!");

        JBChangeInfo1.setText("Save changes");
        JBChangeInfo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBChangeInfo1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Username:");

        jLabel10.setText("Role:");

        lblUsername.setText(" ");

        lblRole.setText(" ");

        jDateChooser.setDateFormatString("dd/MM/yyyy");

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4)
                        .addGap(266, 266, 266)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(lblUsername)
                        .addGap(263, 263, 263)
                        .addComponent(lblRole))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnRefresh)
                        .addGap(59, 59, 59)
                        .addComponent(btnLogOut)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(JTFPhoneNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTFPassword)
                                    .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(350, 350, 350)
                                .addComponent(JBChangeInfo1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(552, 552, 552)
                                .addComponent(JBPhoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBDelete))))
                .addGap(322, 322, 322))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblRole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JTFPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JBPhoto)
                        .addComponent(JTFPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBChangeInfo1)
                    .addComponent(jLabel3)
                    .addComponent(JBDelete))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnLogOut))
                .addGap(103, 103, 103))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBDeleteActionPerformed

    private void JBChangeInfo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBChangeInfo1ActionPerformed
       //Set text in text fields
       
        //Get text form text fields
       String newPassword = JTFPassword.getText();
       String newEmail = JTFEmail.getText();
       String newPhone = JTFPhoneNumber.getText();
       String newPhoto = JTFPhotoPath.getText();
       
       SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
       Date date = jDateChooser.getDate();
       String newBirthDate = dateFormat.format(date);
       
       validateUser(newPassword, newEmail, newPhone, newPhoto, newBirthDate);
    }//GEN-LAST:event_JBChangeInfo1ActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        JTFEmail.setText(Data.getEmail());
        JTFPhoneNumber.setText(Data.getPhone());
        JTFPhotoPath.setText(Data.getPhotoPath());
        Date date1;  
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Data.getBirthDate());
            jDateChooser.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblUsername.setText(Data.getUser());
        lblRole.setText("User");
        
        /*ImageIcon ico = new ImageIcon(getClass().getResource(Data.getPhotoPath()));
        icon.setIcon(ico);*/
        
        btnRefresh.setEnabled(false);
    
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
       showMessageDialog(null, "Logging out...");
       LoginFrame myFrame = new LoginFrame();
                myFrame.setVisible(true);
                dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    public void validateUser(String newPassword, String newEmail, String newPhone, String newPhoto, String newBirthDate)
    {
       
        
        if (!"".equals(newPassword) && !"".equals(newEmail) && !"".equals(newPhone) && !"".equals(newPhoto) && !"".equals(newBirthDate) && newBirthDate.length() == 10){
            if (newPhone.length() == 8 && RegisterFrame.isNumeric(newPhone)) {
                if (newEmail.contains("@")) {
                    if (RegisterFrame.passSecurityLevel(newPassword)) {
                        newPassword = RegisterFrame.getMD5(newPassword); //Encrypt password
                        
                        String usersFilePath = "C:\\MEIA\\usuario.txt";
                        String bitUsersFilePath = "C:\\MEIA\\bitacora_usuario.txt";
                        String descUsersFilePath = "C:\\MEIA\\desc_usuario.txt";
                        String descBitUsersFilePath = "C:\\MEIA\\desc_bitacora_usuario.txt";

                        File usersFile = new File(usersFilePath);
                        File bitUsersFile = new File(bitUsersFilePath);
                        File descUsersFile = new File(descUsersFilePath);
                        File descBitUsersFile = new File(descBitUsersFilePath); 
                        
                        updateUser(newPassword, newEmail, newPhone, newPhoto, newBirthDate, usersFile, bitUsersFile, descUsersFile, descBitUsersFile);
                        showMessageDialog(null, "Your personal information was modified.");
                    }
                    else
                    {
                        showMessageDialog(null, "Data Modification Failed: Your password is not secure, try with another password.");
                    }
                }
                else
                {
                    showMessageDialog(null, "Data Modification Failed: Your email is not valid.");
                }
            }
            else
            {
                showMessageDialog(null, "Data Modification Failed: Your phone number is not valid.");
            }
        } 
       else
            {
                showMessageDialog(null, "Data Modification Failed: Some fields are empty or in the wrong format.");
            } 
        
    }
    
    public void updateUser(String newPassword, String newEmail, String newPhone, String newPhoto, String newBirthDate, File master, File bit, File descMaster, File descBit)
    {
        String user = Data.getUser(), name = Data.getName(), lastname = Data.getLastName();
        String role = Data.getRole(),  status = Data.getStatus();
        String content = "";
 
        String data = user + "|" + name + "|" + lastname + "|" + newPassword + "|" + role + "|" + newBirthDate + "|" + newEmail + "|" + newPhone + "|" + newPhoto + "|" + status;

            try
        {
            FileReader frResult = new FileReader(master);
            BufferedReader brResult = new BufferedReader(frResult);
            
            FileReader frResultBit = new FileReader(bit);
            BufferedReader brResultBit = new BufferedReader(frResultBit);
            
            String line;
            int pos = 0;
            int auxpos = 0;
            boolean flag = false;
            List<String> list = new ArrayList<String>();

            while((line = brResultBit.readLine()) != null){
                list.add(line);
                String[] Arr = line.split("\\|");
                if (Arr[0].equalsIgnoreCase(user)) {
                    flag = true; 
                    auxpos = pos;
                }
                pos++;
            }
            
            if (!flag) {
               pos = 0;
               list.clear();
                while((line = brResult.readLine()) != null){
                list.add(line);
                String[] Arr = line.split("\\|");
                if (Arr[0].equalsIgnoreCase(user)) {   
                    auxpos = pos;
                }
                pos++;
            }
                }
                if (flag) {                  
                    list.set(auxpos, data);

                    for (String x :list) {
                         content += x + "\n";
                    }
                    FileWriter fwbit = new FileWriter(bit, false);
                    BufferedWriter bwbit = new BufferedWriter(fwbit);
                    bwbit.write(content);
                    bwbit.close();
                    RegisterFrame.updateDesc(bit, descBit, user);
                }
                else 
                {
                    list.set(auxpos, data);

                    for (String x :list) {
                         content += x + "\n";
                    }
                    FileWriter fwmaster = new FileWriter(master, false);
                    BufferedWriter bwmaster = new BufferedWriter(fwmaster);
                    bwmaster.write(content);
                    bwmaster.close();
                    RegisterFrame.updateDesc(master, descMaster, user);
                }
                
                
            }
       catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                } 
    }
    
    
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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);       
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBChangeInfo1;
    private javax.swing.JButton JBDelete;
    private javax.swing.JButton JBPhoto;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFPhoneNumber;
    private javax.swing.JTextField JTFPhotoPath;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel icon;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
