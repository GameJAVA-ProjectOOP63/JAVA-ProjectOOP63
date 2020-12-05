/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

//ออกแบบ Player

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class Player {
    Map map;
    private int x;
    private int y;
    //กำหนดความเร็ซในการเคลื่อนที่ของผู้เล่นตลอดการทำงาน
    private int speedx=0;
    private int speedy=0;
    public Player(int x, int y){
        this.x= x;
        this.y= y;
    }
        private LinkedList<Enemy> e = RandEnemy.getEnemyBounds();
    public Player(){
        map = new Map(0);
    }
    //เมธอดการเคลื่อนที่ของผู้เล่น จะทำงานตลอดเวลา
    public void update(){
        x+=speedx;
        y+=speedy;
        //การชนขอบ ออกจากขอบของจอ
        if(x< 158){
            x=158;
        }
        if(y< 10){
            y=10;
        }
        if(x>470){
            x=470;
        }
        if(y> 826){
            y = 826;
        }
        hit();
        
    }
    //วาดตัวละครผู้เล่น
    public void draw(Graphics2D g2d){
        g2d.drawImage(Image.kraba, x, y, 70, 140 ,null);
    }
    //กดปุ้มค้างไว้
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=6;
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=-6;
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_UP){
            speedy=-6;
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_DOWN){
//            System.out.println(x);
//            System.out.println(y);
            speedy=6;
;        }
    }
    public void keyReleased(KeyEvent e){
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=0;
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=0;
        }
        if(key==KeyEvent.VK_DOWN){
            speedy=0;
        }
        if(key==KeyEvent.VK_UP){
            speedy=0;
        }
    }

 //กำหนดhitbox
    public Rectangle getBounds() {
        return new Rectangle(x+20, y +20, 70-40, 140);
    }

    //เช็คการชนPlayerกับEnemy
    public void hit() {
        for (int i = 0; i < e.size(); i++) {
            if (getBounds().intersects(e.get(i).getBounds())) {
                e.remove(i);       }
        }
    }   
}
