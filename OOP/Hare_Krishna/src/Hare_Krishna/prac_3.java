package Hare_Krishna;
import java.util.Scanner;

public class prac_3 {
     public static void main(String[] args) {
          int cost_p, cost_b, p, b, pt, bt, total ;
          cost_p=10;
          cost_b=60;
          Scanner in=new Scanner(System.in);
          System.out.print("\nEnter the number of pens purchased : ");
          p=in.nextInt();
          System.out.print("Enter the number of books purchased : ");
          b=in.nextInt();
          in.close();
          pt=cost_p*p;
          bt=cost_b*b;
          total=pt+bt;
          System.out.println("\nItem\t\tQty\t\tCost\t\tTotal\n");
          System.out.println("Pens\t\t" + p + "\t\t" + cost_p + "\t\t"+ pt);
          System.out.println("Books\t\t" + b + "\t\t" + cost_b +"\t\t" + bt);
          System.out.println("\nTotal\t\t"+ (p+b) + "\t\t" + (cost_b+cost_p) + "\t\t" + total);

     }
}
