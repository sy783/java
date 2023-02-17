package chap8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REDemo2 {
    public static void main(String[] args) {

        new REDemo2().validateIc("123456-12-1234"); //valid
        new REDemo2().validateIc("1234"); //invalid
        new REDemo2().validateIc("123456-10-12346777"); //valid
    }

    //match IC No pattern
    // 1. 12 digit, 6 digit, - 2 digit - 4 digit

    public void validateIc(String ic){
        Pattern pattern = Pattern.compile("[0-9]{6}-10-[0-9]{4}$");
        Matcher matcher = pattern.matcher(ic);
        if(matcher.find()){
            System.out.println("IC is valid");
        }else{
            System.out.println("IC is not valid");
        }
    }
}
