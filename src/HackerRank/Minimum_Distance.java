package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Minimum_Distance
{
    private void distance(ArrayList<Integer> arr,int n)
    {
        boolean flag = false;
        int temp,ti,p=Integer.MAX_VALUE;
        for (int i=0;i<n;i++)
        {
            temp = arr.get(i);
            arr.set(i,0);
            ti = arr.indexOf(temp);
            if(ti>0)
            {
                p = Math.min(ti-i,p);
                flag = true;
            }
        }
        if(flag==true)
        {
            System.out.println(p);
        }
        else
        {
            System.out.println(-1);
        }
    }
    public static void main(String[] args)
            throws IOException
    {
        Minimum_Distance ob = new Minimum_Distance();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        String s[] = (br.readLine()).split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0;i<n;i++)
        {
            arr.add(Integer.parseInt(s[i]));
        }
        ob.distance(arr,n);
    }
}
