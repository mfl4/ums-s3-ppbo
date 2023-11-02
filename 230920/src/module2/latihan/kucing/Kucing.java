package module2.latihan.kucing;

public class Kucing {
    int umur;
    String warnaBulu;

    void meong() {
        System.out.println("Meong... Meong... Meong...");
    }
    void umur(int umur) {
        this.umur = umur;
        System.out.println("Umur kucing ini adalah " + umur + " tahun");
    }
}
