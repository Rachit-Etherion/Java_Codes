package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fairRations
{
    private void solution(int arr[],int n)
    {
        int count = 0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]%2==1)
            {
                arr[i]++;
                arr[i+1]++;
                count += 2;
            }
        }
        if(arr[n-1]%2==0)
        {
            System.out.println(count);
        }
        else
        {
            System.out.println("NO");
        }
    }
    public static void main(String []args)
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = (br.readLine()).split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        fairRations ob = new fairRations();
        ob.solution(arr,n);
    }
}
