import java.util.Scanner;

class Employee{
    String Name,Address,DOB,ID,Department;
 
    Employee(String Name,String ID, String DOB, String Department,String Address){
        this.Name=Name;
         this.ID = ID;
         this.DOB=   DOB;
        this.Department = Department;
        this.Address=Address;
        System.out.println("Welcome "+ Name);
            }
            
}
class Operator extends Employee{
       double attendance, perday_salary, monthly_salary,Overtime,Overtimepay;
       String message;
       boolean eligibilitystatus;
       Operator(String Name,String ID,String DOB,String Department,String Address,double attendance,double perday_salary,double Overtime,double Overtimepay){
            super(Name,ID,DOB,Department,Address);
           this.attendance=attendance;
           this.perday_salary=perday_salary;
           this.Overtime=Overtime;
                   this.Overtimepay=Overtimepay;
               }
               void BonusCalculator(){
                  
        if(attendance>=28 ){
            if(Overtime>=50){
                eligibilitystatus=true;
                 message = "Eligible for bonus";
             
            }
                else{
                    eligibilitystatus=false;
                    message = "Not eligible for bonus Bcz less Overtime";
                }
            }
            else{
               eligibilitystatus=false;
                    message = "Not eligible for bonus Bcz less Attendance";
            }
               }
  
}
class SalaryCalculator extends Operator{
    double Bonus;
   SalaryCalculator(String Name,String ID,String DOB,String Department,String Address,double attendance,double peray_salary,double Overtime,double Overtimepay ){
 
      super(Name,ID,DOB,Department,Address,attendance,peray_salary,Overtime,Overtimepay);
       
   }
    
    void monthlySalaryCalculator(){
         Scanner sc= new Scanner(System.in);
          System.out.println("Enter the bonus Amount for this month:");
           Bonus = sc.nextDouble();
         
         BonusCalculator();
        if(eligibilitystatus == true){
           
    
                           monthly_salary =(attendance * perday_salary) + (Overtime * Overtimepay) + (Bonus * Overtime);
                             System.out.println("Bonus="+(Bonus*Overtime));
                             System.out.println("Your Monthly salary = "+ monthly_salary);
                       }
        else{
             System.out.println(message);
             monthly_salary =(attendance*perday_salary) + (Overtime * Overtimepay);
             System.out.println("Your Monthly salary = "+monthly_salary);
            
        }
    
           }
    }

class Mainclass {
    public static void main(String[] args) {
        System.out.println(" --- Enter the New employee details ----");
         Scanner sc= new Scanner(System.in);
 System.out.print("Enter the Name:");
 String Name = sc.next();
 
 System.out.print("Enter the ID:");
 String ID = sc.next();
 
  System.out.print("Enter the DOB:");
   String DOB = sc.next();
   
     System.out.print("Enter the  Department:");
    String Deparment = sc.next();
    
     System.out.print("Enter the Address :");
    String Address = sc.next();
   
        System.out.println(" --- Enter details for salary calculator----");
      System.out.print("Enter the attendance:");
    double attendance = sc.nextDouble();
    
     System.out.print("Enter the perday salary:");
    double perday_salary = sc.nextDouble();
    
    System.out.print("Enter the OverTime:");
    double OverTime = sc.nextDouble();
    
     System.out.print("Enter the OverTime pay:");
     double Overtimepay = sc.nextDouble();
    
    SalaryCalculator s1 = new SalaryCalculator(Name,ID,DOB,Deparment,Address,attendance,perday_salary,OverTime,Overtimepay);
   
    s1.monthlySalaryCalculator();
  //  Employee e1 = new Employee(Name,ID,DOB,Deparment,Address,attendance);
        
    }
}
