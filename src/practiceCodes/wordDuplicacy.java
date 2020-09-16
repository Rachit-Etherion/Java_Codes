package practiceCodes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class wordDuplicacy
{
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String st[] = s.split(" ");
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(st));
        String ans = "";
        for(String str : hs)
        {
            ans += str;
            ans += " ";
        }
        System.out.println(ans);
    }
}
