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
        loop = new Timer(1, (ActionListener) this);
        loop.start();
    }

    public LinkedList<Enemy> getE() {
        return e;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(Image.carzing, x, y, 84, 170, null);
        y += 3;
        //ให้ enermy เพิ่มความเร็ว(ตำแหน่ง)
        if (g.score > 30) {
            y += 5;
        }
        else if (g.score > 60) {
            y += 10;
        }
        else if (g.score > 100) {
            y += 15;
        }
        else if (g.score > 160) {
            y += 20;
        }
        else if (g.score > 220) {
            y += 100;
        }
//        System.out.println("score " + g.score);
//        System.out.println(y + " y");
        //หากเกินหน้าจอ เอาออกจาก list
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