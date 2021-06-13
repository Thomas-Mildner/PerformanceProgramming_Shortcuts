package de.thro.lombok.services;

import de.thro.lombok.base.LombokExampleDefinition;

import java.io.IOException;

public class DataService implements LombokExampleDefinition
{
    @Override
    public void SynchronizeExample()
    {

    }

    @Override
    public void LoggingExample()
    {

    }

    @Override
    public void CleanUpExample()
    {
        try(var stream = DataService.class.getResourceAsStream("/demo.txt"))
        {


        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
