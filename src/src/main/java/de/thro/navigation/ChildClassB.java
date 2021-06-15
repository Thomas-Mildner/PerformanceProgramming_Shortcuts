package de.thro.navigation;

public class ChildClassB extends NavigationExample
{
    private NavigationInterface testInterface = new NavigationExample();

    public ChildClassB()
    {
        super();

        /* CTRL + ALT + B --> Navigate to Implementation */
        testInterface.TestMethodDeclaration();
    }
}
