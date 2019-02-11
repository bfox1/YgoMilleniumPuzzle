package io.github.bfox1.ygomp.application.threads;

import io.github.bfox1.ygomp.application.gameplay.GameLoop;

public class LogicThread extends Thread
{
    private int gameState;

    public LogicThread(int state)
    {
        this.gameState = state;
    }

    @Override
    public void run()
    {
        execute();
    }

    public void execute()
    {

    }

}
