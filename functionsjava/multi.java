package functionsjava;

import java.util.Scanner;

public class multi {
    public static int calculateProduct(int a,int b) {
        int product =a*b;
        return product;
    }
    public static void main(String[] args) {
         try(Scanner sc = new Scanner(System.in);)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product =calculateProduct(a, b);
            System.out.println("the Multiplication is:"+product);
        }
    }
    
}
