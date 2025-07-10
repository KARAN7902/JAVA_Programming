

import java.util.*;
// for getting user inputs above library is important
public class area {
    
  public static void main(String[] args){
   try( Scanner sc= new Scanner(System.in);){
    //above statement is use to get user input
    int r= sc.nextInt();
    // sc.nextInt(); this function get input from user and store it into the variable r
    double pi=3.142;
    double area=pi*(r*r);
    System.out.println(area); 
    // this statement is used to print the value or to show the output by passing the  variable name 
    // through this we can display the string in '' or "" quotes
    //

  }
}
}