package Hare_Krishna;

class  ysl
{
     int id = 64; 
     String name = "ICT Ganpat University";
     // College ID and Name in parent class
}

class yash extends ysl
{
     void show()
     {
          System.out.println("\n\tCollege ID : " + id);
          System.out.println("\n\tCollege Name : " + name);
          // Fetching and displaying the data from child class
     }
}

public class prac_8 
{
     public static void main(String[] args) {
          yash y = new yash();
          y.show();
     }     
}