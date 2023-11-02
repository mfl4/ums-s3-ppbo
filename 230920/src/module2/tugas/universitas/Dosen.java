package module2.tugas.universitas;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Dosen {
    String nama = "Freflo";
    int nik = 1001;
    String pendidikan;
    Date tglLahir = new Date();

    void tampilkanNama(){
        System.out.println(nama);
    }
    void tampilkanTglLahir() throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        tglLahir = dateFormat.parse("19-09-1990");
        System.out.println(tglLahir);
    }
    void tampilkanNik(){
        System.out.println(nik);
    }
}
