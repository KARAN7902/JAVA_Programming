public class half_butterfly_pattern {
    public static void main(String[] args) {
        // for n rows 
        // take spaces = 2*(n-i)
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            //for spaces 
            // we can also take for spaces 8-(i+i)
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            for(int k=1;k<=2*(n-i);k++)
            {
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    
}
