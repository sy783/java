package chap3;

/**
 * this is a program to demonstrate the usage of constructor
 */

public class Computer {

    //properties /fields/ variable
    double cpuSpeed;

    //constructor
    Computer(){

        cpuSpeed = 3.4;
        System.out.println("im in constructor");
    }

    // this is also constructor, can change the type
    Computer(double speed){

        cpuSpeed = speed;

    }

    void setCpuSpeed(double cpuSpeed){
        this.cpuSpeed = cpuSpeed;
    }

    public static void main(String[] args) {

        Computer computer1 = new Computer(); //instantiate a object
        computer1.cpuSpeed = 2.5;
        Computer computer2  = new Computer();
        System.out.println("Comp 1 CPU Speed= " + computer1.cpuSpeed);
        System.out.println("Comp 2 CPU Speed = " + computer2.cpuSpeed);

        computer2.setCpuSpeed(4.0);
        System.out.println("Comp2 CPU Speed = " + computer2.cpuSpeed);

        Computer comp3 = new Computer(8.0);
        System.out.println("Comp3 CPU Speed = " + comp3.cpuSpeed);

    }
}
