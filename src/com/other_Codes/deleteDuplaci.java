package com.other_Codes;

import java.util.HashSet;
import java.util.Scanner;

public class deleteDuplaci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;
        String str;
        sc.nextLine();
        while(t>0)
        {
            count=0;
            str = sc.nextLine();
            for(int i=0;i<str.length()-1;i++)
            {
                if(str.charAt(i)==str.charAt(i+1))
                {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
