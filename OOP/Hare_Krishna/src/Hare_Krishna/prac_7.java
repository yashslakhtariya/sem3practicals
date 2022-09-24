package Hare_Krishna;

class ysl_major
{
     String name, adrs;
     double blnc;
}    

class ysl_minor extends ysl_major
{

}

public class prac_7 
{
     public static void main(String[] args) {
          ysl_major mjr = new ysl_major();
          ysl_minor mnr = new ysl_minor();

          mjr.name="Yash";
          mjr.blnc = 643216.12;
          mjr.adrs = "Vrindavana";

          mnr.name = "Yash2";
          mnr.blnc = 163264.12;
          mnr.adrs = "Mayapur";

          System.out.println("\nRegular Account Holder : ");
          System.out.println("\n\tName : " + mjr.name);
          System.out.println("\n\tAddress : " + mjr.adrs);
          System.out.println("\n\tAccount Balance : " + mjr.blnc);

          System.out.println("\nMinor Account Holder : ");
          System.out.println("\n\tName : " + mnr.name);
          System.out.println("\n\tAddress : " + mnr.adrs);
          System.out.println("\n\tAccount Balance : " + mnr.blnc);
     }
}
