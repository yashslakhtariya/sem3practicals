package yash_lakhtariya;
import java.util.Scanner;

public class ex3 {
     public static void main(String[] args) {
          double a, b, ans;
          Scanner in = new Scanner(System.in);
          System.out.print("\nEnter the 1st number : ");
          a=in.nextDouble();
          System.out.print("Enter the 2nd number : ");
          b=in.nextDouble();
          ans=a+b;
          System.out.println("\n\tAddition is : " + ans);
          ans=a-b;
          System.out.println("\n\tSubtraction is : " + ans);
          ans=a*b;
          System.out.println("\n\tMultiplication is : " + ans);
          ans=a/b;
          System.out.println("\n\tDivision is : " + ans);
          ans=a%b;
          System.out.println("\n\tRemainder is : " + ans);
          in.close();
          }
}