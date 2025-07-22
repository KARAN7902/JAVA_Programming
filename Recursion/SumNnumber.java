package Recursion;

public class SumNnumber {
    public static void PrintNaturalnum(int i,int n,int sum)
    {
           
          if(n==i){
            sum+=i;
            System.out.println(sum);
            return;
          }
             sum =sum+i;
            //  System.out.println(sum);
             PrintNaturalnum(i+1,n,sum);
           
    

    }

    public static int PrintFact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact_nm1 =PrintFact(n-1);
        int Fact_n = n*fact_nm1;
        return Fact_n;

    }
    public static void main(String[] args) {
        int n=5;
         int sum =0;
        PrintNaturalnum(1,n,sum);
        PrintFact(n);
        System.out.println("factorial of "+n+" is "+PrintFact(n));

    }
}
