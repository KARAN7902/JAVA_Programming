package BitManipulation;
// import java.util.*;
public class BinaryToDecimal {
    public static String DecimaltoBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static int BinarytoDecimal(String binary){
        return Integer.parseInt(binary, 2);
        // radix can be 2 for binary  8 for octal 16 for hexal
    }
    public static void main(String[] args) {
        int n =25;
        String binary =DecimaltoBinary(n);
        System.out.println("the Binary no of  "+n+" is "+DecimaltoBinary(n));
        System.out.println("the Decimal no of  "+binary+"  is "+BinarytoDecimal(binary));

    }
    
}
