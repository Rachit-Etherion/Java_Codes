package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheProductOfSubset
{
    public  int answer(int arr[])
    {
        int ans = 1;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans*(arr[i]+1);
        }
        return ans-1;
    }
    public static void main(String []args)
            throws IOException
    {
        SumOfTheProductOfSubset obj = new SumOfTheProductOfSubset();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s[] = str.split(" ");
        int arr[] = new int[s.length];
        for(int i=0;i<s.length;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        System.out.println(obj.answer(arr));

    }
}
