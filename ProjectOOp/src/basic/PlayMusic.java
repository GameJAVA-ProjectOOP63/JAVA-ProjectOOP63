/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.io.*;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
/**
 *
 * @author Bank Jirayuth
 */
public class PlayMusic {
    
    public static void main(String[] args) {
        playMusic("/Music/soundgame");
    }
    public static void playMusic(String filepath){
        InputStream music;
        try{
            music = new FileInputStream(new File(filepath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e){
            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error");
        }
    }
}
