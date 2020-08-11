package HackerRank;

import java.util.Scanner;

public class Solution3
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        int count=0;
        for (int i=0;i<n-1;)
        {
            if(i+2<n && arr[i+2]==0)
            {
                count++;
                i=i+2;
            }
            else
            {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}
