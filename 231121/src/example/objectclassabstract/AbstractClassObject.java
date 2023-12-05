package example.objectclassabstract;

public class AbstractClassObject {
    public static void main(String [] args){
        // AbstractClass ac =new AbstractClass(2, 3, 4);
        AbstractClassInstance aci = new AbstractClassInstance(2,3,2);
        aci.printX();
        System.out.println(aci.multiply());
    }
}
