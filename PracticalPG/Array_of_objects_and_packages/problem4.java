package PracticalPG.Array_of_objects_and_packages;
// package PracticalPG.Array_of_objects_and_packages;

import java.util.*;

class Employee1 {
    int EmpId;
    String Name;
    String Desgnation;
    double salary;

    Employee1(int id, String name, String ddes, double sal) {
        this.EmpId = id;
        this.Desgnation = ddes;
        this.Name = name;
        this.salary = sal;
    }

    public String toString() {

        return "Id :\t" + EmpId + "\tName :\t" + Name + "\tDesgnation :\t" + Desgnation + "\tContact No :\t" + salary;
    }

}

public class problem4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Employee1[] Emp = new Employee1[3];
        for(int i= 0; i< 3;i++){
            System.out.println("enter the id");
            int id = sc.nextInt();
            System.out.println("enter the name:");
            String name = sc.next();
            System.out.println("enter the Designation :");
            String des =sc.next();
            System.out.println("enter the Contact No :");
            double sal = sc.nextDouble();
            Emp[i]= new Employee1(id, name, des, sal);
        }
        System.out.println("enter the contact no to search the emp");
        int cont =sc.nextInt();
        for(int i =0;i<3;i++){
            if(Emp[i].salary==cont)
            System.out.println(Emp[i].toString());
        }
        sc.close();
    }

}
