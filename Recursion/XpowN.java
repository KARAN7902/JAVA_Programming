package Recursion;

import java.util.Scanner;

public class XpowN {
    public static int CalXpowN(int n, int x) {
        // stack height =n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        // if(n==1){
        // return x;
        // }

        int result = x * CalXpowN(n - 1, x);
        return result;
    }

    public static int CalX(int x, int n) {
        // stack height =log n
        if (n == 0) {
            return 1;
        }
        if (x == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return CalX(x, n / 2) * CalX(x, n / 2);
        } else {
            return CalX(x, n / 2) * CalX(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        // XpowN.CalXpowN(n, x);
        System.out.printf("the %d th power of %d is %d\n", n, x, CalXpowN(n, x));
        System.out.printf("the %d th power of %d is %d", n, x, CalX(n, x));
        sc.close();
    }
}
