package OOPS.PolyMorphism;

class Students {
    String name;
    int age;

    public void Display(String name) {
        System.out.println(name);
    }

    public void Display(int age) {
        System.out.println(age);
    }

    public void Display(String name, int age) {
        System.out.println("name= "+ name +" age= "+ age);
        // System.out.println(age);
    }
}

public class FunctionOverLoading {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name="kartik";
        s1.age=23;
        s1.Display(s1.name);
        s1.Display(s1.age);
        s1.Display(s1.name,s1.age);
    }

}
