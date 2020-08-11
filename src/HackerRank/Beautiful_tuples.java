package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Beautiful_tuples
{
    private void beaut(int arr[],int n,int d)
    {
        int count=0;
        Arrays.sort(arr);
        List<Integer> a = IntStream.of(arr).boxed().collect(Collectors.toList());
        for (int i=0;i<n;i++)
        {
            if(a.contains(arr[i])&&a.contains(arr[i]+d)&&a.contains(arr[i]+d+d))
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String []args)
        throws IOException
    {
        Beautiful_tuples ob = new Beautiful_tuples();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = (br.readLine()).split(" ");
        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        int arr[] = new int[n];
        s = (br.readLine()).split(" ");
        for (int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        ob.beaut(arr,n,d);
    }
}
