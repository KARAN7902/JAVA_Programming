package Recursion;

import java.util.Scanner;

public class XpowN {
    public static int CalXpowN(int n,int x)
    {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // if(n==1){
        //     return x;
        // }

        int result = x*CalXpowN(n-1, x);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int x =sc.nextInt();
        System.out.printf("the %d th power of %d is %d",n,x,CalXpowN(n, x));
    }
}
