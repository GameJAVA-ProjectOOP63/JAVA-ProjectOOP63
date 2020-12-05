/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author HP
 */
//จัดการ Event Keyboard
public class Keyinput extends KeyAdapter{
    Player p;

    public Keyinput(Player p) {
        this.p = p;
    }

    @Override
    //กดค้าง
    public void keyPressed(KeyEvent ke) {
        p.keyPressed(ke);
    }

    @Override
    //ปล่อยปปุ่ม
    public void keyReleased(KeyEvent ke) {
        p.keyReleased(ke);
    }
    
}
