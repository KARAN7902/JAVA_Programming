package PracticalPG.Practical1.SetA;
import java.util.Scanner;
public class b {
    public static float CalculateArea(float length,float breadth)
    {
        float area =length*breadth;
    //    float perimeter =2*(length+breadth);
    return area;
    }
    public static float CalculatePerimeter(float length,float breadth)
    {
        // float area =length*breadth;
     
        float perimeter =2*(length+breadth);
        return perimeter;
    }
    public static void main(String[] args) {

        float length;
        float breadth;
        Scanner sc = new Scanner(System.in);
        length =sc.nextFloat();
        breadth =sc.nextFloat();
        System.out.println("the Area of ractangle is"+CalculateArea(length,breadth));
        System.out.println("the Perimeter of ractangle is"+CalculatePerimeter(length,breadth));
        System.out.printf("the Area of ractangle is %f\n",CalculateArea(length, breadth));
        System.out.printf("the Peremeter of ractangle is %f\n",CalculatePerimeter(length, breadth));
    sc.close();
    }
}
