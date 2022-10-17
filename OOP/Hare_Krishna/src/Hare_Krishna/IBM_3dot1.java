package Hare_Krishna;

import java.util.Scanner;

public class IBM_3dot1
{
    public static void main(String... s)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a String : ");

        String inpt;
        inpt = scnr.nextLine();

        int ln = inpt.length();
        String hlf = inpt.substring(inpt.length()/2);

        System.out.print("\nThe length of the input String is : " + ln);
        System.out.println("\nSecond Half :- " + hlf);
    }
}
