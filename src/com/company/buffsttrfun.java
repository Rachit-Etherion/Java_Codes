package com.company;
import java.io.*;
public class buffsttrfun
{
    public static void strfun()
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s,p;
        System.out.print("Enter the String : ");
        s=br.readLine();
        p=s;
        StringBuffer sb = new StringBuffer(s);
        sb.append(" This line is append and integer ");
        sb.append(5);
        s=sb.toString();
        System.out.println("String is : "+s);
        sb.delete(0,3);
        s=sb.toString();
        System.out.println("String is : "+s);
        sb.deleteCharAt(7);
        s=sb.toString();
        System.out.println("String is : "+s);
        sb.insert(0,"Hello ");
        s=sb.toString();
        System.out.println("String is : "+s);;
        sb.setCharAt(1,'a');
        s=sb.toString();
        StringBuffer sk = new StringBuffer(p);
        sk.reverse();
        s=sk.toString();
        System.out.println("String is : "+s);

    }
}
