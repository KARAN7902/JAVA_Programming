package JAVA.hw_problems;
import java.util.Scanner;
public class p6 {
   public static void main(String[] args) {
    try(Scanner sc =new Scanner(System.in);)
    {
        int ch;
        do{
            System.out.println("enter 1 to take marks from student and 0 for end program");
             ch= sc.nextInt();
             if(ch==1){
                 System.out.println("enter the markas of student(0 to 100) ");
                 int marks=sc.nextInt();
                if(marks >=90)
                {
                    System.out.println("This is Good");
                }else if( 60>= marks && marks <=89 ){
                    System.out.println("This is also Good");
    
                }else if(0>=marks && marks <= 59)
                {
                    System.out.println("This is Good as well");
                }
            }else{
                System.out.println("program end");
            }
        }while(ch!=0);
    }
   }
}
