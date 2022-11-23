package Hare_Krishna;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Prac_16
{
    static public void main(String... s)
    {
        try
        {
            File f = new File("OOP_p16.txt");
            String[] haribol =
                    {
                            "Krishna","Ram","Chaitanya","Gopinath","Madanmohan","Vasudev","Narsimha","Govinda"
                    };
            if(f.exists())
            {
                System.out.println("File is already created");
                FileWriter fw = new FileWriter("OOP_p16.txt");
                for(int i=0 ; i<haribol.length-1; i++)
                {
                    fw.write("Sri " + haribol[i] + "\n");
                }
                fw.close();
            }
            else
            {
                f.createNewFile();
                System.out.println("File created successfully -->"+f.getName());
                FileWriter fw = new FileWriter("OOP_p16.txt");
                for(int i=0 ; i<haribol.length-1; i++)
                {
                    fw.write("Sri " + haribol[i] + "\n");
                }
                fw.close();
            }
        }
        catch (IOException e)
        {
            System.out.println("Something wrong happened!");
        }
    }
}


