package Inhritance;

class MyClass{
  String ClassName;
  int roll_no;
  public void Print(String addr){
    System.out.println(this.ClassName);
    System.out.println(this.roll_no);
    System.out.println(addr);
  }
}

class kartik extends MyClass{
       String addr;
}

class yogesh extends MyClass{
    String addr;
}

public class HierarchalLevel {
    public static void main(String[] args) {
        // here both the  kartk and yogesh (child classes) accessing the peoperties of myclass class(parent class)
        kartik k= new kartik();
        k.ClassName="tybcs";
        k.addr="padvi";
        k.roll_no=34;
        yogesh y= new yogesh();
        y.ClassName="tybcs";
        y.roll_no=31;
        y.addr="padvi";
        y.Print(y.addr);
        k.Print(k.addr);
    }
}
