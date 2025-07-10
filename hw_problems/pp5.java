package JAVA.hw_problems;
import java.util.Scanner;
public class pp5 {
    public static void main(String[] args) {
        try(Scanner sc= new Scanner(System.in);){
            System.out.println("enter the num");
            int num=sc.nextInt();
            for(int i=1;i<=num;i++)
            {
                if(i%2==0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
