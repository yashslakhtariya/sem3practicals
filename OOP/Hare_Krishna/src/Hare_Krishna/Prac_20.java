package Hare_Krishna;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Prac_20
{
    static public void main(String... s)
    {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            q.add(sc.nextLine());
        }
        System.out.println(q);
        q.remove();
        q.remove();
        q.add("Semester 6: Pascal");
        System.out.println(q);
    }
}
