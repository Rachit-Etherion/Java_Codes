package practiceCodes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringSolution
{
    public static void main(String[] args)
    {
        StringSolution ob = new StringSolution();
        Result r = ob.encodeThreeStrings("John","Johny","Janardhan");
        System.out.println(r.output1);
        System.out.println(r.output2);
        System.out.println(r.output3);
    }
    public class Result
    {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String output1, String output2, String output3) {
            this.output1 = output1;
            this.output2 = output2;
            this.output3 = output3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3)
    {
        String s1,m1,e1,s2,s3,m2,m3,e2,e3;
        int l1 = input1.length();
        int l2 = input2.length();
        int l3 = input3.length();
        if(l1%3==0)
        {
            s1 = input1.substring(0,l1/3);
            m1 = input1.substring(l1/3,2*(l1/3));
            e1 = input1.substring(2*(l1/3),l1);
        }
        else if(l1%3==1)
        {
            s1 = input1.substring(0,l1/3);
            m1 = input1.substring(l1/3,2*(l1/3)+1);
            e1 = input1.substring(2*(l1/3)+1,l1);
        }
        else {
            s1 = input1.substring(0,(l1/3)+1);
            m1 = input1.substring((l1/3)+1,2*(l1/3)+1);
            e1 = input1.substring(2*(l1/3)+1,l1);
        }
        if(l2%3==0)
        {
            s2 = input2.substring(0,l2/3);
            m2 = input2.substring(l2/3,2*(l2/3));
            e2 = input2.substring(2*(l2/3),l2);
        }
        else if(l2%3==1)
        {
            s2 = input2.substring(0,l2/3);
            m2 = input2.substring(l2/3,2*(l2/3)+1);
            e2 = input2.substring(2*(l2/3)+1,l2);
        }
        else {
            s2 = input2.substring(0,(l2/3)+1);
            m2 = input2.substring((l2/3)+1,2*(l2/3)+1);
            e2 = input2.substring(2*(l2/3)+1,l2);
        }
        if(l3%3==0)
        {
            s3 = input3.substring(0,l3/3);
            m3 = input3.substring(l3/3,2*(l3/3));
            e3 = input3.substring(2*(l3/3),l3);
        }
        else if(l3%3==1)
        {
            s3 = input3.substring(0,l3/3);
            m3 = input3.substring(l3/3,2*(l3/3)+1);
            e3 = input3.substring(2*(l3/3)+1,l3);
        }
        else {
            s3 = input3.substring(0,(l3/3)+1);
            m3 = input3.substring((l3/3)+1,2*(l3/3)+1);
            e3 = input3.substring(2*(l3/3)+1,l3);
        }
        String ans1 = s1+e2+m3;
        String ans2 = m1+s2+e3;
        String ans3 = e1+m2+s3;
        char[] charArray = ans3.toCharArray();
        for(int i=0; i < charArray.length; i++){
            if( Character.isUpperCase(charArray[i]) ){

                charArray[i] = Character.toLowerCase( charArray[i] );

            }else if(Character.isLowerCase(charArray[i]) ){

                charArray[i] = Character.toUpperCase( charArray[i] );
            }

        }
        ans3 = new String(charArray);
        Result r = new Result(ans1,ans2,ans3);
        return r;
    }

}
