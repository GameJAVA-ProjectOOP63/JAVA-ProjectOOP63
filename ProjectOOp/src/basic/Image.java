package basic;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Image {
    public static BufferedImage Startgame;
    public static BufferedImage map, map_end;
    public static BufferedImage carzing;
    public static BufferedImage kraba;
    public static BufferedImage life1, life1Red;
    public static BufferedImage life2,life2Red;
    public static BufferedImage life3,life3Red;

    public Image() {
        try {
            Startgame = ImageIO.read(getClass().getResource("/Img/StartGame.png"));
            map = ImageIO.read(getClass().getResource("/Img/street.png"));
            map_end = ImageIO.read(getClass().getResource("/Img/street_end.png"));
            carzing = ImageIO.read(getClass().getResource("/Img/carzing.png"));
            kraba = ImageIO.read(getClass().getResource("/Img/Kraba.png"));
            life1 = ImageIO.read(getClass().getResource("/Img/engine.png"));
            life2 = ImageIO.read(getClass().getResource("/Img/shock.png"));
            life3 = ImageIO.read(getClass().getResource("/Img/wheel.png"));
            life1Red = ImageIO.read(getClass().getResource("/Img/engine_red.png"));
            life2Red = ImageIO.read(getClass().getResource("/Img/shock_red.png"));
            life3Red = ImageIO.read(getClass().getResource("/Img/wheel_red.png"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
