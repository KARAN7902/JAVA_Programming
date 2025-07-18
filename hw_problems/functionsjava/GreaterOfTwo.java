package functionsjava;
import java.util.*;
public class GreaterOfTwo {
    public static int  GratestofNumbers(int a,int b){
        if(a>b)
        {
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);)
        {
          System.out.println("enter a & b:");
          int a = sc.nextInt();
          int b = sc.nextInt();
          int greater = GratestofNumbers(a, b);
          System.out.println("the grater number ="+greater);
          System.err.println("hhh");

        }
    }
    
}
