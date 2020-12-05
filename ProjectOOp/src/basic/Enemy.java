/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.LinkedList;


/**
 *
 * @author HP
 */
public class Enemy {
    game g ;
    private int speedy = 1;
    public float count = 1;
    private int x, y = 0;
    private LinkedList<Enemy> e = RandEnemy.getEnemyBounds();

    public Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(e.size());
    }

    public LinkedList<Enemy> getE() {
        return e;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.yellow);
        g2d.fillRect(x, y, 32, 32);
        y += 2;
        if(g.score >  250){
        y += 2;
        }
        if(g.score >  550){
        y += 4;
        }
        if(g.score >  750){
        y += 6;
        }
        if(g.score >  1000){
        y += 7;
        }
        if(g.score >  1200){
        y += 8;
        }
//        if (y > 1015) {
//            y = 0;
//            count += 0.5;
//        }
        System.out.println("score " + g.score);
        System.out.println(y + " y");
        if (y > 1000) {
            e.remove();
        }
    }

    public void update() {

    }
    
}
