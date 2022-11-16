
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author danie
 */
abstract class MusicRep {
     public static Clip clip;
    
    public static void InitializeRep(String path)
    {
        AudioInputStream streamAudio = null;
        try
        {
            File audio = new File(path);
            streamAudio = AudioSystem.getAudioInputStream(audio);
            clip = AudioSystem.getClip();
            clip.open(streamAudio);
        }
        catch(UnsupportedAudioFileException ex) {
            Logger.getLogger(MusicRep.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex) {
            Logger.getLogger(MusicRep.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(LineUnavailableException ex) {
            Logger.getLogger(MusicRep.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try{
                streamAudio.close();
            } catch(IOException ex) {
                Logger.getLogger(MusicRep.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void Start(String path)
    {
        InitializeRep(path);
        clip.start();
    }
    
    public static void Stop()
    {
        clip.stop();
    }
}
