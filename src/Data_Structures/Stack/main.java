package Data_Structures.Stack;

import java.util.Stack;

public class main
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<Integer>();
        StackFunctions ob1 = new StackFunctions();
        ReverseStack ob2 = new ReverseStack();
        ob1.push(10,s);
        ob1.push(11,s);
        ob1.push(12,s);
        ob1.push(13,s);
        ob2.RSR(s);
        System.out.println(ob1.pop(s));
        System.out.println(ob1.pop(s));
        System.out.println(ob1.pop(s));
        System.out.println(ob1.pop(s));
    }
}
