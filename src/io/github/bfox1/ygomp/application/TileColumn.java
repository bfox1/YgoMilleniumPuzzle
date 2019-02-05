package io.github.bfox1.ygomp.application;

/**
 * The Field will be 6 Tiles Wide(X Axis) and 25 Tiles Length(Y Axis)
 * The Visible screen will be 6 Tiles Wide and 23 Tiles Long. This gives 2 rows the ability to generate out of sight.
 */
public class TileColumn
{

    private Tile[] tiles;
    private int yPos;

    public TileColumn(int yPos)
    {
        tiles = new Tile[25];
        this.yPos = yPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    /**
     * Setting Tile Position is for randomized Tile Generation.
     * This should be ran at the start of the match and to constantly Generate new Tiles.
     * Shouldnt be used to set specific Tiles OR swap Tiles.
     * @param xPos
     */
    public void setTile(int xPos)
    {

    }

    private Tile generateTile()
    {

    }
}
