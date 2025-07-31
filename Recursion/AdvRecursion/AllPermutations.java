package Recursion.AdvRecursion;

public class AllPermutations {
    public static void PrintAllPermutations(String str ,String Permutations){
        if(str.length()==0){
            System.out.println(Permutations);
            return;
        }
        for(int i=0;i<str.length();i++){
            char CurrentChar =str.charAt(i);
            // i=0; CurrentChar =a 
            // a+b+c
            //permu =a
            String NewString =str.substring(0, i)+str.substring(i+1);
            PrintAllPermutations(NewString, Permutations+CurrentChar);
        }
    }
    public static void main(String[] args) {
        String str="abc";

        PrintAllPermutations(str, "");
    }
}
