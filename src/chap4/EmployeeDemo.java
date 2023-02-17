package chap4;

import java.util.ArrayList;

public class EmployeeDemo {

    public static void main(String[] args) {

        ArrayList<Employee> emp = new ArrayList<Employee>();

        Employee emp1 = new Employee("Haley", 2600.80f);
        Employee emp2 = new Employee("Ron", 2689.60f);

        emp.add(emp1);
        emp.add(emp2);

        for(Employee employees: emp){
            System.out.printf("Name: %s, Salary: %.2f \n", employees.name, employees.salary);
        }
    }
}
