package basic;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameStart extends JPanel  {
    Image image;
    public GameStart(){
        image = new Image();
        setFocusable(true);
        
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(Image.Startgame, 0, 0,null);
    }
}
