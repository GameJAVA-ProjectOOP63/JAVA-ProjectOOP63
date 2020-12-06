/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

/**
 *
 * @author HP
 */
public class Image {

    public static BufferedImage map;
    public static BufferedImage carzing;
    public static BufferedImage kraba;
    public static BufferedImage life1;
    public static BufferedImage life2;
    public static BufferedImage life3;
    
    public Image(){
        try {

            map = ImageIO.read(getClass().getResource("/Img/street.png"));
            carzing = ImageIO.read(getClass().getResource("/Img/carzing.png"));
            kraba = ImageIO.read(getClass().getResource("/Img/Kraba.png"));
            life1 = ImageIO.read(getClass().getResource("/Img/engine.png"));
//            life2 = ImageIO.read(getClass().getResource("/shock/Kraba.png"));
//            life3 = ImageIO.read(getClass().getResource("/wheel/Kraba.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
