package com.databaseconnection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

public class test2
{
    public static void main(String []args)
        throws IOException
    {
        test2 a = new test2();
        int ans = a.findKey(2859,5,925);
        System.out.println(ans);
    }

    public int findKey(int input1,int input2, int input3)
    {
        int digit = 0;
        int step = 1;
        while(input1>0 || input2>0 || input3>0)
        {
            Integer arr[] = new Integer[3];
            arr[0] = input1%10;
            arr[1] = input2%10;
            arr[2] = input3%10;
            input1 /= 10;
            input2 /= 10;
            input3 /= 10;
            int max = Collections.max(Arrays.asList(arr));
            digit = step*max + digit;
            step *= 10;
        }
        return digit;
    }

}
