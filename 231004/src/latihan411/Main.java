package latihan411;

public class Main {
    public static void main(String[] args) {
        PrivateModifier pvtm = new PrivateModifier();
        pvtm.nama = "Budi";
        pvtm.umur = 20;
        
        System.out.println(pvtm.nama);
        System.out.println(pvtm.umur);
        pvtm.printInfo();
    }
}
