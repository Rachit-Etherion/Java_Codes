package com.Leetcode;

import java.util.Scanner;

public class Solution2A1
{

    private void gen(int n, int oc, int cc, String s) {
        if (s.length() == n*2) {
           // result.add(s);
        }

        if (oc != n) {
            String s1 = s+"(";
            gen(n, oc+1, cc, s1);
        }

        if (cc < oc) {
            String s1 = s+")";
            gen(n, oc, cc+1, s1);
        }

        return;
    }
    public static void main(String[] args)
    {
       // gen(0,0,0,0,1,2,"");

    }
}
