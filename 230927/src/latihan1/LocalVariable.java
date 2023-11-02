package latihan1;

public class LocalVariable {

    public void hitungUsia () {
        int usia = 0;
        int tahunSekarang = 2023;
        int tahunLahir = 2003;
        
        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya: " + usia);
    }

    void beratBadan () {
        int beratLahir = 3;

        System.out.println(beratLahir + (usia/2));
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();
        localVariable.hitungUsia();
        localVariable.beratBadan();
    }
}