package codefores;

import java.util.Scanner;

public class Letters
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        long a[] = new long[n];
        long b[] = new long[m];
        long sum=0;
        for (int i=0;i<n;i++)
        {
            a[i] = sc.nextLong();
            sum += a[i];
        }
        for (int i=0;i<m;i++)
        {
            b[i] = sc.nextLong();
        }
        for (int i=0;i<m;i++)
        {
            long l = 0,mid=0;
            long h = sum+1;
            while(h-l>1)
            {
                mid = (l+h)/2;
                if(b[i]<mid)
                {
                    h=mid;
                }
                else
                {
                    l=mid;
                }
            }
            System.out.println(l);
        }
    }
}
