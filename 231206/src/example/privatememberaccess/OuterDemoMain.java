package example.privatememberaccess;

public class OuterDemoMain {
    public static void main(String[] args) {
        // Membuat Object OuterDemo
        OuterDemo2 outer = new OuterDemo2();

        // Membuat Object InnerDemo
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
