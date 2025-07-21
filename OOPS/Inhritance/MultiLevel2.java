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
        
     }

}