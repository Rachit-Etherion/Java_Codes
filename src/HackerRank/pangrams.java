package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class pangrams
{
    private void answer(String s)
    {
        boolean flag = true;
        int arr[] = new int[26];
        s = s.toLowerCase();
        int n;
        for (int i=0;i<s.length();i++)
        {
            n = s.charAt(i);
            if(n>=97 && n<=122)
            {
                arr[n-97]++;
            }
        }
        for (int i=0;i<26;i++)
        {
            if(arr[i]==0)
            {
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }
    }
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        pangrams ob = new pangrams();
        ob.answer(s);
    }
}
