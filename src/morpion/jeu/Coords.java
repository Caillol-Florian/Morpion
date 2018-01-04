/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.jeu;

/**
 *
 * @author dussaulp
 */
public class Coords {
    private int x;
    private int y;
    
    public Coords(int x, int y) {
        setX(x);
        setY(y);
    }

    /**
     * @return the y
     */
    public int getX() {
        return getY();
    }

    /**
     * @param x the y to set
     */
    public void setX(int x) {
        this.setY(x);
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
    
}
