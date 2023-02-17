package chap2;

public class Loop1 {
    public static void main(String[] args) {

        // loop #1
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // i+= 2 equals to i = i + 2
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);
        }

        //loop #2 special for array
        String[] name = {"John", "Doe", "Labu"};

        //for each
        for (String pname : name) {
            System.out.println(pname);
        }

        // loop #3 while loop
        int num = 1;

        while (num < 5) {
            System.out.println("Number = " + num);
            num++;
        }

        num = 1;

        while (num < 5) {
            System.out.println("Number = " + num);
            if (num == 3) {
                break; //exit loop
            }
            num++;
        }

        num = 1;

        while (num < 10) {

            if (num % 2 == 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;

        }

        // Loop #4 do..while
        // while vs do while do..while at least run one time (minimal)
        num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num < 5);
    }
}
