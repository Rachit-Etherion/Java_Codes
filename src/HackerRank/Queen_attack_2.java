package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Queen_attack_2
{
    public static int quenattack(int n,int k, int qu,int qr,int [][]obs)
    {
        int l=0,r=0,u=0,d=0,ul=0,ur=0,dl=0,dr=0,temp_u,temp_r,temp;
        l = qr-1;
        r = n-qr;
        u = n-qu;
        d = qu-1;
        ul = Math.min(qr-1,n-qu);
        ur = Math.min(n-qr,n-qu);
        dl = Math.min(qr-1,qu-1);
        dr = Math.min(n-qr,qu-1);
        for (int i=0;i<k;i++)
        {
            temp_u = obs[i][0];
            temp_r = obs[i][1];
            if(temp_r == qr && temp_u > qu)
            {
                //Upper side of queen
                temp = Math.abs(temp_u-qu)-1;
                if(temp<u)
                {
                    u=temp;
                }
            }
            else if(temp_r == qr && temp_u < qu)
            {
                //Down side of queen
                temp = Math.abs(temp_u-qu)-1;
                if(temp<d)
                {
                    d=temp;
                }
            }
            else if(temp_u == qu && temp_r < qr)
            {
                //Left side
                if((Math.abs(qr-temp_r)-1)<l)
                {
                    l = Math.abs(qr-temp_r)-1;
                }
            }
            else if(temp_u == qu && temp_r > qr)
            {
                //Right Side
                if((Math.abs(qr-temp_r)-1) < r)
                {
                    r = Math.abs(qr-temp_r)-1;
                }
            }
            else if(temp_r < qr && temp_u > qu)
            {
                //upper left side
                if(Math.abs(qu-temp_u) == Math.abs(qr-temp_r))
                {
                    if((Math.abs(qu-temp_u)-1)<ul){
                        ul=Math.abs(qu-temp_u)-1;
                    }
                }
            }
            else if (temp_r > qr && temp_u > qu)
            {
                //Upper Right side
                if(Math.abs(qu-temp_u) == Math.abs(qr-temp_r))
                {
                    if ((Math.abs(qu - temp_u) - 1) < ur)
                    {
                        ur = Math.abs(qu - temp_u)-1;
                    }
                }
            }
            else if (temp_r < qr && temp_u < qu)
            {
                if(Math.abs(qu-temp_u) == Math.abs(qr-temp_r))
                {
                    if ((Math.abs(qu - temp_u) - 1) < dl)
                    {
                        dl = Math.abs(qu - temp_u)-1;
                    }
                }
            }
            else if(qu > temp_u && qr < temp_r)
            {
                //right-bottom of queen
                if(Math.abs(qu-temp_u) == Math.abs(qr-temp_r))
                {
                    if((Math.abs(qu-temp_u)-1)<dr)
                    {
                        dr=Math.abs(qu-temp_u)-1;
                    }
                }
            }
        }
        return l+r+u+d+ul+ur+dl+dr;
    }
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String str[] = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        s = br.readLine();
        str = s.split(" ");
        int qu = Integer.parseInt(str[0]);
        int qr = Integer.parseInt(str[1]);
        int obs[][] = new int[k][2];
        for (int i=0;i<k;i++)
        {
            s = br.readLine();
            str = s.split(" ");
            obs[i][0] = Integer.parseInt(str[0]);
            obs[i][1] = Integer.parseInt(str[1]);
        }
        System.out.println(quenattack(n,k,qu,qr,obs));
    }
}
