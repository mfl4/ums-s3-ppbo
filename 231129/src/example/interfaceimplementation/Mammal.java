package example.interfaceimplementation;

import example.interfacedeclaration.AnimalActivity;

public class Mammal implements AnimalActivity {
    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }
    
    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.eat();
        m.travel();
    }
}
