package chap2;

public class Conditional2 {
    public static void main(String[] args) {
        int x = 50;
        String result = "";
        if(x > 100)
            result = "> 100";
        else
            result = "< 100";

        System.out.println("Result = " + result);

        //ternary operator    true      false
        result = (x > 100)? "> 100" : "< 100";
        System.out.println("Result2 = " + result);
    }
}
