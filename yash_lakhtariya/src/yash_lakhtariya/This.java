package yash_lakhtariya;

class Student
{
     static String clg;
     int id;
     String nme;
     int mrks1, mrks2, mrks3;
     static void college(String college)
     {
          Student.clg=college;
     }
     Student(int id, String nme)
     {
          this.id=id;
          this.nme=nme;
     }
     int total(int mrks1, int mrks2, int mrks3)
     {
          this.mrks1=mrks1;
          this.mrks2=mrks2;
          this.mrks3=mrks3;
          int totalmrks=mrks1+mrks2+mrks3;
          return totalmrks;
     }
     void dsply()
     {
          System.out.println(id + nme + mrks1 + mrks2 + mrks3);
     }
}

public class This {
     public static void main(String[] args) {
          Student.college("ICT");
          
          Student ysl = new Student(64, "Yash");
          ysl.total(16, 32, 64);
          ysl.dsply();
     }
}
