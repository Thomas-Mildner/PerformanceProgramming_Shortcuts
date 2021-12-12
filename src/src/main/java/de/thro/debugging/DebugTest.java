package de.thro.debugging;

import de.thro.debugging.services.DebugFactory;
// Show all Breakpoints --> CTRL + SHIFT + F8
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

        //add Fieldwatch --> Go to Definition and add Breakpoint
        isReady = true;
        //add method Watch --> Go to Method Definition and add Breakpoint
        var result = DebugFactory.TestMethodBreakpoint();

        //region Step In - Step over
        DebugFactory.count(10);
        System.out.println("Count completed");

        //endregion

        //CTRL + SHIFT + F8 --> Move to Group (Naming a specific bug)

    }



}
