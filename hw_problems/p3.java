

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("enter the num");
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        }
    }
}
