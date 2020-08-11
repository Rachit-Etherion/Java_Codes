package leetcode;

public class LongestSubsequence
{
    public int longestCommonSubsequence(String text1, String text2)
    {
        String t1,t2;

        if(text1.length()>text2.length()) {
            t1 = text2;
            t2 = text1; }
        else {
            t1 = text1;
            t2 = text2; }
        int index = -1;
        int count = 0;
        int ans = 0;
        for(int i=0;i<t1.length();i++)
        {
            int temp = t2.indexOf(t1.charAt(i));
            if(temp>index)
            {
                count++;
                index = temp;
            }
            else if(temp<=index && temp != -1)
            {
                count = 1;
                index = temp;
            }
            if(count>ans)
            {
                ans = count;
            }
        }
        return ans;
    }
}
