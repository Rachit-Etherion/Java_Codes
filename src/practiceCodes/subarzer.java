package practiceCodes;


import java.util.HashSet;
import java.util.Set;

public class subarzer
{
    public static void main(String []args)
    {
        int[] arr = {2,1,-3,4,2};
        boolean found = false;
        Set<Integer> s = new HashSet<>();
        s.add(0);
        int sum = 0;
        for (int j : arr) {
            sum += j;
            if (s.contains(sum)) {
                found = true;
                break;
            } else {
                s.add(sum);
            }
        }
        System.out.println(found);
    }
}
