package de.thro.debugging.models;

public class ComplexDebuggingException extends Exception
{
    public ComplexDebuggingException()
    {
        this("Custom Exception thrown without Exception message");
    }

    public ComplexDebuggingException(String s)
    {
        super(s);
        System.out.printf("Inner Exception: %s%n",s);
    }
}
