/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import javax.sound.sampled.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bank Jirayuth
 */
public class SoundPlay {

    public Clip clip;

    public SoundPlay(String file) {
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(getClass().getResource(file));
            clip = AudioSystem.getClip();
            clip.open(sound);
            clip.setFramePosition(0);
            FloatControl gaiControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            double gain = 0.05;
            float dB = (float) (Math.log(gain) / Math.log(10.0) * 20.0);
            gaiControl.setValue(dB);
            clip.start();
        } catch (LineUnavailableException e) {
//            Logger.getLogger(soundBG.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
//            Logger.getLogger(soundBG.class.getName()).log(Level.SEVERE, null, e);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        }

    }

}
