package com.udemycodes;

public class Point
{
    private int x;
    private int y;

    public Point()
    {

    }

    public Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }

    public double distance()
    {
        double dist;
        dist = Math.sqrt(((double)x*(double)x)+((double)y*(double)y));
        return  dist;
    }

    public double distance(int x,int y)
    {
        double dist = Math.sqrt(((double)(this.x-x)*(double)(this.x-x))+((double)(this.y-y)*(double)(this.y-y)));
        return dist;
    }

    public double distance(Point s)
    {
        double dist = Math.sqrt(((double)(this.x-s.getX())*(double)(this.x-s.getX()))+((double)(this.y-s.getY())*(double)(this.y-s.getY())));
        return dist;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
