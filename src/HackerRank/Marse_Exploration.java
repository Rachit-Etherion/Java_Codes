package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marse_Exploration
{
    private int calcilate(String s)
    {
        String comp = "SOS";
        int k=0;
        int ans = 0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != comp.charAt(k))
            {
                ans ++;
            }
            k = k+1;
            k = k%3;
        }
        return ans;
    }
    public static void main(String []args)
        throws IOException
    {
        Marse_Exploration ob = new Marse_Exploration();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = ob.calcilate(s);
        System.out.println(ans);
    }
}
