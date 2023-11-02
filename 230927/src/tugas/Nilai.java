package tugas;

public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;

    public void setNilaiUTS(int nilaiUTS){
        this.nilaiUTS = nilaiUTS;
    }
    public void setNilaiUAS(int nilaiUAS){
        this.nilaiUAS = nilaiUAS;
    }
    public void setNilaiTugas(int nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }

    double hitungNilaiTotal () {
        double nilaiTotal = (double)(this.nilaiUTS + this.nilaiUAS+ this.nilaiTugas)/3;
        return nilaiTotal;
    }
    
}
