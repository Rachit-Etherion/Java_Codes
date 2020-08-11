package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove_vowel {
    public static void rvowel()
            throws IOException
    {
        int i;
        char ch;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String : ");
        String s,p="";
        s = br.readLine();
        s=s.toLowerCase();
        for (i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
            else
                p+=ch;
        }
        System.out.println("String is : "+p);
    }


}
