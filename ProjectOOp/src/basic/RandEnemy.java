/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.Graphics2D;
import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class RandEnemy {

    private int Probability = 1200;
    static LinkedList<Enemy> e = new LinkedList<>();
    Enemy enemy;
    public static int s;
    int stop2car;

    public RandEnemy() {
        s = e.size();
    }

    //วาดenemyทีละหลายๆตัว
    public void draw(Graphics2D g2d) {
        RandomEnemy();
        for (int i = 0; i < e.size(); i++) {
            enemy = e.get(i);
            enemy.draw(g2d);
        }
    }

    public void addEnemy(Enemy enemy) {

        if (e.size() < 10) {
            System.out.println("------------");
            System.out.println("add enemy ");
            e.add(enemy);
            System.out.println("evemy: " + e.size());
        }
    }

//    public void removeEnemy(Enemy enemy) {
//        
//    }

    //hit box ของ enemy แต่ละตัว
    public static LinkedList<Enemy> getEnemyBounds() {
        return e;
    }

    private void RandomEnemy() {
        int num = (int) Math.floor(Math.random() * Probability);
        //x != 223 , != 406
        //224 269 314 359 404
        if (num == 0 && stop2car != 0) {
            addEnemy(new Enemy(168, -150));
            stop2car = 0;
            System.out.println(num);
        }
        if (num == 100 && stop2car != 100) {
            addEnemy(new Enemy(368, -100));
            stop2car = 100;
            System.out.println(num);
        }
        if (num == 200 && stop2car != 200) {
            addEnemy(new Enemy(268, -150));
            stop2car = 200;
            System.out.println(num);
        }
        if (num == 300 && stop2car != 300) {
            addEnemy(new Enemy(168, -100));
            stop2car = 300;
            System.out.println(num);
        }
        if (num == 500 && stop2car != 500) {
            addEnemy(new Enemy(368, -150));
            stop2car = 500;
            System.out.println(num);
        }
        if (num == 600 && stop2car != 600) {
            addEnemy(new Enemy(450, -150));
            stop2car = 900;
            System.out.println(num);
        }
        if (num == 700 && stop2car != 700) {
            addEnemy(new Enemy(268, -100));
            stop2car = 700;
            System.out.println(num);
        }
        if (num == 900 && stop2car != 900) {
            addEnemy(new Enemy(450, -100));
            stop2car = 900;
            System.out.println(num);
        }
//        System.out.println(num);
    }
}
