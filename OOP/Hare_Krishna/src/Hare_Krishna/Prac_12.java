package Hare_Krishna;

import java.util.Scanner;

abstract class Book
{
    String title;

    abstract void setTitle(String b);
/*    String getTitle()
    {
        return title;
    }
*/
}

interface TitleBook
{
    void setTitle(String tb);
    public String getTitle();
}

class MyBook extends Book implements TitleBook
{
    public void setTitle(String mb)
    {
        title = mb;
    }
    public String getTitle()
    {
        return title;
    }
}
public class Prac_12
{
    public static void main(String... s)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter title of the book : ");
        String twelve = scnr.nextLine();
        MyBook mb1 = new MyBook();
        mb1.setTitle(twelve);
        System.out.print("\nThe title of the book is : " + mb1.getTitle() + "\n");
    }
}
