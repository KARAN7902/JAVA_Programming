package Recursion;

public class SubSequence {

    public static void SubStrings(String str,int index,String NewString){
       if(index==str.length())
       {
        System.out.println(NewString);
        return;
       }
       char CurrChar =str.charAt(index);
        //to be in the string 
        SubStrings(str, index+1, NewString+CurrChar);
        // not to be in the String
        SubStrings(str, index+1, NewString);
    }

    public static void main(String[] args) {
        String str ="abc";
        SubStrings(str, 0,"");
        
    }
    
}
