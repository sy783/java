package chap3;

public class Animal {

    int legs;
    String name;
    String species;

    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }


    // final here means cannot override
    @Deprecated
    final public int getLegs(){
        return legs;
    }
}
