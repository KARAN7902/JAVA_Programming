package DSA.Sorting;

public class BubbleSort {
    public static void PrintArray(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        
        int array[]={600,3,9,1,90};
        for(int i=0;i <array.length-1;i++)
        {
             for(int j=0;j<array.length-i-1;j++)
             {
                if(array[j]>array[j+1])
                {
                    int temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
             }
        }  
        PrintArray(array);      
    }
}
