package PracticalPG.Array_of_objects_and_packages;

import java.util.*;

class Employee {
    int EmpId;
    String Name;
    String Desgnation;
    double salary;

    Employee(int id, String name, String ddes, double sal) {
        this.EmpId = id;
        this.Desgnation = ddes;
        this.Name = name;
        this.salary = sal;
    }

    public String toString() {

        return "Id :\t" + EmpId + "\tName :\t" + Name + "\tDesgnation :\t" + Desgnation + "\tSalary :\t" + salary;
    }

}

public class problem3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Employee[] Emp = new Employee[3];
        for(int i= 0; i< 3;i++){
            System.out.println("enter the id");
            int id = sc.nextInt();
            System.out.println("enter the name:");
            String name = sc.next();
            System.out.println("enter the Designation :");
            String des =sc.next();
            System.out.println("enter the salary :");
            double sal = sc.nextDouble();
            Emp[i]= new Employee(id, name, des, sal);
        }
        for(int i =0;i<3;i++){
            System.out.println(Emp[i].toString());
        }
        sc.close();
    }

}
