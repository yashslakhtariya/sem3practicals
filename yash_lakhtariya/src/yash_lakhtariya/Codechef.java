package yash_lakhtariya;
import java.util.Scanner;

public class Codechef
{    
     int id, yrs, slry, sum=0, avg;
     String name;
     Scanner in = new Scanner(System.in);
     void input()
     {
          id=in.nextInt();
          name=in.next();
          yrs=in.nextInt();
          for(int i=0; i<yrs; i++)
          {
               slry=in.nextInt();
               sum=sum+slry;
          }
     }
     void complete_sal()
     {
          System.out.println(sum);
     }
     void overall_sal()
     {
          avg=sum/yrs;
          System.out.println(avg);
     }
     public static void main(String[] args) 
     {
          Codechef ysl = new Codechef();
          ysl.input();
          ysl.complete_sal();
          ysl.overall_sal();
     }
}
