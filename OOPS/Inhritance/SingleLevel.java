package OOPS.Inhritance;
class Animal{
    String name;
    String type;
}
class Horse extends Animal {
    //horse class geting the properties of the animal class
    public void Print(){
        System.out.println(this.name);
        System.out.println(this.type);
    }
}



public class SingleLevel {

    public static void main(String[] args) {
        Horse newHorse =new Horse();
        newHorse.name="raka";
        newHorse.type="racing";
        newHorse.Print();
    }
    
}
