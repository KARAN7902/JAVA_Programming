package OOPS.Constructors;

class Students{
    String name;
    int age;

    public void PrintDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // constructor defind or declaration
    // non parameteric Constructor
    Students(){
     System.out.println("Constructor called");
    }
}

public class SimpleCon { 
    public static void main(String[] args) {
        Students kartik = new Students();
                             // constructor calling
        kartik.name="yogesh";
        kartik.age=28;
        kartik.PrintDetails();
    }
    
}
