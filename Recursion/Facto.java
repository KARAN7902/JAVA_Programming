package Recursion;

import java.util.Scanner;

public class Facto {
    public static int CAlfatc(int n){
        if(n==0||n==1){
            return 1;
        }
        int FNm1=CAlfatc(n-1);
        int totalF=n*FNm1;
        return totalF;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.printf("the fact of %d is %d",n,CAlfatc(n));
        sc.close();
    }
}
