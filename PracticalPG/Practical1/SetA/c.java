package PracticalPG.Practical1.SetA;
import java.util.*;
public class c {
    // public static int isarmstrong(int n)
    // {
    //  // n=153;
    //   String str =Integer.toString(n);
    //   int length =str.length();
    //   //int l=3;
    //     int resuilt =0;
    //     while (n>0) {

    //         int digit =n%10;
    //         resuilt +=Math.pow(digit,length);
    //         n/=10;
    //     }
    //     return resuilt;
    // }
    // public static void main(String[] args) {
    //      Scanner scan = new Scanner(System.in);
    //      int n =scan.nextInt();
    //      int resuilt =isarmstrong(n);
    //      if(resuilt == n)
    //      {
    //         System.out.println(n+" it is s armstrong number");
    //      }else{
    //         System.out.println(n+" it is not a armstrong number");

    //      }

    public static int CalFact(int n)
    {
        int resuilt=1;
        for(int i=n;i>=1;i--)
        {
        resuilt *=i;
        }
        return resuilt;
    }
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n =scan.nextInt();
System.out.println("factorial of "+n+" is "+CalFact(n));
     scan.close(); 
}
      
    }

    

