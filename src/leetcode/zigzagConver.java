package leetcode;

public class zigzagConver
{
    public String convert(String s, int r)
    {
        int l = s.length();
        if(r>l || r<=1)
        {
            return s;
        }

        int interval = 2*r - 2;
        String ans = "";
        for (int i=0;i<r;i++)
        {
            int step = interval - 2*i;
            for (int j=i;j<l;j += interval)
            {
                ans += s.charAt(j);
                if(step>0 && step<interval && j+step < l)
                {
                    ans += s.charAt(j+step);
                }
            }
        }
        return ans;
    }
}
