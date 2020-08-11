package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EqualStack
{
    public static void main(String []args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int n = Integer.parseInt(st);
        String str[] = st.split("");
        int sum=0;
        for (int i=0;i<str.length;i++)
        {
            sum = sum + Integer.parseInt(str[i]);
        }
        sum = sum + n;
        System.out.println(sum);
    }
}
