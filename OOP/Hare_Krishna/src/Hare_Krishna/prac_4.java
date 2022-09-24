package Hare_Krishna;
import java.util.Scanner;

public class prac_4 {
     public static void main(String[] args) {
          String user, pswd;
          Scanner in = new Scanner(System.in);

          System.out.print("\nEnter your Username : ");
          user=in.next();
          System.out.print("Enter your Password : ");
          pswd=in.next();

          in.close();

          if(user.equals("Ganpat") && pswd.equals("ICT")){
               System.out.println("\n\tWelcome Ganpat");
          }
          else{
               System.out.println("\n\tFailed to login!! Please try again");
          }
     }
}