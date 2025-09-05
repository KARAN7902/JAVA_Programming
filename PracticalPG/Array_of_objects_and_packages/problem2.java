package PracticalPG.Array_of_objects_and_packages;

import java.util.Scanner;

class Array1 {

}

public class problem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int brr[][] = new int[5][5];
        System.out.println("IN put matrix 3X3");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                brr[j][i] = arr[i][j];
            }

        }
        System.out.println("After Transpose of the Matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(brr[i][j]+"\t");
            }
            System.out.println();

        }
        sc.close();
    }

}
