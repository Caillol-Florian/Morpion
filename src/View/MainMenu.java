/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.util.Observable;

public class MainMenu extends Observable {
    private final JFrame window ;
    private final JLabel Title;
    private final JButton Quick_Play;
    private final JButton Custom_Game;
    private final JButton Tournament;
    private final JButton Rules;
    private final JButton Exit ;
    private final JButton Options;
    private final JButton Single_Player;
    
    
    public MainMenu(){ 
        // Definition de la fenètre
        window = new JFrame();
        window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        window.setSize(720, 480);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        window.setLocation(dim.width/2-window.getSize().width/2, dim.height/2-window.getSize().height/2);
        // Creation du mainPanel
        JPanel mainPanel = new JPanel(new GridLayout(9,1));
        window.add(mainPanel);

        //Creation du topPanel
        JPanel topPanel = new JPanel();
        Title = new JLabel("Morpion");
        topPanel.add(Title,BorderLayout.CENTER);
        topPanel.setBackground(Color.red);
        mainPanel.add(topPanel,BorderLayout.NORTH);

        
          // Creation du bouton option 
        JPanel optionPanel =  new JPanel(new BorderLayout());
        Options = new JButton("Options");
        optionPanel.add(Options,BorderLayout.EAST);
        mainPanel.add(optionPanel);
        
        mainPanel.add(new JLabel());
          // Creation du bouton Quick Play
        JPanel Quick_PlayPanel = new JPanel(new GridLayout(1,3));
        Quick_Play = new JButton("Quick Play");
        Quick_PlayPanel.add(new JLabel());
        Quick_PlayPanel.add(Quick_Play,BorderLayout.CENTER);
        Quick_PlayPanel.add(new JLabel());
        mainPanel.add(Quick_PlayPanel);

         // Creation du bouton Single Player
         JPanel Single_PlayerPanel = new JPanel(new GridLayout(1,3));
         Single_Player = new JButton("Single Player");
         Single_PlayerPanel.add(new JLabel());         
         Single_PlayerPanel.add(Single_Player);
         Single_PlayerPanel.add(new JLabel());
         
         mainPanel.add(Single_PlayerPanel);
          // Creation du bouton Custom Game
        JPanel Custom_GamePanel = new JPanel(new GridLayout(1,3));
        Custom_Game= new JButton("Custom Game");
        Custom_GamePanel.add(new JLabel());
        Custom_GamePanel.add(Custom_Game);
        Custom_GamePanel.add(new JLabel());
        
        mainPanel.add(Custom_GamePanel);
        
            // Creation du bouton Tournoi 
        JPanel TournamentPanel = new JPanel(new GridLayout(1,3));
        Tournament = new JButton("Tournoi");
        TournamentPanel.add(new JLabel());
        TournamentPanel.add(Tournament);
        TournamentPanel.add(new JLabel());
        
        mainPanel.add(TournamentPanel);
        mainPanel.add(new JLabel());
        
        //Creation du bottomPanel
        JPanel bottomPanel = new JPanel(new GridLayout(1,7));
        Exit = new JButton("Exit");
        Rules = new JButton("Rules");

        for (int i =0; i<=7 ; i++){
            if (i==1){
                bottomPanel.add(Rules);
            }
            else if (i==6){
                bottomPanel.add(Exit);
                
            }
            else {
                bottomPanel.add(new JLabel());
            }
        }
        
        mainPanel.add(bottomPanel);

    }
    
    public void setVisible(){
        window.setVisible(true);
    }
    
}
