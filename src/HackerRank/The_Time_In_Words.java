package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class The_Time_In_Words
{
    HashMap<Integer, String> time = new HashMap<Integer, String>();
    private void hashmapdecl()
    {
        this.time.put(1,"one");        this.time.put(2,"two");
        this.time.put(3,"three");      this.time.put(4,"four");
        this.time.put(5,"five");       this.time.put(6,"six");
        this.time.put(7,"seven");      this.time.put(8,"eight");
        this.time.put(9,"nine");       this.time.put(10,"ten");
        this.time.put(11,"eleven");    this.time.put(12,"twelve");
        this.time.put(13,"thirteen");  this.time.put(14,"fourteen");
        this.time.put(15,"fifteen");   this.time.put(16,"sixteen");
        this.time.put(17,"seventeen"); this.time.put(18,"eighteen");
        this.time.put(19,"nineteen");  this.time.put(20,"twenty");

    }
    private void printtime(int h,int m)
    {
        hashmapdecl();
        if(m==0)
        {
            System.out.println(this.time.get(h) + " o' clock");
        }
        else if (m == 1)
        {
            System.out.println(this.time.get(m) + " minute past " + this.time.get(h));
        }
        else if (m == 15)
        {
            System.out.println("quarter past " + this.time.get(h));
        }
        else if (m == 30)
        {
            System.out.println("half past " + this.time.get(h));
        }
        else if (m == 45) {
            System.out.println("quarter to " + this.time.get((h + 1) % 12));
        }
        else if (m < 30)
        {
            if (m <= 20)
            {
                System.out.println(this.time.get(m) + " minutes past " + this.time.get(h));
            }
            else
            {
                System.out.println("twenty " + this.time.get(m - 20) + " minutes past " + this.time.get(h));
            }
        }
        else if (m > 30)
        {
            if (m >= 40)
            {
                System.out.println(this.time.get(60 - m) + " minutes to " + this.time.get((h + 1) % 12));
            }
            else
            {
                System.out.println("twenty " + this.time.get(60 - m - 20) + " minutes to " + this.time.get((h + 1) % 12));
            }
        }
    }
    public static void main(String[] args)
        throws IOException
    {
        The_Time_In_Words ob = new The_Time_In_Words();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ob.printtime(h,m);
    }
}
