package chap4;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        new MapDemo().demo1();

    }

    public void demo1(){
        Map map = new HashMap();
        map.put("name", "Derek");
        map.put("salary", 50_000.00f);
        map.put("age", 40);

        System.out.println("Name = " + map.get("name"));

        Set keys = map.keySet();

        Iterator iterator = keys.iterator();

        while(iterator.hasNext()){

            String key = (String)iterator.next();
            System.out.printf("%s = %s", key, map.get(key));

        }


    }
}
