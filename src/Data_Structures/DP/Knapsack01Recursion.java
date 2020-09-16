package Data_Structures.DP;

import java.io.IOException;

public class Knapsack01Recursion
{
    public static void main(String []args)
            throws IOException
    {
        int w[] = {10,20,30};
        int v[] = {60,100,120};
        int W = 50;
        int n =w.length;
        Knapsack01Recursion obj = new Knapsack01Recursion();
        System.out.println(obj.Knapsack(w,v,W,n));

    }
    int Knapsack(int w[],int v[],int W,int n)
    {
        if(n==0 || W==0)
        {
            return 0;
        }
        if(w[n-1]<=W)
        {
            return Math.max(v[n-1] + Knapsack(w,v,W-w[n-1],n-1),Knapsack(w,v,W,n-1));
        }
        else
        {
            return Knapsack(w,v,W-w[n-1],n-1);
        }
    }
}
