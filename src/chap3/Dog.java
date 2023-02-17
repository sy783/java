package chap3;

public class Dog extends Animal{

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.name = "Livvy";
        dog.species = "Poodle";

        System.out.printf("Name: %s, Species: %s",
                dog.getName(), dog.getSpecies());
    }
}
