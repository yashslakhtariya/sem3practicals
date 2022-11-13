package Hare_Krishna;
import java.util.Scanner;

public class Prac_15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter ROI : ");
        float roi = sc.nextFloat();
        System.out.print("Enter Principal : ");
        int principle = sc.nextInt();
        System.out.print("Enter No. of Years : ");
        float no = sc.nextFloat();
        try
        {
            if(no == 2.12f)
            {
                throw new ArithmeticException();
            }
            float amount = (float) ((float)principle * (Math.pow((1 + roi / 100), no)));
            System.out.print("\n\tROI = "+roi);
            System.out.print("\n\tPrincipal = "+principle);
            System.out.print("\n\tn = "+no);
            System.out.print("\n\tAmount = "+amount);
            System.out.println();
        }
        catch (Exception exc)
        {
            roi = 3;
            float amount = (float) ((float)principle * (Math.pow((1 +
                    roi / 100), no)));
            System.out.print("\n\tROI = "+roi);
            System.out.print("\n\tPrincipal = "+principle);
            System.out.print("\n\tn = "+no);
            System.out.print("\n\tAmount = "+amount);
            System.out.println();
        }
    }
}