package com.others;

import java.io.IOException;
import java.util.HashSet;

public class flower
{
    public static void main(String []args)
            throws IOException
    {
        int a = 5;
        int b = 3;
        int arr[] = {1,1,2,1,5};
        flower ob = new flower();
        System.out.println(ob.SheenaFlowers(a,b,arr));
    }
    public int SheenaFlowers(int input1,int input2,int[] input3)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<input2;i++)
        {
            hs.add(input3[i]);
        }
        int ans = hs.size();
        return ans;
    }
}
