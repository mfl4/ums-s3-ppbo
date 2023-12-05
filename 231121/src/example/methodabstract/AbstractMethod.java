package example.methodabstract;

public abstract class AbstractMethod{
    public abstract int area();
    public abstract int perimeter();

    public int getArea(){
        return area();
    }
    public int getPerimeter() {
        return perimeter();
    }
}
