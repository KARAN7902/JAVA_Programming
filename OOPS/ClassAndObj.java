
class Pen {
    String color;
    String type;

    public void WriteColor() {
        System.out.println(this.color);
        // this keyword tells the class which object is accessing the data
        //which object is calling the data 
    }

    public void WriteType() {
        System.out.println(this.type);
    }
}

public class ClassAndObj {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen2.color = "black";
        // way to access the data members in the class
        pen2.type = "bollpoint";
        pen1.WriteColor();
        //way to access the methods / functions in the class
        pen1.WriteType();
        pen2.WriteColor();
        pen2.WriteType();
    }
}
