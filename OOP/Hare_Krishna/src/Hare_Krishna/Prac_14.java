package Hare_Krishna;
import java.util.Scanner;

class Underage extends Exception
{
    Underage(String err)
    {
        System.out.println(err);
    }
}

public class Prac_14
{
    public static void main(String... s) throws Underage
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("\nEnter you details for check voting eligibility : ");
        System.out.print("\n\tName : ");
        String name = scnr.nextLine();
        System.out.print("\n\tAge : ");
        int age = scnr.nextInt();
        System.out.println();
        if(age>18)
        {
            System.out.println("You are eligible to vote in India!");
        }
        else
        {
            throw new Underage("Oops! You are not eligible to vote!");
        }
    }
}