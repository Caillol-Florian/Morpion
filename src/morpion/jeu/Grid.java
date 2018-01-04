/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morpion.jeu;

import java.util.HashMap;
/**
 *
 * @author dussaulp
 */
public class Grid {
    
    private int gridSize;
    private HashMap<Coords,Tile> tiles = new HashMap<>();
    private Coords coords[][];
    public Grid (int gridSize) {
       this.gridSize=gridSize;
        coords = new Coords[gridSize][gridSize];
        for(int i = 0 ; i < gridSize; i++){
            for (int j = 0; j<gridSize;j++){
                coords[i][j]=new Coords(i,j);
                tiles.put(coords[i][j],new Tile());
            }
        }

    }

    public Tile getTile(int x, int y){
       return tiles.get(coords[x][y]);
    }
    public Tile getTile(int[] coord){
        return tiles.get(coords[coord[0]][coord[1]]);

    }
}
