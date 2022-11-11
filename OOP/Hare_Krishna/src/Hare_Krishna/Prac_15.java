package Hare_Krishna;

import java.io.IOException;
import java.util.Scanner;

class yslException extends IOException
{
    yslException()
    {
        super();
    }
    int flt2int(float y)
    {
        return (int) y;
    }
}

public class Prac_15
{
    static public void main(String... s)
    {
        int pr;
        float roi;
        float yrs;
        Scanner scnr = new Scanner(System.in);
        System.out.println("\nEnter the details for calculating amount : ");

        System.out.print("\n\tROI : ");
        roi = scnr.nextFloat();
        System.out.print("\n\tPrincipal : ");
        pr = scnr.nextInt();
        float temp = (float) pr;

        System.out.print("\n\tNumber of years : ");
    }
}
