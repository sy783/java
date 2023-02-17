package chap2;

import java.sql.SQLOutput;

public class Conditional {
    public static void main(String[] args) {
        float credit = 70000.00f;
        if(credit >= 60000.00f){
            System.out.println("Enough credit");
        }else {
            System.out.println("Not enough credit");
        }

        if(true){
            System.out.println("Always true");
        }

        int num = 100;
        if(num < 10){
            System.out.println("< 10");
        } else if (num >= 10 && num < 50) {
            System.out.println("between 10 and 50");

        }else{
            System.out.println("Greater than 50");
        }

        String name = "John";

        if(name.equals("John")){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
