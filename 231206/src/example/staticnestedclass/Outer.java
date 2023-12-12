package example.staticnestedclass;

public class Outer {
    static class NestedDemo {
        public void myMethod() {
            System.out.println("This is a method from " + "static nested class");
        }
    }

    public static void main(String[] args) {
        Outer.NestedDemo nested = new Outer.NestedDemo();
        nested.myMethod();
    }
}
