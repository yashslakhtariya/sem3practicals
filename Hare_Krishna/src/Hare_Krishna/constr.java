package Hare_Krishna;
import java.util.Scanner;
class ConstrMain
{
     String h;
     ConstrMain(String y)
     {
          this.h = y;
     }
     void rvrse()
     {
          int a=0;
          while(a != h.length()-1)
          {
               for(int i=0; i<h.length()-1; i++)
               {
                    if(i==' ')
                    {
                         for(int j=i-1; j>=0; j--)
                         {
                              System.out.print(h.charAt(j));
                         }
                    }
                    System.out.print(h.charAt(i));
               }
          }
     }
}

public class constr
{
     public static void main(String[] args) throws Exception
     {
          String inpt;
          Scanner sc=new Scanner(System.in);
          inpt=sc.next();
          ConstrMain yash=new ConstrMain(inpt);
          yash.rvrse();
          sc.close();
     }
}
