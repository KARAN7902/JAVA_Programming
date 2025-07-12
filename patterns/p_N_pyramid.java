public class p_N_pyramid {
//palindromic number pyramid
public static void main(String[] args)
{
    for(int i=1;i<=4;i++)
    {
        for(int j= 1;j<=4-i;j++)
        {
            System.out.print("  ");
        }
        for(int k=i;k>=1;k--)
        {
            System.out.print(k+" ");
        }
         for(int k=2;k<=i;k++)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
}    
}

/*    1 
    2 1 2
  3 2 1 2 3
4 3 2 1 2 3 4
*/