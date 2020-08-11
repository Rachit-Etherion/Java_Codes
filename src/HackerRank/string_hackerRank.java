package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class string_hackerRank
{
    private void answer(int n,String s[])
    {
        boolean flag;
        String compare = "hackerrank";
        int k;
        for (int i=0;i<n;i++)
        {
            flag =true;
            k=0;
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j) == compare.charAt(k))
                {
                    k++;
                    if(k==10)
                    {
                        System.out.println("YES");
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true)
            {
                System.out.println("NO");
            }
        }
    }
    public static void main(String[] args)
        throws IOException
    {
        string_hackerRank ob = new string_hackerRank();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        for (int i=0;i<n;i++)
        {
            s[i] = br.readLine();
        }
        ob.answer(n,s);
    }
}
