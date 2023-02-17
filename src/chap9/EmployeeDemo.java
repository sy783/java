package chap9;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Harold");

        System.out.println(emp.toString());
    }
}
