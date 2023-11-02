package module2.tugas.hewan;

public class Hewan {
    String nama;
    int jumlahKaki;
    String makanan;
    String tipe;

    void setDataHewan(String nama, int jumlahKaki, String makanan, String tipe) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.makanan = makanan;
        this.tipe = tipe;
    }
    String showDataHewan() {
        return ("Nama Hewan: " + nama + "\nJumlah Kaki: " + jumlahKaki + "\nMakanan: " + makanan + "\nTipe: " + tipe + "\n");
    }
}
