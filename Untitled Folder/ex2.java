package yash_lakhtariya;
import java.util.Scanner;

public class ex2 {
     public static void main(String[] args) {
          int n, sum;
          Scanner in = new Scanner(System.in);
          System.out.print("\nEnter the number of integers : ");
          n=in.nextInt();
          sum=(n*(n+1))/2;
          System.out.println("\n\tThe sum of " + n + " integers is : " + sum);
          in.close();
     }     
}
