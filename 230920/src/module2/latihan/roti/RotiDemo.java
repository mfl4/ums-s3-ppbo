package module2.latihan.roti;

public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        Roti roti2 = new Roti();
        Roti roti3 = new Roti();
        Roti roti4 = new Roti();

        
        System.out.println("Roti 1");
        roti.beriWarna("Merah");
        roti.beriRasa("Red Velvet");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();
        System.out.print("\n");
        
        System.out.println("Roti 2");
        roti2.beriWarna("Biru");
        roti2.beriRasa("Bubblegum");
        roti2.timbangBerat(20);
        roti2.hargaJual(6000);
        roti2.infoRoti();
        System.out.print("\n");
        System.out.println("code by MFL4 - L200220277\n");
        
        System.out.println("Roti 3");
        roti3.beriWarna("Kuning");
        roti3.beriRasa("Kunyit");
        roti3.timbangBerat(40);
        roti3.hargaJual(6000);
        roti3.infoRoti();
        System.out.print("\n");
        
        System.out.println("Roti 4");
        roti4.beriWarna("Hitam");
        roti4.beriRasa("Coal");
        roti4.timbangBerat(50);
        roti4.hargaJual(6000);
        roti4.infoRoti();
    }
}
