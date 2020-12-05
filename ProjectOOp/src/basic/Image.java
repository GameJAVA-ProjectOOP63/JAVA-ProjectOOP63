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
    
    public Image(){
        try {

            map = ImageIO.read(getClass().getResource("/Img/street.png"));
            carzing = ImageIO.read(getClass().getResource("/Img/carzing.png"));
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
