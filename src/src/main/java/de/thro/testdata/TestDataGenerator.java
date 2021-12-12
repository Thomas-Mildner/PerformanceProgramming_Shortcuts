package de.thro.testdata;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class TestDataGenerator
{
    public static void main(String[] args)
    {

        /* Exercise: Install Plugin "Randomness" */
        /* Create some variables and press ALT + R*/



        /* Exercise - Generate Customer Data with Faker*/

    }

    private static int CalculateDaysToBirthday (Date birthday){

        LocalDate today = LocalDate.now();
        long diffDays = ChronoUnit.DAYS.between((Temporal) birthday, today);

        return Math.abs((int)diffDays);
    }


    private static class Customer
    {
        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private Date birthday;

        public Customer()
        {

        }

        /*Exercise generate a matching constructor */
        /*Exercise generate Getter & Setter */
    }

}
