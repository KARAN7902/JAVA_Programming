package BitManipulation;

public class Countones {

     public static int Consecative(int n){
        String str =Integer.toBinaryString(n);
        int count =0;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='1'){
                count++;
                i++;
            }else{
                count=0;
                i++;
            }
        }
      return count;
     }

    public static int cout1s(int n){
        int count =0;
        while (n!=0) {
             count+=n&1;
             n>>=1;            
        }
        return count;
    }
    public static void main(String[] args) {
        int n=5;
    //    System.out.printf("no of one's in %d are %d\n",n,cout1s(n));
       // we can also use the built in function to  count no of one's in the number 
       //Integer.bitCount(n); 
    //   int count1 =Integer.bitCount(n);
    //  System.out.println(count1);
     System.out.println(Integer.toBinaryString(n));
     System.out.println(Consecative(n));
    }
    
}

