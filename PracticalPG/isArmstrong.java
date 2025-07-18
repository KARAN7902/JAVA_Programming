package PracticalPG;
import java.util.Scanner;

public class isArmstrong {
    public static Boolean IsArmstrong(int n) {
        int origionl = n;
        String newString = Integer.toString(n);
        int count = newString.length();
        int resuilt = 0;
        while (n > 0) {
            int digit = n % 10;
            resuilt += Math.pow(digit, count);
            n /= 10;
        }
        return resuilt == origionl;
    }
    public static void PrintArmstronNumber(int k)
    {
        for(int i=1;i<k;i++)
        {
            if(IsArmstrong(i))
            {
                System.err.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
       int n=sc.nextInt();
        // n = 153;
        boolean resuilt =IsArmstrong(n);
        if (resuilt) {
            System.out.println(n+" is an armstron number " + resuilt);
        } else {
            System.out.println(n+" is not an armstrong number " + resuilt);
        }
        PrintArmstronNumber(500);
        sc.close();
    }
}
