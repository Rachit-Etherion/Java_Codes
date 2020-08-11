package HackerRank;

import java.util.Scanner;

public class Solution2
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long m = sc.nextLong();
        long count=0;
        for (int i = 0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                count++;
            }
        }
        long rep = m/(long)str.length();
        count = count*rep;
        if(m%(long)str.length()!=0)
        {
            for (int i = 0;i<(int)(m%(long)str.length());i++)
            {
                if(str.charAt(i)=='a')
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
