

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Sequential {
    
    //If files do not exist, create them.
    public static void createFiles(File file, File desc, File bin, File descBin)
    {
        try
        {
            if (!file.exists()) {
                file.createNewFile();
                desc.createNewFile();
                RegisterFrame.createDesc(desc, AdminData.getUser());
            }
            if (!bin.exists()) {
                bin.createNewFile();
                descBin.createNewFile();
                RegisterFrame.createDesc(descBin, AdminData.getUser());
            }
        }
        catch(Exception e)
        {
             e.printStackTrace();
        }
    }
    
    //Obtains the max number of registers in a binnacle file before reorganization
     public static int MaxReorg(File file)
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
    
     //Identifies if it's the moment for a reorganization
     public static boolean isMaxReorg(File bit, File desc)
    {
       int count = countRegisters(bit);          
       return count>=MaxReorg(desc);        
 
    }
    
     //Count registers
     public static int countRegisters(File file)
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
     
     //Obtains actual time and date
     public static String getDate()
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
    
     //Creates descriptor of file
     public static void createDesc(File file, String username)
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
     
         public static void updateDesc(File bit, File desc, String user, int qFields)
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
            list.set(5, "#_registros: " + countRegisters(bit));
            list.set(6, "registros_activos: " + countActive(bit, qFields));
            list.set(7, "#registros_inactivos: " + countInactive(bit, qFields));
            
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
     
     //Count the total of active 
     public static int countActive(File file, int qFields)
    {
        try
        {
            FileReader frResult = new FileReader(file);
            BufferedReader brResult = new BufferedReader(frResult);

            String line;
            int count = 0;

            while((line = brResult.readLine()) != null){
                String[] arr = line.split("\\|");
                if (arr[qFields].contains("1")) {
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
    public static int countInactive(File file, int qFields)
    {
        try
        {
            FileReader frResult = new FileReader(file);
            BufferedReader brResult = new BufferedReader(frResult);

            String line;
            int count = 0;

            while((line = brResult.readLine()) != null){
                String[] arr = line.split("\\|");
                if (arr[qFields].contains("0")) {
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
    
    public static void Reorganization(File master, File bit, File descMaster, File descBit, int qFields)
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
                if (arr[qFields].contains("1")) {
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
            updateDesc(master, descMaster, lastUser, qFields);
            
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
    
    public static void filesReorganization()
     {
            String usersFilePath = "C:\\MEIA\\usuario.txt";
            String bitUsersFilePath = "C:\\MEIA\\bitacora_usuario.txt";
            String descUsersFilePath = "C:\\MEIA\\desc_usuario.txt";
            String descBitUsersFilePath = "C:\\MEIA\\desc_bitacora_usuario.txt";
           /* String songsFilePath = "C:\\MEIA\\usuario.txt";
            String binSongsFilePath = "C:\\MEIA\\bitacora_usuario.txt";
            String descSongsFilePath = "C:\\MEIA\\desc_usuario.txt";
            String descBinSongsFilePath = "C:\\MEIA\\desc_bitacora_usuario.txt";*/

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
    
    public static String searchInfo(File master, File bin, String code)
    {
        try
        {
            FileReader frMaster = new FileReader(master);
            BufferedReader brMaster = new BufferedReader(frMaster);
            
            FileReader frBin = new FileReader(bin);
            BufferedReader brBin = new BufferedReader(frBin);
            
            List<String> codes = new ArrayList<String>();
            List<String> info = new ArrayList<String>();
            String linea = "";
            
            if (bin.exists()) {
                while(!"".equals(linea = brBin.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    codes.add(arr[0]);
                    info.add(linea);
                }
            }
            if (master.exists()) {
                while(!"".equals(linea = brMaster.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    codes.add(arr[0]);
                    info.add(linea);
                }
            }
            
            String [] arrCodes = new String[codes.size()];
            arrCodes = codes.toArray(arrCodes);
            int pos = Search(arrCodes, code);
            
            if (pos != -1) {
               String[] arrInfo = info.toArray(new String[0]);
                if (arrCodes[pos].equals(code)) {
                    brMaster.close();
                    brBin.close();
                    return arrInfo[pos];
                }
            }
            brMaster.close();
            brBin.close();
            return "";
            
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            return "";
        }
    }
    
    public static int Search(String[] arr, String x)
    {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void closeReorg(File master, File descMaster, File bin, File descBin, int qFields)
    {
        try{
                if (master.exists() && bin.exists()) {
                    FileReader frResult = new FileReader(master);
                    BufferedReader brResult = new BufferedReader(frResult);

                    FileReader frResultBit = new FileReader(bin);
                    BufferedReader brResultBit = new BufferedReader(frResultBit);

                    List<String> masterUsers = new ArrayList<String>();
                    List<String> bitUsers = new ArrayList<String>();
                    String line = "";
                    
                    //Read each line of both files, if status is 1, add to specific list
                    while(!"".equals(line = brResult.readLine()) && line != null)
                    {
                        String [] arr = line.split("\\|");
                        if (arr[qFields].equals("1")) {
                            masterUsers.add(line);
                        }
                    }
                    while(!"".equals(line = brResultBit.readLine()) && line != null)
                    {
                        String [] arr = line.split("\\|");
                        if (arr[qFields].equals("1")) {
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
                    FileWriter fwMaster = new FileWriter(master, false);
                    BufferedWriter bwMaster = new BufferedWriter(fwMaster);
                    
                    String content ="";
                    for (String info :masterUsers) {
                        content += info + "\n";
                    }
                    
                    bwMaster.write(content);
                    bwMaster.close();
                    updateDesc(master, descMaster, "admin", qFields);
                    
                    //Clear binnacle
                    FileWriter fwBit = new FileWriter(bin, false);
                    BufferedWriter bwBit = new BufferedWriter(fwBit);
                    
                    bwBit.write("");
                    bwBit.close();
                    updateDesc(bin, descBin, "admin", qFields);
                    
                }

            } catch (Exception e){
                e.printStackTrace();
            }
    }
    
    
}
