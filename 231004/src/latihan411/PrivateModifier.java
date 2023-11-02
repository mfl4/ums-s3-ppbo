package latihan411;

public class PrivateModifier {
    private String nama;
    private int umur;
    
    public void printInfo(){
        System.out.println("private modifier");
    }

    public static void main(String[] args) {
        PrivateModifier pvtm = new PrivateModifier();
        pvtm.nama = "Budi";
        pvtm.umur = 20;

        System.out.println(pvtm.nama);
    }
}