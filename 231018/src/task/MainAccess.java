package task;

public class MainAccess {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        SegiTigaSamaKaki stsk = new SegiTigaSamaKaki();
        
        System.out.println(p.sisi);
        p.hitungLuas();
        p.hitungKeliling();

        stsk.hitungLuas();
    }
}
