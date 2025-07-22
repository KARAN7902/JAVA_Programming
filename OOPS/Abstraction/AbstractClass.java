package OOPS.Abstraction;
abstract class Animal{
     static int eye=2;
     //this in the constant value for all the other objects
    public void walk(){

    }
}
class horse extends Animal{
        public void walk(){
            System.out.println("animal walks");
        }
        public void print(){
            System.out.println(Animal.eye);
        }
}
class chiken extends Animal{
    public void walk(){
        System.out.println("chiken walks");
    }
     public void print(){
            System.out.println(Animal.eye);
        }
}
public class AbstractClass {

    public static void main(String[] args) {
        horse h1 =new horse();
        h1.walk();
        chiken c1 = new chiken();
        c1.walk();
        System.out.println(Animal.eye);
        System.out.println(Animal.eye);
    }
    
}
