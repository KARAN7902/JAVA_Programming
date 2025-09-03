package CodingSekho;
class A{
     int x; // the variable which does not have any  access specifier it is called instance vriable or which is not static or live as long as object lives
    static  int y;// Static variable is accessible through the  whole class and lives as long as program runs
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
        a1.fun2();// print y it prints 45 because the y is the static variable  and it is the part of the class not the object
        // it not accesible by the object ,it is accessible by the class itself
        //i.e. A.y  
        // if any update is done by a2 the a2 is able to see the changes or the updated value of static member
     }
}
