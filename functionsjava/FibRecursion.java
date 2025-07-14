package functionsjava;
import java.util.*;
public class FibRecursion {
    public static int CalculateFib(int n){
        if(n==0)
        {
            return 0;
        }else if(n==1){
            return 1;
        }else{

            int FibNm1=CalculateFib(n-1);
            int FibNm2=CalculateFib(n-2);
            int FibN=FibNm1 + FibNm2;
            return FibN;
        }

    }
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in);)
        {
            System.out.println("enter the n:");
            int n = sc.nextInt();
            for(int i=0;i<=n;i++)
            {
                System.out.println("fib of"+i+"="+CalculateFib(i));
            }
        }
        
    }
}
