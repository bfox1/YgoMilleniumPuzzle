package io.github.bfox1.ygomp.application;

/**
 * The Field will be 6 Tiles Wide(X Axis) and 25 Tiles Length(Y Axis)
 * The Visible screen will be 6 Tiles Wide and 23 Tiles Long. This gives 2 rows the ability to generate out of sight.
 */
public class TileColumn
{

    private Tile[] tiles;
    private int xPos;

    private int highestTileNum;

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
    public void populateStartField(int xPos)
    {
        Tile t = generateTile(xPos);

        addToBottomArray(t);
    }

    /**
     * This will add the Tile to the array. Adding it incrementally to the next available position in the array.
     * This is for per tick incremental. Meaning the tiles will come from the bottom up.
     */
    private void addToBottomArray(Tile tile)
    {

        for(int i = 0; i < tiles.length; i++)
        {
            if(tiles[i] == null)
            {
                tiles[i] = tile;
            }
        }
    }

    public void addFromTopArray(Tile tile)
    {
        Tile[] tiles = new Tile[this.tiles.length];
        tiles[0] = tile;
        for(int i = 0; i < this.tiles.length; i++)
        {
            tiles[i+1] = this.tiles[i];
        }
        this.tiles = tiles;
    }

    /**
     * This is for adding and multiple tiles from the top down.
     * @param tiles
     */
    public void addFromTopArray(Tile... tiles)
    {
        Tile[] til = tiles;

        for(int i = 0; i < this.tiles.length; i++)
        {
            til[i+tiles.length + 1] = this.tiles[i];
        }
    }

    public Tile[] readDisplayTiles()
    {
        Tile[] tiles = new Tile[this.tiles.length];
        int i = 25;
        for(Tile tile : this.tiles)
        {
            if(tile != null)
            {
                tiles[i] = tile;
            }
        }

        return tiles;
    }

    public void addFirst(Tile tile)
    {

        Tile[] tiles = new Tile[26];
        tiles[0] = tile;

        for(int i = 0; i < this.tiles.length; i++)
        {
            tiles[i+1] = this.tiles[i];
        }

        this.tiles = tiles;
    }

    public void addLast(Tile tile)
    {
        for(int i = 25; i >=0; i--)
        {
            if(this.tiles[i] == null)
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
