
import java.util.*;

public class nestedifelse {
    public static void main(String argc[]) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.print("enter a:");
            int a = sc.nextInt();
            System.out.print("enter b:");
            int b = sc.nextInt();
            if (a == b)

            {
                System.out.println("a is equal to b");
            } else if (a > b) {
                System.out.println("a is greater ");
            } else {
                System.out.println("b is greater");
            }
        }
    }
}
