package OOPS.Abstraction;
interface Animal8 {
       // this the finla value for all types of animal
    static int eye=2;
    void print();
}
interface Animal9 {
       
    static String color ="red";
    void print2();
}
class hores implements Animal8,Animal9{
    // interfaces onle supports the multiple inheritance
    String name;
    public void print(){
        System.out.println("helooo");
    }
    public void print2(){
        System.out.println("dgfshfhf");
    }

}
public class PureAbstraction {
    public static void main(String[] args) {
        hores h1= new hores();
        h1.print();
        h1.print2();
        System.out.println(h1.color);
        System.out.println(h1.eye);
    }
}
