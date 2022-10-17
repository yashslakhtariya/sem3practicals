package Hare_Krishna;

import java.util.Scanner;

public class IBM_3dot2
{
    public static void main(String... s)
    {
        Scanner scnr = new Scanner(System.in);
        int v=0;
        int c=0;
        String inpt = scnr.nextLine();
        for (int i = 0; i < inpt.length(); i++)
        {
            if (inpt.charAt(i)=='a' || inpt.charAt(i) == 'e' || inpt.charAt(i) == 'i' || inpt.charAt(i) == 'o' || inpt.charAt(i) == 'u')
                v++;
            else if (inpt.charAt(i) > 'a' && inpt.charAt(i) < 'z')
                c++;
        }
        System.out.print("\nNumber of vowels : " + v);
        System.out.print("\nNumber of consonants : " + c);
    }
}
