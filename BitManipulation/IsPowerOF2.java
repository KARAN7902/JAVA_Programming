package BitManipulation;

public class IsPowerOF2 {
    public static boolean ispowerof2(int n) {
        return (n > 0 && (n & (n - 1)) == 0);
    }
    public static void main(String[] args) {
        int n=64;
        System.out.println(n+" is power of 2? "+ispowerof2(n));
    }

}
