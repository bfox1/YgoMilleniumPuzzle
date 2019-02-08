package io.github.bfox1.ygomp.application.gameplay;

public class GameLoop
{

    private int ticks;

    private GameState state;

    public GameLoop()
    {

    }

    public void gameUpdate()
    {
        while(state != GameState.STOP)
        {
            while (state == GameState.START)
            {
                boolean b = startGame();

                if(!b)
                {
                    state = GameState.STOP;
                }
            }
            while (state == GameState.STARTING)
            {
                startingGame();
            }
        }
    }

    /**
     * Initiates Start Game mechanics. Anything that needs to be loaded during game start should be performed here.
     * @return
     */
    private boolean startGame()
    {
        try
        {
            this.state = GameState.STARTING;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private boolean startingGame()
    {
        try
        {

        }
        catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    enum GameState
    {
        START(0),
        STOP(1),
        RUNNING(2),
        PAUSED(3),
        STARTING(4),
        STOPPING(5);

        int code;

        GameState(int code)
        {
            this.code = code;
        }

        public int getCode()
        {
            return this.code;
        }
    }
}
