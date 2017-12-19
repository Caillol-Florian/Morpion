/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
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
    private final JFrame window;

    public MatchView(int gridSize) {
            
        
        // D E F I N I T I O N   D E   L A   F E N E T R E //
            window = new JFrame();
            window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            // Définit la taille de la fenêtre en pixels
            window.setSize(720, 800);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
            
            JPanel mainPanel = new JPanel(new GridLayout(gridSize+3,1));
            window.add(mainPanel);            
                
        // P A N E L   T I T R E //
            JPanel titlePanel = new JPanel(new GridLayout(3,1));
            
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridheight=1;
            gbc.gridwidth=5;
            gbc.gridx=0;
            gbc.gridy=0;
            mainPanel.add(titlePanel, gbc);
            JLabel title = new JLabel ("P O S I T I O N N E M E N T   T O U R N O I (a finir)", JLabel.CENTER);
            titlePanel.add(title, BorderLayout.CENTER);
            titlePanel.setBackground(Color.red);

        // P A N E L   T O P   B U T T O N S //
            GridLayout gridButton = new GridLayout(1,3,30,0);
            JPanel buttonPanel = new JPanel(gridButton);
            gbc.gridy=1;
            mainPanel.add(buttonPanel,gbc);

            GridLayout grid = new GridLayout(3,1);

            JPanel leftButtonPanel = new JPanel(grid);
            buttonPanel.add(leftButtonPanel);

            JPanel centerButtonPanel = new JPanel(grid);
            buttonPanel.add(centerButtonPanel);

            JPanel rightButtonPanel = new JPanel(grid);
            buttonPanel.add(rightButtonPanel);


            // R U L E S   B U T T O N //
                for (int i = 0; i<3; i++) { 
                    if (i == 1) {
                        JButton rulesButton = new JButton("Rules");
                        leftButtonPanel.add(rulesButton, BorderLayout.CENTER);
                    } else {
                        JPanel emptyPanel = new JPanel();
                        leftButtonPanel.add(emptyPanel);
                        emptyPanel.setBackground(Color.ORANGE);
                    }        
                }

            // S T A N D I N G S   B U T T O N //            
                for (int i = 0; i<3; i++) { 
                    if (i == 1) {
                        JButton standingsButton = new JButton("Tournament standings");
                        centerButtonPanel.add(standingsButton, BorderLayout.CENTER);
                    } else {
                        JPanel emptyPanel = new JPanel();
                        centerButtonPanel.add(emptyPanel);
                        emptyPanel.setBackground(Color.GREEN);
                    }        
                }

            // O P T I O N S   S E T T I N G S //          
                for (int i = 0; i<3; i++) { 
                    if (i == 1) {
                        JButton optionsButton = new JButton("Options");
                        rightButtonPanel.add(optionsButton, BorderLayout.CENTER);                    
                    } else {
                        JPanel emptyPanel = new JPanel();
                        rightButtonPanel.add(emptyPanel);
                        emptyPanel.setBackground(Color.PINK);
                    }        
                }
                
                
            //  // 
            for (int i = 0; i<gridSize;i++){
                JPanel grille = new JPanel(new GridLayout(1,5));
                mainPanel.add(grille);
            for (int j = 0; j<gridSize+2; j++) { 
                if (j != 0 && j != gridSize+1) {
                    JPanel emptyPanel = new JPanel();
                    grille.add(emptyPanel);
                    emptyPanel.setBackground(Color.GRAY);                   
                } else {
                    JPanel emptyPanel = new JPanel();
                    grille.add(emptyPanel);
                    emptyPanel.setBackground(Color.WHITE);
                }        
            }
            }

            
            
             
    }    
    
    
    public void afficher() {
        window.setUndecorated(true);
        this.window.setVisible(true);
    }
    
}
