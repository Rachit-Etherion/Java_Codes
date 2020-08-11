package Data_Structures.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainclass
{
    public static void main(String []args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str[] = br.readLine().split(" ");
        int arr[] = new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        Sorting obj = new Sorting(arr);
        obj.mergesort(0,arr.length-1);
        for(int i : arr)
        {
            System.out.println(i);
        }
    }
}
