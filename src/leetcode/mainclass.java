package leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class mainclass
{
    public static void main(String []args)
        throws IOException
    {
        ShuffelTheArray obj = new ShuffelTheArray();
        int arr[] = {2,5,1,3,4,7};
        int[] ans = obj.shuffle(arr,3);

        for (int i : ans)
        {
            System.out.print(i + " ");
        }
    }
}
