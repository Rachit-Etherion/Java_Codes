package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Service_Lane
{
    private int find(int p1,int p2,int arr[])
    {
        int a1[] = Arrays.copyOfRange(arr,p1,p2+1);
        Arrays.sort(a1);
        return a1[0];
    }
    public static void main(String[] args)
        throws IOException
    {
        Service_Lane ob = new Service_Lane();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = (br.readLine()).split(" ");
        int n = Integer.parseInt(s[0]);
        int t = Integer.parseInt(s[1]);
        s = (br.readLine()).split(" ");
        int p1,p2;
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        for (int i=0;i<t;i++)
        {
            String s1 = br.readLine();
            if (s1 != null && !s1.trim().equals(""))
                s = s1.split(" ");
            p1 = Integer.parseInt(s[0]);
            p2 = Integer.parseInt(s[1]);
            System.out.println(ob.find(p1,p2,arr));
        }
    }
}
