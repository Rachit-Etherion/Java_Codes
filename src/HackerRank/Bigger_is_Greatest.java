package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bigger_is_Greatest
{
    public String[] answer(String[] s,int n)
    {
        for (int i=0;i<n;i++)
        {

        }
        return s;
    }
    public static void main(String[] args)
        throws IOException
    {
        Bigger_is_Greatest ob = new Bigger_is_Greatest();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        for (int i=0;i<n;i++)
        {
            s[i] = br.readLine();
        }
        String sf[] = ob.answer(s,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(sf[i]);
        }
    }
}
