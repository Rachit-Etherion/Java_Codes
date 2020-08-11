package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CavityMap
{
    private void solution(String s[],int n)
    {
        int arr[][] = new int[n][n];
        for (int i=0;i<n;i++)
        {
            String s1[] = s[i].split("");
            for(int j=0;j<n;j++)
            {
                arr[i][j] = Integer.parseInt(s1[j]);
            }
        }
        String s2[][] = new String[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                {
                    //s2[i][j] == Integer.toString(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        for(int i=0;i<n;i++)
        {
            s[i] = br.readLine();
        }
        CavityMap ob = new CavityMap();
        ob.solution(s,n);
    }
}
