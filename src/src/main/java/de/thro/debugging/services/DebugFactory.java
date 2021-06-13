package de.thro.debugging.services;

public class DebugFactory
{
    public static int TestMethodBreakpoint()
    {
        // breakpoint hit
        int x = 0;
        x += 1;
        return x;
    }

    public static void Count(int max)
    {
        for (int i = 0; i < max; i++)
        {
            System.out.println(i);
        }
    }
}
