package Data_Structures.DP;

import java.io.IOException;

public class Knapsack01TopDown
{
    public static void main(String[] args)
            throws IOException
    {
        int w[] = {10,20,30};
        int v[] = {60,100,120};
        int W = 50;
        int n =w.length;
        Knapsack01TopDown obj = new Knapsack01TopDown();
        System.out.println(obj.Knapsack(w,v,W,n));

    }

    int Knapsack(int w[],int v[],int W,int n)
    {
        int t[][] = new int[n+1][W+1];
        for (int i=0;i<n+1;i++)
        {
            for (int j=0;j<W+1;j++)
            {
                if(i==0 || j==0)
                {
                    t[i][j] = 0;
                }
            }
        }
        for (int i=1;i<n+1;i++)
        {
            for (int j=1;j<W+1;j++)
            {
                if(w[i-1] <= j)
                {
                    t[i][j] = Math.max(v[i-1]+t[i-1][j-w[i-1]],t[i-1][j]);
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];

    }
}
