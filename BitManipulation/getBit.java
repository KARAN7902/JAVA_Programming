package BitManipulation;

public class getBit {
  public static void main(String[] args) {
    int n=5;//0101
    int bitMask =1<<2;//0100
    if((bitMask & n)==0)
    {
        System.out.println("the bit is zero at position 2");
    }else{
        System.out.println("the bit is one at position 2");
    }
  }
  }
