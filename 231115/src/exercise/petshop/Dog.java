package exercise.petshop;

public class Dog extends Pet{
    public String behavior(){
        return "Menyukai Daging dan Tulang";
    }
    public void makeSound(){
        System.out.println("Guk..Guk..Guk..");
    }
}
