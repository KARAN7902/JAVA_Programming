package BitManipulation;

public class ClearBit {
    public static void main(String[] args) {
        int n =5;
        int i=2;// 3rd bit position i =2
        int bitMask =1<<i;
        int notBitmask =~bitMask;
        // not of bitmask
        int newNumber =n&notBitmask;
        System.out.println(newNumber);
    }
    
}
