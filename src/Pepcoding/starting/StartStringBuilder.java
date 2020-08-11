package Pepcoding.starting;

public class StartStringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder str = new StringBuilder("Hello");
        System.out.println(str);
        System.out.println(str.append(" Rachit !"));
        System.out.println(str.capacity());
        System.out.println(str.charAt(6));
        System.out.println(str.delete(0,1));
        str.setCharAt(0,'f');
        System.out.println(str);
        str.insert(0,'H');
        System.out.println(str);
        System.out.println(str.length());

    }
}
