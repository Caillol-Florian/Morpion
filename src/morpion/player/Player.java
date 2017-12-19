/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.player;

/**
 *
 * @author dussaulp
 */
public class Player {
    
    private String name;
    private int nbWins;
    private int rank;
    
    public Player(String name, int nbWins, int rank) {
        setName(name);
        setNbWins(nbWins);
        setRank(0);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nbWins
     */
    public int getNbWins() {
        return nbWins;
    }

    /**
     * @param nbWins the nbWins to set
     */
    public void setNbWins(int nbWins) {
        this.nbWins = nbWins;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(int rank) {
        this.rank = rank;
    }
    
}
