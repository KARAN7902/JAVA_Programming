public class p_N_pyramid {
//palindromic number pyramid
public static void main(String[] args)
{
    int n=4;
    // outer loop for n rows
    for(int i=1;i<=n;i++)
    {
        // 1) inner loop for spaces
        for(int j= 1;j<=n-i;j++)
        {
            System.out.print("  ");
        }
        // 2) inner loop for print the numbers in reverse order
        for(int k=i;k>=1;k--)
        {
            System.out.print(k+" ");
        }
        // 3) inner loop for print the numbers 
         for(int k=2;k<=i;k++)
        {
            System.out.print(k+" ");
        }
        // for next line
        System.out.println();
    }
}    
}

/*    1 
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/