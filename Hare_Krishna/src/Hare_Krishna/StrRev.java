package Hare_Krishna;
import java.util.Scanner;
public class StrRev
{
    public static void rvrse(String a)
    {
        String[] ysl=new String[3];
        ysl[0]="";
        ysl[1]="";
        ysl[2]="";
        char c;
        int j=0;
        for(int i=0;i<a.length();i++)
        {
            c=a.charAt(i);
            if(c==' ')
            {
                j++;
            }
            else{
                ysl[j]=c+ysl[j];
            }
        }
        for(int y=0;y< 3;y++)
        {
            System.out.print(ysl[y] + " ");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\n\tInput a String : ");
        String y=sc.nextLine();
        System.out.print("\tReversed String : ");
        rvrse(y);
        System.out.println("\n");
    }
}