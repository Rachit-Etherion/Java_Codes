package com.udemycodes;

public class ComplexNumber
{
    private double real;
    private double imaginary;
    public ComplexNumber(double real,double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getImaginary()
    {
        return imaginary;
    }
    public double getReal()
    {
        return real;
    }
    public void add(double real,double imaginary)
    {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber complexNumber)
    {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }
    public void subtract(double real, double imaginary)
    {
        this.imaginary -= imaginary;
        this.real -= real;
    }
    public void subtract(ComplexNumber complexNumber)
    {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }
}
