public class Employee{
    
  static class GeneralEmployee{
      int ID;
      String name;
      float salary;
      
      GeneralEmployee(int i, String n, float s){
          ID = i;
          name = n;
          salary = s;
         // display();
      }
      
      void display(){
          System.out.println("ID : "+ID);
          System.out.println("Name : "+name);
          System.out.println("Salary : "+salary);
      }
  }
  
  static class Managers extends GeneralEmployee{
      int bonus = 5000;
      
      Managers(int i, String n, float s){
          super(i,n,s);
           salary+=bonus;
          display();
      }
      
     
  }
  
  public static void main(String args[]){
      
      Managers punda = new Managers(001, "Malai" , 100000);
      
  }
}