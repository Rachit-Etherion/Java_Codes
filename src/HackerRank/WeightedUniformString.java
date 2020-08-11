package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WeightedUniformString
{
    private void answer(String s,int n,int arr[])
    {
        ArrayList arrayList = new ArrayList();
        int temp = s.charAt(0) - 96;
        arrayList.add(temp);
        for (int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                temp += s.charAt(i) - 96;
                arrayList.add(temp);
            }
            else
            {
                temp = s.charAt(i)-96;
                arrayList.add(temp);
            }
        }
        for (int i=0;i<n;i++)
        {
            if(arrayList.contains(arr[i]))
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
    public static void main(String[] args)
        throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        WeightedUniformString ob = new WeightedUniformString();
        ob.answer(s,n,arr);
    }

}
