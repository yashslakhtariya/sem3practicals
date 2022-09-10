package Hare_Krishna;
import java.util.Scanner;

public class prac_9 
{
    public static void main(String[] args) 
    {
        System.out.println("\nList of ROIs of different banks : ");
        Scanner in = new Scanner(System.in);
        sbi s = new sbi();
        hdfc h = new hdfc();
        boi b = new boi();
        s.roi = 6.9;
        h.roi = 7.1;
        b.roi = 6.5;
        s.sbiroi();
        h.hdfcroi();
        b.boiroi();
        System.out.print("\nEnter Your Principal amount : ");
        int pa = in.nextInt();
        System.out.println("\n\t1. SBI");
        System.out.println("\n\t2. HDFC");
        System.out.println("\n\t3. BOI");
        System.out.print("\nChoose Your bank : ");
        int c = in.nextInt();
        if (c == 1) 
        {
            interest(pa, s.roi);
        } else if (c == 2) 
        {
            interest(pa, h.roi);
        } else if (c == 3) 
        {
            interest(pa, b.roi);
        } 
        else 
        {
            System.out.println("Please Enter Valid Input.");
        }
        in.close();
    }

    static void interest(int p, double r) 
    {
        double intr = (p * r * 5) / 100;
        double amount = intr + p;
        System.out.println("\n\tTotal Interest : " + intr);
        System.out.println("\n\tTotal Amount : " + amount);
    }
}
class banks 
{
    double roi;
}

class sbi extends banks 
{
    void sbiroi() 
    {
        System.out.println("\n\tSBI Rate of Interest : " + roi);
    }
}

class hdfc extends banks 
{
    void hdfcroi() 
    {
        System.out.println("\n\tHDFC Rate of Interest : " + roi);
    }
}

class boi extends banks 
{
    void boiroi() 
    {
        System.out.println("\n\tBOI Rate of Interest : " + roi + "\n");
    }
}