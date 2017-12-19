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
    private int nbLine;
    private int nbColumn;
    private enumForms symbol;

    public Tile(int x, int y, enumForms form) {
        setNbLine(x);
    }
    
    
    /**
     * @return the nbLine
     */
    public int getNbLine() {
        return nbLine;
    }

    /**
     * @param nbLine the nbLine to set
     */
    public void setNbLine(int nbLine) {
        this.nbLine = nbLine;
    }

    /**
     * @return the nbColumn
     */
    public int getNbColumn() {
        return nbColumn;
    }

    /**
     * @param nbColumn the nbColumn to set
     */
    public void setNbColumn(int nbColumn) {
        this.nbColumn = nbColumn;
    }

    /**
     * @return the symbol
     */
    public enumForms getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(enumForms symbol) {
        this.symbol = symbol;
    }
    
    
    
}
