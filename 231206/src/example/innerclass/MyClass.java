package example.innerclass;

public class MyClass {
    public static void main(String[] args) {
        // membuat object outer class
        OuterDemo outer = new OuterDemo();

        // mengakses method outer class
        outer.displayInner();
    }
}
