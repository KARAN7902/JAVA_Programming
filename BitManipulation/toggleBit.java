package BitManipulation;

public class toggleBit {
    public static int togglebit(int n,int pos){
        int bitMask =1<<pos;
        //1010 
        //0100
        //1110
        int operation =n | bitMask;
        return operation;
    }
    public static void main(String[] args) {
        int n=10; //1010
        int pos =2; //
       System.out.println(togglebit(n, pos));
    }
    
}
