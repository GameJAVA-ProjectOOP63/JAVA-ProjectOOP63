/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

import java.awt.Component;
import javax.swing.JFrame;
 
public class Runner extends JFrame {
 
    public Runner() {
        super("Scrolling Background Demo");
        setSize(550, 250);
 
        ScrollingBackground back = new ScrollingBackground();
        ((Component)back).setFocusable(true);
        getContentPane().add(back);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public static void main(String[] args) {
        new Runner();
    }
 
}