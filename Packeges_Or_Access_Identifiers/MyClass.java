package Packeges_Or_Access_Identifiers;
// import Packeges_Or_Access_Identifiers.Accounts;
import Packeges_Or_Access_Identifiers.Accounts.*;

class Myclass{
  public int age;
  String kartik;
  // accessible within the class or package
  protected String name1;
// this protected string allow to access only same class and in the  different package  only sub classes can access
//
 private String password;
 // to print the password
  public String GetName(){
    return this.password;
  }
  // to change the password
   public void SetName(String name){
   this.password=name;
  }
  // to print the passsword
  public void Print(){
    System.out.println(this.password);
  }
}
class Karan extends Myclass{
  public int id;
}
public class MyClass {
    public static void main(String[] args) {
      // here we are accessing the public data of the class by importing i.e.import Packeges.Accounts.*; it into this program
      Account1 acc = new Account1();
      acc.name="kartik";
      acc.getName(acc.name="kartik");
      acc.getName("karan");
      //here we are accessing the private data from the MYclass 
      Myclass name1= new Myclass();
      name1.name1="karan";
      System.out.println(name1.name1);
      name1.SetName("kartik");
      name1.Print();

      Karan kg =new Karan();
      // the protected String is aacessed by the child class
      kg.name1 ="kartik";
      /// accessing the default access identifier
      Myclass m1 = new Myclass();
      m1.kartik ="karan";
    }  
}

