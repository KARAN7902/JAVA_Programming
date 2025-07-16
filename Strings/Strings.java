//package Strings;

// import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // this data type can contain a singl word or " " blank spaces as character or
        // full setence
        // String name ="karan";
        // String fullName="karan Gaikwad";
        // String sentence ="hi i a am java student";
        // ** user input string
        // try(Scanner sc =new Scanner(System.in);)
        // {
        // // to take a single word or full line withot spaces we use sc.next();
        // // to take input full line with spaces we use sc.nextline();
        // String _name = sc.nextLine();
        // System.out.println("name :"+_name);
        // }
        // **String concatenation
        // using + operator add the both strings

        // ** string length
        // String nme = "karan";
        // System.out.println(nme.length());

        // ** substring
        // String name ="karan Gaikwad";
        // // requires substring(start index,end index);
        // String lastName =name.substring(6);
        // System.out.println(lastName);

        // acess characters one by one

        String name = "karan";
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
        /* out put
         * k
         * a
         * r
         * a
         * n
         */
        // String compare compareTo() function

        // String name1="karan";
        // String name2="karan1";
        // if(name1.compareTo(name2)==0)
        // {
        //     System.out.println("string are equal");
        // }else{
        //     System.out.println("string are  not equal");
        // }

        // String name ="karan";
        // for(int i=name.length()-1;i>=0;i--)
        // {
        //     System.out.print(name.charAt(i));
        // }
    }
}
