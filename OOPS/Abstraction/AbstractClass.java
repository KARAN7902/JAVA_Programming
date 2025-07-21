package OOPS.Abstraction;
abstract class Animal{
     static int eye=2;
    public void walk(){

    }
}
class horse extends Animal{
        public void walk(){
            System.out.println("animal walks");
        }
        public void print(){
            System.out.println(this.eye);
        }
}
class chiken extends Animal{
    public void walk(){
        System.out.println("chiken walks");
    }
     public void print(){
            System.out.println(this.eye);
        }
}
public class AbstractClass {

    public static void main(String[] args) {
        horse h1 =new horse();
        h1.walk();
        chiken c1 = new chiken();
        c1.walk();
        System.out.println(c1.eye);
        System.out.println(h1.eye);
    }
    
}
