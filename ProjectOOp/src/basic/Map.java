package basic;

import static basic.Image.life1;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

public class Map {

    Player Player;
    private LinkedList<Enemy> e = RandEnemy.getEnemyBounds();
    private final int x = 0;
    private int y;
    private int speedy = 1;
    public static float count_speed_map = 1;
    int width = 700;
    int height = 1000;

    //กำหนดความเร็ซในการเคลื่อนที่ของผู้เล่นตลอดการทำงาน
    public Map(int y) {
        this.y = y;
    }

    public static float getCount_speed_map() {
        return count_speed_map;
    }

    public void draw(Graphics2D g2d) {
        y += 1 + count_speed_map;
        if (y > 1015) {
            y = 0;
            if (count_speed_map < 30) {
                count_speed_map += 0.5;
            }
        }
        if (Player.life > 0) {
            g2d.drawImage(Image.map, 0, y - 1000, 700, 2000, null);//วาดmap
        } else {
            g2d.drawImage(Image.map_end, 0, y - 1000, 700, 2000, null);//วาดmap
        }

    }
}
