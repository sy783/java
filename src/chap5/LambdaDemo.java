package chap5;

public class LambdaDemo {
    public static void main(String[] args) {

        //don't get parameter
        Message msg = () -> System.out.println("Hello Lambda");
        msg.printable();

        //receive parameter
        Alert beware = (name) -> "Danger " + name;
        String txt = beware.alert("Harry");
        System.out.println(txt);
    }
}

// this is annotation
@FunctionalInterface //decorator
interface Message {
    public void printable();

}

interface Alert {
    public String alert(String str);
}