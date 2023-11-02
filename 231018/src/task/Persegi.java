package task;

public class Persegi extends BangunDatar {
    double sisi = 2;

    void hitungLuas(){
        luas = sisi * sisi;
        System.out.println(luas);
    }
    void hitungKeliling(){
        keliling = 4 * sisi;
        System.out.println(keliling);
    }
}
