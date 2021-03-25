package HackerRank.codingChallange30Days;

import java.util.Scanner;

public class Day9 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        for(int i=n;i>0;i--)
        {
            p *= i;
        }
        System.out.println(p);
    }
}
