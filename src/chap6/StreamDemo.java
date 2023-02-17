package chap6;

import java.sql.SQLOutput;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        //filter
        Stream.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10)
                .filter((i) -> i > 3)
                .forEach(System.out::println);

        //map
        Stream.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10)
                .map((no) -> no > 3)
                .forEach ((i) -> System.out.println(i));

        Stream.of(1, 2, 3, 4, 5, 6, 7 ,8 , 9, 10)
                .map((no) -> {
                    return no > 3;
                })
                .forEach((i) -> System.out.println(i));

        // sorted
        Stream.of(1, 3, 2, 4, 8, 6, 7 ,5 , 9, 10)
                .sorted()
                .forEach((i) -> System.out.println(i));

        // sorted - descending order
        Stream.of(1, 3, 2, 4, 8, 6, 7 ,5 , 9, 10)
                .sorted((no1, no2) -> no2.compareTo(no1))
                .forEach((i) -> System.out.println(i));


        //reduce - aggregate value
        int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(0, (no1, no2) -> no1+ no2);
        System.out.println("Sum = " + sum);
    }
}
