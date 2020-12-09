package basic;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Jframe extends JFrame {

    Player Player;

    public Jframe() {
        JFrame window = new JFrame("Kraba Zing");
        window.setSize(700, 1000);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.setLayout(new BorderLayout());
        window.add(new Game(), BorderLayout.CENTER);

        window.setVisible(true);
    }
}
