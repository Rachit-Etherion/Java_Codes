package Data_Structures.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class NextLargerEliment
{
    public static void main(String[] argds)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine());
            long arr[] = new long[n];
            String s[] = br.readLine().split(" ");
            for (int i=0;i<n;i++)
            {
                arr[i]=Long.parseLong(s[i]);
            }
            nextgreater(arr,n);
        }
    }
    public static void nextgreater(long arr[],int n)
    {
        long b[] = new long[n];
        StringBuffer st = new StringBuffer();
        Stack<Integer> s = new Stack<Integer>();
        for (int i=0;i<n;i++)
        {
            if(s.empty()==true)
            {
                s.push(i);
                continue;
            }
            while (s.empty()!=true && arr[s.peek()]<arr[i])
            {
                b[s.pop()] = arr[i];
            }
            s.push(i);
        }
        while (s.empty()!=true)
        {
            b[s.pop()]=-1;
        }
        for (int i=0;i<n;i++)
        {
            st.append(b[i]);
            st.append(" ");
        }
        System.out.println(st);
    }
}
