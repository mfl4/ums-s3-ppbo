package latihan2;

public class LocalVariable {
    int usia = 0;

    public void hitungUsia () {
        int tahunSekarang = 2023;
        int tahunLahir = 2003;
        
        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia saya: " + usia);
    }

    void beratBadan () {
        double beratLahir = 3.2;
        double beratBadan  = beratLahir + (usia/2);

        System.out.println("Berat badan : " + beratBadan);
    }

    
}