package com.company;
public class udamy
{
    public static boolean wakeup(boolean barking, int hourofday)
    {
        if(hourofday>23 || hourofday<0)
            return  false;
        else if ((hourofday>=22 || hourofday<8) && barking==true)
            return true;
        else
            return false;
    }

}
