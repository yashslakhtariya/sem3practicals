import java.util.*;
import java.lang.*;
import java.io.*;

class YSL_BLICZ
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ysl_in=new Scanner(System.in);
        int t=ysl_in.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=ysl_in.nextInt();
            int a=ysl_in.nextInt();
            int b=ysl_in.nextInt();
            int timeGiven= 2 *(180 + n);
            int timeLeft=a+b;
            System.out.println(timeGiven-timeLeft);
        }
    }
}