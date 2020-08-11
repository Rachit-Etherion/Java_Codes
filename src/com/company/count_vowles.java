package com.company;
import java.io.*;
import java.util.*;
public class count_vowles {
    public static void cvowel()
            throws IOException
    {
        int i,c=0;
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String : ");
        String s = br.readLine();
        s=s.toLowerCase();
        for (i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        System.out.println("Vowels are : "+c);
    }

}