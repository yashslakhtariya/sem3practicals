package Hare_Krishna;

import java.util.Scanner;

public class Prac_11
{
    private static void dplcte()
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter the size of String array : ");
        int n = scnr.nextInt();
        String[] in = new String[n];
        System.out.print("\nEnter the Strings : ");
        for (int i=0; i<n; i++)
            in[i] = scnr.next();

        for (int a=0; a<n; a++)
        {
            for (int b=a+1; b<n; b++)
            {
                if (in[a].equals(in[b]))
                    System.out.println(in[b]);
            }
        }
    }
    public static void main(String... s)
    {
        dplcte();
    }
}
