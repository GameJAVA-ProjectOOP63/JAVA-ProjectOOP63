/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class Jframe extends JFrame {
    Player Player;
    public Jframe(){
        JFrame window = new JFrame("Kraba Zing");
        
        window.setSize(700, 1000);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        
        window.setLayout(new BorderLayout());
        window.add(new game(),BorderLayout.CENTER);
        
        window.setVisible(true);
    }

}