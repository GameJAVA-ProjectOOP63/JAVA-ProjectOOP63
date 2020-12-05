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
    public RandEnemy(){
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

    public void addEnemy(Enemy enemy){
        
        
        if(e.size() < 10){
            System.out.println("add");
            e.add(enemy);
        }
        else {
            System.out.println("remove");
            e.remove(enemy);
        }
    }
    public void removeEnemy(Enemy enemy){
        e.remove(enemy);
    }
    //hit box ของ enemy แต่ละตัว
    public static LinkedList<Enemy> getEnemyBounds(){
        return e;
    }
    
    private void RandomEnemy(){
        int num = (int) Math.floor(Math.random()*Probability);
        //x != 223 , != 406
        //224 269 314 359 404
        if(num==0){
            addEnemy(new Enemy(224,0));
        }
        if(num==10){
            addEnemy(new Enemy(404,0));
        }
        if(num==20){
            addEnemy(new Enemy(269,0));
        }
        if(num==30){
            addEnemy(new Enemy(314,0));
        }
        if(num==40){
            addEnemy(new Enemy(359,0));
        }
        if(num==50){
            addEnemy(new Enemy(314,0));
        }
        if(num==60){
            addEnemy(new Enemy(269,0));
        }
        if(num==70){
            addEnemy(new Enemy(404,0));
        }
        if(num==80){
            addEnemy(new Enemy(359,0));
        }
        if(num==90){
            addEnemy(new Enemy(314,0));
        }
        if(num==100){
            addEnemy(new Enemy(269,0));
        }
        if(num==110){
            addEnemy(new Enemy(404,0));
        }
//        System.out.println(num);
    }
}
