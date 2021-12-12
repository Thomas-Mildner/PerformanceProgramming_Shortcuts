package de.thro.refactoring;

/* CTRL + ALT + M  --> Extract Method*/
public class RefactoringExample
{

    public static void main(String[] args)
    {
        /* Exercise: Extract Logic in Method*/
        //CTRL + ALT + M  // CTRL + W
        var a = new TestA();
        a.printTest();

        var b = new TestA();
        b.printTest();


        /* Exercise: Move WrongClass in wrongPackage to refactoring package */ // F6
        /* Exercise: Rename wrong class to TestB --> Shift + F6*/
        /* Exercise: Change Signature in testmethod*/
    }

    private static int test(int x)
    {
        /* Exercise: Extract i as  Field, Constant, Parameter --> CTRL + ALT + F / C / P */
        var i = 0;
        return i;
    }
}
