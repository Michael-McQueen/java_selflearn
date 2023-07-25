package week1;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction a = new Fraction(in.nextInt(), in.nextInt());
        Fraction b = new Fraction(in.nextInt(),in.nextInt());
        a.print();
        b.print();
        a.plus(b).print();
        a.multiply(b).plus(new Fraction(5,6)).print();
        a.print();
        b.print();
        in.close();
    }

    public static int gcd(int a,int b)
    {
        while (b != 0)
        {
            int yushu = a % b;
            a = b;
            b = yushu;
        }
        return a;
    }
}

class Fraction
{
    int fenmu;
    int fenzi;

    Fraction()
    {
        fenmu = 0;
        fenzi = 0;
    }
    Fraction(int a,int b)  // a/b
    {
        fenmu = b;
        fenzi = a;
    }

    double toDouble()
    {
        return (double)(fenzi/fenmu);
    }

    Fraction plus(Fraction other)
    {
        Fraction t = new Fraction();
        t.fenzi = fenzi* other.fenmu+fenmu* other.fenzi;
        t.fenmu = fenmu*other.fenmu;
        int gcd= Main.gcd(t.fenzi,t.fenmu);
        t.fenzi /= gcd;
        t.fenmu /= gcd;
        return t;
    }

    Fraction multiply(Fraction other)
    {
        Fraction t = new Fraction();
        t.fenzi = fenzi*other.fenzi;
        t.fenmu = fenmu* other.fenmu;
        int gcd= Main.gcd(t.fenzi,t.fenmu);
        t.fenzi /= gcd;
        t.fenmu /= gcd;
        return t;
    }

    void print()
    {
        int gcd = Main.gcd(fenzi, fenmu);
        fenzi /= gcd;
        fenmu /= gcd;
        if (fenmu == 1)
        {
            System.out.println(fenzi);
        }
        else
        {
            System.out.println(fenzi + "/" + fenmu);
        }
    }

}