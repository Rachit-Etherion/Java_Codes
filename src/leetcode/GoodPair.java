package leetcode;

import java.util.HashSet;

public class GoodPair
{
    public static void main(String []args)
    {
        GoodPair obj = new GoodPair();
        int arr[] = {1,1,1,1};
        System.out.println(obj.numIdenticalPairs(arr));
    }
    public int numIdenticalPairs(int[] nums)
    {
        int count = 0;
        for(int i=0;i<nums.length-1;i++) {
            for (int j=i+1;j<nums.length;j++)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
