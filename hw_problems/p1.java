

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("1: for Addition");
            System.out.println("2: for Substraction");
            System.out.println("3: for Multiplication");
            System.out.println("4: for Division");
            System.out.println("5: for Reminder");
            System.out.println("Enter the choice:");
            int ch = sc.nextInt();
            int a, b;
            switch (ch) {
                case 1:
                    System.out.print("enter the numbers a & b:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int sum = a + b;
                    System.out.println(sum);
                    break;

                case 2:
                    System.out.print("enter the numbers a & b:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int Sub = a - b;
                    System.out.println(Sub);
                    break;
                case 3:
                    System.out.print("enter the numbers a & b:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int multi = a * b;
                    System.out.println(multi);
                    break;

                case 4:
                    System.out.print("enter the numbers a & b:");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    int Div = a / b;
                    System.out.println(Div);
                    break;

                case 5:
                    System.out.print("enter the numbers a & b:");
                  Float  a1 = sc.nextFloat();
                  Float  b1 = sc.nextFloat();
                  Float Mod = a1 % b1;
                    System.out.println(Mod);
                    break;
                default:
                    System.out.println("Invalid command");
                    break;
            }

        }

    }
}
