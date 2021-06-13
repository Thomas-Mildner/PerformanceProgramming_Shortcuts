package de.thro.debugging;

import de.thro.debugging.services.ComplexDebuggingFactory;

/*Add Watches*/
public class ComplexDebugging
{

     public static void main(String[] args)
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
            /* CTRL + SHIFT + F8  --> View Breakpoints, ALT + ENTER (Exception)*/
            ComplexDebuggingFactory.ThrowException("Exception Message");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage().toString());
        }
        //endregion


    }


}
