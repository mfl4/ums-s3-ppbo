package latihan421b;
import latihan421.DefaultModifier;

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
