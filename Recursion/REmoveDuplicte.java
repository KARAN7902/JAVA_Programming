package Recursion;

public class REmoveDuplicte {
    static boolean a[] =new boolean[26];


    public static void RemoveDuplicates(String str,int index,String NewString){
        if(index == str.length()){
            System.out.println(NewString);
            return;
        }
        char CurrentChar =str.charAt(index);
        if(a[CurrentChar -'a' ]==true){
            // here the logic is when we substract a-a =0 & b-a =1
            RemoveDuplicates(str, index+1, NewString);
        }else{
            
         NewString +=str.charAt(index);
         a[CurrentChar-'a']=true;
         //this removes the duplicate in the string
        RemoveDuplicates(str, index+1, NewString);
        }
    
    }
    public static void main(String[] args) {
        String str="karakanng";
        RemoveDuplicates(str, 0,"");
    }

    
}
