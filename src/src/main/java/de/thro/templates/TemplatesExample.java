package de.thro.templates;

public class TemplatesExample
{
    public static void main(String[] args)
    {
        /* ALT + 1
         * SWITCH TO PROJECT VIEW */

        /* ALT + F1 */
        /* SWITCH TO DIFFERENT VIEWS*/



        /* CTRL + ALT + INSERT
         * CUSTOMTEMPLATE */


        /* USEFUL DEFAULT LIVE TEMPLATES*/
        /*
        PSVM
        SOUT
        IFN
        IFNN

        FORI
        ITER
         */

        /* USE CTRL + J
         * CUSTOMTEMP */

        var resultOk = criticalCode(10, 2);
        System.out.println(resultOk);
        var errorOccur = criticalCode(10, 0);
        System.out.println(errorOccur);

    }

    private static float criticalCode(int a, int b)
    {
        //Todo maybe there should be a try catch?
        /*Exercise: Add TryCatch --> SHIFT + ALT + T*/
        return a / b;

    }

}

