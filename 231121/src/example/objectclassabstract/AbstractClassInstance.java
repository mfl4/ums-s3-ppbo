package example.objectclassabstract;

public class AbstractClassInstance extends AbstractClass{
    int x;
    public AbstractClassInstance (int a, int b, int c){
        super(a,b,c);
        x = a+b+c;
    }
    public void printX(){
        System.out.println(x);
    }
}
