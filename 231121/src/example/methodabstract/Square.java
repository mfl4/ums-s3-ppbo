package example.methodabstract;

public class Square extends AbstractMethod{
    int side=5;
    
    public int area() {
        return side*side;
    }
    public int perimeter() {
        return 4*side;
    }
}
