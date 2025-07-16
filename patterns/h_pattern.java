public class h_pattern {
    public static void main(String[] args) {
        
        int n=10;
        for(int i=1;i<=n/2-1;i++)
        {

            //1)inner loop for left spaces
            for(int j=n/2;j>=i;j--)
            {
                System.out.print("  ");
             }
           ////2)inner loop for left stars
             for(int k =1 ; k<=i*2;k++)
             {
                System.out.print("* ");
             }
           ////3)inner loop for middle spaces
             for(int l=n/2-1;l>=i;l--)
             {
                System.out.print("  ");
             }
             ////4)inner loop for right spaces
             for(int j=n/2-1;j>=i;j--)
            {
                System.out.print("  ");
             }
           //5)inner loop for right  stars
             for(int k =1 ; k<=i*2;k++)
             {
                System.out.print("* ");
             }
        //    ////6)inner loop for  spaces
        //      for(int l=n/2-1;l>=i;l--)
        //      {
        //         System.out.print("  ");
        //      }
             System.out.println();
    }
    for(int i=1;i<=n;i++)
    {
        // inner loop for lower left spaces
        for(int j=1;j<=i;j++)
        {
            System.out.print("  ");
        }
       // // for left stars
        for(int k=n;k>=i;k--)
        {
            System.out.print("* ");
        } 
        // inner loop for right stars
        for(int l=n;l>=i;l--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
}
}
/*       heart pattern
          * *                 * * 
        * * * *             * * * *
      * * * * * *         * * * * * *
    * * * * * * * *     * * * * * * * *
  * * * * * * * * * * * * * * * * * * * *
    * * * * * * * * * * * * * * * * * *
      * * * * * * * * * * * * * * * *
        * * * * * * * * * * * * * *
          * * * * * * * * * * * *
            * * * * * * * * * *
              * * * * * * * *
                * * * * * *
                  * * * *
                    * *
 */