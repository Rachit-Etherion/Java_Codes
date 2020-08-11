package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KB_TO_MB
{
    public static void main(String[] args)
            throws Exception
    {
        int kb;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter KB : ");
        kb = Integer.parseInt(br.readLine());
        //KB_TO_MB obj = new KB_TO_MB();
        //       obj.pmbkb(kb);
        pmbkb(kb);
    }
    public static void pmbkb(int kb)
    {
        int mb=0;
        if (kb<0)
            System.out.println("Invalid Entry ");
        while(kb>=1024)
        {
            kb-=1024;
            mb++;
        }
        System.out.println("MB = "+mb+"\nKB = "+kb);
    }

}
