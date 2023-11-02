package latihan421;

public class Main {
    public static void main(String[] args) {
        DefaultModifier dm = new DefaultModifier();
        dm.a = 2;
        dm.b = 3;

        System.out.println(dm.a);
        System.out.println(dm.b);
        dm.jumlah();
    }
}
