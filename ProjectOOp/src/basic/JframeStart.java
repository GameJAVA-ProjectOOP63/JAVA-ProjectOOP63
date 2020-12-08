package basic;
              
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class JframeStart extends KeyAdapter{
    Map map;
    JFrame window = new JFrame("Kraba Zing");
    public JframeStart(){
        window.setSize(700, 1000);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.add(new GameStart());
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
