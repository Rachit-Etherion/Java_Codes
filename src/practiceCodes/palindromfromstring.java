package practiceCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class palindromfromstring
{
    public static void main(String[] args)
            throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> ans = solve(str);
        for(String a : ans)
        {
            System.out.println(a);
        }
    }

    private static List<String> solve(String s) {
        List<String> res = new ArrayList<>();
        int[] dp = new int[s.length()];
        boolean[][] isPal = new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++) {
            int min = i;
            for(int j=0;j<=i;j++) {
                if(s.charAt(j) == s.charAt(i) && (i-j<2 || isPal[j+1][i-1])){
                    isPal[j][i] = true;
                    min = Math.min(min, j==0 ? 0 : dp[j-1] + 1);
                }
            }
            dp[i] = min;
        }
        if(dp[s.length()-1] > 2) {
            res.add("Impossible");
            return res;
        }
        List<Integer> last = new ArrayList<>();
        for(int i=0;i<s.length() - 1;i++) {
            if(isPal[i][s.length()-1] == true)
                last.add(i);
        }
        for(int l : last) {
            for(int i=0;i<l;i++) {
                if(isPal[0][i] && isPal[i+1][l-1]) {
                    res.add(s.substring(0, i+1));
                    res.add(s.substring(i+1, l));
                    res.add(s.substring(l));
                    return res;
                }
            }
        }
        res.add("Impossible");
        return res;
    }
}
