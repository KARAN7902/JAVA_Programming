// package Arrays;
// import Arrays;
import java.util.Scanner;
public class Array2D {

    public static void main(String[] args) {
       // predefined array with data
        int array[][] ={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}}; 
        System.out.println("ente the key:");

        try (Scanner sc = new Scanner(System.in);) {

            int key =sc.nextInt();
        // // array accepting from user
        // //     System.out.print("Enter the array elements:");
        // //     for (int i = 0; i < 5; i++) {
        // //         for (int j = 0; j < 5; j++) {
        // //             array[i][j] = sc.nextInt();
        // //         }
        // //     }
         // array searching
            System.out.println("the array is:");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                   if(array[i][j]==key)
                   {
                      System.out.print("key found at ="+i+","+j);
                      break;
                   }
                }
                System.out.println();
            }

        }
    }
}
    


