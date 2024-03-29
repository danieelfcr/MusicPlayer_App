/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.util.List;
import java.io.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.stream.Collectors;
/**
 *
 * @author danie
 */
public class AdminRegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminRegisterFrame
     */
    public AdminRegisterFrame() {
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

        jLabel9 = new javax.swing.JLabel();
        JDCBirthDate = new com.toedter.calendar.JDateChooser();
        JBRegister = new javax.swing.JButton();
        JBBack = new javax.swing.JButton();
        JTFName = new javax.swing.JTextField();
        JTFUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        JTFLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFPhotoPath = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JBPhoto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JTFPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTFRole = new javax.swing.JTextField();
        JTFStatus = new javax.swing.JTextField();
        jlblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("*Phone number");

        JDCBirthDate.setDateFormatString("dd/MM/yyyy");

        JBRegister.setText("Register");
        JBRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegisterActionPerformed(evt);
            }
        });

        JBBack.setText("Back to login");
        JBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Register");

        jLabel2.setText("*Username");

        jLabel3.setText("*Name");

        JTFPhotoPath.setEditable(false);

        jLabel4.setText("*Last name");

        jLabel5.setText("*Password");

        JBPhoto.setText("Import photo");
        JBPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPhotoActionPerformed(evt);
            }
        });

        jLabel6.setText("*Birth date");

        jLabel10.setText("*Profile photo");

        jLabel7.setText("*Email");

        jLabel8.setText("*Role");

        jLabel11.setText("*Status");

        jlblClose.setBackground(new java.awt.Color(74, 31, 61));
        jlblClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlblClose.setText("X");
        jlblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JTFEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFPhotoPath, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JBPhoto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JTFPhoneNumber)
                                .addComponent(JDCBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTFRole)
                            .addComponent(JTFStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                        .addContainerGap(341, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBBack)
                        .addGap(587, 587, 587)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(JBRegister)
                        .addGap(737, 737, 737))
                    .addComponent(jlblClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBBack)
                    .addComponent(jLabel1))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(47, 47, 47)
                            .addComponent(jLabel3)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel4)
                            .addGap(73, 73, 73)
                            .addComponent(jLabel5)
                            .addGap(59, 59, 59)
                            .addComponent(jLabel6)
                            .addGap(56, 56, 56)
                            .addComponent(jLabel7)
                            .addGap(54, 54, 54)
                            .addComponent(jLabel9)
                            .addGap(96, 96, 96))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(JTFRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGap(43, 43, 43)
                                        .addComponent(JTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103))
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(JDCBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JTFPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(JBPhoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(JBRegister)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegisterActionPerformed
        //Fields
        String username = JTFUsername.getText().toLowerCase();
        String name = JTFName.getText();
        String lastname = JTFLastName.getText();
        String password = JTFPassword.getText();
        String email = JTFEmail.getText();
        String phoneNumber = JTFPhoneNumber.getText();
        String photoPath = JTFPhotoPath.getText();
        int role = Integer.parseInt(JTFRole.getText());
        int status = Integer.parseInt(JTFStatus.getText());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = JDCBirthDate.getDate();
        String birthDate = dateFormat.format(date);

        if (username.length() != 0 && name.length() != 0 && lastname.length() != 0 && password.length() != 0 && email.length() != 0  && birthDate.length() == 10){
            if (phoneNumber.length() == 8 && RegisterFrame.isNumeric(phoneNumber)) {
                if (email.contains("@")) {
                    if (RegisterFrame.passSecurityLevel(password)) {
                        password = RegisterFrame.getMD5(password); //Encrypt password

                        String usersFilePath = "C:\\MEIA\\usuario.txt";
                        String bitUsersFilePath = "C:\\MEIA\\bitacora_usuario.txt";
                        String descUsersFilePath = "C:\\MEIA\\desc_usuario.txt";
                        String descBitUsersFilePath = "C:\\MEIA\\desc_bitacora_usuario.txt";

                        File usersFile = new File(usersFilePath);
                        File bitUsersFile = new File(bitUsersFilePath);

                        File descUsersFile = new File(descUsersFilePath);
                        File descBitUsersFile = new File(descBitUsersFilePath);

                        try{
                            if (!usersFile.exists() && !bitUsersFile.exists()) {
                                //If it's the first user, create admin and add to binnacle
                                role = 1;
                            }

                            if (!usersFile.exists()) {
                                usersFile.createNewFile();
                                descUsersFile.createNewFile();
                                RegisterFrame.createDesc(descUsersFile, username);
                            }
                            if (!bitUsersFile.exists()) {
                                bitUsersFile.createNewFile();
                                descBitUsersFile.createNewFile();
                                RegisterFrame.createDesc(descBitUsersFile, username);
                            }
                            if (!RegisterFrame.userExists(usersFile, bitUsersFile, username)) {
                                if (!RegisterFrame.isMaxReorg(bitUsersFile, descBitUsersFile)) {
                                    RegisterFrame.addUserToBit(username, name, lastname, password, role, birthDate, email, phoneNumber, photoPath, status, bitUsersFile, descBitUsersFile);
                                }
                                else
                                {
                                    RegisterFrame.addUser(usersFile, bitUsersFile, descUsersFile, descBitUsersFile);
                                    RegisterFrame.addUserToBit(username, name, lastname, password, role, birthDate, email, phoneNumber, photoPath, status, bitUsersFile, descBitUsersFile);
                                }

                                //Invoke login form
                                showMessageDialog(null, "Your user has been successfully created. Please, enter your credentials to continue.");
                                LoginFrame myFrame = new LoginFrame();
                                myFrame.setVisible(true);
                                dispose();
                            }
                            else
                            {
                                showMessageDialog(null, "Register Failed: Your username already exists.");
                            }

                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        showMessageDialog(null, "Register Failed: Your password is not secure, try with another password.");
                    }

                }
                else
                {
                    showMessageDialog(null, "Register Failed: Your email is not valid.");
                }
            }
            else
            {
                showMessageDialog(null, "Register Failed: Your phone number is not valid.");
            }
        }
        else
        {
            showMessageDialog(null, "Register Failed: Some fields are empty or in the wrong format.");
        }
    }//GEN-LAST:event_JBRegisterActionPerformed

    private void JBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBackActionPerformed
        LoginFrame myFrame = new LoginFrame();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBBackActionPerformed

    private void JBPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPhotoActionPerformed
        //Create a JFileChooser, add a filter for images and let the user choose his profile image, setting the path in the textbox.
        JFileChooser dialogue = new JFileChooser("C:\\MEIA");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Images", "jpg", "png");
        dialogue.setFileFilter(filter);

        File imageFile;
        String imagePath;

        int valor = dialogue.showOpenDialog(this);

        if (valor == JFileChooser.APPROVE_OPTION) {
            imageFile = dialogue.getSelectedFile();
            imagePath = imageFile.getPath();

            JTFPhotoPath.setText(imagePath);
        }
    }//GEN-LAST:event_JBPhotoActionPerformed

    private void jlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseClicked
        LoginFrame.filesReorganization();
        System.exit(0);
    }//GEN-LAST:event_jlblCloseMouseClicked

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
            java.util.logging.Logger.getLogger(AdminRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminRegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBack;
    private javax.swing.JButton JBPhoto;
    private javax.swing.JButton JBRegister;
    private com.toedter.calendar.JDateChooser JDCBirthDate;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFLastName;
    private javax.swing.JTextField JTFName;
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFPhoneNumber;
    private javax.swing.JTextField JTFPhotoPath;
    private javax.swing.JTextField JTFRole;
    private javax.swing.JTextField JTFStatus;
    private javax.swing.JTextField JTFUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlblClose;
    // End of variables declaration//GEN-END:variables
}
