// calculate the area of triangle 

public class triangle_example_03_3{
    
    
    
  static class Triangle{
      int b,h;
      Triangle(int b, int h){
          
          this.b = b;
          this.h = h;
          
          calculateArea();
          
      }
      public void calculateArea(){
          System.out.println("Area of Triangle : " + 0.5*b*h);
      }
      
  }
  
  public static void main(String args[]){
      
      Triangle t = new Triangle(2,3);
      
  }
  
  
  
  
  
}

