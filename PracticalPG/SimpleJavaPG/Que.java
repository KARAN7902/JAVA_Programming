package PracticalPG.SimpleJavaPG;

public class Que {
    public static boolean IsPrime(int n) {
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(i%2==0){
                return false;
            }
        }

        return true;
        
    }
    

    public static void main(String[] args) {
        int arr[] = new int[args.length];
        for(int i=0;i<args.length;i++){
            arr[i]=Integer.parseInt(args[i]);
        }
        for(int j = 0;j<arr.length;j++){
               if(IsPrime(arr[j])){
                System.out.println(arr[j]);
               }
        }
    }
}
