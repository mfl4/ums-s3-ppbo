package tugas;

public class NilaiMain {
    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        
        nilai.setNilaiUTS(70);
        nilai.setNilaiUAS(80);
        nilai.setNilaiTugas(80);

        System.out.println(
            nilai.hitungNilaiTotal()
        );
    }

}
