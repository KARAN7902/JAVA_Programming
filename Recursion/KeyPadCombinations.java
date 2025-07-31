package Recursion;

public class KeyPadCombinations {
    public static String Kaypad[] ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void PrintCombinations(String str,int index,String Combinations){
        if(index==str.length()){
            System.out.println(Combinations);
            return;
        }
     char CurrentChar = str.charAt(index);// current char =2
     String Mapping =Kaypad[CurrentChar-'0'];
     //to get the keypad combination by CurrentChar -'0' ex 2-0 =2 then the keypad[2]="def";
     for(int i=0;i<Mapping.length();i++){
        // here we are adding the characters one by one to the combinatons 
        PrintCombinations(str, index+1, Combinations+Mapping.charAt(i));
     }
    }

    public static void main(String[] args) {
        String str ="239";
        PrintCombinations(str, 0, "");
     }
    
}
