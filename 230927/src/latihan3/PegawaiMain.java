package latihan3;

public class PegawaiMain {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();

        System.out.println(pegawai1.informasiPegawai("Marsha", 101, 5000000));
        System.out.println(pegawai2.informasiPegawai("Freya", 102, 12000000));
        System.out.println(pegawai3.informasiPegawai("Flora", 103, 1000000));
        System.out.println(pegawai4.informasiPegawai("Gita", 103, 10000000));
        System.out.println(pegawai5.informasiPegawai("Adel", 105, 1000000));
    }
}
