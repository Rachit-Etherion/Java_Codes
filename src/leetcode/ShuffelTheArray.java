package leetcode;

public class ShuffelTheArray
{
    public int[] shuffle(int[] nums, int n)
    {
        int[] ans = new int[n*2];
        for (int i=0,count=0,j=n;i<n;i++,j++)
        {
            ans[count++] = nums[i];
            ans[count++] = nums[j];
        }
        return ans;
    }
}
