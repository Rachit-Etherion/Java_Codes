package leetcode;

public class runningSum1DArray
{
    public int[] runningSum(int[] n)
    {
        int sum = 0;
        int j=0;
        int ans[] = new int[n.length];
        for (int i : n)
        {
            sum += i;
            ans[j++] = sum;
        }
        return ans;
    }
}
