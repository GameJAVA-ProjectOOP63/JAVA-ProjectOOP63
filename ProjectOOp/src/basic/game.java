/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author HP
 */
//วาดกราฟฟริกลงบนจอ
public class game extends JPanel implements ActionListener {

    Timer loop;
    Player Player;
    Enemy Enemy;
    RandEnemy rand;
    Image image;
    Map Map;
    int width = 700;
    int height = 1000;
    int count_score = 0;
    public static int score = 0;
    
    public game() {

        rand = new RandEnemy();
        loop = new Timer(10, this);
        loop.start();
        Player = new Player(width / 2, height);
        Enemy = new Enemy(350, 200);
        addKeyListener(new Keyinput(Player));
        image = new Image();
        Map = new Map(0);
        setFocusable(true);

    }
    public void addScore(){
        if (count_score % 100 == 0){
            score += 1;
            System.out.println(score);
        }
    }

    //การจัดการกราฟฟิคบนจอ
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;
//        g2d.setColor(Color.yellow);
//        g2d.fillRect(0, 0, MainClass.WIDTH, MainClass.HEIGHT);
        Map.draw(g2d);//วาดmap
        Player.draw(g2d);
        rand.draw(g2d);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Player.update();
   
        count_score++;
        addScore();
        repaint();
    }

}
