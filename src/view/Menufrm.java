
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Menufrm extends JFrame {

    JPanel pnlNorth = new JPanel();
    
    public Menufrm() {
        this.setTitle("MENU PRINCIPAL");
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
        pnlNorth.setPreferredSize(new Dimension(500,80));
        this.add(pnlNorth,BorderLayout.NORTH);
    }
    
    public void head(){
        JLabel lblTitle = new JLabel("Menu");
        lblTitle.setFont(new Font("Calibri",Font.BOLD,20));
        pnlNorth.add(lblTitle);
    }

}
