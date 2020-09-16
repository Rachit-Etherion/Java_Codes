package leetcode;

public class DefangingIP
{
    public static void main(String []args)
    {
        DefangingIP obj = new DefangingIP();
        String ans = obj.defangIPaddr("1.1.1.1");
        System.out.println(ans);
    }
    public String defangIPaddr(String address)
    {
        String ans = "";
        String[] st = address.split("\\.",-1);
        for (int i=0;i<st.length-1;i++)
        {
            ans += st[i];
            ans += "[.]";
        }
        ans += st[st.length-1];
        return ans;
    }
}
