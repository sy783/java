package chap3;

public class Bulldog extends Dog{

    @Override
    public String getName(){
        return "Name:" + name;
    }

    // this is error, cannot override final method
//    public int getLegs(){
//        return 0;
//    }
    public static void main(String[] args) {

        final float PI = 3.14f;
        //PI = 4.0f; //error, cannot change the value
        Bulldog bulldog = new Bulldog();
        bulldog.name = "Jany";
        System.out.println(bulldog.getName());

    }
}
