package basic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.*;

//วาดกราฟฟริกลงบนจอ
public class Game extends JPanel implements ActionListener {

    Timer loop, loop1, loop2;
    Player Player;
    Enemy Enemy;
    RandEnemy rand;
    Image image;
    Map Map;
    Game game;
    SoundPlay1 sound1;
    SoundPlay2 sound2;
    SoundPlay3 sound3;
    static int width = 700;
    static int height = 1000;
    public static int count_score = 0;
    public static int score = 0;

    public Game() {
        rand = new RandEnemy();
        loop = new Timer(10, this);
        loop.start();
        Player = new Player((width / 2) - 35, height);
        Enemy = new Enemy(350, 200);
        addKeyListener(new Keyinput(Player));
        image = new Image();
        Map = new Map(0);
        setFocusable(true);
    }

    public void addScore() {
        if (count_score % 75 == 0 && Player.life > 0) {
            score += 1;
        }
    }

    //การจัดการกราฟฟิคบนจอ
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;
        Map.draw(g2d);//วาดmap

        if (Player.life > 0) {
            Player.draw(g2d);
            rand.draw(g2d);
            g2d.setColor(Color.white);
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, 30));
            g2d.drawString("score " + score, 542, 50);
            if (sound1 == null) {
                loop1 = new Timer(1000, (ActionListener) sound1);
                loop1.start();
                sound1 = new SoundPlay1("/Music/background.wav");
            }
            if (sound2 != null) {
                sound2.clip.stop();
                sound3.clip.stop();
                sound2 = null;
            }
        } else {//พลังชีวิตหมด
            g2d.setColor(Color.white);
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, 70));
            g2d.drawString("Game Over", (width / 2) - 180, (height - 50) / 2);
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, 50));
            g2d.drawString("Your Score " + score, (width / 2) - 150, (height + 60) / 2);
            g2d.setFont(new Font("TimesRoman", Font.PLAIN, 20));
            g2d.drawString("Press SPACEBAR to try again.", (width - 485), (height - 200));
            g2d.drawImage(Image.life1Red, 550, 60, 45, 45, null);
            g2d.drawImage(Image.life2Red, 600, 65, 35, 35, null);
            g2d.drawImage(Image.life3Red, 640, 65, 35, 35, null);
            if (sound1 != null) {
                sound1.clip.stop();
                sound1 = null;
            }
            if (sound2 == null) {
                loop2 = new Timer(1000, (ActionListener) sound2);
                loop2.start();
                sound2 = new SoundPlay2("/Music/gameover.wav");
                sound3 = new SoundPlay3("/Music/dead.wav");
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Player.update();
        count_score++;
        addScore();
        repaint();
    }
}
