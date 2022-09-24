package Hare_Krishna;
import java.util.Scanner;
// YSL - Yash S Lakhtariya
public class YSL_p6
{
     static String ysl_bnk="Shree Kadi Nagarik Sahakari Bank Pvt Ltd";
     static double ysl_amnt=643216.12;

     public static void main(String[] args) {
          String ysl_nm;
          int ysl_id;

          Scanner ysl_in = new Scanner(System.in);
          System.out.print("\nEnter customer name : ");
          ysl_nm = ysl_in.next();
          System.out.print("\nEnter customer ID : ");
          ysl_id = ysl_in.nextInt();
          // YSL_p6 yash = new YSL_p6();
          // yash.ysl_bnk = "Shree Kadi Nagarik Sahakari Bank Pvt. Ltd.";
          // yash.ysl_amnt = 64321616.12;
          // Above method for static variable is not used because of warnings by IDE
          // Better initialized its value while declaring
          System.out.print("\nYour Bank details : \n");
          System.out.print("\n\tAccount holder : " + ysl_nm);
          System.out.println("\n\tAccount number : " + ysl_id);
          System.out.println("\tBank name : " + ysl_bnk);       
          System.out.println("\tAccount Balance : " + ysl_amnt + " INR");
          ysl_in.close();
     }
}