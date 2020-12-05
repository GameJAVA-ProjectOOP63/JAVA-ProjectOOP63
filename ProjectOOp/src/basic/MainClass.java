/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class MainClass extends JFrame {
    //สร้างจอเกม
    public static final int WIDTH=700;
    public static final int HEIGHT=1000;   
    public static void main(String[] args) {
                JFrame window=new JFrame("โปรเกรมวาดภาพอย่างง่าย");
                window.setSize(WIDTH,HEIGHT);
                window.setResizable(false);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setLocationRelativeTo(null);
                window.add(new game());
                window.setVisible(true);
    }
}