package com.company;

public class lpyear
{
    public static void leapyear(int year)
    {
        if (year>=1 && year<=9999)
        {
            if (year%4==0)
            {
                if (year%400==0)
                    System.out.println("Year is leap year");
                else if (year%100 !=0)
                    System.out.println("Year is leap year");
                else
                    System.out.println("Year is not leap year");

            }
            else
                System.out.println("Year is not leap year");
        }
    }
}
