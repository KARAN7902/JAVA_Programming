package functionsjava;
import java.util.Scanner;
class Student{
    String name;
    void print(){
        System.out.println(this.name);
    }
}

public class AditionOdd {

     public static int SumOddNumbers(int n){
        int result =0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                result +=i;
            }
        }
        return result;
     }
     public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);)
        {
            int n=sc.nextInt();
            int SumOddNumbers=SumOddNumbers(n);
            System.out.println("Sum of odd numbers from 1 to"+n+"="+SumOddNumbers);
        }
     }


}
