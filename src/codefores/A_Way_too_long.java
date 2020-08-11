package codefores;

import java.util.Scanner;

public class A_Way_too_long
{
    public static void main(String []args)
    {
        String str,temp="";
        int t,l;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while(t>0)
        {
            str = sc.nextLine();
            l = str.length();
            if(l<10)
            {
                System.out.println(str);
            }
            else
            {
                temp="";
                temp += str.charAt(0) + Integer.toString(l-2) + str.charAt(l-1);
                System.out.println(temp);
            }
            t--;
        }
    }
}
