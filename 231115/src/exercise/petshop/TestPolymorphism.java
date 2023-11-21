package exercise.petshop;

public class TestPolymorphism {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Dog bull = new Dog();

        tom.giveName("TOM");
        System.out.println(tom.callName());
        System.out.println(tom.behavior());
        tom.makeSound();

        bull.giveName("BULL");
        System.out.println(bull.callName());
        System.out.println(bull.behavior());
        bull.makeSound();
    }
}
