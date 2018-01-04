/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import Util.Messages;
import Util.enumForms;
import View.MainMenu;
import View.MatchView;
import View.TournamentSettings;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import com.sun.tools.javac.Main;
import com.sun.tools.javac.code.Attribute;
import morpion.jeu.*;

import javax.swing.*;

/**
 *
 * @author dussaulp
 */
public class Controller implements Observer {
    private ArrayList<Observable> views = new ArrayList<>();
    private MatchView matchView ;
    private MainMenu mainMenu;
    private TournamentSettings tournamentSettings;
    public Controller(){
    mainMenu = new MainMenu();
    views.add(mainMenu);
    tournamentSettings = new TournamentSettings();
    tournamentSettings.setVisible();

    }
    @Override
    public void update(Observable o, Object arg){
        if (arg == Messages.CASE){
            //System.out.println(grille.getTile(matchView.getPosition()));
    }

    }

    public void addView(Observable o){
        o.addObserver(this);
        views.add(o);
    }
}
