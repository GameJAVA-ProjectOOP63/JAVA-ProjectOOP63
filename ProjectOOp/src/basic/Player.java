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
    public Player(){
        map = new Map(0);
    }
    //เมธอดการเคลื่อนที่ของผู้เล่น จะทำงานตลอดเวลา
    public void update(){
        x+=speedx;
        y+=speedy;
        //การชนขอบ ออกจากขอบของจอ
        if(x< 223){
            x=223;
        }
        if(y< 0){
            y=0;
        }
        if(x>406){
            x=406;
        }
        if(y> 863){
            y = 863;
        }
        
    }
    //วาดตัวละครผู้เล่น
    public void draw(Graphics2D g2d){
        g2d.drawImage(Image.carzing, x, y, 70, 120 ,null);
    }
    //กดปุ้มค้างไว้
    public void keyPressed(KeyEvent e){
        int key=e.getKeyCode();
        if(key==KeyEvent.VK_RIGHT){
            speedx=3;
            if(map.count_speed_map > 30){
                speedx=5;
            }
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_LEFT){
            speedx=-3;
            if(map.count_speed_map > 30){
                speedx=-5;
            }
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_UP){
            speedy=-3;
            if(map.count_speed_map > 30){
                speedy=-5;
            }
//            System.out.println(x);
//            System.out.println(y);
        }
        if(key==KeyEvent.VK_DOWN){
//            System.out.println(x);
//            System.out.println(y);
            speedy=3;
            if(map.count_speed_map > 30){
                speedy=5;
            }
        }
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

    
}
