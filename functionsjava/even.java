package functionsjava;

import java.util.Scanner;

public class even {
    public static int isEven(int n){
        if(n%2==0)
            return 1;
        else 
        return 0;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);)
        {
            int n = sc .nextInt();
            if(isEven(n)==1)
            {

                System.out.println(n+" is a even number");
            }
            else{

                System.out.println(n+" is a odd number");
            }
        }
    }
    
}
