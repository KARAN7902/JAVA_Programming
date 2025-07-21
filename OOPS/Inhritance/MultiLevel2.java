 package OOPS.Inhritance;
class MultiLevel {

    String name;
}

class MultiLevel1 extends MultiLevel{
     String color;
}

public class MultiLevel2 extends MultiLevel1{
    

    public void Print(){
   System.out.println(this.color);
   System.out.println(this.name);
    }

     public static void main(String[] args) {
        MultiLevel2 m2 =new MultiLevel2();
        // this is the property of  multilevel class
        m2.name="kartik";
        // this property  is of  multilevel 1 class
        m2.color="gora";
        // this property is of multilevel 2 class
        m2.Print();
     }

}