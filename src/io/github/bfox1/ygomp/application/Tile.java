package io.github.bfox1.ygomp.application;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The Tile Class is the entity represented as "tiles" or "Squares" to which the player must move
 * on the screen to get 3 or more in a row either horizontal or vertical.
 *
 * Tile Will contain coordinates that are matched with the playing field. The playing field per player is
 * 6 Wide and 12 Tall
 *
 * Each Column with be labeled by a number and will be its own Tile Array. The Array goes from 0-5.
 *
 * Tiles Include the following
 *
 * Grass = WIND
 * Normal = EARTH
 * Water = WATER
 * Fire = FIRE
 * Psychic = LIGHT
 * Steel = DIVINE
 *
 */
public class Tile
{
    private int pos;

    private TileType tileType;

    public Tile(int pos)
    {
        this.pos = pos;

    }

    /**
     * This is for creating random Tile Types.
     * This is ONLY to be used for Tile Generated.
     */
    protected void createType()
    {
        int rand = ThreadLocalRandom.current().nextInt(0,6);

        int i = 0;
        for(TileType type : TileType.values())
        {
            if(i == rand)
            {
                this.tileType = type;
                break;
            }
            i++;
        }
    }

    public enum TileType
    {
        WIND("wind"),
        EARTH("earth"),
        WATER("water"),
        FIRE("fire"),
        LIGHT("light"),
        DARK("dark"),
        DIVINE("divine");

        private final String typeName;
        private final String resourceLocation;
        TileType(String typeName)
        {
            this.typeName = typeName;

            //TODO: This is for when a definite location is set, the resource can be static within the Enum of the
            this.resourceLocation = typeName;
        }

        public String getTypeName()
        {
            return typeName;
        }

        public String getResourceLocation()
        {
            return resourceLocation;
        }
    }
}