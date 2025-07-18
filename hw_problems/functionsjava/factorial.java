package functionsjava;

public class factorial {
    public static int calFactorial(int n)
    {
        int fact =1;
        for(int i=n;i>=1;i--)
        {
         fact= i*fact;
        }
        return fact;
    }
    public static void main(String[] args) {
        int n =3;
        int fact = calFactorial(n);
        System.out.println(fact);
    }
    
}
