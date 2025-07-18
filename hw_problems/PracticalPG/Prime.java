package PracticalPG;

import java.util.Scanner;

public class Prime {
    public static boolean IsPrime(int n){
        if(n<=1)// 1 is not prime number
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            // to check other divisor than 1
            if(n%i==0)
            {
                return false;  
            }
        }
        return true; // if no divisor is found number is prime
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        if(IsPrime(n))
        {
          System.out.println(n+" is prime");            
        }else{
          System.out.println(n+" is not prime");            
        }
        sc.close();
    }
    
}
