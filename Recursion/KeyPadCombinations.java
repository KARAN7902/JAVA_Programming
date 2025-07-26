package Recursion;

public class KeyPadCombinations {
    public static String Kaypad[] ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintCombinations(String str,int index,String Combinations){
        if(index==str.length()){
            System.out.println(Combinations);
            return;
        }
     char CurrentChar = str.charAt(index);
     String Mapping =Kaypad[CurrentChar-'0'];
     for(int i=0;i<Mapping.length();i++){
        PrintCombinations(str, index+1, Combinations+Mapping.charAt(i));
     }
    }

    public static void main(String[] args) {
        String str ="23";
        PrintCombinations(str, 0, "");
     }
    
}
