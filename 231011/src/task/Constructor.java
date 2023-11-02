package task;

public class Constructor {
    String name;
    public Constructor() {
        System.out.println("Helloo world");
    }

    public Constructor(String name) {
        this.name = name;

        System.out.println("Hello my name is " + name);
    }
}
