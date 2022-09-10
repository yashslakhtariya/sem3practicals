package yash_lakhtariya;
import java.util.Scanner;
class ConstrMain
{
     String h;
     ConstrMain(String y)
     {
          y=h;
     }
     void rvrse()
     {
          int a=0;
          while(a != h.length())
          {
               for(int i=0; i<h.length(); i++)
               {
                    if(i==' ')
                    {
                         for(int j=i-1; j>=0; j--)
                         {
                              System.out.print(h.charAt(j));
                         }
                    }
               }
          }
     }
}

public class constr {
     public static void main(String[] args) {
          String inpt;
          Scanner sc=new Scanner(System.in);
          inpt=sc.next();
          ConstrMain yash=new ConstrMain(inpt);
          yash.rvrse();
          sc.close();
     }
}
