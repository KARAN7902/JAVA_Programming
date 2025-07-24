package Recursion;

public class FirstandLastOccurance {
    public static int First = -1;
    public static int Last = -1;

    public static void FirstandLastOccurance1(String str, char element, int n) {
        if (n == str.length()) {
            System.out.println(First);
            System.out.println(Last);
            return;
        }
        char CurrChar = str.charAt(n);
        if (CurrChar == element) {
            if (First == -1) {
                First = n;
            } else {
                Last = n;
            }
        }
        FirstandLastOccurance1(str, element, n+1);
    }
    public static void main(String[] args) {
        String str ="abbgdsdsaaah";
        FirstandLastOccurance1(str,'a',0);
    }

}
