import java.sql.SQLOutput;

public class class_objects_01 {

    /* class creation
    access_modifier static class class_name{

    para1;
    para2;
    ....
    para n;

    }



     */
    public static class Student{
        int rno;
        float marks;
        String name;
    }

    public static void main(String[] args) {

        // storing marks of 5 students

        // variables
        int m1 = 34;
        int m2 = 42;
        //....
        int m5 = 65;

        // array

        int[] marks = new int[5];

        /* class - data store of different data types

        object creation

        class_name object_name = new class_name();

        */

        Student s = new Student();

        System.out.println(s.rno);
        System.out.println(s.name);
        System.out.println(s.marks);

    }
}
