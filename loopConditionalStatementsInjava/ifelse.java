import java.util.*;

public class ifelse {
    public static void main(String args[]) {
       try( Scanner sc = new Scanner(System.in);){
        System.out.print("enter the age:");
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("not  adult");
        }
    }
}
}
