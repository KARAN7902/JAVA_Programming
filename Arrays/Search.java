package Arrays;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("enter the key:");
            int key = sc.nextInt();
            int array[] = { 1, 2, 3, 4, 5 };
            for (int i = 0; i < array.length; i++) {
                if (key == array[i]) {

                    System.out.println("the key is found at " + i + "th index");
                    break;
                } else {

                    System.out.println("the key is not found");
                }
            }
        }
    }
}
