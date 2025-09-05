package PracticalPG.Array_of_objects_and_packages;

import java.util.*;

class Employee$ {
    int id;
    String name;
    String dname;
    int salary;
    static int count =0;

    Employee$(int id, String name, String dname, int sal) {
       this.dname=dname;
       this.id=id;
       this.name=name;
       this.salary=sal;
       count++;
    }
    void display(){
        System.out.println("ID :\t"+id+"\tName :\t"+name+"\tDname :\t"+dname+"\tsalry :\t"+salary);
    }
  static  int count(){
        return count;
    }
}

public class problem5 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        Employee$[] Emp = new Employee$[3];
        for(int i= 0; i< 3;i++){
            System.out.println("enter the id");
            int id = sc.nextInt();
            System.out.println("enter the name:");
            String name = sc.next();
            System.out.println("enter the Designation :");
            String des =sc.next();
            System.out.println("enter the Contact No :");
            int sal = sc.nextInt();
            Emp[i]= new Employee$(id, name, des, sal);
        }
        for(int i=0;i<3;i++){
           Emp[i].display();
        }
        System.out.println("total obj created :\t"+Employee$.count());
        sc.close();
        
        
    }

}
