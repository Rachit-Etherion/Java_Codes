package HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Equalize_The_Array
{
    public int frequency(int arr[],int n)
    {
        int max=0;
        boolean visit[] = new boolean[n];
        Arrays.fill(visit,false);
        for (int i = 0;i<n;i++)
        {
            if(visit[i]==true)
            {
                continue;
            }
            int count=1;
            for (int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    visit[j] = true;
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        Equalize_The_Array ob = new Equalize_The_Array();
        int max = ob.frequency(arr,n);
        System.out.println(n-max);


    }
}
