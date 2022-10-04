package Hare_Krishna;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class abstrct
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s = new Scanner(System.in);
        int c1,c2,r2,r1;
        // frst matrix.
        // System.out.print("Enter ROW: ");
        r1 = s.nextInt();
        // System.out.print("Enter clmn: ");
        c1 = s.nextInt();
        int[][] frst = new int[r1][c1];

        for(int row = 0; row<r1; row++)
        {
            for(int clmn = 0; clmn<c1; clmn++)
            {
                frst[row][clmn] = s.nextInt();
            }
        }


        // scnd matrix.
        // System.out.print("Enter ROW: ");
        r2 = s.nextInt();
        // System.out.print("Enter clmn: ");
        c2 = s.nextInt();
        int[][] scnd = new int[r2][c2];
        for(int row = 0; row<r2; row++)
        {
            for(int clmn = 0; clmn<c2; clmn++)
            {
                scnd[row][clmn] = s.nextInt();
            }
        }
        // matrix m = new matrix(r1,c1,r2,c2);
        result obj = new result(r1,c1,r2,c2);
        obj.cal(frst, scnd);
    }
}

abstract class matrix
{
    int c1,c2,r1,r2;
    matrix(int a, int b, int c, int d)
    {
        r1 = a;
        c1 = b;
        r2 = c;
        c2 = d;
    }
    abstract void cal(int[][] frst, int[][] scnd);
}

class result extends matrix
{

    result(int a, int b, int c, int d)
    {
        super(a, b, c, d);
    }

    void cal(int[][] frst, int[][] scnd)
    {
        if(c1 == r2)
        {
            // will execute
            int[][] answr = new int[r1][c2];
            for(int row=0; row<r1; row++)
            {
                for(int clmn=0; clmn<c2; clmn++)
                {
                    answr[row][clmn] = 0; // will be zero at each iteration.
                    for(int y = 0; y<r1; y++)
                    {
                        answr[row][clmn] = answr[row][clmn] + (frst[row][y] * scnd[y][clmn]);
                    }
                    System.out.print(answr[row][clmn] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            return;
        }
    }
}