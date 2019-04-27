package io.github.bfox1.ygomp.application.gameplay;

import io.github.bfox1.ygomp.application.Tile;
import io.github.bfox1.ygomp.application.TileColumn;

public class PlayerField
{
    private TileColumn[] columns = new TileColumn[6];

    public PlayerField()
    {
        generateField();
    }

    private void generateField()
    {
        for(int i = 0; i < columns.length; i++)
        {
            TileColumn column = new TileColumn(i);
            column.populateStartField(i);
            columns[i] = column;
        }
    }

    public void test()
    {
        for(TileColumn c : this.columns)
        {
            Tile[] t = c.readDisplayTiles();


            for(int i = 0; i < t.length; i++)
            {
                if(t[i] == null)
                {

                    System.out.println("Empty");
                }
                else
                {
                    System.out.println(t[i].getTileName());
                }
            }

        }
    }

}
