
import java.util.Scanner;
public class p4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in); ){
            System.out.println("Enter the num to print its table:");
            int num = sc.nextInt();
            for(int i=1;i<11;i++)
            {

                System.out.println(num*i);
            }
        }
    }
}


