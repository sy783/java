package chap3;

public class Student implements People{

    //one class can implement more than one interface
    public String getName(){
        return "John Doe";

    }

    public int getAge(){
        return 40;
    }

    public static void main(String[] args) {
        Student stu = new Student();
        System.out.printf( "Name = %s Age = %d", stu.getName(),
                stu.getAge());
    }
}
