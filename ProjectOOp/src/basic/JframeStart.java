package basic;
        
        
        
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class JframeStart extends KeyAdapter{
    JFrame window = new JFrame("Bobby Survival");
    public JframeStart(){
        
        
        window.setSize(1200, 800);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        window.setVisible(true);
        
        window.addKeyListener(this);
        window.setFocusable(true);
    }
    
    @Override
    public void keyPressed(KeyEvent ke) {
        int key = ke.getKeyCode();
        if(key==KeyEvent.VK_SPACE){
            window.dispose();
            Jframe fr = new Jframe();
        }
    }
}
