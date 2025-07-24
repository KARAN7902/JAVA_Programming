package Recursion;

public class StringREverse {
    public static void StringREverse1(String str,int n){
         if(n==0){
            System.out.print(str.charAt(n));
            return;
         }
        System.out.print(str.charAt(n));
        StringREverse1(str, n-1);
    }

    public static void main(String[] args) {
        String str ="karan";
       int   n =str.length()-1;
       // -1 due to length returns 5 and the index starts from 0
        StringREverse1(str,n);
    }
    
}

