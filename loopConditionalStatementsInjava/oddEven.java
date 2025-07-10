import java.util.*;

public class oddEven {
    public static void main(String argc[]) {
        try (Scanner sc = new Scanner(System.in);) {

            System.out.print("Enter the number:");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
            }
        }
    }
}
