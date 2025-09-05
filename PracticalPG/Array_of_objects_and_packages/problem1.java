package PracticalPG.Array_of_objects_and_packages;

import java.util.*;
class Person{
  protected String P_name;
  private int Adhr_no;
  private String PAN;
  Person(String p_name,int adhr,String Pan){
    this.P_name=p_name;
    this.Adhr_no=adhr;
    this.PAN=Pan;
  }
  void display(int i){
    System.out.println("P_no :\t"+i+"\tPerson Name :\t"+P_name+"\tAddhar No :\t"+Adhr_no+"\tPan No :\t"+PAN);
  }
}

public class problem1 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("How many Persons :");
        int n =sc.nextInt();
        Person[] P = new Person[n];
        for(int  i=0;i<n;i++){
            System.out.println("Enter the Person Name  of P_NO :"+(i+1));
            String name =sc.next();
            System.out.println("Enter the Addhar No :");
            int adhr = sc.nextInt();
            System.out.println("Enter the PAN No :");
            String Pan = sc.next();
            P[i] = new Person(name,adhr,Pan);
        }
        // display the Persons Details
        for(int i =0;i<n;i++){
            P[i].display(i);
        }
        sc.close();
    }
}
