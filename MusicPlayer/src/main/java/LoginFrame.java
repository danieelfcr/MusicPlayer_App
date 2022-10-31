
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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
        jLabel3 = new javax.swing.JLabel();
        jTFUsername = new javax.swing.JTextField();
        jPFPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        JBLogin = new javax.swing.JButton();
        JBRegisterForm = new javax.swing.JButton();
        jlblClose = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);

        jLabel1.setText("Login");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel4.setText("Don´t have an account?");

        JBLogin.setText("Login");
        JBLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLoginActionPerformed(evt);
            }
        });

        JBRegisterForm.setText("Register here");
        JBRegisterForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegisterFormActionPerformed(evt);
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
                .addGap(318, 318, 318)
                .addComponent(jLabel4)
                .addGap(32, 32, 32)
                .addComponent(JBRegisterForm, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(267, 267, 267)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(122, 122, 122)
                                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(190, 190, 190)
                                    .addComponent(JBLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(219, 219, 219)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(115, 115, 115)
                                .addComponent(jTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(234, 234, 234))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(JBLogin)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JBRegisterForm))
                .addGap(207, 207, 207))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRegisterFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegisterFormActionPerformed
        //Open register form and close actual form
        RegisterFrame myFrame = new RegisterFrame();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBRegisterFormActionPerformed

    private void JBLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLoginActionPerformed
        String username = jTFUsername.getText().toLowerCase();
        String password = RegisterFrame.getMD5(jPFPassword.getText());
        
        if (userMatches(username, password)) {
            
            String [] userInformation = new String[10];
            if (isAdmin(username, userInformation)) {
                if (userInformation[9].contains("1")) {
                    AdminData usr = AdminData.Instance(username, userInformation[1], userInformation[2], password, userInformation[4], userInformation[5], userInformation[6], userInformation[7], userInformation[8], userInformation[9]);
                    JOptionPane.showMessageDialog(null, "¡Bienvenido " + username + "!" );
                    AdminMenu myFrame = new AdminMenu();
                    myFrame.setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Acceso denegado: usuario ya no existe" );
                }
                
            }
            else
            {
                if (userInformation[9].contains("1")) {
                Data usr = Data.Instance(username, userInformation[1], userInformation[2], password, userInformation[4], userInformation[5], userInformation[6], userInformation[7], userInformation[8], userInformation[9]);
                JOptionPane.showMessageDialog(null, "¡Bienvenido " + username + "!" );
                UserMusic myFrame = new UserMusic();
                myFrame.setVisible(true);
                dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Acceso denegado: usuario ya no existe" );
                }
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Acceso denegado: tus credenciales no coinciden.");
        }
    }//GEN-LAST:event_JBLoginActionPerformed

    private void jlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseClicked
        filesReorganization();
        System.exit(0);
    }//GEN-LAST:event_jlblCloseMouseClicked

    public boolean userMatches(String user, String password)
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
            List<String> passwords = new ArrayList<String>();
            String linea = "";
            
            if (bitUsersFile.exists()) {
                while(!"".equals(linea = brBitUsers.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    users.add(arr[0]);
                    passwords.add(arr[3]);
                }
            }
            
            if (usersFile.exists()) {
                while(!"".equals(linea = brUsers.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    users.add(arr[0]);
                    passwords.add(arr[3]);
                }
            }
            
            String [] arrUsers = new String[users.size()];
            arrUsers = users.toArray(arrUsers);
            int pos = Search(arrUsers, user);
            
            if (pos != -1) {
               String[] arrPass = passwords.toArray(new String[0]);
                if (arrPass[pos].equals(password)) {
                    brUsers.close();
                    brBitUsers.close();
                    return true;
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
    
    public boolean isAdmin(String user, String [] userInformation)
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

            String linea = "";
            
            if (bitUsersFile.exists()) {
                while(!"".equals(linea = brBitUsers.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    
                    if (arr[0].equals(user)) {
                        setInformation(arr, userInformation);
                        if (arr[4].equals("1")) {
                            return true;
                        }
                    }
                }
            }
            
            if (usersFile.exists()) {
                while(!"".equals(linea = brUsers.readLine())&& linea != null)
                {
                    String arr [] = linea.split("\\|");
                    
                    if (arr[0].equals(user)) {
                        setInformation(arr, userInformation);
                        if (arr[4].equals("1")) {
                            return true;
                        }
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
    
     public void setInformation(String[] arr, String[] userInformation)
        {
            for (int i = 0; i < 10; i++) {
                userInformation[i] = arr[i];
            }
        }
     
     public static void filesReorganization()
     {
            String usersFilePath = "C:\\MEIA\\usuario.txt";
            String bitUsersFilePath = "C:\\MEIA\\bitacora_usuario.txt";
            String descUsersFilePath = "C:\\MEIA\\desc_usuario.txt";
            String descBitUsersFilePath = "C:\\MEIA\\desc_bitacora_usuario.txt";

            File usersFile = new File(usersFilePath);
            File bitUsersFile = new File(bitUsersFilePath);

            File descUsersFile = new File(descUsersFilePath);
            File descBitUsersFile = new File(descBitUsersFilePath);

            try{
                if (usersFile.exists() && bitUsersFile.exists()) {
                    FileReader frResult = new FileReader(usersFile);
                    BufferedReader brResult = new BufferedReader(frResult);

                    FileReader frResultBit = new FileReader(bitUsersFile);
                    BufferedReader brResultBit = new BufferedReader(frResultBit);

                    List<String> masterUsers = new ArrayList<String>();
                    List<String> bitUsers = new ArrayList<String>();
                    String line = "";
                    
                    //Read each line of both files, if status is 1, add to specific list
                    while(!"".equals(line = brResult.readLine()) && line != null)
                    {
                        String [] arr = line.split("\\|");
                        if (arr[9].equals("1")) {
                            masterUsers.add(line);
                        }
                    }
                    while(!"".equals(line = brResultBit.readLine()) && line != null)
                    {
                        String [] arr = line.split("\\|");
                        if (arr[9].equals("1")) {
                            bitUsers.add(line);
                        }
                    }
                    
                    //For each information on bitUsers list, add it to masterUsers list
                    for (String info :bitUsers) {
                        masterUsers.add(info);
                    }
                    //Sort list
                    masterUsers.stream().sorted().collect(Collectors.toList());  
                    
                    //Write on master file
                    FileWriter fwMaster = new FileWriter(usersFile, false);
                    BufferedWriter bwMaster = new BufferedWriter(fwMaster);
                    
                    String content ="";
                    for (String info :masterUsers) {
                        content += info + "\n";
                    }
                    
                    bwMaster.write(content);
                    bwMaster.close();
                    RegisterFrame.updateDesc(usersFile, descUsersFile, "admin");
                    
                    //Clear binnacle
                    FileWriter fwBit = new FileWriter(bitUsersFile, false);
                    BufferedWriter bwBit = new BufferedWriter(fwBit);
                    
                    bwBit.write("");
                    bwBit.close();
                    RegisterFrame.updateDesc(bitUsersFile, descBitUsersFile, "admin");
                    
                }

            } catch (Exception e){
                e.printStackTrace();
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBLogin;
    private javax.swing.JButton JBRegisterForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPFPassword;
    private javax.swing.JTextField jTFUsername;
    private javax.swing.JLabel jlblClose;
    // End of variables declaration//GEN-END:variables
}
