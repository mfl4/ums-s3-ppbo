package module2.latihan.kucing;

public class KucingMain {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();

        kucing.warnaBulu = "oyen";
        System.out.println("Warna bulu kucing ini " + kucing.warnaBulu);
        kucing.umur(2);
        kucing.meong();

        System.out.println("code by MFL4 - L200220277\n");
    }
}
