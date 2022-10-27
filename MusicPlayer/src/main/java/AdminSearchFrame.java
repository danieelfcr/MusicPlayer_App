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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 *
 * @author danie
 */
public class AdminSearchFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminSearchFrame
     */
    public AdminSearchFrame() {
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
        jLabel9 = new javax.swing.JLabel();
        JTFRole = new javax.swing.JTextField();
        JDCBirthDate = new com.toedter.calendar.JDateChooser();
        JTFStatus = new javax.swing.JTextField();
        JBModify = new javax.swing.JButton();
        JBBack = new javax.swing.JButton();
        JTFName = new javax.swing.JTextField();
        JTFUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTFPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTFSearch = new javax.swing.JTextField();
        JBSearch = new javax.swing.JButton();
        jlblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel9.setText("*Phone number");

        JDCBirthDate.setDateFormatString("dd/MM/yyyy");

        JBModify.setText("Save changes");
        JBModify.setEnabled(false);
        JBModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBModifyActionPerformed(evt);
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

        jLabel12.setText("Search");

        JBSearch.setText("Search user");
        JBSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSearchActionPerformed(evt);
            }
        });

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
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBBack)
                        .addGap(587, 587, 587)
                        .addComponent(jLabel1))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFRole)
                                    .addComponent(JTFStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBModify)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(JTFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addComponent(JBSearch)))))
                .addContainerGap(206, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBBack)
                    .addComponent(jLabel1))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(JTFSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(291, 291, 291)
                                .addComponent(JBModify))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(JDCBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(JTFPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(JBPhoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTFPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
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
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JBSearch)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(54, 54, 54)
                                    .addComponent(jLabel9)))
                            .addGap(96, 96, 96))))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void JBModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBModifyActionPerformed
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
                        
                        Data usr = Data.Instance(username, name, lastname, password, String.valueOf(role), birthDate, email, phoneNumber, photoPath, String.valueOf(status));
                        UserFrame.updateUser(password, email, phoneNumber, photoPath, birthDate, usersFile, bitUsersFile, descUsersFile, descBitUsersFile);
                        showMessageDialog(null, "User modified");

                                              
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
    }//GEN-LAST:event_JBModifyActionPerformed

    private void JBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBackActionPerformed
        LoginFrame myFrame = new LoginFrame();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBBackActionPerformed

    private void JBSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSearchActionPerformed
        String searchUser = JTFSearch.getText();
        if (searchUser.equals(AdminData.getUser())) {
            JTFRole.setEnabled(false);
            JTFStatus.setEnabled(false);
        }
        
        if (!"".equals(searchUser)) {
            if (findUser(searchUser)) {
                showMessageDialog(null, "User found!");
                setOnText();
                JBModify.setEnabled(true);
                
            }
            else
            {
                showMessageDialog(null, "User not found.");
            }
        }
        else
        {
            showMessageDialog(null, "Enter the username you want to search.");
        }
    }//GEN-LAST:event_JBSearchActionPerformed

    private void jlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseClicked
        LoginFrame.filesReorganization();
        System.exit(0);
    }//GEN-LAST:event_jlblCloseMouseClicked

    public boolean findUser(String user)
    {
        String usersFilePath = "C:\\MEIA\\usuario.txt";
        String bitUsersFilePath = "C:\\MEIA\\bitacora_usuario.txt";
        
        File usersFile = new File(usersFilePath);
        File bitUsersFile = new File(bitUsersFilePath);
        
        try
        {
            FileReader frUsers = new FileReader(usersFilePath);
            BufferedReader brUsers = new BufferedReader(frUsers);
            
            FileReader frBitUsers = new FileReader(bitUsersFilePath);
            BufferedReader brBitUsers = new BufferedReader(frBitUsers);
            
            List<String> users = new ArrayList<String>();
            String linea = "";
            
            if (bitUsersFile.exists()) {
                while(!"".equals(linea = brBitUsers.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    if (arr[0].equalsIgnoreCase(user)) {
                        Data usr = Data.Instance(user, arr[1], arr[2], "", arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                        brUsers.close();
                        brBitUsers.close();
                        return true;
                        
                    }
                }
            }
            
            if (usersFile.exists()) {
                while(!"".equals(linea = brUsers.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    if (arr[0].equalsIgnoreCase(user)) {
                        Data usr = Data.Instance(user, arr[1], arr[2], "", arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
                        brUsers.close();
                        brBitUsers.close();
                        return true;
                        
                    }
                }
            }
            
            
            brUsers.close();
            brBitUsers.close();
           return false;
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        return false;
    }
    }
    
    public int Search(String[] arr, String x)
    {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    
    public void setOnText()
    {
        JTFUsername.setText(Data.getUser());
        JTFName.setText(Data.getName());
        JTFLastName.setText(Data.getLastName());
        JTFRole.setText(Data.getRole());
        JTFEmail.setText(Data.getEmail());
        JTFPhoneNumber.setText(Data.getPhone());
        JTFPhotoPath.setText(Data.getPhotoPath());
        JTFStatus.setText(Data.getStatus());
        
        Date date1;  
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(Data.getBirthDate());
            JDCBirthDate.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(UserFrame.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AdminSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBack;
    private javax.swing.JButton JBModify;
    private javax.swing.JButton JBPhoto;
    private javax.swing.JButton JBSearch;
    private com.toedter.calendar.JDateChooser JDCBirthDate;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFLastName;
    private javax.swing.JTextField JTFName;
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFPhoneNumber;
    private javax.swing.JTextField JTFPhotoPath;
    private javax.swing.JTextField JTFRole;
    private javax.swing.JTextField JTFSearch;
    private javax.swing.JTextField JTFStatus;
    private javax.swing.JTextField JTFUsername;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlblClose;
    // End of variables declaration//GEN-END:variables
}
