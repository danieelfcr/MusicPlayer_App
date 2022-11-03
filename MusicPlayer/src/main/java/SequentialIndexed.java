
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
public class SequentialIndexed {
    
    public static void Initialize(String user, String playlist, String code, int qFields)
    {
        try
        {
            //Get index file path
            String indexFilePath = "C:\\MEIA\\index.txt";
            File indexFile = new File(indexFilePath);
            String descIndexFilePath = "C:\\MEIA\\desc_index.txt";
            File descIndexFile = new File(descIndexFilePath);
           
            //Verify if file exists
            if (!indexFile.exists()) {
                             
                String blockFilePath = "C:\\MEIA\\block1.txt";
                String descBlockFilePath = "C:\\MEIA\\desc_block1.txt";
                

                File blockFile = new File(blockFilePath);
                File descBlockFile = new File(descBlockFilePath);
                
                //Create Files
                indexFile.createNewFile();
                descIndexFile.createNewFile();
                blockFile.createNewFile();
                descBlockFile.createNewFile();
                
                //Fill descriptors with initial information
                createBlockDesc(descBlockFile, user);
                createIndexDesc(descIndexFile, user);
                
                //Add information to files
                addToBlock(blockFile, descBlockFile, indexFile, descIndexFile, user, playlist, code, user, Sequential.getDate(), qFields);
            }
            else
            {
                int blockNo = no_Blocks(indexFile, descIndexFile);
                String blockFilePath = "C:\\MEIA\\block" + blockNo + ".txt";
                String descBlockFilePath = "C:\\MEIA\\desc_block" + blockNo + ".txt";
                
                File blockFile = new File(blockFilePath);
                File descBlockFile = new File(descBlockFilePath);
                
                if (!isMaxed(blockFile, descIndexFile)) {
                    addToBlock(blockFile, descBlockFile, indexFile, descIndexFile, user, playlist, code, user, Sequential.getDate(), qFields);
                }
                else
                {
                    int newBlockNo = blockNo + 1;
                    String newBlockFilePath = "C:\\MEIA\\block" + newBlockNo + ".txt";
                    String newDescBlockFilePath = "C:\\MEIA\\desc_block" + newBlockNo + ".txt";
                    
                    File newBlockFile = new File(newBlockFilePath);
                    File newDescBlockFile = new File(newDescBlockFilePath);
                    
                    //Create new block and its descriptor
                    newBlockFile.createNewFile();
                    newDescBlockFile.createNewFile();
                    
                    //Fill descriptors with initial information
                    createBlockDesc(newDescBlockFile, user);
                    
                    //Add register
                    addToBlock(newBlockFile, newDescBlockFile, indexFile, descIndexFile, user, playlist, code, user, Sequential.getDate(), qFields);
                }
            }
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }   
    }
    
    public static void addToIndex(File index, File descIndex, String user, String listName, String code, int block, int line)
    {
        String info = "";
        if (Sequential.countRegisters(index) == 0) {
            info = Sequential.countRegisters(index)+1 + "|" + user + "|" + listName + "|" + code + "|" + block + "." + line + "|null" + "|1";
        }
        else
        {
            //Crear codigo que apuntador cambie dependiendo si es menor
            info = Sequential.countRegisters(index)+1 + "|" + user + "|" + listName + "|" + code + "|" + block + "." + line + "|null" + "|1";
            info = indexRegisterPointer(index, getListStart(descIndex), info);
        }
        //Write in file
        try
        {
            FileWriter fwIndex = new FileWriter(index, true);
            BufferedWriter bwIndex = new BufferedWriter(fwIndex);
            bwIndex.append(info+"\n");
            
            bwIndex.close();
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                } 
        
        //Update descriptor
        updateIndexDesc(user, index, descIndex, 6);
    }
    
    public static void addToBlock(File block, File desc, File index, File descIndex, String user, String listName, String code, String transUser, String date, int qFields)
    {
        String line = user + "|" + listName + "|" + code + "|" + transUser + "|" + date + "|1";
        try
        {
            FileWriter fw = new FileWriter(block, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(line+"\n");
            bw.close();
            updateBlockDesc(user, block, desc, qFields);
            
            //Add information to index file
            addToIndex(index, descIndex, user, listName, code, no_Blocks(index, descIndex), Sequential.countRegisters(block));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static boolean isMaxed(File block, File descIndex)
    {
        return !(Sequential.countRegisters(block)+1<= maxRegisters(descIndex));
    }
    
    public static int maxRegisters(File desc)
    {
        return Sequential.MaxReorg(desc);
    }
    
    public static int no_Blocks(File file, File descFile)
    {
        int registers = Sequential.countRegisters(file);
        int max = maxRegisters(descFile);
        double blocks = Math.ceil(registers / max);
        if (blocks == 0) {
            blocks++;
        }
        return (int) blocks;
    }
           
    public static void createIndexDesc(File desc, String user)
    {
        try{
        String descContent = "nombre_simbolico: " + desc.getName()
                + "\nfecha_creacion: " + Sequential.getDate()
                + "\nusuario_creacion: " + user
                + "\nfecha_modificacion: "
                + "\nusuario_modificacion: "
                + "\n#_registros: 0"
                + "\nregistros_activos: 0"
                + "\nregistros_inactivos: 0"
                + "\ninicio_lista: 0"
                + "\n#_bloques: 0"
                + "\nmax_reorganización: 3"; //3 IS THE DEFAULT VALUE
        
            FileWriter fw = new FileWriter(desc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descContent);
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void createBlockDesc(File desc, String user)
    {
        try{
        String descContent = "nombre_simbolico: " + desc.getName()
                + "\nfecha_creacion: " + Sequential.getDate()
                + "\nusuario_creacion: " + user
                + "\nfecha_modificacion: "
                + "\nusuario_modificacion: "
                + "\n#_registros: 0"
                + "\nregistros_activos: 0"
                + "\nregistros_inactivos: 0";
        
            FileWriter fw = new FileWriter(desc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(descContent);
            bw.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void updateIndexDesc(String user, File index, File descIndex, int qFields)
    {
        try
        {
            FileReader frResult = new FileReader(index);
            BufferedReader brResult = new BufferedReader(frResult);
            
            FileReader frResultDesc = new FileReader(descIndex);
            BufferedReader brResultDesc = new BufferedReader(frResultDesc);

            String line;
            List<String> list = new ArrayList<String>();

            while((line = brResultDesc.readLine()) != null){
                list.add(line);
            }
            int newBlocksNo = no_Blocks(index, descIndex)+1;
            
            list.set(3, "fecha_modificacion: " + Sequential.getDate());
            list.set(4, "usuario_modificacion: " + user);
            list.set(5, "#_registros: " + Sequential.countRegisters(index));
            list.set(6, "registros_activos: " + Sequential.countActive(index, qFields));
            list.set(7, "#registros_inactivos: " + Sequential.countInactive(index, qFields));
            list.set(8, "inicio_lista: " + getMinor(index));
            list.set(9, "#_bloques: " + newBlocksNo);
            
            String descContent = "";
            
            for (String data :list) {
                descContent += data + "\n";
            }
            
            FileWriter fw = new FileWriter(descIndex);
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
    
    public static void updateBlockDesc(String user, File block, File desc, int qFields)
    {
        try
        {
            FileReader frResult = new FileReader(block);
            BufferedReader brResult = new BufferedReader(frResult);
            
            FileReader frResultDesc = new FileReader(desc);
            BufferedReader brResultDesc = new BufferedReader(frResultDesc);

            String line;
            List<String> list = new ArrayList<String>();

            while((line = brResultDesc.readLine()) != null){
                list.add(line);
            }
            
            list.set(3, "fecha_modificacion: " + Sequential.getDate());
            list.set(4, "usuario_modificacion: " + user);
            list.set(5, "#_registros: " + Sequential.countRegisters(block));
            list.set(6, "registros_activos: " + Sequential.countActive(block, qFields));
            list.set(7, "#registros_inactivos: " + Sequential.countInactive(block, qFields));
            
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
    
    public static int getMinor(File index)
    {
        String linea = "";
        try
        {
        FileReader frIndex = new FileReader(index);
        BufferedReader brIndex = new BufferedReader(frIndex);  
        List<String> info = new ArrayList<String>();
        if (index.exists()) {
            while(!"".equals(linea = brIndex.readLine()) && linea != null)
            {
                String arr [] = linea.split("\\|");
                info.add(arr[1] + arr[2] + arr[3] + "|" + arr[0]);
            }
        }
        
         //Create new list with all data and sort it
            List<String> newInfo = info.stream().sorted().collect(Collectors.toList());
            
         String firstElement = newInfo.get(0);
         String arr [] = firstElement.split("\\|");
         
         brIndex.close();
         return Integer.parseInt(arr[1]);
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            return -1;
        }
    }
    
    public static String getListStart(File descIndex)
    {
        try
        {
            FileReader frResult = new FileReader(descIndex);
            BufferedReader brResult = new BufferedReader(frResult);

            String line, aux = "";
            int count = 0;

            //Obtain indicated line
            while(count < 9){
                line = brResult.readLine();
                aux = line;
                count++;
            }
            
            aux = aux.replace("inicio_lista: ", "");   
            brResult.close(); 
            return aux;
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return "";
                }  
    }
    
    public static String indexRegisterPointer(File index, String startingNo, String newRegister)
    {
        String line = searchRegister(index, startingNo);

        //Auxiliar variables
        String[] antArr = new String [7];
        int counter = 0, noRegisters = Sequential.countRegisters(index);

        String[] fields = line.split("\\|");
        String[] newRegisterFields = newRegister.split("\\|");

        String code = fields[1] + fields[2] + fields[3];
        String newRegisterCode = newRegisterFields[1] + newRegisterFields[2] + newRegisterFields[3];

        if (isMinor(newRegisterCode, code)) {
            newRegisterFields[5] = fields[0];
            return newRegisterFields[0] + "|" + newRegisterFields[1] + "|"+ newRegisterFields[2] + "|" + newRegisterFields[3] + "|" + newRegisterFields[4] + "|" + newRegisterFields[5] + "|" + newRegisterFields[6];
        }
        else if(noRegisters == 1)
        {
            newRegisterFields[5] = "null";
            fields[5] = newRegisterFields[0];
            rewriteIndex(index, fields[0], fields);
            return newRegisterFields[0] + "|" + newRegisterFields[1] + "|"+ newRegisterFields[2] + "|" + newRegisterFields[3] + "|" + newRegisterFields[4] + "|" + newRegisterFields[5] + "|" + newRegisterFields[6];
        }
        else
        {
            while(counter<noRegisters && !"null".equals(fields[5])){
                antArr = fields;
                //Get next register line
                fields = searchRegister(index, fields[5]).split("\\|");
                if ("null".equals(fields[0])) {
                    break;
                }
                code = fields[1] + fields[2] + fields[3];
                if (isMinor(newRegisterCode, code)) {
                    newRegisterFields[5] = fields[0];
                    antArr[5] = newRegisterFields[0];
                    rewriteIndex(index, antArr[0], antArr);
                    return newRegisterFields[0] + "|" + newRegisterFields[1] + "|"+ newRegisterFields[2] + "|" + newRegisterFields[3] + "|" + newRegisterFields[4] + "|" + newRegisterFields[5] + "|" + newRegisterFields[6];
                }
                counter++;
            }
            newRegisterFields[5] = "null";
            antArr=fields;
            antArr[5] = newRegisterFields[0];
            rewriteIndex(index, antArr[0], antArr);
            return newRegisterFields[0] + "|" + newRegisterFields[1] + "|"+ newRegisterFields[2] + "|" + newRegisterFields[3] + "|" + newRegisterFields[4] + "|" + newRegisterFields[5] + "|" + newRegisterFields[6];
            
        }
            
    }
    
    public static boolean isMinor(String a, String b)
    {
        int comparison = a.compareTo(b);
        return comparison < 0;
    }
    
    public static String searchRegister(File index, String nextIndex)
    {
        try
        {
            FileReader frResult = new FileReader(index);
            BufferedReader brResult = new BufferedReader(frResult);
            String line, aux="";
            int count = 1;
            if ("null".equals(nextIndex)) {
                return "null";
            }
             while((line = brResult.readLine()) != null && count < Integer.parseInt(nextIndex)){
                aux = line;
                count++;
            }
             brResult.close();
             return line;
         }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                    return "";
                }  
    }
    
    public static void rewriteIndex(File index, String changedIndex, String[] newLine)
    {
        try
        {
            FileReader frResult = new FileReader(index);
            BufferedReader brResult = new BufferedReader(frResult);
           String line;
            List<String> indexData = new ArrayList<String>();

            //Add users from master to list
            while((line = brResult.readLine()) != null){
                indexData.add(line);
            }
            int s = Integer.parseInt(changedIndex);
            indexData.set(s-1, newLine[0] + "|" + newLine[1] + "|"+ newLine[2] + "|" + newLine[3] + "|" + newLine[4] + "|" + newLine[5] + "|" + newLine[6]);
            
            FileWriter fwMaster = new FileWriter(index);
            BufferedWriter bwMaster = new BufferedWriter(fwMaster);
            for (String item: indexData) {
                bwMaster.write(item + "\n");
            }
            
             brResult.close();
             bwMaster.close();
         }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }  
    }
    
    public static String[] getIndexedList(File index, String indexNo)
    {
        try
        {
            FileReader frResult = new FileReader(index);
            BufferedReader brResult = new BufferedReader(frResult);
                       
            int reg = Sequential.countRegisters(index);
            String[] indexes = new String[reg];
            int counter = 1;                    
            
            indexes[0] = indexNo;
            while(counter < reg)
            {
                String helper = searchRegister(index, indexNo);
                String[] fields = helper.split("\\|");
                indexes[counter] = fields[5];
                
                indexNo = fields[5];      
                counter++;
            }
            
            return indexes;
            
        } catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
            String[] no = new String[1];
            return no;
        }
    }
}
