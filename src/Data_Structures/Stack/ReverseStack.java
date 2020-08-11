package Data_Structures.Stack;

import java.util.Stack;

public class ReverseStack
{
    public void RSI(Stack<Integer> s)
    {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        while (s.empty()!=true)
        {
            s1.push(s.pop());
        }
        while (s1.empty()!=true)
        {
            s2.push(s1.pop());
        }
        while (s2.empty()!=true)
        {
            s.push(s2.pop());
        }
    }
    public void RSR(Stack<Integer> s)
    {
        PushBottom ob = new PushBottom();
        if(s.empty()==true)
        {
            return;
        }
        int k=s.pop();
        RSR(s);
        ob.PDR(k,s);
    }
}
