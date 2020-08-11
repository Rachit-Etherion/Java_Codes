package codefores;

import java.util.Scanner;

public class warms
{
    public static void main(String[] args)
    {
        int n,m,t=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long a[] = new long[n];
        long k[] = new long[n];
        long sum=0,b;
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
            sum += a[i];
            k[i] = sum;
        }
        m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            t=0;
            b = sc.nextLong();
            while (k[t]<b)
            {
                t++;
            }
            System.out.println(t+1);
        }
    }
}
