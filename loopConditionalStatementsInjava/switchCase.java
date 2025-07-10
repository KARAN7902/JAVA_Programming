
import java.util.*;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("1: for Namaste");
        System.out.println("2: for Hello");
        System.out.println("3: for Bonjour");
        // try function we use to automatically  sc.close() the scanner or any other input / output function
        try (Scanner sc = new Scanner(System.in);) {
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Namaste");
                    break;

                case 2:
                    System.out.println("Hello");
                    break;

                case 3:
                    System.out.println("Bonjour");
                    break;

                default:
                    System.out.println("invalid command");
            }
        }

    }
}
