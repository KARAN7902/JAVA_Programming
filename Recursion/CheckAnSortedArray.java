package Recursion;

public class CheckAnSortedArray {

    public static boolean isSortedArray(int arr[],int index){
        if(index ==arr.length-1){
            // when we reach the final index of array then the array is sorted
            return true;
        }
        if(arr[index] < arr[index+1]){
            // if a[0]< a[1] then call the function with index+1
         return isSortedArray(arr, index+1);
        }
        else{
            // if not then the array is not sorted
            return false;
        }

    }
    public static void main(String[] args) {
      int arr[]={1,5,3,4,5};
      System.out.println("The given array is sorted ?"+isSortedArray(arr, 0));

    }
    
}
