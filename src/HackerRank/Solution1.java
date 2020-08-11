package HackerRank;

import java.util.Scanner;

public class Solution1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[k];
        for (int i=0;i<n;i++)
        {
            arr[sc.nextInt()%k]++;
        }
        int result=0;
        if(k%2==0)
        {
            result++;
        }
        result = result+Math.min(arr[0],1);
        for (int j=1;j<=k/2;j++)
        {
            if (j!=k-j)
            {
                result = result+Math.max(arr[j],arr[k-j]);
            }
        }
        System.out.println(result);
    }
}
