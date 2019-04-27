package io.github.bfox1.ygomp.application.Util.exceptions;

public class MissingResourceException extends Exception
{
    public MissingResourceException(String m)
    {
        this.initCause(new Throwable(m));
    }
}
