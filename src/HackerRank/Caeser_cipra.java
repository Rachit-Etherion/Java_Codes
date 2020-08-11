package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caeser_cipra
{
    private String convert(int n,String s,int inc)
    {
        int temp;
        String ans ="";
        char ch;
        for(int i=0;i<n;i++)
        {
            ch = s.charAt(i);
            temp = (int)ch;
            if(temp>=97 && temp<=122)
            {
                temp = temp-97;
                temp += inc;
                temp = temp%26;
                temp += 97;
                ch = (char)temp;
            }
            else if(temp>=65 && temp<=90)
            {
                temp = temp-65;
                temp += inc;
                temp = temp%26;
                temp += 65;
                ch = (char)temp;
            }
            ans += ch;
        }
        return ans;
    }
    public static void main(String[] args)
        throws IOException
    {
        Caeser_cipra ob = new Caeser_cipra();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int inc = Integer.parseInt(br.readLine());
        String ans = ob.convert(n,s,inc);
        System.out.println(ans);
    }
}
