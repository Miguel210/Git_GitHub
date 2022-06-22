
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menufrm extends JFrame {

    JPanel pnlNorth = new JPanel();
    
    public Menufrm() {
        this.setTitle("Hola");
        this.setLayout(new BorderLayout());
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        head();
        panels();
    }
    
    public void panels(){
        pnlNorth.setBackground(Color.gray);
        pnlNorth.setPreferredSize(new Dimension(50,80));
        this.add(pnlNorth,BorderLayout.NORTH);
    }
    
    public void head(){
        JLabel lblTitle = new JLabel("Menu");
        pnlNorth.add(lblTitle);
    }

}
