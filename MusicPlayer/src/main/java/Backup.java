
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class Backup {
       public static void createBackupBit(File bit, File desc, File dir, String creationDate)
    {
        String bckupPath = dir.getAbsolutePath();
        String user = AdminData.getUser();
        String date = RegisterFrame.getDate();
        
        
        List<String> bitInfo = new ArrayList<String>();
        try
        {
        FileReader frResult = new FileReader(bit);
        BufferedReader brResult = new BufferedReader(frResult);

            String line;

            //Obtain last line
            while(!"".equals(line = brResult.readLine()) && line != null){
                bitInfo.add(line);
            }
            
            String lastBckup = bckupPath + "|" + user + "|" + date;
            bitInfo.add(lastBckup);
            
            String content = "";
            
            for (String data :bitInfo) {
            content += data + "\n";
        }
        
        FileWriter fw = new FileWriter(bit);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(content);
        bw.close();
        
        createBackupDesc(desc, bit, creationDate);
        } catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }
    
    public static void createBackupDesc(File desc, File bit, String creationDate)
    {
        String content = "nombre_simbolico: bitacora_backup.txt\n" + "fecha_creacion: " + creationDate + "\n" +
                "usuario_creacion: " + AdminData.getUser() + "\n" + "fecha_modificacion: " + RegisterFrame.getDate() + "\n" + 
                "usuario_modificacion: " + AdminData.getUser() + "\n" + "#_registros: " + countRegisters(bit);
        try
        {
            FileWriter fw = new FileWriter(desc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        } catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
        }
    }
    
    public static int countRegisters(File bit)
    {
        int count = 0;
        try
        {
        FileReader frResult = new FileReader(bit);
        BufferedReader brResult = new BufferedReader(frResult);

            String line;

            //Obtain last line
            while(!"".equals(line = brResult.readLine()) && line != null){
                count++;
            }
            return count;
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            return -1;
        }
    }
}
