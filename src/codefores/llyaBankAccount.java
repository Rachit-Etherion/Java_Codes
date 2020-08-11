package codefores;

import java.util.Scanner;

public class llyaBankAccount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long ba = sc.nextLong();
        long l,sl;
        if(ba<0)
        {
            l = Math.abs(ba%10);
            sl = ba%100;
            sl = Math.abs(sl/10);
            if(l>sl)
            {
                ba = ba/10;
            }
            else
            {
                ba = ba/100;
                ba = -(ba*10) + l;
                ba = -1*ba;
            }
        }
        System.out.println(ba);
    }
}
