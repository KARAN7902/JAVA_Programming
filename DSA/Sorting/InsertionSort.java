package DSA.Sorting;

public class InsertionSort {
public static void PrintArray(int arr[]) {
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int a[]={5,8,2,4,9};
        for(int i=1;i<a.length;i++)
        {
            int current =a[i];
            int j=i-1;
            while (j>=0 && current<a[j]) {
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        PrintArray(a);
    }
}
