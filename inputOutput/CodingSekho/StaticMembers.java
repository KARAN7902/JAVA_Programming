package CodingSekho;
class A{
     int x;
    static  int y;
    void fun1(){
     y=22;
    }
    void fun2(){
     System.out.println(y);
     //y=45;
    }
    void fun3(){
     y=45;
    }

}


public class StaticMembers {


     public static void main(String[] args) {
        A a1=new A();
        A a2=new A();
        a1.fun1();// y=22
        a2.fun3();// y=45
        a1.fun2();// print y it prints 45 because the y is the static variable  and it is the part of the the oject of the class 
        // if any update is done by a2 the a2 is able to see the changes or the updated value of static member
     }
}
