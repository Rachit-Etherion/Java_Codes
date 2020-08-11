package com.databaseconnection;

import java.io.IOException;
import java.util.TreeSet;

public class test3
{
    public int findPassword(int input1,int input2,int input3,int input4,int input5) {
        int inp[] = new int[5];
        inp[0] = input1;
        inp[1] = input2;
        inp[2] = input3;
        inp[3] = input4;
        inp[4] = input5;

        int un = 0, st = 0;
        String s = " ";

        for (int i = 0; i < inp.length; i++) {
            TreeSet<Integer> tr = new TreeSet<Integer>();
            int dig[] = new int[10];
            s = String.valueOf(inp[i]);
            char c[] = s.toCharArray();


            int narr[] = new int[c.length];
            for (int j = 0; j < c.length; j++) {
                narr[j] = Integer.parseInt(String.valueOf(c[j]));
            }

            for (int k = 0; k < narr.length; k++) {
                dig[narr[k]] = (dig[narr[k]]) + 1;
            }

            for (int p = 0; p < 10; p++) {
                if (dig[p] != 0) {
                    tr.add(dig[p]);
                }
            }

            if (tr.size() > 1) {
                un = un + 1;
            } else {
                st = st + 1;
            }
        }
        return (st*10)+un;
    }


    public static void main(String[] args)
        throws IOException
    {
        test3 a = new test3();
        int ans = a.findPassword(12,1331,122,678,897);
        System.out.println(ans);
    }
}
