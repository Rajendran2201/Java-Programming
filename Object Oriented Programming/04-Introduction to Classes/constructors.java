public class constructors {
  public static void main(String[] args) {
    
      //lets create a class named car 

      Car ferrari = new Car(1,"Ferrari",3242343);
      System.out.println(ferrari.carName);
      System.out.print(ferrari.price);

  }  
}

class Car{

  Car(int carNo,String carName, float price){
    this.carNo = carNo;
    this.carName = carName;
    this.price = price;
  }

  int carNo; 
  String carName; 
  float price;
}