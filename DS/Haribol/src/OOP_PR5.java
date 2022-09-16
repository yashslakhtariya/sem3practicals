import java.util.Scanner;
import java.lang.Math;

class sqrert
{
    double root(double y)
    {
        return Math.sqrt(y);
    }
}

class ecldn extends sqrert
{
    void calc()
    {

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

}
