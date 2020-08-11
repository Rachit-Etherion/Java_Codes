package HackerRank;

import java.util.Scanner;

public class ACM_ICPC
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str[] = new String[n];
        sc.nextLine();
        for (int i=0;i<n;i++)
        {
            str[i] = sc.nextLine();
        }
        int count = 0;
        int maxway = 0;
        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int temp = 0;
                for(int k=0;k<m;k++)
                {
                    if(str[i].charAt(k)=='1' || str[j].charAt(k)=='1')
                    {
                        temp++;
                    }
                }
                if(temp>count)
                {
                    count = temp;
                    maxway = 1;
                }
                else if(temp == count)
                {
                    maxway++;
                }
            }
        }
        System.out.println(count);
        System.out.println(maxway);
    }
}
