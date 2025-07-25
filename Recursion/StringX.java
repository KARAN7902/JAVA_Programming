package Recursion;

public class StringX {
    static String str1="";
    static String str2="";
    public static void XStringAtEnd(String str ,int i){
        if(i==str.length()){
            System.out.println(str1+str2);
            return;
        }
        if(str.charAt(i)=='x'){
            // if the x is present int the String
            str2+=str.charAt(i); 
        }else{
            str1+=str.charAt(i);
        }
        XStringAtEnd(str, i+1);
    }
    public static void main(String[] args) {
        String str ="xxhxhxx";
        XStringAtEnd(str, 0);
    }
    
}
