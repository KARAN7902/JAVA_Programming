package OOPS.Inhritance;
class Main{
    String job;
    String addr;
    String Quali;
    public void Print(String name,int n,int m){
        System.out.println(this.job);
        System.out.println(this.addr);
        System.out.println(this.Quali);
        System.out.println(name);
        System.out.println(n);
        System.out.println(m);
    }
}

class User1 extends Main{
    String name;
    int pin;
}
class User2 extends Main{
    String name;
    int pin;
}
class User5 extends User2{
 int Marks;
}
public class HibridLevel {
  public static void main(String[] args) {
      User5 u1 = new User5();
    u1.job="fhf";
    u1.addr="xyz";
    u1.Quali="fgfg";
    u1.name="kartik";
    u1.pin=412202;
    u1.Marks=34;
    u1.Print(u1.name,u1.pin,u1.Marks);
    User5 u2 =new User5();
    u2.job="fhf";
    u2.addr="xyz";
    u2.Quali="fgfg";
    u2.name="kartik";
    u2.pin=412202;
    u2.Marks=34;
    u2.Print(u2.name,u2.pin,u2.Marks);
    // User5 u2 =new User5();
  }
}
