package Pepcoding.starting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class topggel
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(toggle(str));
    }
    private static String toggle(String s)
    {
        StringBuilder str = new StringBuilder(s);
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch = (char) (ch-'a'+ 'A');
            }
            else {
                ch = (char) (ch-'A'+'a');
            }
            str.setCharAt(i,ch);
        }
        return str.toString();
    }
}
