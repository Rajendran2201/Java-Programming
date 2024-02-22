// classes - 02

import java.util.Arrays;

public class objects {
  public static void main(String[] args) {

    // Objects - instance of the classes 
    // cars - class ;  ferrari , lamborghini, porsche - objects;
    // class - logical construct , object - physical reality (occupies space in memory)

    // objects have three essential properties - state, identity and behavior 
    // state - value ; identity - differentiating thing ; behavior - how the memory is allocated 

  

    Student[] students = new Student[5];    // new - dynamically allocates the memory at run time and returns a refernce to it 

    System.out.println(Arrays.toString(students));  //[null, null, null, null, null]


    Student raj = new Student(43,"Raj",100);
   
  // Student raj - compile time 
    // new Student() - run time 
  

    System.out.println(raj.rno);

  }
}


class Student{

  Student(int rno, String name, float marks){
      this.rno = rno; 
      this.name = name;
      this.marks = marks;
  }

  int rno;
  String name;
  float marks;

}