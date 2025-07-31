package BitManipulation;

public class Countones {
    public static int cout1s(int n){
        int count =0;
        while (n!=0) {
             count+=n&1;
             n>>=1;            
        }
        return count;
    }
    public static void main(String[] args) {
        int n=951;
       System.out.printf("no of one's in %d are %d\n",n,cout1s(n));
       // we can also use the built in function to  count no of one's in the number 
       //Integer.bitCount(n); 
      int count1 =Integer.bitCount(n);
     System.out.println(count1);
     System.out.println(Integer.toBinaryString(n));
    }
    
}

