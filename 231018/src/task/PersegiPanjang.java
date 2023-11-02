package task;

public class PersegiPanjang extends BangunDatar{
    int panjang = 4;
    double lebar = 2;

    void hitungLuas(){
        luas = panjang * lebar;
        System.out.println(luas);
    }
    void hitungKeliling(){
        keliling = 2 * (panjang + lebar);
        System.out.println(keliling);
    }
}
