package com.evening_class;

import java.util.HashMap;
import java.util.Scanner;

public class keypair
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int sum = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            boolean c = check(arr,n,sum);
            if(c==true)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
    static boolean check(int arr[],int n,int sum)
    {
       // HashMap<int, int> hashMap = new HashMap<int, int>();
        for(int i=0;i<n;i++)
        {
            if(arr[i]<sum)
            {
                
            }
        }
        return true;
    }
}
