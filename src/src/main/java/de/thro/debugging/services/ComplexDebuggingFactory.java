package de.thro.debugging.services;

import de.thro.debugging.models.ComplexDebuggingException;
import de.thro.debugging.models.DebuggingCustomerModel;

import java.util.ArrayList;
import java.util.Random;

public class ComplexDebuggingFactory
{
    public static ArrayList<DebuggingCustomerModel> generateTestData(int maxCustomers)
    {
        var customers = new ArrayList<DebuggingCustomerModel>();
        var rand = new Random(100);
        for (int i = 0; i < maxCustomers; i++)
        {
            customers.add(new DebuggingCustomerModel("FirstName", "LastName", rand.nextInt(100) + 1));
        }
        return customers;
    }

    public static void ThrowException(String exceptionMessage) throws ComplexDebuggingException
    {
        throw new ComplexDebuggingException(exceptionMessage);
    }
}
