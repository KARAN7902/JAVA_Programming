import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        StringBuilder email  =new StringBuilder();
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the email id:");
        email.append(sc.next()); 
        System.out.println(email);
        String UserName = "";
        sc.close();
        for(int i =0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                UserName+=email.substring(0,i);
            }
        }
        System.out.println(UserName);
    }
    
}
