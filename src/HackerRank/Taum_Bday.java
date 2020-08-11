package HackerRank;

import java.util.Scanner;

public class Taum_Bday
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long b,w,bc,wc,z;
        while(t>0)
        {
            b = sc.nextLong();
            w = sc.nextLong();
            bc = sc.nextLong();
            wc = sc.nextLong();
            z = sc.nextLong();
            if(bc<wc && bc+z<wc)
            {
                System.out.println((b*bc)+(w*(bc+z)));
            }
            else if(wc<bc && wc+z<bc)
            {
                System.out.println((b*(wc+z))+(w*wc));
            }
            else
            {
                System.out.println((b*bc)+(w*wc));
            }
            t--;
        }
    }
}
