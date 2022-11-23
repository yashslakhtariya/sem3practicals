package Hare_Krishna;

import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class Prac_18
{
    static public void main(String... s)
    {
        String name;
        File main = new File("number.txt");

        try
        {
            if(main.exists())
            {
                try (FileReader reader = new FileReader(main))
                {
                    BufferedReader br = new BufferedReader(reader);
                    if((name = br.readLine()) != null)
                    {
                        System.out.println(name);
                        method(name);
                    }
                }
            }
            else
            {
                main.createNewFile();
            }
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }
    static void method(String number)
    {
        int[] array = new int[number.length()];
        for(int i=0; i<number.length(); i++)
        {
            array[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        int[] even_array = new int[4];
        int[] odd_array = new int[5];
        int e=0;
        int o=0;
        for (int j : array)
        {
            if (j % 2 == 0)
            {
                even_array[e] = j;
                e++;
            }
            else
            {
                odd_array[o] = j;
                o++;
            }
        }
        try
        {
            Desktop dex = Desktop.getDesktop();
            File even = new File("even.txt");
            even.createNewFile();
            FileWriter for_even = new FileWriter(even);
            for_even.write(Arrays.toString(even_array));
            dex.open(even);
            for_even.close();

            File odd = new File("odd.txt");
            odd.createNewFile();
            FileWriter for_odd = new FileWriter(odd);
            for_odd.write(Arrays.toString(odd_array));
            dex.open(odd);
            for_odd.close();
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
        System.out.println("All Even Numbers");
        for(int i=0; i<4; i++)
        {
            System.out.print(even_array[i] + " ");
        }
        System.out.println();
        System.out.println("All Odd Numbers");
        for(int i=0; i<5; i++)
        {
            System.out.print(odd_array[i] + " ");
        }
    } }