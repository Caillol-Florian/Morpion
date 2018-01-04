/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.jeu;

import Util.enumForms;

/**
 *
 * @author dussaulp
 */
public class Tile {
    private enumForms symbol;

    public Tile() {
       this.symbol=enumForms.VOID;
    }
    public void setSymbol(enumForms form){
        if (symbol==enumForms.VOID){
            symbol = form;
        }
    }
@Override
    public String toString(){
        return symbol.toString();
}
}
