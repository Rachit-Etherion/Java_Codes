package Pepcoding.starting;

import java.util.Scanner;

public class All_prime_no
{
    public int isprime(int n,int count)
    {
        if(count==n)
        {
            return 1;
        }
        if(n%count == 0)
        {
            return 0;
        }
        return isprime(n,count+1);
    }
    public static void main(String[] args)
    {
        All_prime_no o = new All_prime_no();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(o.isprime(i,2)==1)
            {
                System.out.print(i+" ");
            }
        }
    }
}
