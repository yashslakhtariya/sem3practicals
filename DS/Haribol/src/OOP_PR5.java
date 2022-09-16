import java.util.Scanner;
import java.lang.Math;

class sqrert
{
    void root(double y)
    {
        System.out.println(Math.sqrt(y));
    }
}

class ecldn extends sqrert
{
    static double num;
    void calc(double[] x, double[] y)
    {
        double[] diff = new double[2];
        diff[0] = Math.pow((x[1]-x[0]),2);
        diff[1] = Math.pow((y[1]-y[0]),2);
        num = diff[0] + diff[1];
    }
}

class pnt extends ecldn
{
    double[] x = new double[2];
    double[] y = new double[2];
    void inpt()
    {
        Scanner ysl = new Scanner(System.in);
        for (int i=0; i<2; i++)
        {
            x[i] = ysl.nextDouble();
            y[i] = ysl.nextDouble();
        }
    }
}
public class OOP_PR5
{
    public static void main(String[] args)
    {
        pnt point = new pnt();
        ecldn eucli = new ecldn();
        point.inpt();
        point.calc(point.x, point.y);
        point.root(ecldn.num);
    }
}
