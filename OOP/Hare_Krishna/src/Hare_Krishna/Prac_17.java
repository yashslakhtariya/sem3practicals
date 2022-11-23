package Hare_Krishna;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Objects;

public class Prac_17
{
    static public void main(String... s) throws Exception
    {
        String name;
        File fl = new File("oop_17.txt");
        if(fl.exists())
        {
            System.out.println("This file exists");
            try (FileWriter fwrtr = new FileWriter("oop_17.txt"))
            {
                fwrtr.write("Hare Krishna!");
            }

            FileReader frdr = new FileReader("oop_17.txt");
            BufferedReader rd = new BufferedReader(frdr);
            if ((name = rd.readLine()) != null)
            {
                System.out.println(name);
            }
            method(Objects.requireNonNull(name));
        }
        else
        {
            System.out.println("This file doesn't exist");
            fl.createNewFile();
        }
    }
    static void method (String name)
    {
        String[] greet = name.split("\\s+");
        for (String value : greet)
        {
            if (value.equals("impossible"))
            {
                System.out.println("You can't use the word 'impossible'");
                break;
            }
        }
    }
}
