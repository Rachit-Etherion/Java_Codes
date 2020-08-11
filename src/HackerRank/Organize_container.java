package HackerRank;

import java.util.Scanner;

public class Organize_container
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0)
        {
            int n = sc.nextInt();
            long arr1[] = new long[n];
            long arr2[] = new long[n];
            for (int i=0;i<n;i++)
            {
                for (int j=0;j<n;j++)
                {
                    long x = sc.nextInt();
                    arr1[i] += x;
                    arr2[j] += x;
                }
            }
            String str = "Possible";
            for (int i=0;i<n;i++)
            {
                int j=0;
                for (j=i;j<n;j++)
                {
                    if(arr1[i]==arr2[j])
                    {
                        break;
                    }
                }
                if(j==n)
                {
                    str = "Impossible";
                    break;
                }
            }
            System.out.println(str);
        }
    }
}
