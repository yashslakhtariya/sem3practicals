package yash_lakhtariya;
public class pizza
{
     public static void main(String[] args) {
          float size, pi, peri, area, rad;
          pi=(float)22/7;
          size=20;
          rad=size/2;
          // Perimeter = 2 pi r
          peri=2*pi*rad;
          area=pi*rad*rad;
          System.out.println("The perimeter is "+peri+" cm");
          System.out.println("The area is "+area+" cm");
          System.out.println("\nSo Ankit has to spread chilli on whole "+area+" cm area of pizza");
     }
}