package Hare_Krishna;
import java.util.Scanner;

public class Prac_19
{
    public static void main(String... s)
    {
        Scanner scanner = new Scanner(System.in);
        String name1, name2, name3;
        System.out.print("\nEnter First Name: ");
        name1 = scanner.next();
        System.out.print("Enter Second Name: ");
        name2 = scanner.next();
        System.out.print("Enter Third Name: ");
        name3 = scanner.next();
        int id1, id2, id3;
        id1 = 101;
        id2 = 102;
        id3 = 103;
        Thread t1 = new Thread(name1);
        Thread t2 = new Thread(name2);
        Thread t3 = new Thread(name3);
        t1.start();
        t2.start();
        t3.start();
        try
        {
            Thread.sleep(600);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("ID --> " + id1 + " \nName --> " + t1.getName());
        System.out.println();
        try
        {
            Thread.sleep(600);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("ID --> " + id2 + " \nName --> " + t2.getName());
        System.out.println();
        try
        {
            Thread.sleep(600);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("ID --> " + id3 + " \nName --> " + t3.getName());
    }
}