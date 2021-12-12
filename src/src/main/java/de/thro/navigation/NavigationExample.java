package de.thro.navigation;

public class NavigationExample implements NavigationInterface
{
    /* ALT + Pfeiltasten */
    /* CTRL + W --> Extend Selection*  --> IMPORTANT */
    /* CTRL + SHIFT + W --> Shrink Selection*/
    /* CTRL + Pfeiltasten --> Commands überspringen*/
    /* CTRL + SHIFT + Pfeiltasten --> Commands+ Markieren überspringen*/
    /* SHIFT + Home  oder SHIFT + END --> ganze Zeile markieren*/

    /* ALT + HOME  --> Show Package Root Classes */
    /* ALT + UP / DOWN --> Navigation zwischen Methoden --> Important */

    /*CTRL + ALT + Numpad -   oder +    --> Einklappen von Methoden */
    /*CTRL + SHIFT + Numpad -    --> alles einklappen */

    /* CTRL + N --> Show Class */

    /* CTRL + G --> Go to Line */
    /* CTRL + E --> Last Files*/
    /* CTRL + SHIFT + Backspace */


    public static void main(String[] args)
    {
        var x = 1;
        System.out.println("Test");
    }

    @Override
    public String toString()
    {
        return "NavigationExample{}";
    }

    public NavigationExample()
    {
        var ix = 12;
        //base constructor call
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    @Override
    public void testMethodDeclaration()
    {
        System.out.println("Test Implementation");
    }
}


