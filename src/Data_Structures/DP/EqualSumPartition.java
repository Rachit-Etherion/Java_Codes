package Data_Structures.DP;

public class EqualSumPartition
{
    Boolean t[][];
    public static void main(String []args)
    {
        int arr[] ={1, 5, 11, 5};
        EqualSumPartition obj = new EqualSumPartition();
        System.out.println(obj.solve(arr));
    }
    public boolean solve(int arr[])
    {
        int sum =0;
        for (int i : arr)
        {
            sum += i;
        }
        if(sum%2 != 0)
        {
            return false;
        }
        sum = sum/2;
        t = new Boolean[arr.length+1][sum+1];
        return TopDown(arr,sum,arr.length);
    }

    public  boolean TopDown(int arr[],int s,int n)
    {
        if(s==0 || n==0)
        {
            return s==0;
        }
        if(t[n][s] != null)
        {
            return t[n][s];
        }

        if(arr[n-1] <= s)
        {
            t[n][s] = TopDown(arr,s-arr[n-1],n-1) || TopDown(arr,s,n-1);
            return t[n][s];
        }
        else
        {
            t[n][s] = TopDown(arr,s,n-1);
            return t[n][s];
        }
    }

    public boolean canPartition(int[] nums)
    {
        int sum = 0;
        for (int i : nums)
        {
            sum += i;
        }
        if(sum%2 != 0)
        {
            return false;
        }
        sum = sum/2;
        boolean dp[][] = new boolean[nums.length+1][sum+1];
        for (int i=0;i< nums.length+1;i++)
        {
            for (int j=0;j<sum+1;j++)
            {
                if (i==0)
                {
                    dp[i][j] = false;
                }
                if(j==0)
                {
                    dp[i][j] = true;
                }
            }
        }
        for (int i=1;i<nums.length+1;i++)
        {
            for (int j=0;j<sum+1;j++)
            {
                if(nums[i-1] <= j)
                {
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
                else
                {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[nums.length][sum];
    }
}
