package functionsjava;

import java.util.Scanner;

public class isprime {
    public static boolean isPrime(int n)
    {
        boolean isprime = true;
        if(n<=1)
        {
            isprime =false;
        }
        for(int i = 2 ; i<n/2;i++)
        {
              if(n%i==0)
              {
                isprime =false;
                break;
              }
        }
        return isprime;
    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in);){
            int n = sc.nextInt();
            if(isPrime(n))
            {
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
        
    }
    
}
