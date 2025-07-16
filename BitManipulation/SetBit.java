package BitManipulation;

public class SetBit {
public static void main(String[] args) {
    int n=5;
    int bitMask =1<<1;

   int newNumber = bitMask | n;
   System.out.println(newNumber);     
}    
}
