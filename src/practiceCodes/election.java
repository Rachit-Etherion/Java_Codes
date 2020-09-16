package practiceCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class election
{
    public static void main(String[] args)
        throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int a = -1;
        int b = -1;
        int acount = 0;
        int bcount = 0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A')
            {
                acount++;
            }
            else if(s.charAt(i)=='B')
            {
                bcount++;
            }
        }
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='B')
            {
                if(b!=-1)
                {
                    bcount += count;
                    count = 0;
                }
                b=i;
            }
            if(s.charAt(i)=='A')
            {
                a=i;
                if(b==-1)
                {
                    acount += count;
                    count = 0;
                }
                else
                {
                    acount += count/2;
                    bcount += count/2;
                    count = 0;
                }
                b=-1;
                a=-1;
            }
            if(s.charAt(i)=='-')
            {
                count++;
            }
        }
        if(count>0 && b != -1 && b != s.length()-1)
        {
            bcount += count;
        }
        if(acount>bcount)
        {
            System.out.println("A");
        }
        else if(bcount>acount)
        {
            System.out.println("B");
        }
        else
        {
            System.out.println("Coalition government");
        }
        br.close();
    }
}
