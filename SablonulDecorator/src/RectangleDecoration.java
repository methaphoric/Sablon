
public class RectangleDecoration {

    protected Rectangle rectangle;
    public RectangleDecoration(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public int perimeter(){
        return  2*(this.rectangle.a+this.rectangle.b);
    }
}
