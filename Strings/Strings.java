package Strings;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // this data type can contain a singl word or " " blank spaces as character or full setence
        // String name ="karan";     
        // String fullName="karan Gaikwad";
        // String sentence ="hi i a am java student";
    // user input string
     try(Scanner sc =new Scanner(System.in);)
      {
        // to take a single word or full line withot spaces we use sc.next();
        // to take input full line with spaces we use sc.nextline();
        String _name = sc.nextLine();

        System.out.println("name :"+_name);
      }
    }
}
