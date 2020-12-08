package basic;

import static basic.Image.carzing;
import static basic.RandEnemy.e;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;

public class Enemy {

    Game g;
    Timer loop;
    private int speedy = 1;
    private int x, y = 0;
    LinkedList<Enemy> e = RandEnemy.getEnemyBounds();

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public LinkedList<Enemy> getE() {
        return e;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(Image.carzing, x, y, 84, 170, null);
        y += 3;
        //ให้ enermy เพิ่มความเร็ว(ตำแหน่ง)
        if (g.score > 30) {
            y += 3;
        } else if (g.score > 60) {
            y += 5;
        } else if (g.score > 100) {
            y += 11;
        } else if (g.score > 160) {
            y += 20;
        } else if (g.score > 220) {
            y += 100;
        }

        //หากเกินหน้าจอ เอาออกจาก list
        if (y > 1000) {
            e.remove();
        }
    }

    //กำหนดhitbox
    public Rectangle getBounds() {
        return new Rectangle(x, y + 30, 84, 135);
    }
}
