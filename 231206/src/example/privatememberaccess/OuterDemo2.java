package example.privatememberaccess;

public class OuterDemo2 {
    private int num = 175;

    public class Inner_Demo {
        public int getNum() {
            System.out.println("This is the value of the private variable outerDemo");
            return num;
        }
    }
}
