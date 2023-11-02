package task;

public class SegiTigaSamaSisi extends SegiTiga{
    double sisi = 2;
    void hitungKeliling(){
        keliling = alas + sisi + sisi + sisi;
        System.out.println(keliling);
    }
}
