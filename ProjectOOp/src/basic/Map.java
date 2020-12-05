/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.Graphics2D;

/**
 *
 * @author HP
 */
public class Map {

    private final int x = 0;
    private int y;
    private int speedy = 1;
    public static float count_speed_map = 1;

    //กำหนดความเร็ซในการเคลื่อนที่ของผู้เล่นตลอดการทำงาน
    public Map(int y) {
        this.y = y;
    }

    public static float getCount_speed_map() {
        return count_speed_map;
    }

    public void draw(Graphics2D g2d) {
        y += 0.5 + count_speed_map;
        if (y > 1015) {
            y = 0;
            if (count_speed_map < 40) {
                count_speed_map += 1.5;
            }
            System.out.println("SP_MAP = " + count_speed_map);
        }

//       for (int i = 0; i <  2; i++) {
        g2d.drawImage(Image.map, 0, y - 1000, 700, 2000, null);//วาดmap
//           System.out.println(count);

//           System.out.println(i);
//        }
//        System.out.println(y);
    }

    public void update() {

    }
}
