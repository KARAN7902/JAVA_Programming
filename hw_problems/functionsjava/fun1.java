package functionsjava;

import java.util.Scanner;

public class fun1 {
    public static void printMyName(String name)
    {
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("enter the Name:");
        try(Scanner sc = new Scanner(System.in);)
        {
            String name = sc.next();
            printMyName(name);
        }
        
    }
}
