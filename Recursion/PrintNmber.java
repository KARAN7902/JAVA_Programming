package Recursion;

public class PrintNmber {
    public static void Printnmber(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        Printnmber(n+1);
    }
 public static void main(String[] args) {
     int n=1;
     Printnmber(n);
 }    
}
