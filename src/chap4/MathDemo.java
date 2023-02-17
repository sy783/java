package chap4;

public class MathDemo {

    public static void main(String[] args) {
        double rand = Math.random();
        System.out.println("random = " + rand);

        //how to generate random num between 0 and 100
        // (int) = casting - convert from one type of number to other type of number
        int num = (int) (Math.random() * 100);
        System.out.println("random = " + num);
    }
}
