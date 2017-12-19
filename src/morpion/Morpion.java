/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion;

import View.MainMenu;
import View.MatchView;

/**
 *
 * @author florian
 */
public class Morpion {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        MatchView match = new MatchView(15);
        match.afficher();
    }
    
}
