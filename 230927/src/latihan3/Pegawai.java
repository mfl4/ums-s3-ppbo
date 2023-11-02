package latihan3;

public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    String informasiPegawai(String nama, int nip, double gaji){
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;

        return "Bulan ini, " + nama + " dengan NIP " + nip + " mendapatkan gaji sebesar " + gaji + " rupiah";
    }
}