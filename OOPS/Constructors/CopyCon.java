package Constructors;
class Vp{
    String Dept;
    int Students;
    public void Display()
    {
        System.out.println(this.Dept);
        System.out.println(this.Students);
    }
    Vp(Vp vp1){
      this.Dept=vp1.Dept;
      this.Students=vp1.Students;
    }
    // empty constructor
    // is required  when we have to make copy
    Vp(){

    }

}
public class CopyCon {
    public static void main(String[] args) {
        Vp vp1 = new Vp();
        vp1.Dept="computer";
        vp1.Students=100;
        
        Vp vp2 =new Vp(vp1);
        vp2.Display();

    }
}
