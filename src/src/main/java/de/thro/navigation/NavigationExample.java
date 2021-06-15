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

    public static void main(String[] args)
    {

    }

    @Override
    public String toString()
    {
        return "NavigationExample{}";
    }

    public NavigationExample()
    {
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
    public void TestMethodDeclaration()
    {
        System.out.println("Test Implementation");
    }
}


