package chap7;

public class StringDemo {
    public static void main(String[] args) {
        String str = "my name is azman";
        String str2 = str.toUpperCase();

        //string is immutable = cannot change
        System.out.println(str);
        System.out.println(str2);

        String str3 = str.substring(11,16);
        System.out.printf("str1: %s, str2: %s, str3: %s \n", str, str2, str3);

        //concat
        String s1 = "my name ";
        String s2 = "azman";
        String s3 = s1.concat(s2);

        System.out.println(s3);

        //search
        String sentence = "Helo Java Reader, how are you";
        boolean isAvail = sentence.toLowerCase().contains("java");

        if(isAvail)
            System.out.println("Yes");
        else
            System.out.println("No");

        //replace
        String replaced = sentence.replace("Java", "Jawa");
        System.out.println(replaced);

        //convert string to array
        String[] toArray = sentence.split("\\s+");
        for(String word: toArray){
            System.out.println(word);
        }
    }
}
