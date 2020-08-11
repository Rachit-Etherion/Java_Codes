package Pepcoding.starting;

import java.util.Scanner;

public class Prime
{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        while(count < n)
        {
            if(n%count==0)
            {
                System.out.println("not prime");
                return;
            }
            count++;
        }
        System.out.println("Prime");
    }
}
