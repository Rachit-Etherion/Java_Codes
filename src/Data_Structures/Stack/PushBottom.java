package Data_Structures.Stack;

import java.util.Stack;

public class PushBottom
{
    public void PDR(int n,Stack<Integer> s)
    {
        if(s.empty()==true)
        {
            s.push(n);
            return;
        }
        int k = s.pop();
        PDR(n,s);
        s.push(k);
    }
    public void PDI(int n,Stack<Integer> s)
    {
        Stack<Integer> s1 = new Stack<Integer>();
        while (s.empty()!=true)
        {
            s1.push(s.pop());
        }
        s.push(n);
        while (s1.empty()!=true)
        {
            s.push(s1.pop());
        }
    }
}
