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
import java.time.LocalDateTime;
import java.util.stream.Collectors;
/**
 *
 * @author danie
 */
public class RegisterFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegisterFrame
     */
    public RegisterFrame() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        JBRegister = new javax.swing.JButton();
        JTFName = new javax.swing.JTextField();
        JTFUsername = new javax.swing.JTextField();
        JTFPassword = new javax.swing.JPasswordField();
        JTFLastName = new javax.swing.JTextField();
        JTFPhotoPath = new javax.swing.JTextField();
        JTFEmail = new javax.swing.JTextField();
        JBPhoto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        JTFPhoneNumber = new javax.swing.JTextField();
        JDCBirthDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Register");

        jLabel2.setText("*Username");

        jLabel3.setText("*Name");

        jLabel4.setText("*Last name");

        jLabel5.setText("*Password");

        jLabel6.setText("*Birth date");

        jLabel7.setText("*Email");

        jLabel9.setText("*Phone number");

        JBRegister.setText("Register");
        JBRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegisterActionPerformed(evt);
            }
        });

        JTFPassword.setText("jPasswordField1");

        JTFPhotoPath.setEditable(false);

        JBPhoto.setText("Import photo");
        JBPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPhotoActionPerformed(evt);
            }
        });

        jLabel10.setText("*Profile photo");

        JDCBirthDate.setDateFormatString("dd/MM/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(139, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                            .addComponent(JTFPhotoPath, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBPhoto, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFPhoneNumber)
                            .addComponent(JDCBirthDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(547, 547, 547)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(JBRegister)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(JTFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(JTFLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5))
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(JDCBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(JTFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(JTFPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(JBPhoto))
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTFPhotoPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(JBRegister)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegisterActionPerformed
        //Fields
        String username = JTFUsername.getText();
        String name = JTFName.getText();
        String lastname = JTFLastName.getText();
        String password = JTFPassword.getText();
        String email = JTFEmail.getText();
        String phoneNumber = JTFPhoneNumber.getText();
        String birthDate = JDCBirthDate.getDateFormatString();
        String photoPath = JTFPhotoPath.getText();
        int role = 0, status = 1;
        
        if (username.length() != 0 && name.length() != 0 && lastname.length() != 0 && password.length() != 0 && email.length() != 0  && birthDate.length() == 10){
            if (phoneNumber.length() == 8 && isNumeric(phoneNumber)) {
                if (email.contains("@")) {
                    if (passSecurityLevel(password)) {
                        password = getMD5(password); //Encrypt password
                        
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
                                createDesc(descUsersFile, username);
                            }
                            if (!bitUsersFile.exists()) {
                                bitUsersFile.createNewFile();
                                descBitUsersFile.createNewFile();
                                createDesc(descBitUsersFile, username);
                            }
                           
                            if (!isMaxReorg(bitUsersFile, descBitUsersFile)) {
                                addUserToBit(username, name, lastname, password, role, birthDate, email, phoneNumber, photoPath, status, bitUsersFile, descBitUsersFile);
                            }
                            else
                            {
                                addUser(usersFile, bitUsersFile, descUsersFile, descBitUsersFile);
                                addUserToBit(username, name, lastname, password, role, birthDate, email, phoneNumber, photoPath, status, bitUsersFile, descBitUsersFile);
                            }
                            
                            showMessageDialog(null, "Your user has been successfully created. Please, enter your credentials to continue.");
                            
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    else
                    {
                        showMessageDialog(null, "Register Failed: Your password is not secure, try with another password");
                    }
   
                }
                else
                {
                    showMessageDialog(null, "Register Failed: Your email is not valid");
                }
            }
            else
            {
                showMessageDialog(null, "Register Failed: Your phone number is not valid.");
            }
        }
        else
        {
            showMessageDialog(null, "Register Failed: Some fields are empty or in the wrong format");
        }
    }//GEN-LAST:event_JBRegisterActionPerformed

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

    public static boolean isNumeric(String str) 
    { 
          try {  
            Double.parseDouble(str);  
            return true;
          } catch(NumberFormatException e){  
            return false;  
          }  
    }    
    public boolean passSecurityLevel(String password)
    {
        try{
         
            //Read first file
         File puncutationFile = new File ("C:\\MEIA\\Password_Security_Level\\Punctuation.txt");
         FileReader frPunctuation = new FileReader(puncutationFile);
         BufferedReader brPunctuation = new BufferedReader(frPunctuation);
         

             //Read second file
             File resultFile = new File ("C:\\MEIA\\Password_Security_Level\\Result.txt");         
             FileReader frResult = new FileReader(resultFile);
             BufferedReader brResult = new BufferedReader(frResult);

            String linea;

            //Add lines of first file to array
            List<String> list = new ArrayList<String>();
            while((linea = brResult.readLine()) != null){
             list.add(linea);
            }
            String[] resArr = list.toArray(new String[0]);

            //Add lines of second file to array
            list.clear();
            linea = "";
            while((linea = brPunctuation.readLine()) != null){
             list.add(linea);
            }
            String[] punArr = list.toArray(new String[0]);

            String oneline = joinStrings(resArr);
            String[]newresArr = oneline.split(",");

            //Close files
            brPunctuation.close();
            brResult.close();

            //Show punctuation
            return result(newresArr, punctuation(punArr, password));      
        }
        catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return false;
                }
    }    
     public int punctuation(String[] punArr, String pass)
    {
        int punc = 0;
        //Beginning in 0 because line number 1 isnt in array (it has already been read)
        punc += Integer.parseInt(punArr[0]) * pass.length();
        punc += Integer.parseInt(punArr[1]) * countUpperCase(pass);
        punc += (countLetters(pass) + Integer.parseInt(punArr[2]));
        punc += countNumbers(pass) + Integer.parseInt(punArr[3]);
        punc += countSymbols(pass) * (pass.length() + Integer.parseInt(punArr[4]));
        
        if(countLetters(pass) == pass.length())
        {
            punc -= Integer.parseInt(punArr[5]);
        }
        else if(countNumbers(pass) == pass.length())
        {
            punc -=Integer.parseInt(punArr[6]);
        }

       
        return punc;
    }   
    public boolean result(String[] resArr, int punc)
    {
        String res = "";
        boolean isSecure = false;
        if(punc >= Integer.parseInt(resArr[0]) && punc <= Integer.parseInt(resArr[1]))
        {
            res = "Your password is not secure."; 
        }
        else if(punc >= Integer.parseInt(resArr[2]) && punc <= Integer.parseInt(resArr[3]))
        {
            res = "Your password is not so secure.";
        }
        else if(punc >= Integer.parseInt(resArr[4]) && punc <= Integer.parseInt(resArr[5]))
        {
           res = "Your password is secure."; 
           isSecure = true;
        }
        else
        {
           res = "Your password is very secure.";
           isSecure = true;
        }
        JOptionPane.showMessageDialog(null, res);
        return isSecure;
    }    
    private int countUpperCase(String string)
    {
        int count = 0;
        char[] charArr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(charArr[i])) {
                count++;
            }
        }
        return count;
    }
    private int countNumbers(String string)
    {
        int count = 0;
        char[] charArr = string.toCharArray();
        for(int i = 0; i< string.length(); i++)
        {
            if(!Character.isLetter(charArr[i]))
            {
               count++; 
            }
        }
        return count;
    }
    private int countLetters(String string)
    {
        int count = 0;
        char[] charArr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(charArr[i])) {
                count++;
            }
        }
        return count;
    }
    private int countSymbols(String string)
    {
        int count = 0;
        char[] charArr = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            if ((charArr[i] == 47) || (charArr[i] >=36 && charArr[i] <= 38) || (charArr[i] == 63) || (charArr[i] == 168)) 
            {
                count++;
            }
        }
        return count;
    }
    private String joinStrings(String[] resultadoArr)
    {
        
         return resultadoArr[0] + "," + resultadoArr[1] + "," + resultadoArr[2] + "," + resultadoArr[3];
    }
    public static String getMD5(String input) 
    {
         try {
             MessageDigest md = MessageDigest.getInstance("MD5");
             byte[] messageDigest = md.digest(input.getBytes());
             BigInteger number = new BigInteger(1, messageDigest);
             String hashtext = number.toString(16);

             while (hashtext.length() < 32) {
                 hashtext = "0" + hashtext;
             }
             return hashtext;
         }
         catch (NoSuchAlgorithmException e) {
             throw new RuntimeException(e);
         }
     }
    public String getDate()
    {
        LocalDateTime localDate = LocalDateTime.now();
        int day = localDate.getDayOfMonth();
        int month = localDate.getMonthValue();
        int year = localDate.getYear();
        
        int hours = localDate.getHour();
        int minutes = localDate.getMinute();
        int seconds = localDate.getSecond();
        
        return day + "/" + month + "/" + year + " " + hours + ":" + minutes + ":" + seconds;
    }
    public void createDesc(File file, String username)
    {
        try{
        String descContent = "nombre_simbolico: " + file.getName()
                + "\nfecha_creacion: " + getDate()
                + "\nusuario_creacion: " + username
                + "\nfecha_modificacion: "
                + "\nusuario_modificacion: "
                + "\n#_registros: 0"
                + "\nregistros_activos: 0"
                + "\nregistros_inactivos: 0"
                + "\nmax_reorganización: 3"; //3 IS THE DEFAULT VALUE
        
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descContent);
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int MaxReorg(File file)
    {
        try
        {
            FileReader frResult = new FileReader(file);
             BufferedReader brResult = new BufferedReader(frResult);

            String line, aux = "";

            //Obtain last line
            while((line = brResult.readLine()) != null){
                aux = line;
            }
            
            aux = aux.replace("max_reorganización: ", "");
            
            brResult.close();
            
            int maxReorg = Integer.parseInt(aux);
            return maxReorg;
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return -1;
                }  
    }
    public boolean isMaxReorg(File bit, File desc)
    {
       int count = countUsers(bit);          
       return count>=MaxReorg(desc);        
 
    }
    public void addUserToBit(String user, String name, String lastname, String pass, int role, String birthDate, String email, String phone, String imagePath, int status, File file, File desc)
    {
         try{
            String data = user + "|" + name + "|" + lastname + "|" + pass + "|" + role + "|" + birthDate + "|" + email + "|" + phone + "|" + imagePath + "|" + status + "\n";
        
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(data);
            bw.close();
            
            updateDesc(file, desc, user);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void updateDesc(File bit, File desc, String user)
    {
        try
        {
            FileReader frResult = new FileReader(bit);
            BufferedReader brResult = new BufferedReader(frResult);
            
            FileReader frResultDesc = new FileReader(desc);
            BufferedReader brResultDesc = new BufferedReader(frResultDesc);

            String line;
            List<String> list = new ArrayList<String>();

            while((line = brResultDesc.readLine()) != null){
                list.add(line);
            }
            
            list.set(3, "fecha_modificacion: " + getDate());
            list.set(4, "usuario_modificacion: " + user);
            list.set(5, "#_registros: " + countUsers(bit));
            list.set(6, "registros_activos: " + countActive(bit));
            list.set(7, "#registros_inactivos: " + countInactive(bit));
            
            String descContent = "";
            
            for (String data :list) {
                descContent += data + "\n";
            }
            
            FileWriter fw = new FileWriter(desc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descContent);
            
            brResult.close();
            brResultDesc.close();
            bw.close();
                
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }  
    }
    public int countUsers(File file)
    {
        try
        {
            FileReader frResult = new FileReader(file);
            BufferedReader brResult = new BufferedReader(frResult);

            String line;
            int count = 0;

            while((line = brResult.readLine()) != null){
                count++;
            }
            return count;
                
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return -1;
                }  
    }
    public int countActive(File file)
    {
        try
        {
            FileReader frResult = new FileReader(file);
            BufferedReader brResult = new BufferedReader(frResult);

            String line;
            int count = 0;

            while((line = brResult.readLine()) != null){
                String[] arr = line.split("\\|");
                if (arr[9].contains("1")) {
                    count++;
                }
            }
            return count;
                
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return -1;
                }  
    }
    public int countInactive(File file)
    {
        try
        {
            FileReader frResult = new FileReader(file);
            BufferedReader brResult = new BufferedReader(frResult);

            String line;
            int count = 0;

            while((line = brResult.readLine()) != null){
                String[] arr = line.split("\\|");
                if (arr[9].contains("0")) {
                    count++;
                }
            }
            return count;
                
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return -1;
                }  
    }
    public void addUser(File master, File bit, File descMaster, File descBit)
    {
       try
        {
            //Read master and binnacle files
            FileReader frResultMaster = new FileReader(master);
            BufferedReader brResultMaster = new BufferedReader(frResultMaster);
            
            FileReader frResultBit = new FileReader(bit);
            BufferedReader brResultBit = new BufferedReader(frResultBit);

            String line;
            List<String> masterData = new ArrayList<String>();

            //Add users from master to list
            while((line = brResultMaster.readLine()) != null){
                masterData.add(line);
            }
            
            String lastUser = "";
            //Add users from binnacle to list
            while((line = brResultBit.readLine()) != null){
                //Verify if status is 1
                String[] arr = line.split("\\|");
                if (arr[9].contains("1")) {
                     masterData.add(line);
                     lastUser = arr[0];
                }      
            }
            
            //Create new list with all data and sort it
            List<String> newMasterData = masterData.stream().sorted().collect(Collectors.toList());
            
            String masterContent = "";
            
            for (String data :newMasterData) {
                masterContent += data + "\n";
            }
            
            //Write data on master
            FileWriter fwMaster = new FileWriter(master);
            BufferedWriter bwMaster = new BufferedWriter(fwMaster);
            bwMaster.write(masterContent);
            
            brResultMaster.close();
            brResultBit.close();
            bwMaster.close();            
                        
            //Update master descriptor
            updateDesc(master, descMaster, lastUser);
            
            //Delete data from binnacle
            FileWriter fwBit = new FileWriter(bit);
            BufferedWriter bwBit = new BufferedWriter(fwBit);
            bwBit.write("");
            
            bwBit.close();
                
        }catch(IOException ex)
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
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBPhoto;
    private javax.swing.JButton JBRegister;
    private com.toedter.calendar.JDateChooser JDCBirthDate;
    private javax.swing.JTextField JTFEmail;
    private javax.swing.JTextField JTFLastName;
    private javax.swing.JTextField JTFName;
    private javax.swing.JPasswordField JTFPassword;
    private javax.swing.JTextField JTFPhoneNumber;
    private javax.swing.JTextField JTFPhotoPath;
    private javax.swing.JTextField JTFUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
