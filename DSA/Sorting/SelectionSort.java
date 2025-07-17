package DSA.Sorting;
;

public class SelectionSort {
    public static void PrintArray(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int a[]={6,3,8,2,9};
         for(int j=0;j<a.length-1;j++)
         {
            int smallest =j;
            for(int i=j+1;i<a.length;i++)
            {
                if(a[smallest]>a[i])
                {
                    smallest =i;
                }
            }

                    int temp =a[smallest];
            a[smallest]=a[j];
            a[j]=temp;

         }
     PrintArray(a);
 
    }   
}
