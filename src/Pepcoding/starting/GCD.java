package Pepcoding.starting;

public class GCD
{
    public int gcdis(int i,int j)
    {
        if(i%j==0)
        {
            return j;
        }
        return gcdis(j,i%j);
    }
}
