package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class solution1 {
    public int lengthOfLongestSubstring(String s)
    {
        int ml = 0;
        List<Character> c = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            if(c.contains(s.charAt(i)))
            {
                if(ml < c.size())
                {
                    ml = c.size();
                }
                while (c.contains(s.charAt(i)))
                {
                    c.remove(0);
                }
                c.add(s.charAt(i));
            }
            else
            {
                c.add(s.charAt(i));
            }
        }
        if(ml < c.size())
        {
            ml = c.size();
        }
        return ml;
    }
}
