package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kidGreatNumberCandy
{
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> ans = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}
