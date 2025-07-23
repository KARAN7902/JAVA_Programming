package Recursion;

import java.util.Scanner;

public class fibSeries {
    public static int CalFib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int Nm1=CalFib(n-1);// 0  
        int Nm2 =CalFib(n-2);// 1
        int fib =Nm1+Nm2;// 1
        return fib;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<=n;i++)
        System.out.printf("the fib Of %d is %d\n",i,CalFib(i));
    }
    
}
