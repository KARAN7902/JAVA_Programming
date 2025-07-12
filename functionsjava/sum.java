package functionsjava;

import java.util.Scanner;

public class sum {
    public static int printSum(int a,int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum =printSum(a,b);
            System.out.println("the sum is:"+sum);
        }
    }
}
