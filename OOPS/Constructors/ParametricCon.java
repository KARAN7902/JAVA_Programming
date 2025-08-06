package Constructors;
class nalge{
    String name;
    int age;
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    nalge(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
public class ParametricCon {
    public static void main(String[] args) {
        nalge n1=new nalge("kartik",8);
        n1.printDetails();
    }
}
