package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Encryption
{
    public String encrypt(String s)
    {
        int length = s.length();
        int rows=0,column =0;
        for (int i=1;i<=10;i++)
        {
            if(i*i<length)
            {
                rows=i;
            }
            else
            {
                column=i;
                break;
            }
        }
        if(rows*column<length)
        {
            rows=column;
        }
        String str[] = s.split("");
        String s1[][] = new String[rows][column];
        int k=0;
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<column;j++)
            {
                if(k<length)
                {
                    s1[i][j] = str[k++];
                }
                else
                {
                    s1[i][j] = "";
                }
            }
        }
        String sfinal = "";
        for (int i=0;i<column;i++)
        {
            for (int j=0;j<rows;j++)
            {
                sfinal += s1[j][i];
            }
            sfinal += " ";
        }
        return sfinal;
    }
    public static void main(String[] args)
        throws IOException
    {
        Encryption ob = new Encryption();
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(ob.encrypt(s));
    }
}
