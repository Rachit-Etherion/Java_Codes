package codefores;

import java.util.Scanner;

public class IWannaBetheGuy
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x,y,t;
        x=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            t = sc.nextInt();
            arr[t-1]++;
        }
        y = sc.nextInt();
        for (int i=0;i<y;i++)
        {
            t = sc.nextInt();
            arr[t-1]++;
        }
        boolean flag = true;
        for (int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                flag=false;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("Oh, my keyboard!");
        }
        else
        {
            System.out.println("I become the guy.");
        }
    }

}
