//

public class pasc_triangle {
// the first funtcion to calculate the factorial
    public static int Factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
 // the second function to calculate the binomial coeficient
    public static int pascalsNumber(int n, int k) {
        int Nfact = Factorial(n);
        int Kfact = Factorial(k);
        int Nmkfact = Factorial(n - k);
        int result = Nfact /(Kfact * Nmkfact);
        return result;
    }

    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                // calling pascals function
                System.out.print(pascalsNumber(i-1, k)+" ");
            }
            System.out.println();
        }
    }

}
/* Pascals Triangle
 *  1 
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
 */
