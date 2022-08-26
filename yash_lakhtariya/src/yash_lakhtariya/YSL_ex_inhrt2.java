package yash_lakhtariya;
// YSL - Yash S Lakhtariya
class Member
{
     String name;
     int age;
     long contact;
     String address;
     double salary;

    public void printSalary()
    {
          System.out.println("\n\tSalary Assigned : " + this.salary + " USD");
    }
}

class Employee extends Member
{
    String spcl;
    public void empl()
    {
          System.out.println("\nEmployee Details : ");
          System.out.println("\n\tName : " + this.name);
          System.out.println("\n\tAge : " + this.age);
          System.out.println("\n\tContact : " + this.contact);
          System.out.println("\n\tAddress : " + this.address);
          System.out.println("\n\tSpecialization : " + this.spcl);
    }
}

class Manager extends Member
{
    String department;
    public void mngr()
    {
          System.out.println("\nManager Details : ");
          System.out.println("\n\tName : " + this.name);
          System.out.println("\n\tAge : " + this.age);
          System.out.println("\n\tContact : " + this.contact);
          System.out.println("\n\tAddress : " + this.address);
          System.out.println("\n\tDepartment : " + this.department);
    }
}
public class YSL_ex_inhrt2 
{
    public static void main(String[] args) 
    {

          Member mbr = new Member();
          Employee emp1 = new Employee();
          emp1.name = "Yash Lakhtariya";
          emp1.age = 20;
          emp1.contact = 987654321l;
          emp1.address = "Vrindavan";
          emp1.spcl = "Linux";
          mbr.salary = 643216.12;
          emp1.empl();
          mbr.printSalary();

          System.out.println("\n");

          Member mbr2 = new Member();
          Manager emp2 = new Manager();
          emp2.name = "Lakhtariya Yash";
          emp2.age = 19;
          emp2.contact = 1234567890l ;
          emp2.address = "Mayapur";
          emp2.department = "CBA";
          mbr2.salary = 163264.12;
          emp2.mngr();
          mbr2.printSalary();
     }
}