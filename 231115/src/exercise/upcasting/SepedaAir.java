package exercise.upcasting;

public class SepedaAir extends Sepeda{
    void run(){
        System.out.println("Hanya bisa berjalan diatas" + "Air");
    }
    public static void main(String[] args) {
        Sepeda s = new SepedaAir();//upcasting
        s.run();
    }
}