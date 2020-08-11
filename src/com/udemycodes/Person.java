package com.udemycodes;

public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setFirstName(String n)
    {
        firstName = n;
    }
    public void setLastName(String n)
    {
        lastName = n;
    }
    public void setAge(int a)
    {
        if(a<0||a>100)
        {
            age = 0;
        }
        else {
            age = a;
        }
    }
    public boolean isTeen()
    {
        if(age > 12 && age < 20)
        {
            return true;
        }
        return false;
    }
    public String getFullName()
    {
        if(firstName.isEmpty() && lastName.isEmpty())
        {
            return "";
        }
        else if (firstName.isEmpty())
        {
            return lastName;
        }
        else if (lastName.isEmpty())
        {
            return firstName;
        }
        return firstName +" "+lastName;
    }
}
