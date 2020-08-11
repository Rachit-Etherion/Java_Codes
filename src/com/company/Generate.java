package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CheckVal extends  Exception
{
    int v;
    CheckVal(int b)
    {
        v=b;
    }
    public String toString()
    {
        return "Sorry second value is not perfect "+v;
    }
}
public class Generate
{

    public void subtract(int a,int b)throws CheckVal
    {

        if(a>b)
        {
            System.out.println(a-b);
        }
        else
        {
           throw new CheckVal(b);
        }
    }


   public static void main(String args[])
   {
       int a,b,c;
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       Generate ob=new Generate();
       try
       {
         ob.subtract(4,6);
       }
       catch(CheckVal e)
       {
           System.out.println(e);
       }

   }

}
