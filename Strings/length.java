import java.util.Scanner;
public class length {
public static void main(String[] args) {
    int n=5;
    String Array[] = new String[n];
    System.out.println("enter the Strings:");
    Scanner sc =new Scanner(System.in);
    for(int i=0;i<Array.length;i++)
    {
        Array[i]=sc.nextLine();
    }
    sc.close();
     int resuilt=0;
     for(int j=0;j<Array.length;j++)
     {
        resuilt+=Array[j].length();
     }
     System.out.println("the combined length is: "+resuilt);
}   
   
}
