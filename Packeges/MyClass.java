package Packeges;
//import Packeges.Accounts.*;;

class Myclass{
  public int age;
  protected String name1;
// this protected string allow to access only same class
//
  public String GetName(){
    return this.name1;
  }
   public void SetName(String name){
   this.name1=name;
  }
  public void Print(){
    System.out.println(this.name1);
  }
}
class Karan extends Myclass{
  public int id;
}
public class MyClass {
    public static void main(String[] args) {
    //   ACcount acc = new ACcount();
    //   acc.name="kartik";
    //   acc.getName(acc.name="kartik");
    //   acc.getName("karan");
      Myclass name1= new Myclass();
      name1.name1="karan";
      System.out.println(name1.name1);
      name1.SetName("kartik");
      name1.Print();
    }

    Karan kg=new Karan();     
  
}

