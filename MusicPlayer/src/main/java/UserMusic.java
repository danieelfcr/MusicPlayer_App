
import com.sun.istack.internal.logging.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.DefaultListModel;
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
public class UserMusic extends javax.swing.JFrame {

    /**
     * Creates new form UserMusic
     */
    public UserMusic() {
        initComponents();
        fillRecomSongsList();
        fillPlaylists();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBBack = new javax.swing.JButton();
        jBAccount = new javax.swing.JButton();
        jlblClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLPlaylist = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLSongs = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLAvailableSongs = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        JBPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JBCreatePlaylist = new javax.swing.JButton();
        JBAddSong = new javax.swing.JButton();
        jBOrderArtist = new javax.swing.JButton();
        jBOrderCode = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 0, 255));

        jBBack.setText("Log out");
        jBBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBackActionPerformed(evt);
            }
        });

        jBAccount.setText("Account");
        jBAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAccountActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(757, Short.MAX_VALUE)
                .addComponent(jBBack)
                .addGap(18, 18, 18)
                .addComponent(jBAccount)
                .addGap(40, 40, 40)
                .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jlblClose, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 50));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jLabel1.setText("Welcome!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLPlaylist.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jLPlaylist.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jLPlaylistValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jLPlaylist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 320, 220));

        jLSongs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jLSongs);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 570, 220));

        jLAvailableSongs.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jLAvailableSongs);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 950, -1));

        jPanel3.setBackground(new java.awt.Color(153, 0, 255));

        JBPlay.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        JBPlay.setText("PLAY");
        JBPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(509, 509, 509)
                .addComponent(JBPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(560, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(JBPlay)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1200, 130));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jLabel2.setText("My playlists");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jLabel3.setText("My songs");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jLabel4.setText("Recommended songs");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        JBCreatePlaylist.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        JBCreatePlaylist.setText("+");
        JBCreatePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCreatePlaylistActionPerformed(evt);
            }
        });
        jPanel1.add(JBCreatePlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        JBAddSong.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        JBAddSong.setText("Add to playlist");
        JBAddSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAddSongActionPerformed(evt);
            }
        });
        jPanel1.add(JBAddSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 650, -1, 40));

        jBOrderArtist.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jBOrderArtist.setText("Order by artist");
        jBOrderArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrderArtistActionPerformed(evt);
            }
        });
        jPanel1.add(jBOrderArtist, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 420, -1, -1));

        jBOrderCode.setFont(new java.awt.Font("Century Gothic", 0, 27)); // NOI18N
        jBOrderCode.setText("Order by code");
        jBOrderCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOrderCodeActionPerformed(evt);
            }
        });
        jPanel1.add(jBOrderCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> songsx = new ArrayList<String>();
    
    private void JBCreatePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCreatePlaylistActionPerformed
        CreatePlaylist myFrame = new CreatePlaylist();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBCreatePlaylistActionPerformed

    private void JBAddSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAddSongActionPerformed
        
        String playlist = jLPlaylist.getSelectedValue();
        String songData = jLAvailableSongs.getSelectedValue();
        
        
        if (playlist != null && songData != null) {
            String songCode = songData.substring(0,1);

            String user = Data.getUser();

            String indexFilePath = "C:\\MEIA\\index.txt";
            File indexFile = new File(indexFilePath);
            if (!keyExists(indexFile, Data.getUser(), playlist, songCode, 1, 2, 3)) {
                SequentialIndexed.Initialize(user, playlist, songCode, 5);
                showMessageDialog(null, "Se ha agregado correctamente a la playlist.");       
            }
            else
            {
                showMessageDialog(null, "Esta canción ya existe en la playlist");
            }
        }
        else
        {
            showMessageDialog(null, "Debes de seleccionar la playlist y una canción que desees añadir a ella.");
        }
        
        
           
    }//GEN-LAST:event_JBAddSongActionPerformed

    private void jLPlaylistValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jLPlaylistValueChanged
        String playlist = jLPlaylist.getSelectedValue();
        String user = Data.getUser();
        
        String indexFilePath = "C:\\MEIA\\index.txt";
        File indexFile = new File(indexFilePath);
        String descIndexFilePath = "C:\\MEIA\\desc_index.txt";
        File descIndexFile = new File(descIndexFilePath);  
        
        String songsFilePath = "C:\\MEIA\\canciones.txt";
        String binSongsFilePath = "C:\\MEIA\\bitacora_canciones.txt";
        File songsFile = new File(songsFilePath);
        File binSongsFile = new File(binSongsFilePath);
        
        if (indexFile.exists() && songsFile.exists()) {
            String[] arr = SequentialIndexed.getIndexedList(indexFile, SequentialIndexed.getListStart(descIndexFile));
            DefaultListModel songs = new DefaultListModel();
            String info = "";

            for (String item: arr) {
                info = addSongsToPlaylist(indexFile, descIndexFile, user, playlist, item);
                if (!"".equals(info)) {
                    String[] data = info.split("\\|");

                    String song = Sequential.searchInfo(songsFile, binSongsFile, data[3]);
                    if (!"".equals(song)) {               
                    String[] songFields = song.split("\\|"); 
                    songs.addElement(songFields[0] + ".    " + songFields[1] + " - " + songFields[2]);
                }
                }

            }
            jLSongs.setModel(songs); 

        }
    }//GEN-LAST:event_jLPlaylistValueChanged

    private void JBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBPlayActionPerformed
        String song = jLSongs.getSelectedValue();
        String song2 = jLAvailableSongs.getSelectedValue();
        String code = song.substring(0,1);
        
        String songsFilePath = "C:\\MEIA\\canciones.txt";
        String binSongsFilePath = "C:\\MEIA\\bitacora_canciones.txt";
        File songsFile = new File(songsFilePath);
        File binSongsFile = new File(binSongsFilePath);
        
        String data = Sequential.searchInfo(songsFile, binSongsFile, code);
        String[] songFields = data.split("\\|");
        String path = songFields[3];
        
        MusicRep.Start(path);
    }//GEN-LAST:event_JBPlayActionPerformed

    private void jBBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBackActionPerformed
        LoginFrame myFrame = new LoginFrame();
        myFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBBackActionPerformed

    private void jlblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCloseMouseClicked
        LoginFrame.filesReorganization();
        System.exit(0);
    }//GEN-LAST:event_jlblCloseMouseClicked

    private void jBAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAccountActionPerformed
        if (!("1").equals(Data.getRole())) {
            UserFrame myFrame = new UserFrame();
            myFrame.setVisible(true);
            dispose(); 
        }
        else
        {
            AdminMenu myFrame = new AdminMenu();
            myFrame.setVisible(true);
            dispose(); 
        }     
    }//GEN-LAST:event_jBAccountActionPerformed

    private void jBOrderArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrderArtistActionPerformed
        String listFilePath = "C:\\MEIA\\lista.txt";
        String descListFilePath = "C:\\MEIA\\desc_lista.txt";
        File listFile = new File(listFilePath);
        File descListFile = new File(descListFilePath);
        
        for (String info :songsx) {
            String [] arr = info.split("\\|"); 
            Song song = new Song();
                song.artist = arr[2];
                song.code = arr[0];
                song.song_name = arr[1];
                song.path = arr[3];
                song.transUser = arr[4];
                song.creationDate = arr[5];
                song.status = arr[6];
            
            BinaryTree.add(song); //add song to binary tree
                  
        }
        BinaryTree.inf.clear();
        BinaryTree.traverseInOrder(BinaryTree.root);
        DefaultListModel songs = new DefaultListModel();
        
        for (String info :BinaryTree.inf) {
            String [] arr = info.split("\\|");
            if (arr[6].equals("1")) {
                String x = arr[1] + ".    " + arr[2] + " - " + arr[0];
                songs.addElement(x);
            }
        }
         jLAvailableSongs.setModel(songs);
         String data = "";
         for (String info: songsx) {
             String [] arr = info.split("\\|"); 
             data += BinaryTree.getInfoWithChildren(arr[0], arr[2]) + "\n"; //Get the complete register including childs      
        }
         writeOnFile(data, listFile, descListFile);
    }//GEN-LAST:event_jBOrderArtistActionPerformed

    private void writeOnFile(String data, File list, File desc)
    {
        createFiles(list, desc);
         try{       
            FileWriter fw = new FileWriter(list);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(data);
            bw.close();
            
            SequentialIndexed.updateBlockDesc(Data.getUser(), list, desc, 9);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    private void jBOrderCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOrderCodeActionPerformed
        fillRecomSongsList();
    }//GEN-LAST:event_jBOrderCodeActionPerformed

    private void fillRecomSongsList()
    {
        try{
            //Obtener archivos que se encuentran en MEIA
            String songsFilePath = "C:\\MEIA\\canciones.txt";
            String binSongsFilePath = "C:\\MEIA\\bitacora_canciones.txt";
            
            File songsFile = new File(songsFilePath);
            File binSongsFile = new File(binSongsFilePath);
            
            if(songsFile.exists())
            {
                //Metodos de lectura de archivos
                FileReader frResult = new FileReader(songsFile);
                BufferedReader brResult = new BufferedReader(frResult);

                FileReader frResultBit = new FileReader(binSongsFile);
                BufferedReader brResultBit = new BufferedReader(frResultBit);

                String line;
                DefaultListModel songs = new DefaultListModel();
                songsx.clear();
                
                 while(!"".equals(line = brResult.readLine()) && line != null)
                        {
                            String [] arr = line.split("\\|");
                            if (arr[6].equals("1")) {
                                String info = arr[0] + ".    " + arr[1] + " - " + arr[2];
                                songs.addElement(info);
                                songsx.add(line);
                            }
                        }
                  while(!"".equals(line = brResultBit.readLine()) && line != null)
                        {
                            String [] arr = line.split("\\|");
                            if (arr[6].equals("1")) {
                                String info = arr[0] + ".    " + arr[1] + " - " + arr[2];
                                songs.addElement(info);
                                songsx.add(line);
                            }
                        }
                 jLAvailableSongs.setModel(songs);
            }
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }   
    }
    
    private void fillPlaylists()
    {
        try
        {
            String songsFilePath = "C:\\MEIA\\listas_canciones.txt";
            String binSongsFilePath = "C:\\MEIA\\bitacora_listas_canciones.txt";

            File songsFile = new File(songsFilePath);
            File binSongsFile = new File(binSongsFilePath);  
            
            if(songsFile.exists())
            {
                FileReader frResult = new FileReader(songsFile);
                BufferedReader brResult = new BufferedReader(frResult);

                FileReader frResultBit = new FileReader(binSongsFile);
                BufferedReader brResultBit = new BufferedReader(frResultBit);

                String line;
                DefaultListModel songs = new DefaultListModel();
                 while(!"".equals(line = brResult.readLine()) && line != null)
                        {
                            String [] arr = line.split("\\|");
                            if (arr[4].equals("1") && arr[0].equals(Data.getUser())) {
                                songs.addElement(arr[1]);
                            }
                        }
                  while(!"".equals(line = brResultBit.readLine()) && line != null)
                        {
                            String [] arr = line.split("\\|");
                            if (arr[4].equals("1") && arr[0].equals(Data.getUser())) {
                                songs.addElement(arr[1]);
                            }
                        }
                 jLPlaylist.setModel(songs);
            }
        }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error.");
                }       
    }
    
    public static String addSongsToPlaylist(File index, File descIndex, String user, String playlist, String nextIndex)
    {
        String line = SequentialIndexed.searchRegister(index, nextIndex);
        String[] fields = line.split("\\|");
        if (user.equals(fields[1]) && playlist.equals(fields[2])) {
            return line;
        }
        return "";
    }
    
    private static boolean keyExists(File master, String Key1, String Key2, String Key3, int posKey1, int posKey2, int posKey3)
    {
         try
        {
            FileReader frMaster = new FileReader(master);
            BufferedReader brMaster = new BufferedReader(frMaster);
            
            
            String linea = "";
            
            if (master.exists()) {
                while(!"".equals(linea = brMaster.readLine()) && linea != null)
                {
                    String arr [] = linea.split("\\|");
                    if (Key1.equals(arr[posKey1])) {
                        if (Key2.equals(arr[posKey2])) {
                            if (Key3.equals(arr[posKey3])) {
                                brMaster.close();
                                return true; 
                            }
                            
                        }
                    }
                }
            }
            brMaster.close();
            return false;
                       
        } catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
            return false;
        }
    }

    public static void createFiles(File file, File desc)
    {
        try
        {
            if (!file.exists()) {
                file.createNewFile();
                desc.createNewFile();
                SequentialIndexed.createBlockDesc(desc, Data.getUser());
            }
        }
        catch(Exception e)
        {
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
            java.util.logging.Logger.getLogger(UserMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMusic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAddSong;
    private javax.swing.JButton JBCreatePlaylist;
    private javax.swing.JButton JBPlay;
    private javax.swing.JButton jBAccount;
    private javax.swing.JButton jBBack;
    private javax.swing.JButton jBOrderArtist;
    private javax.swing.JButton jBOrderCode;
    private javax.swing.JList<String> jLAvailableSongs;
    private javax.swing.JList<String> jLPlaylist;
    private javax.swing.JList<String> jLSongs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jlblClose;
    // End of variables declaration//GEN-END:variables
}
