package example.innerclass;

public class OuterDemo {
    private class InnerDemo {
        // inner class
        private void print() {
            System.out.println("This is an inner class method");
        }

        // access inner class methods from outer class methods
        void displayInner() {
            InnerDemo inner = new InnerDemo();
            inner.print();
        }
    }
}
