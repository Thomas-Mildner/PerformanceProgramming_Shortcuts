package de.thro.debugging;

import de.thro.debugging.services.ComplexDebuggingFactory;

/*Add Watches*/
public class ComplexDebugging
{

    public static void main(String[] args) throws Exception
    {
        //region Conditional Debugging
        var customers = ComplexDebuggingFactory.generateTestData(100);
        for (int i = 0; i < customers.size(); i++)
        {
            /*Exercise - set breakpoint for customers with age > 80 */
            System.out.println(customers.get(i).toString());
        }
        //endregion

        //region Exception Debugging
        try
        {
            /* CTRL + SHIFT + F8  --> View Breakpoints, ALT + Insert (Exception)*/
            ComplexDebuggingFactory.throwException("Exception Message");
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage().toString());
        }
        //endregion

        /* Exercise: Install Plugin: Jump to Line*/
        /* Debug next method and jump over exception*/
        var result = criticalCodeToDebug();
    }

    private static boolean criticalCodeToDebug() throws Exception
    {
        var methodExecutionSuccessful = true;
        System.out.println("Method start");
        System.out.println("Starting to enter critical code");

        //Todo skip this part while debugging
        methodExecutionSuccessful = false;

        System.out.println("Method finished");
        return methodExecutionSuccessful;

    }

}
