package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclass
{
    public static void main(String []args)
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LongestSubsequence obj = new LongestSubsequence();
        System.out.println(obj.longestCommonSubsequence("oxcpqrsvwf","shmtulqrypy"));
    }
}
