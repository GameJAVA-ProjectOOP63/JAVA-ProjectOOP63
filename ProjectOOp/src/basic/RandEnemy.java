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

    game g;
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

    //ส่งมาจาก RandomEnemy
    public void addEnemy(Enemy enemy) {
        if (e.size() < 50) {
            System.out.println("------------");
            System.out.println("add enemy ");
            e.add(enemy);
            System.out.println("enemy: " + e.size());
        }
    }

    public static LinkedList<Enemy> getEnemyBounds() {
        return e;
    }

    //รับคำสั่งจาก Draw
    private void RandomEnemy() {
        int num = (int) Math.floor(Math.random() * Probability);
//        System.out.println(num);
        if (num == 0 && stop2car != 0) {
            addEnemy(new Enemy(168, -170));
            stop2car = 0;
            System.out.println(num);
        } else if (num == 100 && stop2car != 100) {
            addEnemy(new Enemy(368, -120));
            stop2car = 100;
            System.out.println(num);
        } else if (num == 200 && stop2car != 200) {
            addEnemy(new Enemy(268, -170));
            stop2car = 200;
            System.out.println(num);
        } else if (num == 300 && stop2car != 300) {
            addEnemy(new Enemy(168, -120));
            stop2car = 300;
            System.out.println(num);
        } else if (num == 500 && stop2car != 500) {
            addEnemy(new Enemy(368, -170));
            stop2car = 500;
            System.out.println(num);
        } else if (num == 600 && stop2car != 600) {
            addEnemy(new Enemy(450, -120));
            stop2car = 600;
            System.out.println(num);
        } else if (num == 700 && stop2car != 700) {
            addEnemy(new Enemy(268, -120));
            stop2car = 700;
            System.out.println(num);
        } else if (num == 900 && stop2car != 900) {
            addEnemy(new Enemy(450, -120));
            stop2car = 900;
            System.out.println(num);
        } //for score > 30
        if (g.score >= 30) {
            if (num == 50 && stop2car != 50) {
                addEnemy(new Enemy(168, -220));
                stop2car = 50;
                System.out.println(num);
            } else if (num == 150 && stop2car != 150) {
                addEnemy(new Enemy(268, -220));
                stop2car = 150;
                System.out.println(num);
            } else if (num == 250 && stop2car != 250) {
                addEnemy(new Enemy(368, -220));
                stop2car = 250;
                System.out.println(num);
            } else if (num == 400 && stop2car != 400) {
                addEnemy(new Enemy(450, -220));
                stop2car = 400;
                System.out.println(num);
            } else if (num == 800 && stop2car != 800) {
                addEnemy(new Enemy(368, -220));
                stop2car = 800;
                System.out.println(num);
            } else if (num == 350 && stop2car != 350) {
                addEnemy(new Enemy(168, -270));
                stop2car = 350;
                System.out.println(num);
            } else if (num == 450 && stop2car != 450) {
                addEnemy(new Enemy(268, -270));
                stop2car = 450;
                System.out.println(num);
            } else if (num == 550 && stop2car != 550) {
                addEnemy(new Enemy(368, -270));
                stop2car = 550;
                System.out.println(num);
            } else if (num == 650 && stop2car != 650) {
                addEnemy(new Enemy(450, -270));
                stop2car = 650;
                System.out.println(num);
            } else if (num == 750 && stop2car != 750) {
                addEnemy(new Enemy(268, -270));
                stop2car = 750;
                System.out.println(num);
            }
        }
        if (g.score >= 100) {
            if (num == 25 && stop2car != 25) {
                addEnemy(new Enemy(168, -220));
                stop2car = 25;
                System.out.println(num);
            } else if (num == 125 && stop2car != 125) {
                addEnemy(new Enemy(268, -220));
                stop2car = 125;
                System.out.println(num);
            } else if (num == 225 && stop2car != 225) {
                addEnemy(new Enemy(368, -220));
                stop2car = 225;
                System.out.println(num);
            } else if (num == 425 && stop2car != 425) {
                addEnemy(new Enemy(450, -220));
                stop2car = 425;
                System.out.println(num);
            } else if (num == 825 && stop2car != 825) {
                addEnemy(new Enemy(368, -220));
                stop2car = 825;
                System.out.println(num);
            } else if (num == 325 && stop2car != 325) {
                addEnemy(new Enemy(168, -270));
                stop2car = 325;
                System.out.println(num);
            } else if (num == 425 && stop2car != 425) {
                addEnemy(new Enemy(268, -270));
                stop2car = 425;
                System.out.println(num);
            } else if (num == 525 && stop2car != 525) {
                addEnemy(new Enemy(368, -270));
                stop2car = 525;
                System.out.println(num);
            } else if (num == 625 && stop2car != 625) {
                addEnemy(new Enemy(450, -270));
                stop2car = 625;
                System.out.println(num);
            } else if (num == 725 && stop2car != 725) {
                addEnemy(new Enemy(268, -270));
                stop2car = 725;
                System.out.println(num);
            }
        }
    }
}
