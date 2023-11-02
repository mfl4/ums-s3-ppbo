package latihan441b;

import latihan441.PublicModifier;

public class Main {
    public static void main(String[] args) {
        PublicModifier pblm = new PublicModifier();
        pblm.a = 3;
        pblm.b = 4;
        pblm.c = 10;
        
        System.out.println(pblm.a);
        System.out.println(pblm.b);
        System.out.println(pblm.c);
        pblm.kali();
        pblm.tambah();
        pblm.kurang();
        pblm.bagi();
        pblm.rata_rata();
    }
}
