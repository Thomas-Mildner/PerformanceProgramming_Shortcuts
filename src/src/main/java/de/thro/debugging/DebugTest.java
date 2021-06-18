package de.thro.debugging;

import de.thro.debugging.services.DebugFactory;

/* ALT + 5 --> Show Debug Window */
/* F9 --> Choose Debug Configuration */
/* SHIFT + F9  --> Start Debugging*/
/* CTRL + F2  --> Stop Debugging*/
public class DebugTest
{
    private static boolean isReady;

    public static void main(String[] args)
    {
        /*CTRL + F8 --> add breakpoint*/
        System.out.println("Test");

        //add Fieldwatch
        isReady = true;
        var result = DebugFactory.TestMethodBreakpoint();

        //region Step In - Step over
        DebugFactory.count(10);
        System.out.println("Count completed");

        //endregion
    }



}
