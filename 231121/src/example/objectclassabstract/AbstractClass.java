package example.objectclassabstract;

abstract class AbstractClass {
    int a;
    int b;
    int c;
    public AbstractClass(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int multiply(){
        return a*b*c;
    }
}