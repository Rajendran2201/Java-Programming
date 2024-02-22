public class Basic{
    
  static class Students{
      void printFunction(){
          System.out.println("Students are good boys");
      }
  }
  
  static class Malai extends Students{
      void printF(){
          System.out.println("Malai is a good boy");
      }
  }
  
  public static void main(String[] args){
      
      Malai m = new Malai();
      Raj r = new Raj();
      m.printF();
      m.printFunction();
      r.printFunction();
      
  }
  static class Raj extends Malai{
      void printR(){
          System.out.println("Raj is very good boy");
      }
  }
}