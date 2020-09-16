package Data_Structures.DP;

import java.io.IOException;
import java.util.Arrays;

public class Knapsack01Memorization
{
    static int eg[][] = new int[102][1002];
    public static void main(String []args)
        throws IOException
    {
        for (int []row :eg)
        {
            Arrays.fill(row,-1);
        }
        int w[] = {10,20,30};
        int v[] = {60,100,120};
        int W = 50;
        int n =w.length;
        Knapsack01Memorization obj = new Knapsack01Memorization();
        System.out.println(obj.Knapsack(w,v,W,n));
    }

    int  Knapsack(int w[],int v[],int W,int n)
    {
        if(n==0 || W==0)
            return 0;
        if(eg[W][n] != -1)
        {
            return eg[W][n];
        }
        if(w[n-1] <= W)
        {
            eg[W][n] = Math.max(v[n-1] + Knapsack(w,v,W-w[n-1],n-1),Knapsack(w,v,W,n-1));
            return eg[W][n];
        }
        else
        {
            eg[W][n] = Knapsack(w,v,W,n-1);
            return eg[W][n];
        }
    }
}
