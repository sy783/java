package chap5;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemo2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John Doe");
        list.add("Yasmin");
        list.add("Jennie");
        list.add("Harley");
        list.add("Livvy");

        list.forEach((name) -> System.out.println(name));

    }
}
