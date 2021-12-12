package de.thro.testdata;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDataGenerator
{
    public static void main(String[] args)
    {

        /* Exercise: Install Plugin "Randomness" */
        /* Create some variables and press ALT + R*/


        /* Exercise - Generate Customer Data with Faker*/


        //Exercise Add Test Method for count Vowels

    }

 public static int countVowels(String name){
     return name.replaceAll("(?i)[^aeiou]", "").length();
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
