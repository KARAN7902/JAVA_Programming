public class h_rhombus {
   
    public static void main(String[] args) {
        int n = 4;
        for(int i =1; i<=n ;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("  ");
            }
            for(int k =1; k<=n ;k++)
            {
                if(k==n || i==n || k==1 || i==1)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
/*   // hollow rhombus
      * * * * 
    *     * 
  *     * 
* * * *  
 */