package com.company;

import java.io.*;

public class Replace_word
{
    public void repword()
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.print("Enter String : ");
        s=br.readLine();
        String sb[]=s.split(" ");
        s="";
        for (int i=0;i<sb.length;i++)
        {
            if (sb[i].equalsIgnoreCase("school")==true)
                s+="college";
            else
                s+=sb[i];
            s+=" ";
        }
        System.out.println("String is : "+s);

    }
}
