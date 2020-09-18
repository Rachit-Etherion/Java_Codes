package Data_Structures.DP;

public class SubsetSum
{
    public static void main(String []args)
    {
        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        SubsetSum obj = new SubsetSum();
        System.out.println(obj.subsetsums(arr,sum));
    }
    boolean subsetsums(int arr[], int sum)
    {
        boolean dp[][] = new boolean[arr.length+1][sum+1];
        for (int i=0;i<arr.length+1;i++)
        {
            for (int j=0;j<sum+1;j++)
            {
                if(i==0)
                {
                    dp[i][j] = false;
                }
                if(j==0)
                {
                    dp[i][j] = true;
                }
            }
        }
        for (int i=1;i<arr.length+1;i++)
        {
            for (int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    dp[i][j] = (dp[i-1][j-arr[i-1]]) || (dp[i-1][j]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[arr.length][sum];
    }
}
