package exercise.overriding;

class DemoOverriding{
    public static void main(String[] ovr){
        Parentclaz pc = new Parentclaz();
        Childclaz cc = new Childclaz();
        pc.printOut();
        cc.printOut();
        cc.hello();
    }
}