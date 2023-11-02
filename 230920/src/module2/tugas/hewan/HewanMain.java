package module2.tugas.hewan;

public class HewanMain {
    public static void main(String[] args) {
        Hewan harimau = new Hewan();
        Hewan kerbau = new Hewan();
        harimau.setDataHewan("Harimau", 4, "Daging", "karnivora");
        kerbau.setDataHewan("Kerbau", 4, "Rumput", "herbivora");

        System.out.println(harimau.showDataHewan());
        System.out.println("code by MFL4 - L200220277\n");
        System.out.println(kerbau.showDataHewan());
    }
}
