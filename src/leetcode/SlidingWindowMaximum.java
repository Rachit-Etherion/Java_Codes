package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class SlidingWindowMaximum
{
    public int[] maxSlidingWindow(int[] nums, int k)
    {
        int ans[] = new int[nums.length-k+1];
        int index = 0;
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            int current = nums[i];
            while(!q.isEmpty() && q.getFirst() <=(i-k))
            {
                q.removeFirst();
            }
            while (!q.isEmpty() && nums[q.getLast()] < current)
            {
                q.removeLast();
            }
            q.addLast(i);
            if(i >= k-1)
            {
                ans[index++] = nums[q.getFirst()];
            }
        }
        return ans;
    }
}
