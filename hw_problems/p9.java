public class p9 {
    public static void main(String[] args) {
        for(int i=1 ;i<=4;i++)
        {
            for(int j=1;j<=i-1;j++)
            {
                System.out.print("  ");
            }
            for(int k=4-i;k>=0;k--)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
