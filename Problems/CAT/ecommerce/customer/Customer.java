package ecommerce.customer;

public class Customer {
   String cname;
   int age;
   String phone;
   String mail;

   public Customer(String cname, int age, String phone, String mail){
      this.cname = cname;
      this.age = age;
      this.phone = phone;
      this.mail = mail;
   }

   public void fetchcustomerdetails(){
      System.out.println("Customer name: " + cname);
      System.out.println("Age: " + age);
      System.out.println("Mobile no: " + phone);
      System.out.println("Mail id: " + mail);
   }
}
