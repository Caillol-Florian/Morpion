/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author dussaulp
 */
public class MatchView {
    private final JFrame window ;

    public MatchView() {
        
        // D E F I N I T I O N   D E   L A   F E N E T R E //
            window = new JFrame();
            window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            // Définit la taille de la fenêtre en pixels
            window.setSize(1080, 720);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);

            JPanel mainPanel = new JPanel(new GridLayout(5,1));
            window.add(mainPanel);
                
        // P A N E L   T I T R E //
            JPanel titlePanel = new JPanel(new BorderLayout());
            mainPanel.add(titlePanel);
            JLabel title = new JLabel ("P O S I T I O N N E M E N T   T O U R N O I (a finir)", JLabel.CENTER);
            titlePanel.add(title, BorderLayout.CENTER);
            titlePanel.setBackground(Color.red);

        // P A N E L   T O P   B U T T O N S //
            JPanel buttonPanel = new JPanel(new GridLayout(1,3));
            mainPanel.add(buttonPanel);

            // R U L E S   B U T T O N //
                JPanel leftButtonPanel = new JPanel(new GridLayout(3,3));
                buttonPanel.add(leftButtonPanel);
                for (int i = 0; i<9; i++) { 
                    if (i == 4) {
                        JPanel panel = new JPanel();
                        leftButtonPanel.add(panel);
                        JButton rulesButton = new JButton("Rules");
                        panel.add(rulesButton, BorderLayout.CENTER);
                    } else {
                        leftButtonPanel.setBackground(Color.ORANGE);
                    }        
                }

            // S T A N D I N G S   B U T T O N //            
                JPanel centerButtonPanel = new JPanel(new GridLayout(3,3));
                buttonPanel.add(centerButtonPanel);
                for (int i = 0; i<9; i++) { 
                    if (i == 4) {
                        JButton standingsButton = new JButton("Tournament standings");
                        centerButtonPanel.add(standingsButton, BorderLayout.CENTER);
                    } else {
                        centerButtonPanel.setBackground(Color.ORANGE);
                    }        
                }

            // O P T I O N S   S E T T I N G S //            
                JPanel rightButtonPanel = new JPanel(new GridLayout(3,3));
                buttonPanel.add(rightButtonPanel);
                JButton optionsButton = new JButton("Options");
                rightButtonPanel.add(optionsButton, BorderLayout.CENTER);                    
                    rightButtonPanel.setBackground(Color.ORANGE);

    
    }    
    
    
    public void afficher() {
        this.window.setVisible(true);
    }
}
