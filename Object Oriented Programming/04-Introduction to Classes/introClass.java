// Classes - 01 

public class introClass {

  public static void main(String[] args) {
    // store 5 roll nos 
    int[] numbers = new int[5];

    // store 5 names 
    String[] names = new String[5];


    // data of 5 students : {roll no, name, marks}
    int[] rno = new int[5];
    String[] name = new String[5];
    float[] marks = new float[5];

    // but what if you need a data structure that holds all these 3 at one single structure 
    // That's where class comes in. 
    // Class is a named group of properties and fields 

    // By convention, class starts with a Capital letter 

    Student[] students = new Student[5];

    Student raj;

  }
  
}


// create a Student class 

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