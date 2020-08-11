package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Choclate_Feast
{
    private int counts(int n,int c,int m)
    {
        int total = n/c,temp;
        int wraps = n/c;
        while(wraps >= m)
        {
            temp = wraps/m;
            wraps = wraps%m;
            wraps += temp;
            total += temp;
        }
        return total;
    }
    public static void main(String[] args)
        throws IOException
    {
        Choclate_Feast ob = new Choclate_Feast();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n,c,m;
        for (int i=0;i<t;i++)
        {
            String s[] = (br.readLine()).split(" ");
            n = Integer.parseInt(s[0]);
            c = Integer.parseInt(s[1]);
            m = Integer.parseInt(s[2]);
            System.out.println(ob.counts(n,c,m));
        }
    }
}
