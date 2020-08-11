package com.Leetcode;

import java.util.Arrays;

public class findinfaddr
{
    public int[] searchRange(int[] nums, int target)
    {
        int tar[] = new int[2];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i==0&&nums[i]==target)
            {tar[0] = i;
            }
            else if(nums[i]==target && nums[i-1] < target)
            {
                tar[0] = i;
            }
            if( i==nums.length-1 && nums[i]==target)
            {tar[1] = i;
            }
            else if(nums[i]==target && nums[i+1] > target)
            {
                tar[1] = i;
            }
        }
        return tar;
    }
}
