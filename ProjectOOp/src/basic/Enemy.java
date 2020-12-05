/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import static basic.Image.carzing;
import static basic.RandEnemy.e;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Enemy {

    game g;
    private int speedy = 1;
    public float count = 1;
    private static int x, y = 0;
    private LinkedList<Enemy> e = RandEnemy.getEnemyBounds();

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public LinkedList<Enemy> getE() {
        return e;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(Image.carzing, x, y, 84, 170, null);
        y += 2;
        //ให้ enermy เพิ่มความเร็วตามเวลาและความเร็ว
        if (g.score > 30) {
            y += 1;
        }
        if (g.score > 60) {
            y += 2;
        }
        if (g.score > 100) {
            y += 4;
        }
        if (g.score > 150) {
            y += 6;
        }
        if (g.score > 250) {
            y += 8;
        }
        System.out.println("score " + g.score);
//        System.out.println(y + " y");
        if (y > 1000) {
            System.out.println("------------");
            System.out.println("remove enemy");
            e.remove();
            System.out.println("evemy: " + e.size());
        }
    }
    //กำหนดhitbox
    public Rectangle getBounds() {
        return new Rectangle(x, y, 30, 30);
    }

    public void update() {

    }

}
