package Hare_Krishna;
import java.util.Scanner;

public class prac_5 {
     public static void main(String[] args) {
          String name;
          int age;
          double slry;
          Scanner in=new Scanner(System.in);
          System.out.println("Enter the details of an employee below : ");
          System.out.print("\n\tName : ");
          name=in.next();
          System.out.print("\n\tAge : ");
          age=in.nextInt();
          System.out.print("\n\tSalary : ");
          slry=in.nextDouble();
          in.close();
          System.out.println("\n");
          System.out.println("The details entered are : ");
          System.out.println("\n\tName : "+ name);
          System.out.println("\n\tAge : "+age);
          System.out.println("\n\tSalary : "+slry);
     }
}