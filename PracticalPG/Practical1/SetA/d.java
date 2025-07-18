package PracticalPG.Practical1.SetA;

import java.util.Scanner;

public class d {
    public static void main(String[] args) {
       //
       Scanner sc =new Scanner(System.in);
       int n=5;
       int array3[] = new int[n];

        for(int i=0;i<array3.length;i++)
        {
            array3[i]=sc.nextInt();
        }
        for(int i=0;i<array3.length/2;i++)
        {
          int temp = array3[i];
          array3[i]=array3[n-i-1];
          array3[n-i-1]=temp;
        }
        System.out.println();
        for(int i=0;i<array3.length;i++)
        {
            System.out.println(array3[i]);
        }
        
    }
}
