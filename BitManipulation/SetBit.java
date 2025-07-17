package BitManipulation;

public class SetBit {
public static void main(String[] args) {
    int n=5;//0101
    int bitMask =1<<1;//0010

   int newNumber = bitMask | n;
   //0111
   System.out.println(newNumber);     
}    
}
