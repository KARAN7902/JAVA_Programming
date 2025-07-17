package BitManipulation;
import java.util.*;
public class BitUpdated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int n=5;//0101;
     int pos =2;
     System.out.print("enter (1 or 0):");
     int oper =sc.nextInt();
     int bitMask =1<<pos;
     if(oper==1)
     {
        int newNumber1 = bitMask | n;
        System.out.println(newNumber1);
     }else{
        int notBitMask=~bitMask;
        int newNumber = notBitMask & n;
        System.out.println(newNumber);
     }
     sc.close();
    }
    
}
