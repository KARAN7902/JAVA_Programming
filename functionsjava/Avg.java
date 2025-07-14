package functionsjava;
import java.util.*;

public class Avg {
    public static void PrintAverage(int a,int b,int c){
       int  avg =(a+b+c)/3;
       System.out.println("the average of a b and c="+avg);
       return;
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in);)
        {
            System.out.println("enter the value of a b c:");
            int a =sc.nextInt();
            int b =sc.nextInt();
            int c =sc.nextInt();
            PrintAverage(a, b, c);
        }
    }
    
}
