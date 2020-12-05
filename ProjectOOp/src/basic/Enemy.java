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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import javax.swing.Timer;

/**
 *
 * @author HP
 */
public class Enemy implements ActionListener {
    Timer loop;
    game g;
    private int speedy = 1;
    public float count = 1;
    private int x,y = 0;
    private LinkedList<Enemy> e = RandEnemy.getEnemyBounds();

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        loop = new Timer(100, (ActionListener) this);
        loop.start();
    }

    public LinkedList<Enemy> getE() {
        return e;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(Image.carzing, x, y, 84, 170, null);
        y += 3;
        //ให้ enermy เพิ่มความเร็วตามเวลาและความเร็ว
        if (g.score > 40) {
            y += 1;
        }
        else if (g.score > 70) {
            y += 4;
        }
        else if (g.score > 120) {
            y += 6;
        }
        else if (g.score > 200) {
            y += 8;
        }
        else if (g.score > 320) {
            y += 11;
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

    public void update() {

    }
    //กำหนดhitbox
    public Rectangle getBounds() {
        return new Rectangle(x, y, 84, 170);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}