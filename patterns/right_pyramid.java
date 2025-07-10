package JAVA.patterns;

public class right_pyramid {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        {
            for(int j=1;j<=10-i;j++)
            {
                // to print the spaces
                System.out.print(" ");
            }
            // to print the * 's
            for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }
    
}
