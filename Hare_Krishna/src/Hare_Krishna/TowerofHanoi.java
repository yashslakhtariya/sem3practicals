package Hare_Krishna;

import java.util.Scanner;

public class TowerofHanoi
{
    static void ysl(int n, char from, char to, char via)
    {
        if (n==1)
        {
            System.out.println("Top Disk moved from " + from + " to " + to);
            return;
        }
        ysl(n-1, from, via, to);
        System.out.println("Top Disk moved from " + from + " to " + to);
        ysl(n-1, via, to, from);
    }
    public static void main(String[] args) throws Exception
    {
        int n;
        Scanner aavado = new Scanner(System.in);
        n=aavado.nextInt();
        ysl(n,'A', 'B', 'C');
    }
}
