package yash_lakhtariya;
import java.util.Scanner;

public class ex1 {
     public static void main(String[] args) {
          String s1, s2;
          double m1, m2;
          Scanner in = new Scanner(System.in);
          System.out.print("\nEnter the name of first student : ");
          s1=in.next();
          System.out.print("Enter the marks of first student : ");
          m1=in.nextDouble();
          System.out.print("\nEnter the name of second student : ");
          s2=in.next();
          System.out.print("Enter the marks of second student : ");
          m2=in.nextDouble();
          if(m1>m2)
          {
               System.out.print("\n\t" + s1 + " has the highest marks = " + m1);
          }
          else
          {
               System.out.print("\n\t" + s2 + " has the highest marks = " + m2);
          }
          in.close();
     }
}
