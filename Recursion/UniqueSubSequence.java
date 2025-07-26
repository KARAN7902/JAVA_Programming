
package Recursion;
import java.util.HashSet;
public class UniqueSubSequence {

    public static void UniqueSubSequence1(int index,String str,String NewString,HashSet<String>Set){
         if(index ==str.length()){
            if(Set.contains(NewString)){
                // checks the New string is present in the set or not
                 return;
            }else{
                // if not print it and add it into  the set
                System.out.println(NewString);
                Set.add(NewString);
                return;
            }
         }
         char CurentChar =str.charAt(index);
         UniqueSubSequence1(index+1, str, NewString+CurentChar, Set);
         UniqueSubSequence1(index+1, str, NewString, Set);
    }
   public static void main(String[] args) {
     String str ="aa";
     HashSet <String> set =new HashSet<>();
     // declaration of the hash set
     UniqueSubSequence1(0, str, "",set);
   }    
}
