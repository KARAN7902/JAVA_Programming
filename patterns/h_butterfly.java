public class h_butterfly {
    public static void main(String[] args) {
        int n = 4;
        // upper body
        for (int i = 1; i <= n; i++) {
            // for left hollo triangle
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // for spaces between two triangle
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }
            // for right triangle
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // lower body
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= 2 * (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

}
