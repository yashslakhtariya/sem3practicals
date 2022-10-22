import java.util.Scanner;

interface RestDetails
{
    String name = "Govinda's";
    String getMenu(String choice);
}

abstract class Order
{
    String choice;
    abstract int getInvoice();

    Order(String choice)
    {
        this.choice = choice;
    }
}

class RestMgmt extends Order implements RestDetails
{
    public RestMgmt()
    {
        super("Sweet");
    }
    public String getMenu(String choice)
    {
        return choice;
    }
    public int getInvoice()
    {
        int amnt = 0;
        if (choice.equals("Spicy"))
            amnt = 2938;
        else if(choice.equals("Sweet"))
            amnt = 2640;
        else if(choice.equals("Sour"))
            amnt = 1461;
        else if(choice.equals("Bitter"))
            amnt = 1395;
        else if(choice.equals("Salty"))
            amnt = 2507;
        if (amnt > 2000)
            amnt -= (amnt * 0.2);

        return amnt;
    }
}

public class Prac_13
{
    public static void main(String... s)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.print("\nEnter the name of the food item : ");
        String dish = scnr.nextLine();
        RestMgmt yummy = new RestMgmt();
        yummy.getMenu(dish);
        System.out.print("\nThe ordered dish : " + yummy.getMenu(dish));
        System.out.print("\nYour invoice amount : " + yummy.getInvoice() + "\n");
    }
}
