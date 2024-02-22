import java.util.Arrays;

class Student{

  int rno;
  String name;
  float marks;

}

public class objects2 {
  public static void main(String[] args) {
    Student raj = new Student();

    raj.rno = 43;
    raj.name = "Raj";
    raj.marks = 90;

    System.out.println(raj);              // Student@7344699f
    System.out.println(raj.name);       // Raj
  }
}
