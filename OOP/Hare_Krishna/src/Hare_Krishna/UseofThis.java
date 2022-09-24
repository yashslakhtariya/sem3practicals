package Hare_Krishna;
import java.util.*;

class UseofThis
{
    public static void main (String[] args)
    {
        OOP_PR4 obj = new OOP_PR4();
//        obj.OOP_PR4();
    }
}
class def
{
    int d;
}
class OOP_PR4 extends def
{
    OOP_PR4()
    {
        this.d = d;
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int ysl1[] = new int[d];
        int ysl2[] = new int[d];
        int ysl3[] = new int[d];
        int ysl4[] = new int[d];
        int ysl5[] = new int[d];
        int[] temp = new int[d];
        Integer[] rslt = new Integer[d];

        for (int i = 0; i < d; i++)
        {
            ysl1[i] = sc.nextInt();
            ysl2[i] = sc.nextInt();
            ysl3[i] = sc.nextInt();
            ysl4[i] = sc.nextInt();
            ysl5[i] = sc.nextInt();
            rslt[i] = ysl1[i] + ysl2[i] + ysl3[i] + ysl4[i] + ysl5[i];
            temp[i] = ysl1[i] + ysl2[i] + ysl3[i] + ysl4[i] + ysl5[i];

        }
        Arrays.sort(rslt, Collections.reverseOrder());
        for (int i = 0; i < d; i++)
        {
            for (int j = 0; j < d; j++)
            {
                if (rslt[i] == temp[j])
                {
                    System.out.print(ysl1[j] + " " + ysl2[j] + " " + ysl3[j] + " " + ysl4[j] + " " + ysl5[j] + " ");
                }
            }
        }
    }
}