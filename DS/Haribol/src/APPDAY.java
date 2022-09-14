import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class APPDAY
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner ysl_in=new Scanner(System.in);
        int t=ysl_in.nextInt();
        for(int i=0;i<t;i++)
        {
            int hk=ysl_in.nextInt();
            int hr=ysl_in.nextInt();
            if(hk%hr==0)
            {
                System.out.println(hk/hr);
            }
            else
            {
                System.out.println((hk/hr)+ 1);
            }
        }
    }
}