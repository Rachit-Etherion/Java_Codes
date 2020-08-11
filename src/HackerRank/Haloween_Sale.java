package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Haloween_Sale
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st[] = (br.readLine()).split(" ");
        int p = Integer.parseInt(st[0]);
        int d = Integer.parseInt(st[1]);
        int m = Integer.parseInt(st[2]);
        int s = Integer.parseInt(st[3]);
        int count = 0;
        int sum = 0;
        while(sum <= s)
        {
            if(p <= m)
            {
                sum += m;
                count++;
            }
            else
            {
                sum += p;
                p = p-d;
                count++;
            }
        }
        System.out.println(count-1);
    }
}
