package io.github.bfox1.ygomp.application;

/**
 * The Field will be 6 Tiles Wide(X Axis) and 25 Tiles Length(Y Axis)
 * The Visible screen will be 6 Tiles Wide and 23 Tiles Long. This gives 2 rows the ability to generate out of sight.
 */
public class TileColumn
{

    private Tile[] tiles;
    private int xPos;

    public TileColumn(int xPos)
    {
        tiles = new Tile[26];
        this.xPos = xPos;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxpos(int xPos) {
        this.xPos = xPos;
    }

    /**
     * Setting Tile Position is for randomized Tile Generation.
     * This should be ran at the start of the match and to constantly Generate new Tiles.
     * Shouldnt be used to set specific Tiles OR swap Tiles.
     * @param xPos
     */
    public void populateField(int xPos)
    {
        Tile t = generateTile(xPos);

        addToArray(t);
    }

    /**
     * This will add the Tile to the array. Adding it incrementally to the next available position in the array.
     */
    private void addToArray(Tile tile)
    {

        for(int i = 0; i < tiles.length; i++)
        {
            if(tiles[i] == null)
            {
                tiles[i] = tile;
            }
        }
    }

    /**
     * A Private field that will create a Tile.
     * @param xPos
     * @return
     */
    private Tile generateTile(int xPos)
    {
        Tile tile = new Tile(xPos);

        tile.createType();

        return tile;
    }
}
