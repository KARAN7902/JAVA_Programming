package functionsjava;

import java.util.Scanner;

public class sum {

    // function declaration
    public static int printSum(int a,int b)
    {
        // this function takes two user inputs that are integer and 
        // calculates their sum
        // and return it to main function 
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            // function calling
            int sum =printSum(a,b);
            System.out.println("the sum is:"+sum);
        }
    }
}
