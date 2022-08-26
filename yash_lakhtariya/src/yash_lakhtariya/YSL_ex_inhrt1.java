package yash_lakhtariya;
// YSL - Yash S Lakhtariya
class krsna // parent class
{
    public void prnt()
    {
        System.out.println("\n\tThis is parent class");
    }
}

class govind extends krsna //child class
{
    public void extnd()
    {
        System.out.println("\n\tThis is child class");
    }
}
public class YSL_ex_inhrt1 {
     public static void main(String[] args) 
     {
        krsna haribol = new krsna(); // creating object for parent class 
        haribol.prnt(); // calling method using the parent  class

        govind jai = new govind(); // creating object for child class
        jai.extnd(); // calling method using the child class
        jai.prnt(); // calling parent class method using the child class object
     }

}